package happygoat.springapp.miniboard.article_list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class StartController {


    @Autowired
    @GetMapping("/start")
    public String startDash() {

        return "start";
    }

}
