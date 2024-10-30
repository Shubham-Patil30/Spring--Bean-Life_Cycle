package in.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.spring.AppConfigure;
import in.spring.service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigure.class);
		
		UserService service =  ctx.getBean(UserService.class);
		
		service.userData();

	}

}
