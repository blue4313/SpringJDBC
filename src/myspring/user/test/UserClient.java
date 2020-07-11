package myspring.user.test;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

//import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")

public class UserClient {

	@Autowired
	ApplicationContext context;
	
	@Test
	//@Ignore
	public void dataSourceTest() {
		DataSource ds1 = (DataSource) context.getBean("dataSource1");
		
		try {
			System.out.println(ds1.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DataSource ds2 = (DataSource) context.getBean("dataSource2");
		
		try {
			System.out.println(ds2.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


	

	

	
	

}
