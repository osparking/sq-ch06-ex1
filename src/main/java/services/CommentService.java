package services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import domain.Comment;
import util.MyUtil;

@Service
public class CommentService {
	private Logger logger = MyUtil.getLogger(CommentService.class.getName());

	public void publishComment(Comment comment) {
		logger.info("출판한 코멘트: " + comment.getText());
	}
}
