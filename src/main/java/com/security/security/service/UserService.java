package com.security.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.security.dao.UserDao;
import com.security.security.dto.UserDto;
@Service
public class UserService {
	@Autowired
	private UserDao daoUser;
	
	public List<UserDto> get() {
		return daoUser.findAll();
	}
	
	public UserDto save(UserDto userDto) {		
		return daoUser.save(userDto);
	}

}
