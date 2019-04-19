package com.jzp.service.biz;

import com.alibaba.fastjson.JSONObject;
import com.jzp.utils.HttpUtils;
import org.springframework.stereotype.Component;

/**
 * @author Hongyi Zheng
 * @date 2019/4/19
 */
@Component("steamService")
public class SteamService {

    public JSONObject requestApiList() {
        return JSONObject.parseObject(HttpUtils.doPost("", ""));
    }
}
