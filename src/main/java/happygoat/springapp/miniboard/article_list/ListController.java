package happygoat.springapp.miniboard.article_list;

import happygoat.springapp.miniboard.service.urlHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {

    @Autowired
    @GetMapping("/articleList")
    public String getList() {

        urlHandler uh = new urlHandler();
        uh.requestHandler();
        return "articleList";
    }

}
