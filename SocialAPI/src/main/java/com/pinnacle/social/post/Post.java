package com.pinnacle.social.post;

import com.pinnacle.social.user.User;

public class Post {
	
	private String id;
	private String postDate;
	private User user;
	private String details;
	public Post(String i, String postDate, User user, String details) {
		super();
		this.id = i;
		this.postDate = postDate;
		this.user = user;
		this.details = details;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
	

}
