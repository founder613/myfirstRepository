package com.powernode.sh2004.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: TicketSystem
 * @Package: com.powernode.sh2004.bean
 * @Description: java类作用描述
 * @Author: 吴洋
 * @CreateDate: 2020/11/13 20:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public class QueryVo {
    @Autowired
    private User user;
    private String code;

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                ", code='" + code + '\'' +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
