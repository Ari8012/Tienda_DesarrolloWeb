
package com.Tienda.service;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author heaa1
 */
@Service// Toda clase de Implementacion requiere la anotacion de @Service.
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public List<Cliente> getClientes() {
        
        return (List<Cliente>)clienteDao.findAll(); // Quiere decir que es un iteravle de clientes. Al agregar List<Cliente> ya devuelve la lista que se desea. 
    }

    @Override
    @Transactional(readOnly = true)// Manejo de transacciones de lectura.
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null); // Para que devuelva un cliente.
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }
    
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }    
}
