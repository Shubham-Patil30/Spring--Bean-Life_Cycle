package in.spring.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("UserDao")
public class UserService {
	
	public void userData() {
		System.out.println("Getting  a data from cache ");
	}
}

