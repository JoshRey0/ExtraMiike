package com.extra.extra.Service;

import com.extra.extra.Moduls.Detalle_pedido;
import com.extra.extra.Moduls.Oficina;
import com.extra.extra.Repositorys.RepositoryDetalle_pedido;
import com.extra.extra.Repositorys.RepositoryOficina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ServiceOficina {
    @Autowired
    private RepositoryOficina repository;


    @Transactional(readOnly = true)
    public ResponseEntity<List<Oficina>> getAll(){
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }
}
