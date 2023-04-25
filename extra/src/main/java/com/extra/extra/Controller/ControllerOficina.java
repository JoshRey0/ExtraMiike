package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Oficina;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServiceOficina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerOficina {
    @Autowired
    private ServiceOficina service;
    @GetMapping("/Oficina")
    public ResponseEntity<List<Oficina>> getAll(){
        return this.service.getAll();
    }
}
