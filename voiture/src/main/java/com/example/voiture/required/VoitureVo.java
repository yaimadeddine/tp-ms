package com.example.voiture.required;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoitureVo {
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    private ClientVo client;
}
