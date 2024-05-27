package com.cgs.designpattern.builder;

public class User {

	private final String id;
	private final String name;
	private final String phone;

	private User(UserBuilder builder) {
		super();		
		this.id = builder.id;
		this.name = builder.name;
		this.phone = builder.phone;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	public static class UserBuilder {
		
		private String id;
		private String name;
		private String phone;
		
		public UserBuilder() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public UserBuilder setId(String id) {
			this.id = id;
			return this;
		}

		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
}
