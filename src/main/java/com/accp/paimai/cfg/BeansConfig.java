package com.accp.paimai.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.accp.paimai.dao" })
public class BeansConfig {
	

}
