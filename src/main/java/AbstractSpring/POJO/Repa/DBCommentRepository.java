package AbstractSpring.POJO.Repa;

import AbstractSpring.POJO.Model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment: " +
                comment.getText() + " Author: " + comment.getAuthor());
    }
}
