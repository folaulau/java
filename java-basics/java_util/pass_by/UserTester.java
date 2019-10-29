package pass_by;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserTester {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Test
	public void testPassByReference() {
		User user = new User();
		user.setAge(1);
		
		log.info("user={}",ObjectUtils.toJson(user));
		
		changeUserAge(user);
		
		log.info("user={}",ObjectUtils.toJson(user));
	}
	
	
	@Test
	public void testPassByValue() {
		int age = 10;
		
		log.info("age={}",age);
		
		changeUserAge(age);
		
		log.info("age={}",age);
	}
	
	private void changeUserAge(User user) {
		user.setAge(29);
	}
	
	private void changeUserAge(int age) {
		age = 29;
	}
}
