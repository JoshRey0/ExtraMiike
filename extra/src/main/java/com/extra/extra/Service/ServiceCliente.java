package com.extra.extra.Service;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Repositorys.RepositoryCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ServiceCliente {
    @Autowired
    private RepositoryCliente repository;


    @Transactional(readOnly = true)
    public ResponseEntity<List<Cliente>> getAll(){
        return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Cliente>> getAllnotPaid(){
        return new ResponseEntity<>(this.repository.findClientesNotPaid(), HttpStatus.OK);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Cliente>> getAllnotOrder(){
        return new ResponseEntity<>(this.repository.findClientesNotOrder(), HttpStatus.OK);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Cliente>> getAllnot(){
        return new ResponseEntity<>(this.repository.findClientesNotOrderNotPaid(), HttpStatus.OK);
    }

    @Transactional(readOnly = true)
    public ResponseEntity<List<Object[]>> getGroupCountry(){
        return new ResponseEntity<>(this.repository.findClientesCountry(), HttpStatus.OK);
    }

    public String mayorLimit() {
        return repository.mayorLimit();
    }
}
