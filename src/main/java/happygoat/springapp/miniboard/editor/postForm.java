package happygoat.springapp.miniboard.editor;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

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
    @NonNull
    public LocalDateTime last_updated;

}
