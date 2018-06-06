package com.hone.BookManager.po;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserInfo implements UserDetails {

	private Long id;
	private String name;
	private String password;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean enabled;
	private boolean credentialsNonExpired;
	private Collection<? extends GrantedAuthority> grantedAuthorities;
	
	
	public UserInfo(Long id,String name, String password,
			boolean accountNonExpired, boolean accountNonLocked,
			boolean enabled, boolean credentialsNonExpired,
			Collection<? extends GrantedAuthority> grantedAuthorities) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.enabled = enabled;
		this.credentialsNonExpired = credentialsNonExpired;
		this.grantedAuthorities = grantedAuthorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {

		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
	
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
	
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		
		return enabled;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}