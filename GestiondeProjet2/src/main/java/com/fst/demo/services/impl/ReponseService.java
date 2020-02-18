package com.fst.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fst.demo.models.Reponse;
import com.fst.demo.repository.IReponseDao;
import com.fst.demo.services.IReponseService;


@Service
public class ReponseService implements IReponseService {

	@Autowired
	private IReponseDao dao;
	
	
	
	@Override
	public Reponse add(Reponse t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Reponse update(Reponse t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Reponse getOne(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Reponse> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
      dao.deleteById(id);
	}

	public IReponseDao getDao() {
		return dao;
	}

	public void setDao(IReponseDao dao) {
		this.dao = dao;
	}

}
