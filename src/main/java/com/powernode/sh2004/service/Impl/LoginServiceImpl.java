package com.powernode.sh2004.service.Impl;

import com.powernode.sh2004.mapper.LoginMapper;
import com.powernode.sh2004.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: TicketSystem
 * @Package: com.powernode.sh2004.service.Impl
 * @Description: java类作用描述
 * @Author: 吴洋
 * @CreateDate: 2020/11/13 20:58
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
}
