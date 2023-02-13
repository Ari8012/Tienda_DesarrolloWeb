
package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author heaa1
 */
@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")/*Responde al Mapping de la ruta base*/
    public String inicio(Model model){
        log.info("Ahora utilizando MVC");
        /*String mensaje = "Estamos en semana 4, saludos";
        model.addAttribute("MensajeSaludo", mensaje);
        
        Cliente cliente = new Cliente("Ariana", "Araya Martinez","ariam7273@gmail.com", "8888-8888");
        Cliente cliente2 = new Cliente("Maria", "Rodriguez Abarca","mrm1@gmail.com", "8888-8888");
        Cliente cliente3 = new Cliente("Marco", "Rodriguez Abarca","mrm1@gmail.com", "8888-8888");
        //model.addAttribute("cliente", cliente);
        List<Cliente> clientes = Arrays.asList(cliente,cliente2, cliente3);
        model.addAttribute("clientes", clientes);*/
        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index"; /* Listas que se retorna en los controladores estan en Templates*/
    }
    
}
