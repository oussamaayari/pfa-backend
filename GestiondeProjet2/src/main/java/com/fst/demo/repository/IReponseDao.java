package com.fst.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fst.demo.models.Reponse;

@Repository
public interface IReponseDao extends JpaRepository<Reponse, Long>  {

}
