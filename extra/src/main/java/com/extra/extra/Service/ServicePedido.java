package com.extra.extra.Service;

import com.extra.extra.Moduls.Detalle_pedido;
import com.extra.extra.Moduls.Pedido;
import com.extra.extra.Repositorys.RepositoryDetalle_pedido;
import com.extra.extra.Repositorys.RepositoryPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ServicePedido {
    @Autowired
    private RepositoryPedido repository;


    @Transactional(readOnly = true)
    public ResponseEntity<List<Pedido>> getAll(){
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);

    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Object[]>> getStatus(){
        return new ResponseEntity<>(this.repository.statusCount(), HttpStatus.OK);
    }
}
