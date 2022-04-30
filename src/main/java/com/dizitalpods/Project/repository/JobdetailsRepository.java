package com.dizitalpods.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dizitalpods.Project.domain.Jobdetails;

@Repository
public interface JobdetailsRepository extends JpaRepository<Jobdetails,Integer> {

}
