package com.example912.demo912.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example912.demo912.model.User;
import com.example912.demo912.repo.UserRepository;

@Service
public class UserService implements IUserService {
 
	@Autowired
	private UserRepository urepo;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User tuser = urepo.saveUser(user);
		return tuser;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List <User>luser = urepo.readUsers();
		return luser;
	}

	/*@Override
	public List<User> getUser(int uid) {
		// TODO 
		 
		return null;
	}*/
	/*@Override
	public List<User> getAllUSers() {
		List<User> luser = urepo.readUsers();
		// TODO Auto-generated method stub
		return luser;
	}*/

	@Override

	public User getUser(int userid) {

	// TODO Auto-generated method stub

	return urepo.getUser(userid);

	//return null;

	}

	@Override
	public int deleteUser(int userid) {
		// TODO Auto-generated method stub
		return	urepo.deleteUser(userid);
	}
}
