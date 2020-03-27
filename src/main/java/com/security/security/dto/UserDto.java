package com.security.security.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7868921555530898L;
	private Long id;
	private String name;
	private String lastName;
	private Integer authority;
	
	public UserDto() {
		
	}

	
	public UserDto(Long id, String name, String lastName, Integer authority) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.authority = authority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAuthority() {
		return authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

}
