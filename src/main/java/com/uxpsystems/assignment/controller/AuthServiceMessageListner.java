package com.uxpsystems.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.resourcemodel.UserProfile;
import com.uxpsystems.assignment.service.UserProfileService;

@Service
public class AuthServiceMessageListner {
	
	@Value("${custom.kafka.updatetopic}")
	private String updatetopic;
	
	@Value("${custom.kafka.deletetopic}")
	private String deletetopic;
	
	@Autowired
	private UserProfileService userProfileService;
	
	@KafkaListener(topics = "${custom.kafka.updatetopic}")
	public void updateProfile(UserProfile profile) {
		
		userProfileService.updateProfile(profile);
    }
	
	@KafkaListener(topics = "${custom.kafka.deletetopic}")
    public void deleteProfile(UserProfile profile) {
		
		userProfileService.deleteProfile(profile.getUsername());
    }
	

}
