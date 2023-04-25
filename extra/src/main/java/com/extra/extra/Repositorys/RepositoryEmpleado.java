package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Cliente;
import com.extra.extra.Moduls.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryEmpleado extends JpaRepository<Empleado,Long> {

    /*4*/@Query(value = "SELECT * FROM empleado WHERE codigo_oficina IS NULL;",nativeQuery = true)
    List<Empleado> findEmpleadoNotOffice();

    /*5*/@Query(value = "SELECT * FROM empleado WHERE codigo_empleado NOT IN (SELECT codigo_empleado_rep_ventas FROM cliente);"
            ,nativeQuery = true)
    List<Empleado> findEmpleadoNotClient();

    /*6*/ long count();

}
