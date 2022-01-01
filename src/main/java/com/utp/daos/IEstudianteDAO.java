package com.utp.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.models.Estudiante;

@Repository
public interface IEstudianteDAO extends JpaRepository<Estudiante, Integer> {

}
