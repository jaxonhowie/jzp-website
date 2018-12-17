package com.jzp.controller.api.tools;

import com.alibaba.fastjson.JSONObject;
import com.jzp.common.RspCode;
import com.jzp.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@RestController("/steam")
public class SteamApiController extends BaseController {

    public JSONObject getApiList(){
        return result(RspCode.SUC);
    }
}
