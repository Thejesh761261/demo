package pixoUserServer;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.pixogram.controller.FollowController;
import com.pixogram.controller.UserController;
import com.pixogram.model.Follow;
import com.pixogram.model.User;


public class SpringRestMySqlApplicationTests {
	
	UserController user=new UserController();
	FollowController follows = new FollowController();
	
	@Before
	public boolean res()
	{
		List<User> userss = new ArrayList<User>();
		return user.getUsers1().isEmpty();
	}
	

	@Test
	public void contextLoads1() {
		assertEquals(false, res());
	}
	
	@After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	
	@Test
	public void contextLoads() {
		assertEquals(5, user.follow(3, 2));
	}

}