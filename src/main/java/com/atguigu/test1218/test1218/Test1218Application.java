package com.atguigu.test1218.test1218;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.atguigu.test1218.test1218.mapper")
public class Test1218Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1218Application.class, args);
	}

}
