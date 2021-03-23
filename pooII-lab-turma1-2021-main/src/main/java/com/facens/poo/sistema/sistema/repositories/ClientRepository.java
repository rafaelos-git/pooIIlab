package com.facens.poo.sistema.sistema.repositories;

import com.facens.poo.sistema.sistema.entities.Client;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client,Long> {
    //consulta JPQL
    @Query("SELECT c FROM Client c")
    public Page<Client> find(Pageable pageRequest);
    
}



