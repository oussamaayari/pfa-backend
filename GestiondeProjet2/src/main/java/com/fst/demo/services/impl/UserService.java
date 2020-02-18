package com.fst.demo.services.impl;
//package com.fr.adaming.demo.services.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.fr.adaming.demo.models.User;
//import com.fr.adaming.demo.repository.IUserDao;
//import com.fr.adaming.demo.services.IUserService;
//
//
//
//@Service("userDetailsService")
//public class UserService implements UserDetailsService,IUserService{
//
//	@Autowired
//	private IUserDao iUserDao;
//	
//
//	
//	@Override
//	public User add(User t) {
//
//		return iUserDao.save(t);
//	}
//
//	@Override
//	public User update(User t) {
//		// TODO Auto-generated method stub
//		return iUserDao.save(t);
//	}
//
//	@Override
//	public User getOne(Long id) {
//		// TODO Auto-generated method stub
//		return iUserDao.getOne(id);
//	}
//
//	@Override
//	public List<User> findAll() {
//		// TODO Auto-generated method stub
//		return iUserDao.findAll();
//	}
//
//	@Override
//	public void delete(Long id) {
//		// TODO Auto-generated method stub
//		iUserDao.deleteById(id);
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return iUserDao.findoneByUsername(username);
//	}
//
//	public IUserDao getiUserDao() {
//		return iUserDao;
//	}
//
//	public void setiUserDao(IUserDao iUserDao) {
//		this.iUserDao = iUserDao;
//	}
//
//}
