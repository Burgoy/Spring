package AbstractSpring.Proxies;

import AbstractSpring.Model.Comment;

public class CommentService implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Send comment: " + comment.getText());
    }
}
