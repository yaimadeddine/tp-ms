package com.emsi.client.dao;

import com.emsi.client.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client, Long> {
    Client findByMatricule(String matricule);
}
