package com.extra.extra.Repositorys;

import com.extra.extra.Moduls.Gama_producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGama_producto extends JpaRepository<Gama_producto,String> {
}
