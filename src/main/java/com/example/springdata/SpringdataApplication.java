package com.example.springdata;

import com.example.springdata.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringdataApplication {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@PostConstruct
	private void init() {
		PostService postService = new PostService(postRepository);
		postService.savePostsWithComments();
		postService.fetchPostsWtthComments();
	}

}
