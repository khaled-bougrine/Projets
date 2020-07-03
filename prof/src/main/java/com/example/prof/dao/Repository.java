package com.example.prof.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prof.model.Prof;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Prof,Integer> {
	List<Prof> findAll();


}
