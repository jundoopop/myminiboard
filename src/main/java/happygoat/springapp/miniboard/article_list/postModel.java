package happygoat.springapp.miniboard.article_list;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class postModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String title;
    public String content;
    public String username;
    public String password;
    public LocalDateTime last_updated;

}
