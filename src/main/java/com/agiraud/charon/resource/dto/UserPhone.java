package com.agiraud.charon.resource.dto;

import com.agiraud.charon.core.dto.User;

import lombok.Data;

@Data
public class UserPhone {
	private String phoneNumber;

	public UserPhone(User user) {
		this.phoneNumber = user.getPhoneNumber();
	}
}
