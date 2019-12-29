package com.louis.kitty.admin;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import javax.servlet.Servlet;

import java.util.TimeZone;

/**
 * 启动器
 * @author Louis
 * @date Oct 29, 2018
 */

@ImportResource("classpath:ureport-console-context.xml")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.louis.kitty"})
public class KittyAdminApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		SpringApplication.run(KittyAdminApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(KittyAdminApplication.class);
	}

//	@Bean
//	public ServletRegistrationBean<Servlet> buildUreportServlet(){
//		return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
//	}
//	@Bean
//	public ServletRegistrationBean ureportServlet(){
//		ServletRegistrationBean bean = new ServletRegistrationBean(new UReportServlet());
//		bean.addUrlMappings("/com/louis/kitty/admin/ureport/*");
//		return bean;
//	}
}
