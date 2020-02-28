package springbook.user.test;

import java.sql.SQLException;

import springbook.nuser.dao.NUserDao;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class userTest {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		UserDao dao = new NUserDao();
		
		User user = new User();
		user.setId("test01");
		user.setName("EJ");
		user.setPassword("password");
		
		dao.add(user);
		
		System.out.println(user.getId() + "：Add Success");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "：Select Success");
		
		dao.delete(user2.getId());
		
		System.out.println(user2.getId() + "：Delete Success");
	}
}
