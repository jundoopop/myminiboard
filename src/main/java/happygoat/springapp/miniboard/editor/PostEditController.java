package happygoat.springapp.miniboard.editor;

import happygoat.springapp.miniboard.article_list.postModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Controller
public class PostEditController {

    public postRepository pr;


    @GetMapping("/editor")
    public String getEditor(Model model) {
        model.addAttribute("pf", new postForm());

        return "editor";
    }


    @PostMapping("/editor")
    public String setForm(Model model, @ModelAttribute postForm pf, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("title") String title, @RequestParam("content") String content) {

        postModel pm = new postModel();

        pf.setUsername(username);
        pf.setPassword(password);
        pf.setContent(content);
        pf.setTitle(title);

        model.addAttribute("pf", pf);

        ZoneId krtime = ZoneId.of("GMT+9");
        LocalDateTime realtime = LocalDateTime.now(krtime);

        pm.setTitle(pf.getTitle());
        pm.setUsername(pf.getUsername());
        pm.setPassword(pf.getPassword());
        pm.setContent(pf.getContent());
        pm.setLast_updated(realtime);
        pr.save(pm);

        return "uploaded";
    }


}