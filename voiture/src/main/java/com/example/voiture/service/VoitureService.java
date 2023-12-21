package com.example.voiture.service;

import com.example.voiture.bean.Voiture;
import com.example.voiture.dao.VoitureDao;
import com.example.voiture.required.ClientRequired;
import com.example.voiture.required.ClientVo;
import com.example.voiture.required.VoitureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VoitureService {
    @Autowired
    private VoitureDao voitureDao;
    @Autowired
    private ClientRequired clientRequired;

    public List<Voiture> findAll() {
        return voitureDao.findAll();
    }

    public int save(Voiture voiture) {
        if (clientRequired.findByMatricule(voiture.getClientMatricule()) != null) {
            voitureDao.save(voiture);
            return 1;
        } else return -1;
    }

    public Voiture findByMatricule(String matricule) {
        return voitureDao.findByMatricule(matricule);
    }

    ;

    public int deleteByMatricule(String matricule) {
        return voitureDao.deleteByMatricule(matricule);
    }

    ;

    public List<VoitureVo> findAllVoiture() {
        List<VoitureVo> voitureVoList = new ArrayList<>();
        voitureDao.findAll().stream()
                .forEach(voiture -> {
                    voitureVoList.add(new VoitureVo(voiture.getId(), voiture.getMatricule(), voiture.getMarque(), voiture.getModel(), clientRequired.findByMatricule(voiture.getClientMatricule())));
                });
        return voitureVoList;
    }
}
