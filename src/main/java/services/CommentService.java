package services;

import java.io.UnsupportedEncodingException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import domain.Comment;

@Service
public class CommentService {
	private Logger logger =
			Logger.getLogger(CommentService.class.getName());
	{
		var handler = new ConsoleHandler();
		try {
			handler.setEncoding("UTF-8");
			logger.addHandler(handler);
		} catch (SecurityException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		logger.setUseParentHandlers(false);
	}
	
	public void publishComment(Comment comment) {
		logger.info("출판한 코멘트: " + comment.getText());
	}
}
