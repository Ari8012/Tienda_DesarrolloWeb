package com.Tienda.service;

import com.Tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author heaa1
 */
public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activos); 
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo); 
    
    public void delete(Articulo articulo);
    
    
}
