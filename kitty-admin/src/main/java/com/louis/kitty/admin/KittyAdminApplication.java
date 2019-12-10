package com.louis.kitty.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.TimeZone;

/**
 * 启动器
 * @author Louis
 * @date Oct 29, 2018
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.louis.kitty"})
public class KittyAdminApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		SpringApplication.run(KittyAdminApplication.class, args);
	}
}
