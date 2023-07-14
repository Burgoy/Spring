package AbstractSpring.POJO;

import AbstractSpring.POJO.Model.Comment;
import AbstractSpring.POJO.Proxies.EmailCommentNotificationProxy;
import AbstractSpring.POJO.Proxies.LoginNotificationProxy;
import AbstractSpring.POJO.Repa.DBCommentRepository;
import AbstractSpring.POJO.Repa.OracleDBCommentRepository;
import AbstractSpring.POJO.Service.CommentService;

public class Main {
    public static void main(String[] args) {
        var CommentOracleRepo = new OracleDBCommentRepository();
        var CommentDBRepo = new DBCommentRepository();
        var emailProxy = new EmailCommentNotificationProxy();
        var loginProxy = new LoginNotificationProxy();


        var OracleDBServices = new CommentService(emailProxy, CommentOracleRepo);
        var CommentDBServices = new CommentService(loginProxy, CommentDBRepo);

        Comment a = new Comment();
        a.setAuthor("Admin");
        a.setText("Hello World");

        Comment b = new Comment();
        b.setText("JJJJ");

        CommentDBServices.publishComment(a);
        OracleDBServices.publishComment(b);
    }
}
