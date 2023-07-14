package AbstractSpring.POJO.Repa;

import AbstractSpring.POJO.Model.Comment;

public class OracleDBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store Oracle Comment: " + comment.getText() + " Author: " + comment.getAuthor());
    }
}
