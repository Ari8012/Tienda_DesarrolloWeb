package com.Tienda.service;

import com.Tienda.domain.Cliente;
import java.util.List;

/**
 *
 * @author heaa1
 */
public interface ClienteService { //Se crea la firma de los metodos. (Define como un contrato).
    
    public List<Cliente> getClientes(); // Esta es la firma del metodo.
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente); // Se va a utilizar para insertar como para modificar un registro.
    
    public void delete(Cliente cliente);
}
