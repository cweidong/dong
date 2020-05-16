package dao;

import org.apache.ibatis.annotations.Select;
import pojo.loginpojo;

public interface logindao {
    //根据账号密码查
    @Select("Select * from login where pass=#{pass} and accm=#{accm}")
    public loginpojo findlogin(loginpojo pojo);

}
