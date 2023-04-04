package com.Tienda.domain;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author heaa1
 */
@Data // ayuda a crear de manera automatica los Get y Set
@Entity
@Table(name = "articulo")
public class Articulo implements Serializable{

    private static final long serialVersonUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private String precio;
    private int existencias;
    private boolean activo;

    public Articulo(Long idCategoria, String descripcion, String detalle, String precio, int existencias, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.activo = activo;
    }

    public Articulo() {
    }
    
    
    
}
