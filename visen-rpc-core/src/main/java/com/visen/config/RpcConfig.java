package com.visen.config;

import lombok.Data;

@Data
public class RpcConfig {
    /**
     *
     * 名字
     */
    private String name = "visen-rpc";
    /**
     *
     * 版本号
     */
    private String version = "1.0";
    /**
     *
     * 服务器主机名
     */
    private String serverHost = "localhost";
    /**
     * 服务器端口
     *
     */
    private Integer serverPort = 8080;

    /**
     * 模拟调用
     */
    private boolean mock = false;
}
