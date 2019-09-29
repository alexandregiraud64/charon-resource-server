package com.agiraud.charon.resource.dto;

import com.agiraud.charon.core.dto.User;

import lombok.Data;

@Data
public class UserEmail {
	private String emailAddress;

	public UserEmail(User user) {
		this.emailAddress = user.getEmailAddress();
	}
	
	
}
