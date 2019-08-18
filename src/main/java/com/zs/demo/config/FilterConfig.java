package com.zs.demo.config;

import com.zs.demo.filter.MyFilter1;
import com.zs.demo.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * 描述:
 * 多个过滤器配置
 *
 * @author 周晟
 * @create 2019-08-17 0:50
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean1(){
        FilterRegistrationBean<MyFilter1> myFilter1FilterRegistrationBean1 = new FilterRegistrationBean<>();
        myFilter1FilterRegistrationBean1.setFilter(new MyFilter1());
        myFilter1FilterRegistrationBean1.addUrlPatterns("/*");
        myFilter1FilterRegistrationBean1.setName("myFilter1");
        myFilter1FilterRegistrationBean1.setOrder(1);
        return myFilter1FilterRegistrationBean1;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2(){
        FilterRegistrationBean<MyFilter2> myFilter1FilterRegistrationBean1 = new FilterRegistrationBean<>();
        myFilter1FilterRegistrationBean1.setFilter(new MyFilter2());
        myFilter1FilterRegistrationBean1.addUrlPatterns("/*");
        myFilter1FilterRegistrationBean1.setName("myFilter2");
        myFilter1FilterRegistrationBean1.setOrder(2);
        return myFilter1FilterRegistrationBean1;
    }
}
