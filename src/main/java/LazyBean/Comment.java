package LazyBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Comment {

    @Autowired
    public Comment() {
        System.out.println("Bean instance created");
    }
}
