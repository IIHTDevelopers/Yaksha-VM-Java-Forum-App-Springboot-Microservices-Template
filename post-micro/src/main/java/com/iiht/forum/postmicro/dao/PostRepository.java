package com.iiht.forum.postmicro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.iiht.forum.postmicro.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
}
