package com.emsi.client.service;

import com.emsi.client.bean.Client;
import com.emsi.client.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public Optional<Client> findById(Long id) {
        return clientDao.findById(id);
    }

    public int save(Client client) {
            clientDao.save(client);
        return 1;
    }

    public Client findByMatricule(String matricule){
        return clientDao.findByMatricule(matricule);
    };

    @Autowired
    private ClientDao clientDao;
}
