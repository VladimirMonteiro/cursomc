package com.outercode.cursomc.services;

import com.outercode.cursomc.domain.Client;
import com.outercode.cursomc.exceptions.ObjectNotFoundException;
import com.outercode.cursomc.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public Client search(Integer id){
        Optional<Client> client = clientRepository.findById(id);

        if(client.isEmpty()){
            throw new ObjectNotFoundException("Client not found " + id + " type: " + Client.class.getName());
        }

        return client.get();

    }
}
