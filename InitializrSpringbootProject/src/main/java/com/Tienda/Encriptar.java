package com.Tienda;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author heaa1
 */
public class Encriptar {

    public static void main(String[] args) {
        var codigo = new BCryptPasswordEncoder();
        System.out.println("juan (123): " + codigo.encode("123"));
        System.out.println("rebeca (456): " + codigo.encode("456"));
        System.out.println("pedro (789): " + codigo.encode("789"));
    }

}
