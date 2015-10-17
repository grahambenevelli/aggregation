package com.interview.aggregate.impl;

import com.interview.aggregate.User;

public class BasicUser implements User {

	private final long id;
	private final String name;

	public BasicUser(long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override 
	public long getId() {
		return id;
	}

	@Override 
	public String getName() {
		return name;
	}
}
