package com.dizitalpods.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dizitalpods.Project.domain.Jobdetails;
import com.dizitalpods.Project.repository.JobdetailsRepository;

@Service
public class JobdetailsService {
	@Autowired
	private JobdetailsRepository repo;
	
	public List<Jobdetails> listAll()
	{
		return repo.findAll();
	}
	public void save(Jobdetails j)
	{
		repo.save(j);
	}
	public Jobdetails get(int jobid)
	{
		return repo.findById(jobid).get();
	}
	
	public void delete(int jobid)
	{
		repo.deleteById(jobid);
	}
}
	

