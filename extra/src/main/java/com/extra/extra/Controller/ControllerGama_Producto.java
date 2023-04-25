package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Gama_producto;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServiceGama_producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerGama_Producto {
    @Autowired
    private ServiceGama_producto service;
    @GetMapping("/Gama_Producto")
    public ResponseEntity<List<Gama_producto>> getAll(){
        return this.service.getAll();
    }
}
