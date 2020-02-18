package com.fst.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fst.demo.models.Projet;


@Repository	
public interface IProjetDao extends JpaRepository<Projet, Long>{

	@Query("SELECT u FROM Projet u WHERE u.type_entr like %:name% or u.lieu_entr like %:name% ")
    List<Projet> rechercher(@Param("name") String name);
	
}
