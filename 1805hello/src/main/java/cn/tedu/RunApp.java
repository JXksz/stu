package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//放在所有需要处理类等文件的父目录
@SpringBootApplication
public class RunApp {

	//main方法作为入口函数
	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}
}
