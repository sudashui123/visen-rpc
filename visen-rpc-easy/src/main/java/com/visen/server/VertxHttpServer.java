package com.visen.server;

import io.vertx.core.Vertx;

/**
 * Vertx HTTP 服务器
 */
public class VertxHttpServer implements HttpServer {
    /**
     * 启动服务器
     *
     * @param port
     */
    @Override
    public void doStart(int port) {

        //创建Vertx.x实例
        Vertx vertx = Vertx.vertx();

        //创建HTTP 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        //监听端口并处理请求
        server.requestHandler(new HttpServerHandler());


        //启动 HTTP 服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("Server is now listening port" + port);
            } else {
                System.out.println("Failed to start server: " + result.cause());
            }
        });
    }
}
