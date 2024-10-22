package IndexController;

import Model.User;
import ch.qos.logback.classic.net.SyslogAppender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @Autowired
    //private User user;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String Register(@ModelAttribute User user){

        System.out.println(user.gettoString());
        return "index";
    }
}
