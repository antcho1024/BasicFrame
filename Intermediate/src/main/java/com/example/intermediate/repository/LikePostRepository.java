package com.example.intermediate.repository;

import com.example.intermediate.domain.Comment;
import com.example.intermediate.domain.LikePost;
import com.example.intermediate.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikePostRepository extends JpaRepository<LikePost, Long> {
    List<LikePost> findAllByPost(Post post);
}
