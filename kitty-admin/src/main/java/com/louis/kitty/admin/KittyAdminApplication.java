package com.louis.kitty.admin;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

/**
 * 启动器
 * @author Louis
 * @date Oct 29, 2018
 */

@ImportResource("classpath:ureport-console-context.xml")
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.louis.kitty"})
public class KittyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(KittyAdminApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean<Servlet> buildUreportServlet(){
		return new ServletRegistrationBean<Servlet>(new UReportServlet(), "/ureport/*");
	}
//	@Bean
//	public ServletRegistrationBean ureportServlet(){
//		ServletRegistrationBean bean = new ServletRegistrationBean(new UReportServlet());
//		bean.addUrlMappings("/com/louis/kitty/admin/ureport/*");
//		return bean;
//	}
}
