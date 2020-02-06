package cn.tedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 业务需求：
 * 访问controller/hello路径，页面打印json返回值
 * @author Administrator
 *
 */


@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "springboot hello";
	}

}
