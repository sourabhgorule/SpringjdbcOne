package com.springjdbcOne.SpringjdbcOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcOne.bean.Employee;
import com.springjdbcOne.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
        EmployeeDao dao=context.getBean("dao",EmployeeDao.class);
        Employee emp=new Employee(1, "sourabh");
        
        dao.saveRecord(emp);
        
    }
}
