package LazyBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class Comment {

    @Autowired
    public Comment() {
        System.out.println("Bean instance created");
    }
}
