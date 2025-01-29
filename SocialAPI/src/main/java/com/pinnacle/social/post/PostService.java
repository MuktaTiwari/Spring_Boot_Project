package com.pinnacle.social.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.social.location.Location;
import com.pinnacle.social.user.User;

@Service
public class PostService {
			
		
		User user1 = new User("u1","Mukta","Tiwari",new Location("l1","Nagpur"),"mukta203mt@gmail.com");
		User user2 = new User("u3", "Amit", "Borker",new Location("l2","Ballarpur"), "dbwhdbw@gmail.com");
		Post post1 = new Post("p1","20-03-2001",user1,"bfiewhfenfjfeuifheufejfnujfeujf");
		Post post2 = new Post("p2","20-03-2001",user1,"bfiewhfenfjfeuifheufejfnujfeujf");
		Post post3 = new Post("p3","10-09-2012",user2,"bfiewhfenfjfeuifheufejfnujfeujf");

		
		List<Post> posts = new ArrayList<>(Arrays.asList(post1,post2,post3));
		
		public List<Post> getAllPost() 
		   {
				return posts;
		   } 


		public Post getPost(String id) 
		{
			Post post = posts.stream()
			.filter(t -> id.equals(t.getId()))
			.findFirst()
			.orElse(null);
			
			return post;
		}
		
		public void addPost(Post post) {
		     posts.add(post);
		}
		
		public void deletePost(String id) {
		     posts.removeIf(p -> p.getId().equals(id));		
		}
		
		public void updatePost(String id, Post post) {

		    for(int i = 0; i < posts.size(); i++) {

			Post p = posts.get(i);

			if(p.equals(post)) {

			     posts.set(i, post);
			}
		    }
		}


}
