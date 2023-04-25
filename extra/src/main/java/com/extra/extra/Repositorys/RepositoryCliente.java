package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryCliente extends JpaRepository<Cliente,Integer> {
   /*1*/ @Query(value = "SELECT * FROM cliente WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago)",nativeQuery = true)
    List<Cliente> findClientesNotPaid();

    /*2*/@Query(value = "SELECT * FROM cliente WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pedido)",nativeQuery = true)
    List<Cliente> findClientesNotOrder();

    /*3*/@Query(value = "SELECT * FROM cliente WHERE codigo_cliente NOT IN (SELECT codigo_cliente FROM pago )UNION SELECT *\n" +
            "FROM cliente\n" +
            "WHERE  codigo_cliente NOT IN (\n" +
            "  SELECT codigo_cliente\n" +
            "  FROM pedido\n" +
            ")",nativeQuery = true)
    List<Cliente> findClientesNotOrderNotPaid();

    /*7*/@Query(value = "SELECT pais, COUNT(codigo_cliente) as cantidad_clientes FROM cliente GROUP BY pais;",nativeQuery = true)
    List<Object[]> findClientesCountry();

    @Query(value = "SELECT nombre_cliente FROM cliente ORDER BY limite_credito DESC LIMIT 1;",nativeQuery = true)
    String mayorLimit();


}
