package com.example.voiture.required;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@FeignClient(name ="CLIENT" ,url = "http://localhost:8090/")
public interface ClientRequired {
    @GetMapping("clients")
    public List<ClientVo> findAll();
    @GetMapping("clients/{id}")
    public Optional<ClientVo> findById(@PathVariable Long id);

    @PostMapping("/client")
    public int save(@RequestBody ClientVo client);

    @GetMapping("clients/matricule/{matricule}")
    public ClientVo findByMatricule(@PathVariable String matricule);
}
