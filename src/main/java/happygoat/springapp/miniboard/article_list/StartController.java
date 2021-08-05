package happygoat.springapp.miniboard.article_list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import happygoat.springapp.miniboard.service.urlHandler;

@Controller

public class StartController {


    @Autowired
    @GetMapping("/start")
    public String startDash() {

        urlHandler uh = new urlHandler();
        uh.requestHandler();
        return "start";
    }

}
