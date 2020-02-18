package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.demo.models.Candidat;
import com.fst.demo.repository.ICandidatDao;
import com.fst.demo.services.ICandidatService;


@Service
public class CandidatService implements ICandidatService {

	@Autowired
	private ICandidatDao dao;
	
	
	@Override
	public Candidat add(Candidat t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Candidat update(Candidat t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Candidat getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Candidat> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

		dao.deleteById(id);
		
	}
	
	
	
	//getters & setters dao

	public ICandidatDao getDao() {
		return dao;
	}

	public void setDao(ICandidatDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Candidat> Chercher(String Mot) {
		// TODO Auto-generated method stub
		return dao.chercher(Mot);
	}



	
	}


