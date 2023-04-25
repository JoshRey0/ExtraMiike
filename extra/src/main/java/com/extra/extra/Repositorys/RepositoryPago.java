package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryPago extends JpaRepository<Pago,Long> {
    @Query(value = "SELECT AVG(total) as pago_medio FROM pago WHERE fecha_pago BETWEEN '2009-01-01' AND '2009-12-31';",nativeQuery = true)
    Double Medio2009();

}
