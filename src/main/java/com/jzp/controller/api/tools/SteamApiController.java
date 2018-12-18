package com.jzp.controller.api.tools;

import com.alibaba.fastjson.JSONObject;
import com.jzp.common.RspCode;
import com.jzp.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@Controller("/steam")
public class SteamApiController extends BaseController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getApiList(Model model){

        model.addAttribute("apiList", "test");
        return "/menu/steam/apilist";
    }
}
