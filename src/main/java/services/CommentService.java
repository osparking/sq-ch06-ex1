package services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import domain.Comment;

@Service
public class CommentService {
	private Logger logger =
			Logger.getLogger(CommentService.class.getName());
	public void publishComment(Comment comment) {
		logger.info("출판한 코멘트: " + comment.getText());
	}
}
