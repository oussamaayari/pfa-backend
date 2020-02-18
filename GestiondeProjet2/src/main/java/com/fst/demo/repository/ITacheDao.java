package com.fst.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.demo.models.Tache;


@Repository
public interface ITacheDao extends JpaRepository<Tache, Long> {
	

}
