package webappservlet.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import webappservlet.data.*;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class CommentController {

    @MessageMapping("/msg")
    @SendTo("/comment/comments")
    public WebSocket greeting(Comment comment) throws Exception {
        Thread.sleep(500);
        String time = new SimpleDateFormat(" (HH:mm) dd/MM").format(new Date());
        return new WebSocket(HtmlUtils.htmlEscape(comment.getUser()) + time
                 + "<br>" + HtmlUtils.htmlEscape(comment.getComment()));
    }

}
