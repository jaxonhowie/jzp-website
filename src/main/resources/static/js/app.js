var stompClient = null;

function setConnected(connected) {
    //已连接则连接按钮为红色激活
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);

    if (connected) {
        $("#connect").css({color: "green"});
        $("#disconnect").css({color: "black"});
        $("#conversation").show();
    }
    else {
        $("#disconnect").css({color: "red"});
        $("#connect").css({color: "black"});
        $("#conversation").hide();
    }
    $("#broadcast").html("");
}

function connect() {
    var socket = new SockJS('/chat-ws');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/broadcast', function (broadcast) {
            showBroadcast(JSON.parse(broadcast.body).message, JSON.parse(broadcast.body).postTime);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

// 提交内容
function sendMsg() {
    stompClient.send("/app/send", {}, JSON.stringify({
        'message': $("#ctt").val()
    }));
    $("#ctt").val("");
}

function showBroadcast(content, time) {
    $("#broadcast").append("<tr><td>" + content + "</td><td>" + time + "</td></tr>");
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendMsg();
    });
});