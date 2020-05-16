package test;

import dao.userdao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.userpojo;
import servlet.userservlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public void testservlet() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:springapplicationContext.xml");
        userservlet service = (userservlet) ac.getBean("userservletimp");
        service.findalluser();
    }
    @Test
    public void testdao() throws IOException {
        // 加载配置文件
         InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        // 创建工厂
         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建sqlSession对象
        SqlSession session = factory.openSession();
        // 获取代理对象
         userdao dao = session.getMapper(userdao.class);
        // / 调用查询的方法
         List<userpojo> list =dao.findalluser();
        for (userpojo userpojo : list) {
         System.out.println(userpojo);        }
         session.close();
         inputStream.close();
    }
}
