package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(
                1
                ,"170123456"
                ,"Bob"
                ,"Esponja"
                ,"En el mar"
                ,"0987654321"
                ,"besponja@correo.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias constructor Cliente",
                () -> assertEquals(1,cliente.getIdCliente()),
                () -> assertEquals("170123456",cliente.getCedula()),
                () -> assertEquals("Bob",cliente.getNombre()),
                () -> assertEquals("Esponja",cliente.getApellido()),
                () -> assertEquals("En el mar",cliente.getDireccion()),
                () -> assertEquals("0987654321",cliente.getTelefono()),
                () -> assertEquals("besponja@correo.com",cliente.getCorreo())
                );

        System.out.println("====================== Test unitarias en cliente =================");
        System.out.println(cliente.toString());

    }
    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1701234568");
        cliente.setNombre("Juan3");
        cliente.setApellido("Taipe");
        cliente.setDireccion("Av.por ahi, 3,");
        cliente.setTelefono("0987654323");
        cliente.setCorreo("jtaipe3@correo.com");

        assertAll("Pruebas unitarias setters Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1701234568",cliente.getCedula()),
                () -> assertEquals("Juan3",cliente.getNombre()),
                () -> assertEquals("Taipe",cliente.getApellido()),
                () -> assertEquals("Av.por ahi, 3,",cliente.getDireccion()),
                () -> assertEquals("0987654323",cliente.getTelefono()),
                () -> assertEquals("jtaipe3@correo.com",cliente.getCorreo())
        );
    }


    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Validad datos de cliente con toString",
                () ->assertTrue(str.contains("1")),
                () ->assertTrue(str.contains("170123456")),
                () ->assertTrue(str.contains("Bob")),
                () ->assertTrue(str.contains("Esponja")),
                () ->assertTrue(str.contains("En el mar")),
                () ->assertTrue(str.contains("0987654321")),
                () ->assertTrue(str.contains("besponja@correo.com"))
        );
    }
}
