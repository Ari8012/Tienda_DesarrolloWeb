package com.Tienda.dao;

import com.Tienda.domain.Articulo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author heaa1
 */
public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
