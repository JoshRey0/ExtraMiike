package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Detalle_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDetalle_pedido extends JpaRepository<Detalle_pedido,Long> {
}
