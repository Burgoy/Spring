package AbstractSpring.POJO.Proxies;

import AbstractSpring.POJO.Model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
