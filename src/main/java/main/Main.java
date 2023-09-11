package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import domain.Comment;
import services.CommentService;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = ctx.getBean(CommentService.class);
		
		var comment = new Comment();
		comment.setText("코맨트 시험");
		comment.setAuthor("박작가");
		
		service.publishComment(comment);
		System.out.println(service.getClass());
	}

}
