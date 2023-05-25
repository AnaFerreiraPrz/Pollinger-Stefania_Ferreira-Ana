package com.backend.dao.impl;

import java.util.List;

public interface IDao<T> {

    T guardar(T t);

    List<T> listarTodos();

    void eliminar(int id);

    T buscarPorId(int id);

}