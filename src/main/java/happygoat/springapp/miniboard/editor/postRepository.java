package happygoat.springapp.miniboard.editor;

import happygoat.springapp.miniboard.article_list.postModel;
import org.springframework.data.repository.CrudRepository;

public interface postRepository extends CrudRepository<postModel, Integer> {
}
