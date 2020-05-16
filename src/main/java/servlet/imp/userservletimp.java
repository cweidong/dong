package servlet.imp;

import dao.userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.userpojo;
import servlet.userservlet;

import java.util.List;

@Service
public class userservletimp implements userservlet {

    @Autowired
  private userdao userdao;
    public List<userpojo> findalluser() {
        System.out.println("servlet查询用户！！");
        return userdao.findalluser();
    }
}
