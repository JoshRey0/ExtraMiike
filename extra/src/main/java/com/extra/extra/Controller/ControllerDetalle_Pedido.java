package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Detalle_pedido;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServiceDetalle_pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ControllerDetalle_Pedido {
    @Autowired
    private ServiceDetalle_pedido service;
    @GetMapping("/Detalle_Pedido")
    public ResponseEntity<List<Detalle_pedido>> getAll(){
        return this.service.getAll();
    }
}
