package com.StudenteTymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudenteTymeleaf.model.Studente;
@Repository
public interface StudenteRepository extends JpaRepository<Studente, Integer>{

}
