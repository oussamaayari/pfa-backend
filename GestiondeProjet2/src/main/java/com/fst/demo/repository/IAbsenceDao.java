package com.fst.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fst.demo.models.Absence;

public interface IAbsenceDao extends  JpaRepository<Absence,Long> {

}
