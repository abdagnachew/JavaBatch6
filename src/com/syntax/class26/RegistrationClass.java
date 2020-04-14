package com.syntax.class26;

public class RegistrationClass {

	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (email.endsWith("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Please use only yahoo account");
		}
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println(" no empty and more than 6 characters");

		}

	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {

			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Password canno contain username");
				}
			} else {
				System.out.println("Password needs to have 6 characters");
			}
		} else {
			System.out.println("Password needs to be separate from username entered");
		}
	}
}
