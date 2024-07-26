package com.reating.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reating.Entities.Reating;

public interface ReatingRepo extends JpaRepository<Reating,String>{

	List<Reating> findByUserId(String userid);
	
	List<Reating> findByHotelId(String userid);
}

