package com.uxpsystems.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.dao.UserProfileEntity;
import com.uxpsystems.assignment.dao.UserProfileRepository;
import com.uxpsystems.assignment.resourcemodel.UserProfile;

@Service
public class UserProfileService {
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	public void createProfile(UserProfile profile) {
		UserProfileEntity userProfileEntity = new UserProfileEntity();
		userProfileEntity.setUsername(profile.getUsername());
		userProfileEntity.setAddress(profile.getAddress());
		userProfileEntity.setPhoneNumber(profile.getPhoneNumber());
		userProfileRepository.save(userProfileEntity);
	}
	
	public void updateProfile(UserProfile profile) {
		UserProfileEntity userProfileEntity = new UserProfileEntity();
		userProfileEntity.setUsername(profile.getUsername());
		userProfileEntity.setAddress(profile.getAddress());
		userProfileEntity.setPhoneNumber(profile.getPhoneNumber());
		userProfileRepository.save(userProfileEntity);
	}

	public void deleteProfile(String username) {
		userProfileRepository.deleteById(username);;
	}

	

}
