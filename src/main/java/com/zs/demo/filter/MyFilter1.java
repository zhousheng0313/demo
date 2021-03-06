package com.zs.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 描述:
 *
 * @author 周晟
 * @create 2019-08-16 23:19
 */
@WebFilter(filterName = "myFilter1",urlPatterns = "/*")
@Slf4j
public class MyFilter1 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器1被创建！");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse reponse = (HttpServletResponse) servletResponse;
        /*当还有过滤器时，执行过滤器，没有过滤器时则根据请求路径执行controller中对应的方法
        */
        filterChain.doFilter(request,reponse);
        reponse.getWriter().write("aaaa");
        log.info("doFilter1执行完之后");
    }

    @Override
    public void destroy() {
        log.info("过滤器1被销毁");
    }
}
