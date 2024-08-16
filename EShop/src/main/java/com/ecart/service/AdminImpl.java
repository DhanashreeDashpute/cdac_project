package com.ecart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecart.Exception.CustomException;
import com.ecart.model.Admin;
import com.ecart.repo.AdminRepository;

public class AdminImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
//	@Override
//	public Admin getAdminByEmail(String email) {
//		 Optional<Admin> optinal =adminRepository.findByEmail(email);
//		 return optinal
//	}

	@Override
	public Admin addNewAdmin(Admin admin) {
		 
		return adminRepository.save(admin);
	}

}
