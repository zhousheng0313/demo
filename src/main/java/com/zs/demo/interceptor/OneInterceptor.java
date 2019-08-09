package com.zs.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class OneInterceptor implements HandlerInterceptor {

    //在进入handler方法之前执行此方法
    //应用场景：如身份认证，身份授权。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("OneInterceptor的preHandle方法被执行！");
        return true;
    }

    //该方法在进入Handler方法之后，返回ModelAndView之前执行
    //应用场景从modelAndView出发，将公用模型数据（如菜单导航）在这里传到视图，也可以在这里统一制定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("OneInterceptor的postHandle方法执行");
        modelAndView.addObject("OneInterceptor","OneInterceptor");
    }

    //该方法在handler方法执行完之后执行
    //应用场景：统一日志处理，统一异常处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("OneInterceptor执行完");
    }
}
