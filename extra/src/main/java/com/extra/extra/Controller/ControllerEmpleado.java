package com.extra.extra.Controller;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Empleado;
import com.extra.extra.Service.ServiceCliente;
import com.extra.extra.Service.ServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ControllerEmpleado {
    @Autowired
    private ServiceEmpleado service;
    @GetMapping("/Empleado")
    public ResponseEntity<List<Empleado>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/EmpleadoNotOffice")
    public ResponseEntity<List<Empleado>> getNotOffice(){
        return this.service.getAllnotOffice();
    }

    @GetMapping("/EmpleadoNotClient")
    public ResponseEntity<List<Empleado>> getNotClient(){
        return this.service.getAllnotClient();
    }

    @GetMapping("/EmpleadoCount")
    public long countEmpleados() {
        return service.obtenerCantidadEmpleados();
    }


}
