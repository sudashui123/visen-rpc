package com.visen.proxy;

import com.visen.RpcApplication;

import java.lang.reflect.Proxy;

public class ServiceProxyFactory {

    /**
     * 根据服务类 获取代理对象
     *
     * @param serviceClass
     * @return
     * @param <T>
     */
    public static<T>  T getProxy(Class<T> serviceClass){
        if (RpcApplication.getRpcConfig().isMock()){
            return getMockProxy(serviceClass);
        }

        return(T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());

    }

    /**
     *
     * 根据服务类 获取 Mock 代理对象
     * @param serviceClass
     * @return
     * @param <T>
     */
    public static <T> T getMockProxy(Class<T> serviceClass){
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new MockServiceProxy());
    }
}
