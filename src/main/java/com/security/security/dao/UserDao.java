package com.security.security.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.security.security.dto.UserDto;
import com.security.security.entity.User;
import com.security.security.repository.UserRepository;
import com.security.security.security.utils.MapperUser;
@Component
public class UserDao {
	
	private static Integer NOT_AUTHORITY = 0;
	@Autowired
	private UserRepository userRepository;
	
	public List<UserDto> findAll() {
		return MapperUser.toDtoList(userRepository.findAll());
	}

	public UserDto save(UserDto userDto) {
		userDto.setAuthority(NOT_AUTHORITY);
		User user = userRepository.save(MapperUser.toEntity(userDto));
		return MapperUser.toDto(user);
	}	

}
