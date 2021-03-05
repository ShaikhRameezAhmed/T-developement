package com.example.n.demospr.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.model.UserRequestDetail;
import com.example.demo.model.UsersResponse;
import com.example.demo.service.UserService;

@RestController
public class controller {
	
	@Autowired
	private UserService userServiceImpl;

	@PostMapping("/adduser")
	public UsersResponse addUsers(@RequestBody UserRequestDetail userRequestDetail ) {
		UsersResponse userResponse = new UsersResponse();
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userRequestDetail, userDto);
		UserDto useDtofrmDb = userServiceImpl.createUser(userDto);
		BeanUtils.copyProperties(useDtofrmDb, userResponse);
		return userResponse;
		
	}
	
}
