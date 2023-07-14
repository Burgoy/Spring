package AbstractSpring.POJO.Service;

import AbstractSpring.POJO.Model.Comment;
import AbstractSpring.POJO.Proxies.CommentNotificationProxy;
import AbstractSpring.POJO.Repa.CommentRepository;

public class CommentService {
    private final CommentNotificationProxy proxy;
    private final CommentRepository repository;

    public CommentService(CommentNotificationProxy proxy, CommentRepository repository) {
        this.proxy = proxy;
        this.repository = repository;
    }

    public void publishComment(Comment comment){
        repository.storeComment(comment);
        proxy.sendComment(comment);
    }
}
