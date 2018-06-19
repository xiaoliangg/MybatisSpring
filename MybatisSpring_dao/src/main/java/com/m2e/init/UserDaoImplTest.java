package com.m2e.init;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2e.bean.db.User;
import com.m2e.dao.UserDao;

//  https://blog.csdn.net/eson_15/article/details/51684968
public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");//得到spring容器
    }

    @Test
    public void testFindUserById() throws Exception {

    	//dao方式开发
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");//获取这个bean
    	
    	//mapper方式开发
//    	UserMapper userDao = (UserMapper) applicationContext.getBean("userMapper");//获取这个bean
        User user = userDao.findUserById(1);
        System.out.println(user);
    }
}
