package com.xinzhe.dao;

import com.xinzhe.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class UserDaoTest {

    @Test
    public void test01() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDAO mapper = sqlSession.getMapper(UserDAO.class);
        mapper.save(new User("zx1", "123"));

        sqlSession.commit();

    }

    @Test
    public void test02() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);
        userDAO.save(new User("zx3", "123"));
    }

}