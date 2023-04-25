package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOficina extends JpaRepository<Oficina,String> {
}
