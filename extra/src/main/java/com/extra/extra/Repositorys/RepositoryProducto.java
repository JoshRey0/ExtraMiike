package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProducto extends JpaRepository<Producto,String> {
}
