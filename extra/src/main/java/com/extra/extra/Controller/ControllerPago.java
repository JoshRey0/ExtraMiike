package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Pago;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServicePago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerPago {
    @Autowired
    private ServicePago service;
    @GetMapping("/Pago")
    public ResponseEntity<List<Pago>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/PagoMedio")
    public Double countEmpleados() {
        return service.medio();
    }
}
