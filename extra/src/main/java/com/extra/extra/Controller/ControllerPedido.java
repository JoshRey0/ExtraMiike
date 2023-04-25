package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Pedido;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServicePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerPedido {
    @Autowired
    private ServicePedido service;
    @GetMapping("/Pedido")
    public ResponseEntity<List<Pedido>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/statusCount")
    public ResponseEntity<List<Object[]>> getOrderCountry(){
        return this.service.getStatus();
    }
}
