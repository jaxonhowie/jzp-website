package com.jzp.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hongyi Zheng
 * @date 2018/12/17
 */
@Controller
public class HomePageController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
