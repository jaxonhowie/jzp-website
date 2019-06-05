package com.jzp.controller.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jzp.common.Constants;
import com.jzp.common.PagedList;
import com.jzp.common.Result;
import com.jzp.controller.BaseController;
import com.jzp.model.SteamApi;
import com.jzp.service.biz.SteamService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@RestController
@RequestMapping("/steam")
public class SteamApiController extends BaseController {

    private final SteamService steamService;

    public SteamApiController(SteamService steamService) {
        this.steamService = steamService;
    }

    @GetMapping(value = "/get/apis")
    public Result getApiList(@RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        pager(page, pageSize);
        JSONObject jObj = steamService.getApiList();
        return result(JSONPath.eval(jObj, ".apilist.interfaces"));
    }
}
