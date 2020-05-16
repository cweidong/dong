package dao;

import org.apache.ibatis.annotations.Select;
import pojo.userpojo;

import java.util.List;

public interface userdao {
    @Select("SELECT * from account")
    public List<userpojo>  findalluser();
}
