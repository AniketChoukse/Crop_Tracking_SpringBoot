package com.CropTracking.CropTracking.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
public class User implements UserDetails{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid_pk")
	private Long userId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "usercontact")
	private Long contact;
	@Column(name = "userpassword")
	private String password;
//	@Column(name = "addressid_fk")
//	private Long addressId_fk;
	@Column(name = "username")
	private String username;
	
	private Boolean enabled=true;

	// @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy =
	// "user")
//	 private Set<UserRole> userRole=new HashSet<>();

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "userrole", joinColumns = { @JoinColumn(name = "userid_fk") }, inverseJoinColumns = {
			@JoinColumn(name = "roleid_fk") })
	private Set<Role> roles;

	public User() {
	};

	public User(Long userId, String firstName, String lastName, Long contact, String password,String username,Boolean enabled,Set<Role> roles) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.password = password;
		this.username = username;
		this.enabled=enabled;
		this.roles = roles;
	}

//	public Set<UserRole> getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(Set<UserRole> userRole) {
//		this.userRole = userRole;
//	}

//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact
				+ ", password=" + password + ", username=" + username + ",enabled=" + enabled + ", roles="
				+ roles + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<Authority> set=new HashSet<>();
		
		ArrayList<Role> roleList=new ArrayList<>(roles);
		this.roles.forEach(role->{
			set.add(new Authority(role.getRolename()));
		});
		return set;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
