package com.wwg.cloud;

import java.util.List;

/**
 * Created by admin on 2018/9/9.
 */
public class Test {

    public static void main(String[] args) {
        // 选择出myclient对应服务全部可用地址
        List<AlanServiceAddress> list = AlanServiceAddressSelector.selectAvailableServers("service-hi");
        System.out.println(list);

        // 选择出myclient对应服务的一个可用地址(轮询), 返回null表示服务当前没有可用地址
        AlanServiceAddress addr = AlanServiceAddressSelector.selectOne("hi");
        System.out.println(addr);
    }
}
