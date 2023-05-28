package com.spring.springquartz;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan
@EnableScheduling
public class SpringquartzApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringquartzApplication.class).bannerMode(Mode.OFF).run(args);
	}

}
