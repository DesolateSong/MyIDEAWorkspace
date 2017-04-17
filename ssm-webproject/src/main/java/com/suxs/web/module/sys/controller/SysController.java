package com.suxs.web.module.sys.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SUXS on 2017/4/13.
 */
@Controller
@RequestMapping("/sys")
public class SysController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String user = (String) request.getSession().getAttribute("user");

        if (StringUtils.isEmpty(user)) {

            System.out.println("sys/login");

            return "sys/login/login";
        }

        return "sys/index";
    }
}
