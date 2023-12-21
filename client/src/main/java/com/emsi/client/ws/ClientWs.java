package com.emsi.client.ws;

import com.emsi.client.bean.Client;
import com.emsi.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ClientWs {
    @Autowired
    private ClientService clientService;

    @GetMapping("clients")
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @GetMapping("clients/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return clientService.findById(id);
    }
    @PostMapping("/client")
    public int save(@RequestBody Client client) {
        return clientService.save(client);
    }
    @GetMapping("clients/matricule/{matricule}")
    public Client findByMatricule(@PathVariable String matricule) {
        return clientService.findByMatricule(matricule);
    }
}
