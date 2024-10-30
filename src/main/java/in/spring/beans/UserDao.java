package in.spring.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements InitializingBean{
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Getting data from db");
		System.out.println("Storing data to cache");
		
	}
}
