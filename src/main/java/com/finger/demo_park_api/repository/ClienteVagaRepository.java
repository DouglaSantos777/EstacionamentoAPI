package com.finger.demo_park_api.repository;

import com.finger.demo_park_api.entities.Cliente;
import com.finger.demo_park_api.entities.ClienteVaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteVagaRepository extends JpaRepository<ClienteVaga, Long> {


    ClienteVaga cliente(Cliente cliente);
}
