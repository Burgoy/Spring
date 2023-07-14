package AbstractSpring.POJO.Proxies;

import AbstractSpring.POJO.Model.Comment;

public class LoginNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText() + " Author: " + comment.getAuthor());
    }
}