
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author heaa1
 */
@Data
@Entity
@Table(name="cliente")
public class Cliente {
    
    private static final long serialVersonUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;//Transformar en id_cliente.
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente(String nombre, String apellido, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.correo = "";
        this.telefono = "";
    }
}

