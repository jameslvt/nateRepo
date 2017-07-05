package junit;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) throws SQLException {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		DataSource ds = ac.getBean("dataSource", DataSource.class);

		System.out.println(ds.getConnection());
	}

}
