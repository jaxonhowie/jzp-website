package com.jzp.service.biz;

import com.alibaba.fastjson.JSONObject;
import com.jzp.common.Constants;
import com.jzp.utils.HttpUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hongyi Zheng
 * @date 2019/4/19
 */
@Component("steamService")
public class SteamService {

    private static final String API_LIST = "http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v0001/";

    public JSONObject getApiList() {
        return JSONObject.parseObject(HttpUtils.doGet(API_LIST));
    }

    public JSONObject getApiListWithKey() {
        Map<String, String> params = new HashMap<>(1);
        params.put("key", Constants.STEAM_API_KEY);
        return JSONObject.parseObject(HttpUtils.doGet(API_LIST, params));
    }
}
