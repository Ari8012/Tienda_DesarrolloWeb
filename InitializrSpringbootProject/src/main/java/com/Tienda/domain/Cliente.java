
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author heaa1
 */
@Data // ayuda a crear de manera automatica los Get y Set
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersonUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;//Transformar en id_cliente.
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    
    @JoinColumn(name="id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito credito;

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

