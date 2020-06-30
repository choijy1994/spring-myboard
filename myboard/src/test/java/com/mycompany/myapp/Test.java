package com.mycompany.myapp;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class Test {

	@Inject
	private DataSource dataSource;
	
	@org.junit.Test
	public void tst() throws Exception{
		try (Connection conn = dataSource.getConnection()){
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@org.junit.Test
	public void sessionTest() throws Exception{
		try (SqlSession session = sqlFactory.openSession()){
			System.out.println(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
