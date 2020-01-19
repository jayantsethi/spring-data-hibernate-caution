package com.example.springdata;

import com.example.springdata.entity.Comment;
import com.example.springdata.entity.Post;
import com.example.springdata.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void savePostsWithComments() {
        createAndSavePostWithComments("new post1");

        createAndSavePostWithComments("new post2");

        createAndSavePostWithComments("new post3");
    }

    private void createAndSavePostWithComments(String postContent) {
        List<Comment> commentsList = Arrays.asList(
                new Comment("test comment1"),
                new Comment("test comment2"),
                new Comment("test comment3")
        );
        Post post = new Post();
        post.setContent(postContent);
        post.setComments(commentsList);
        postRepository.save(post);
    }

    public Iterable<Post> fetchPostsWtthComments() {
        return postRepository.findAll();
    }

}
