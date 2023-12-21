package com.example.voiture.ws;


import com.example.voiture.bean.Voiture;
import com.example.voiture.required.VoitureVo;
import com.example.voiture.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class VoitureWs {
    @Autowired
    private VoitureService voitureService;

    //@GetMapping("/")
//    public List<Voiture> findAll() {
//        return voitureService.findAll();
//    }
    @PostMapping("/")
    public int save(@RequestBody Voiture voiture) {
        return voitureService.save(voiture);
    }

    @GetMapping("/matricule/{matricule}")

    public Voiture findByMatricule(@PathVariable String matricule) {
        return voitureService.findByMatricule(matricule);
    }

    @DeleteMapping("/matricule/{matricule}")

    public int deleteByMatricule(@PathVariable String matricule) {
        return voitureService.deleteByMatricule(matricule);
    }

    @GetMapping("/")
    public List<VoitureVo> findAllVoiture() {
        return voitureService.findAllVoiture();
    }
}
