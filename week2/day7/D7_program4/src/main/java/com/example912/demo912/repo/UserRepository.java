package com.example912.demo912.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example912.demo912.model.User;
@Component
public class UserRepository {
 private List <User> lUser;
 public UserRepository(){
	 lUser=new ArrayList<User>();// easy to initialize in constructor
 }
 
 //Create
 public User saveUser(User user) {
	 lUser.add(user);
	 return user;
 }
 
 //read
 public List<User> readUsers() {

		return lUser;

	}

	public User getUser(int userid) {

		User user = lUser.stream().filter((usr) -> {
			return usr.getId() == userid;
		}).findFirst().get();

		return user;

	}

	public int deleteUser(int userid) {

		// Optional<User> ouser=Optional.of(luser.stream().filter((usr)->{return
		// usr.getId()==userid;}).findFirst().get());
		Optional<User> ouser = Optional.ofNullable(lUser.stream().filter((usr) -> {
			return usr.getId() == userid;
		}).findFirst().get());

		if (!ouser.isPresent()) {
			return 0;
		} else {
			User user = ouser.get();
			System.out.println("user :" + user);
			lUser.remove(user);
			return userid;
		}
	}
}
