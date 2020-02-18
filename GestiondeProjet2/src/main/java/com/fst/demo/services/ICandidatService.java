package com.fst.demo.services;

import java.util.List;

import com.fst.demo.models.Candidat;

public interface ICandidatService extends ICrudService<Candidat, Long> {
public List<Candidat> Chercher (String Mot);
}
