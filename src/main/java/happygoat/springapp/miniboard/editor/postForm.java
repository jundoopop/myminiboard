package happygoat.springapp.miniboard.editor;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
public class postForm {
    @NonNull
    public String title;
    @NonNull
    public String content;
    @NonNull
    public String username;
    @NonNull
    public String password;

}
