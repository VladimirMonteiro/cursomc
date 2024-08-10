package com.outercode.cursomc.controllers;



import com.outercode.cursomc.domain.Client;
import com.outercode.cursomc.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<?> search(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(clientService.search(id));
    }
}
