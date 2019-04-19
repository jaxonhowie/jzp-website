package com.jzp.controller.api.tools;

import com.alibaba.fastjson.JSONObject;
import com.jzp.common.RspCode;
import com.jzp.controller.BaseController;
import com.jzp.service.biz.SteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@Controller("/steam")
public class SteamApiController extends BaseController {

    @Autowired
    SteamService steamService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getApiList() {
        JSONObject jObj = steamService.getApiList();
        return "/menu/steam/apilist";
    }
}
