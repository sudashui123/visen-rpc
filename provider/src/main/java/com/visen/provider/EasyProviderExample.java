package com.visen.provider;

import com.visen.RpcApplication;
import com.visen.common.service.UserService;
import com.visen.register.LocalRegistry;
import com.visen.server.VertxHttpServer;

/**
 * @author sudashui
 */

public class EasyProviderExample {
    public static void main(String[] args) {

        //Rpc  框架初始化
        RpcApplication.init();

        //注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        //提供服务
        VertxHttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
