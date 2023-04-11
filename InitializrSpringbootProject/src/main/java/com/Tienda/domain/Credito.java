package com.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author heaa1
 */
@Data // ayuda a crear de manera automatica los Get y Set
@Entity
@Table(name="credito")
public class Credito implements Serializable{ // Ayuda a cambiar objetos en varios tipos de elementos 
    
    private static final long serialVersonUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_credito")//Permite indicar con cual campo de la base de datos se va a mapear
    private Long idCredito;
    private double limite;

    public Credito( double limite) {
        this.limite = limite;
    }

    public Credito() {
    }
    
    
    
    
    
}
