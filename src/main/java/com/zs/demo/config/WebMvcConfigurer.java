package com.zs.demo.config;

import com.zs.demo.interceptor.OneInterceptor;
import com.zs.demo.interceptor.TwoInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/user/**");
        registry.addInterceptor(new TwoInterceptor());
        super.addInterceptors(registry);
    }
}
