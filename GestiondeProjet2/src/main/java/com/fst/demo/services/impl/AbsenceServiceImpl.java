package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.demo.models.Absence;
import com.fst.demo.repository.IAbsenceDao;
import com.fst.demo.services.IAbsenceService;


@Service
public class AbsenceServiceImpl implements IAbsenceService {

	
	@Autowired
	IAbsenceDao dao;
	

	@Override
	public Absence add(Absence t) {
			return dao.save(t);

	}

	@Override
	public Absence update(Absence t) {
		return dao.save(t);
	}

	@Override
	public Absence getOne(Long id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Absence> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(Long id) {
	dao.deleteById(id);

	}

}
