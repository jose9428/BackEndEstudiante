package com.utp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.interfaces.IEstudianteService;
import com.utp.models.Estudiante;
import com.utp.services.EstudianteServiceImpl;

@RestController
@RequestMapping(value = "/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping
	public List<Estudiante> listarTodo(){
		return estudianteService.listarTodos();
	}
	
	@GetMapping(value = "/{id}")
	public Estudiante listarPorId(@PathVariable("id") Integer id){
		return estudianteService.listaPorId(id);
	}
	
	@PostMapping
	public Estudiante crear(@RequestBody Estudiante estudiante) {
		return  estudianteService.crear(estudiante);	
	}
	
	@PutMapping
	public Estudiante actualizar(@RequestBody Estudiante estudiante) {
		return  estudianteService.actualizar(estudiante);	
	}
	
	
}
