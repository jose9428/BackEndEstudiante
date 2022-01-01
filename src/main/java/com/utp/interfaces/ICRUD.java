package com.utp.interfaces;

import java.util.List;

public interface ICRUD <T> {

	T  crear(T t);
	T actualizar(T t);
	T listaPorId(Integer id);
	List<T> listarTodos();
	void eliminar(Integer id);
	
}
