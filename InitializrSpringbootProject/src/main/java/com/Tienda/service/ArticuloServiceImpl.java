package com.Tienda.service;

import com.Tienda.dao.ArticuloDao;
import com.Tienda.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author heaa1
 */
@Service// Toda clase de Implementacion requiere la anotacion de @Service.
public class ArticuloServiceImpl implements ArticuloService {
    
    @Autowired
    ArticuloDao articuloDao;

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public List<Articulo> getArticulos(boolean activos){
        var lista = (List<Articulo>)articuloDao.findAll();// Se guarda todas las articulos en listas
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null); // Para que devuelva un articulo.
    }   
}

