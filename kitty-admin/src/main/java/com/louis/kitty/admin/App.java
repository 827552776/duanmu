package com.louis.kitty.admin;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import java.util.TimeZone;


@ImportResource("classpath:ureport-console-context.xml")
@SpringBootApplication
public class App {
    public static void main(String[] args){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(App.class,args);
    }
    @Bean
    public ServletRegistrationBean ureportServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new UReportServlet());
        bean.addUrlMappings("/com/louis/kitty/admin/ureport/*");
        return bean;
    }
}
