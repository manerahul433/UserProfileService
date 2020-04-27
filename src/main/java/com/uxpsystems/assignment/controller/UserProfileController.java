package com.uxpsystems.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uxpsystems.assignment.common.UserProfileServiceException;
import com.uxpsystems.assignment.resourcemodel.UserProfile;
import com.uxpsystems.assignment.service.UserProfileService;

@RestController
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;

	@RequestMapping(method = RequestMethod.POST,path = "/profile")
    public @ResponseBody ResponseEntity<Void> createProfile(@RequestBody UserProfile profile) throws UserProfileServiceException {
		
		userProfileService.createProfile(profile);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
