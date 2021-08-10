package happygoat.springapp.miniboard.editor;

import happygoat.springapp.miniboard.article_list.postModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class PostEditController {

    public postRepository pr;


    @GetMapping("/editor")
    public String getEditor(Model model) {

        return "editor";
    }


    @ModelAttribute("pf")
    @PostMapping("/editor")
    public String setForm(Model model, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("title") String title, @RequestParam("content") String content) {

        postForm pf = new postForm();
        postModel newPost = new postModel();

        pf.setUsername(username);
        pf.setPassword(password);
        pf.setTitle(title);
        pf.setContent(content);
        pf.setLast_updated(LocalDateTime.now());
        model.addAttribute("pf", pf);

        newPost.setTitle(pf.getTitle());
        newPost.setUsername(pf.getUsername());
        newPost.setPassword(pf.getPassword());
        newPost.setContent(pf.getContent());
        newPost.setLast_updated(pf.getLast_updated());
        pr.save(newPost);

        return "uploaded";
    }

}