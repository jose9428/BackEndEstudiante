package com.utp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.daos.IEstudianteDAO;
import com.utp.interfaces.IEstudianteService;
import com.utp.models.Estudiante;


@Service
public class EstudianteServiceImpl implements IEstudianteService {
	
	@Autowired
	private IEstudianteDAO dao;

	@Override
	public Estudiante crear(Estudiante t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Estudiante actualizar(Estudiante t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Estudiante listaPorId(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Estudiante> listarTodos() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
