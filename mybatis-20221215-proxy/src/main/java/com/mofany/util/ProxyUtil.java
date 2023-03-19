package com.mofany.util;

import com.mofany.mapper.StudentMapper;
import com.mofany.mapper.impl.StudentMapperImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author MoFany-J
 * @date 2022/12/15
 * @description ProxyUtil 当前代理用于统计查、删、改的耗时
 */
public class ProxyUtil {
    private ProxyUtil(){
        throw new RuntimeException("禁止反射！");
    }

    /**
     * 创建动态代理逻辑
     * */
    public static Object createProxy(Object obj){
        var object = Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{StudentMapper.class},
                //以下可以替换为Lambda表达式
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //select、delete、update、insert操作计时拦截
                        if (method.getName().indexOf("select")!=-1 || method.getName().indexOf("delete")!=-1 || method.getName().indexOf("update")!=-1 || method.getName().indexOf("insert")!=-1){
                            //开始计时
                            long startTime=System.currentTimeMillis();
                            //调用方法
                            Object result=method.invoke(obj,args);
                            //结束计时
                            long endTime=System.currentTimeMillis();
                            //输出时间差
                            System.out.println("\r\n> "+method.getName()+"方法执行消耗时间为："+(endTime-startTime)+"ms\n");
                            return result;
                        }else {
                            //调用其它方法则放行,如toString()方法
                            Object result=method.invoke(obj,args);
                            return result;
                        }
                    }
                });
        return object;
    }
}
