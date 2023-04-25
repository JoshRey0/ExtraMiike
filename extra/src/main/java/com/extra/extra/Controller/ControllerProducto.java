package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Producto;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServiceProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerProducto {
    @Autowired
    private ServiceProducto service;
    @GetMapping("/Producto")
    public ResponseEntity<List<Producto>> getAll(){
        return this.service.getAll();
    }
}
