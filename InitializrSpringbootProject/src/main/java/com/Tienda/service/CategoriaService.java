package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author heaa1
 */
public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos); // Esta es la firma del metodo.
    
    public Categoria getCategoria(Categoria categoria);
    
    public void save(Categoria categoria); // Se va a utilizar para insertar como para modificar un registro.
    
    public void delete(Categoria categoria);
    
}
