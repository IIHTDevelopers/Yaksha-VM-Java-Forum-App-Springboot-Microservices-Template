package com.iiht.forum.postmicro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.forum.postmicro.dto.CommentDetailDto;
import com.iiht.forum.postmicro.dto.CommentDto;
import com.iiht.forum.postmicro.dto.exception.ExceptionDto;
import com.iiht.forum.postmicro.exception.CommentException;
import com.iiht.forum.postmicro.exception.CommentNotFoundException;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/comment")
public class CommentController {

	@PostMapping("/add/{postId}/{userId}")
	public ResponseEntity<CommentDetailDto> addComment(@PathVariable("postId") String postId, 
													   @PathVariable("userId") String userId,
													   @RequestBody CommentDto comment){
														// write your logic here
		return null;
	}
	
	@PostMapping("/like/{commentId}")
	public ResponseEntity<Integer> addLike(@PathVariable("commentId") String commentId){
		// write your logic here
		return null;
	}
	
	@ExceptionHandler(CommentNotFoundException.class)
	public ResponseEntity<ExceptionDto> commentNotFoundExceptionHandler(CommentNotFoundException ex){
		// write your logic here
		return null;
	}
	@ExceptionHandler(CommentException.class)
	public ResponseEntity<ExceptionDto> commentExceptionHandler(CommentException ex){
		// write your logic here
		return null;
	}
	
}
