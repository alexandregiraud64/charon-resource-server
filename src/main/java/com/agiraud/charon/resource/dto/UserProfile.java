package com.agiraud.charon.resource.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.agiraud.charon.core.dto.User;

import lombok.Data;

@Data
public class UserProfile {
	private String username;
	private UUID userId;
	private String fullName;
	private boolean enabled;
	private String profileImage;
	private List<String> roles = new ArrayList<>();

	public UserProfile(User user) {
		this.username = user.getUsername();
		this.userId = user.getUserId();
		this.fullName = user.getFullName();
		this.enabled = user.isEnabled();
		this.profileImage = user.getProfileImage();
		this.roles = user.getRoles();
	}
}
