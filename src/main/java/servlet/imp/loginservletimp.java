package servlet.imp;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.loginpojo;
import servlet.loginservlet;


@Service
public class loginservletimp implements loginservlet {

    @Autowired
    private dao.logindao logindao;


    @Override
    public boolean findlogin(loginpojo pojo) {
       if(logindao.findlogin(pojo)==null){
           return false;
       }
       else {
           return true;
       }
    }
}
