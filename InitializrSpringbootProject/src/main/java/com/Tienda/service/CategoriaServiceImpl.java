package com.Tienda.service;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service// Toda clase de Implementacion requiere la anotacion de @Service.
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public List<Categoria> getCategorias(boolean activos){
        var lista = (List<Categoria>)categoriaDao.findAll();// Se guarda todas las categorias en listas
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null); // Para que devuelva un categoria.
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }
    
    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.deleteById(categoria.getIdCategoria());
    }    
}
