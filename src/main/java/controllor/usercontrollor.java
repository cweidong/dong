package controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.loginpojo;
import pojo.userpojo;
import servlet.imp.loginservletimp;
import servlet.imp.userservletimp;
import servlet.loginservlet;

import java.util.List;

@Controller
@RequestMapping("/usercontroller")
public class usercontrollor {

    @Autowired
    private userservletimp userservlet;
    @Autowired
    private loginservletimp loginservlet;

    @RequestMapping("/findalluser")
    public String findalluser(Model  model){
        System.out.println("controller查询用户！！");
        List<userpojo> list= userservlet.findalluser();

        for(userpojo user:list){
            System.out.println(user);
        }
        return "succes";
    }

    @RequestMapping("/login")
    public String login(loginpojo pojo){
       if(loginservlet.findlogin(pojo)){
           return "redirect:findalluser";
       }
       else {
           return "fall";
       }
    }
}
