package com.example.voiture.dao;

import com.example.voiture.bean.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VoitureDao extends JpaRepository<Voiture,Long> {
    Voiture findByMatricule(String matricule);
    int deleteByMatricule(String matricule);
}
