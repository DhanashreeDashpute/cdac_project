package com.ecart.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecart.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	
	Optional<Admin> findByEmail(String email);
}
