package com.iiht.forum.postmicro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iiht.forum.postmicro.dto.PostDetailDto;
import com.iiht.forum.postmicro.dto.PostDetailListDto;
import com.iiht.forum.postmicro.dto.PostDto;
import com.iiht.forum.postmicro.dto.exception.ExceptionDto;
import com.iiht.forum.postmicro.exception.PostException;
import com.iiht.forum.postmicro.exception.PostNotFoundException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/post")
public class PostController {

	@PostMapping("/add/{userId}")
	public ResponseEntity<PostDetailDto> addPost(@PathVariable("userId") String userId, @Valid @RequestBody PostDto post, BindingResult result){
		// write your logic here
		return null;
	}

	public ResponseEntity<PostDetailDto> defaultAdd(String userId,  PostDto post) {
		// write your logic here
		return null;	
	}
	
	@GetMapping("/get/{postId}")
	public ResponseEntity<PostDetailDto> getPost(@PathVariable("postId") String postId){
		// write your logic here
		return null;
	}
	
	@GetMapping("/get-all/{userId}")
	public ResponseEntity<PostDetailListDto> getAllPostsForUser(@PathVariable("userId") String userId){
		// write your logic here
		return null;
	}
	
	@PostMapping("/like/{postId}")
	public ResponseEntity<Integer> addLike(@PathVariable("postId") String postId){
		// write your logic here
		return null;
	}
	
	@ExceptionHandler(PostNotFoundException.class)
	public ResponseEntity<ExceptionDto> postNotFoundExceptionHandler(PostNotFoundException ex){
		// write your logic here
		return null;
	}

	@ExceptionHandler(PostException.class)
	public ResponseEntity<ExceptionDto> postExceptionHandler(PostException ex){
		// write your logic here
		return null;
	}
	
}














