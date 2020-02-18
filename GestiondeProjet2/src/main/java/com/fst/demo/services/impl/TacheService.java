package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.demo.models.Tache;
import com.fst.demo.repository.ITacheDao;
import com.fst.demo.services.IQuestionService;
    @Service
   
public class TacheService implements IQuestionService {
 	
    	@Autowired
    	private ITacheDao dao ;
    	
    	
	@Override
	public Tache add(Tache t) {
		// TODO Auto-generated method stub
		
		return dao.save(t);
	}

	@Override
	public Tache update(Tache t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Tache getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Tache> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
       dao.deleteById(id);
	}

	public ITacheDao getDao() {
		return dao;
	}

	public void setDao(ITacheDao dao) {
		this.dao = dao;
	}

}
