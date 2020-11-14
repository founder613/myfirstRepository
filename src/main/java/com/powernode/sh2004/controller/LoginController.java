package com.powernode.sh2004.controller;

import com.powernode.sh2004.bean.QueryVo;
import com.powernode.sh2004.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: TicketSystem
 * @Package: com.powernode.sh2004.controller
 * @Description: java类作用描述
 * @Author: 吴洋
 * @CreateDate: 2020/11/13 20:46
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class LoginController {
    @Autowired

    private LoginService loginService;
    @RequestMapping("/doLogin")
    public String doLogin(QueryVo queryVo){
return "/TicketSystem /login.jsp";
    }
}
