package com.fst.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fst.demo.models.Candidat;


@Repository
public interface ICandidatDao extends JpaRepository<Candidat, Long> {

@Query("select e from Candidat e where e.nom_cand like : x")
	public List<Candidat> chercher(@Param("x")String nom_cand);
// ou bien......
 	// List<Candidat> findByNomContains(String nom_cand);
	

}
