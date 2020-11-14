package com.powernode.sh2004.bean;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

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

public class User {
    private String uid;
    private String uname;
    private String upwd;
    @Autowired
    private Order[] orders;
    @Autowired
    private Train[] train;
    public String getUid() {
        return uid;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", orders=" + Arrays.toString(orders) +
                ", train=" + Arrays.toString(train) +
                '}';
    }

    public Train[] getTrain() {
        return train;
    }

    public void setTrain(Train[] train) {
        this.train = train;
    }




    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
