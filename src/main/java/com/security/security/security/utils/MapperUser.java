package com.security.security.security.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.security.security.dto.UserDto;
import com.security.security.entity.User;

@Component
public class MapperUser {
	private MapperUser() {

	}

	public static UserDto toDto(User entity) {
		return new UserDto(entity.getId(), entity.getName(), entity.getLastName(), entity.getProcess());
	}

	public static User toEntity(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setLastName(userDto.getLastName());
		user.setProcess(userDto.getAuthority());
		return user;
	}

	public static List<UserDto> toDtoList(List<User> findAll) {
		List<UserDto> lista = new ArrayList<>();
		for (User entity : findAll) {
			lista.add(new UserDto(entity.getId(), entity.getName(), entity.getLastName(), entity.getProcess()));			
		}
		return lista;
	}
}
