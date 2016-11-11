package com.bit2016.springcontainer;

import java.util.List;

public class User {
	private List<String> friends;
	private Friend friend;
	private Long no;
	private String name = "안대혁";

	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [friends=" + friends + ", friend=" + friend + ", no=" + no + ", name=" + name + "]";
	}
	
	
}
