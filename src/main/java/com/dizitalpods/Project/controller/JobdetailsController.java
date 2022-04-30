package com.dizitalpods.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dizitalpods.Project.domain.Jobdetails;
import com.dizitalpods.Project.service.JobdetailsService;


@RestController
public class JobdetailsController {
	
	 @Autowired
	private JobdetailsService service;
	
	@GetMapping("/jobdetails")
	public List<Jobdetails> viewData()
	{
		return service.listAll();	
	}
	
	@GetMapping("/jobdetails/{jobid}")
 	public Jobdetails getJobdetails(@PathVariable int jobid)
	{
		return service.get(jobid);	
	}
	
	@PutMapping(value="/jobdetails/{jobid}")
	public ResponseEntity<?> editEmpDEtailsPage(@RequestBody Jobdetails newjobdetail, @PathVariable int jobid) {
		try {
			Jobdetails existingjobdetail= service.get(jobid);
			existingjobdetail.setJobname(newjobdetail.getJobname());
			existingjobdetail.setJobtype(newjobdetail.getJobtype());
			existingjobdetail.setJobvacancy(newjobdetail.getJobvacancy());
			existingjobdetail.setJobdesc(newjobdetail.getJobdesc());
			
			service.save(existingjobdetail);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/jobdetails")
	public void add(@RequestBody Jobdetails  jobdetail)
	{
		service.save(jobdetail);
	}
	
	@DeleteMapping("/jobdetails/{jobid}")
	public void delete(@PathVariable int jobid)
	{
		service.delete(jobid);
	}
}

