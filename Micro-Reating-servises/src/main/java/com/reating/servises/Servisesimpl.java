package com.reating.servises;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reating.Entities.Reating;
import com.reating.Repositories.ReatingRepo;

@Service
public class Servisesimpl implements Servises{
	@Autowired
private ReatingRepo repo;
	@Override
	public Reating addReating(Reating reat) {
		// TODO Auto-generated method stub
		return repo.save(reat);
	}

	@Override
	public List<Reating> allReatings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Reating ReatingById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Reating> ReatingUserId(String id) {
		// TODO Auto-generated method stub
		return repo.findByUserId(id);
	}

	@Override
	public List<Reating> ReatingHotelId(String id) {
		// TODO Auto-generated method stub
		return repo.findByHotelId(id);
	}

}
