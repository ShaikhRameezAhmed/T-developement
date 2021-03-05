package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDto createUser(UserDto userDto) {
		UserEntity usrEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, usrEntity);		
		usrEntity.setEncryptedPassword("test");
		usrEntity.setUserId("TestserID");
		UserEntity saveUserEntity = userRepository.save(usrEntity);
		UserDto outputDto = new UserDto();
		BeanUtils.copyProperties(saveUserEntity, outputDto);
		return outputDto;

	}

}
