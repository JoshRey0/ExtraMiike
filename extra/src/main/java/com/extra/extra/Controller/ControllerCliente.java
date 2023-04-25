package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Service.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class ControllerCliente {
    @Autowired
    private ServiceCliente service;
    @GetMapping("/Cliente")
    public ResponseEntity<List<Cliente>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/ClienteNotPaid")
    public ResponseEntity<List<Cliente>> getAllnotPaid(){
        return this.service.getAllnotPaid();
    }

    @GetMapping("/ClienteNotOrder")
    public ResponseEntity<List<Cliente>> getAllnotOrder(){
        return this.service.getAllnotOrder();
    }

    @GetMapping("/ClienteNotNot")
    public ResponseEntity<List<Cliente>> getAllnot(){
        return this.service.getAllnot();
    }


    @GetMapping("/ClienteOrderCountry")
    public ResponseEntity<List<Object[]>> getOrderCountry(){
        return this.service.getGroupCountry();
    }

    @GetMapping("/ClientemayorLimit")
    public String mayorlimit() {
        return service.mayorLimit();
    }
}
