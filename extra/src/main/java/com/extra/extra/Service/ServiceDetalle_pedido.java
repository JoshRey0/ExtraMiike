package com.extra.extra.Service;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Detalle_pedido;
import com.extra.extra.Repositorys.RepositoryCliente;
import com.extra.extra.Repositorys.RepositoryDetalle_pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ServiceDetalle_pedido {
    @Autowired
    private RepositoryDetalle_pedido repository;


    @Transactional(readOnly = true)
    public ResponseEntity<List<Detalle_pedido>> getAll(){
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }
}
