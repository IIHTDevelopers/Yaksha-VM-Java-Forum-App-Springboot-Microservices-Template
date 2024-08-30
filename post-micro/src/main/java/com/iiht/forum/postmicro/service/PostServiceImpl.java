package com.iiht.forum.postmicro.service;

import org.springframework.stereotype.Service;
import com.iiht.forum.postmicro.dto.PostDetailDto;
import com.iiht.forum.postmicro.dto.PostDetailListDto;
import com.iiht.forum.postmicro.dto.PostDto;

@Service
public class PostServiceImpl implements PostService {

	@Override
		public PostDetailDto addPost(PostDto post, Integer userId) {
		// write your logic here
		return null;
	}

	@Override
	public PostDetailDto getPost(Integer postId) {
		// write your logic here
		return null;
	}

	@Override
	public Integer addLike(Integer postId) {
		// write your logic here
		return null;
	}

	@Override
	public PostDetailListDto getPosts(Integer userId) {
		// write your logic here
		return null;
	}

}
