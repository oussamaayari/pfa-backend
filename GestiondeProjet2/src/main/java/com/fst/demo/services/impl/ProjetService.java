package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.demo.models.Projet;
import com.fst.demo.repository.IProjetDao;
import com.fst.demo.services.IEntretienService;


@Service

public class ProjetService implements IEntretienService {

	@Autowired
	
	private IProjetDao dao;
	
	@Override
	public Projet add(Projet t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Projet update(Projet t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Projet getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Projet> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
         dao.deleteById(id);
	}

	public IProjetDao getDao() {
		return dao;
	}

	public void setDao(IProjetDao dao) {
		this.dao = dao;
	}

}
