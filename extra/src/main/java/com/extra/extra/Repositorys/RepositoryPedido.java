package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryPedido extends JpaRepository<Pedido,Long> {

    @Query(value = "SELECT estado, COUNT(estado) AS num_pedidos FROM pedido GROUP BY estado ORDER BY num_pedidos DESC;",nativeQuery = true)
    List<Object[]> statusCount();
}
