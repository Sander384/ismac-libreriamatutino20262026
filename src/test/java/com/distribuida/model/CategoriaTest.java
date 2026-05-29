//package com.distribuida.model;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CategoriaTest {
//
//    private Categoria categoria;
//
//    @BeforeEach
//    public void setUp() {
//        // Inicializamos una categoría de prueba base
//        categoria = new Categoria(
//                1L,
//                "Ciencia Ficción",
//                "Libros sobre tecnología futurista y espacio",
//                true
//        );
//    }
//
//    @Test
//    public void testCategoriaConstructorAndGetters() {
//        assertAll("Pruebas unitarias constructor Categoria",
//                () -> assertEquals(1L, categoria.getId()),
//                () -> assertEquals("Ciencia Ficción", categoria.getNombre()),
//                () -> assertEquals("Libros sobre tecnología futurista y espacio", categoria.getDescripcion()),
//                () -> assertTrue(categoria.isActiva())
//        );
//
//        System.out.println("====================== Test unitarias en categoria =================");
//        System.out.println(categoria.toString());
//    }
//
//    @Test
//    public void testCategoriaSetters() {
//        // Modificamos los valores usando los setters bajo tu estructura
//        categoria.setId(2L);
//        categoria.setNombre("Terror");
//        categoria.setDescripcion("Novelas de suspenso y horror");
//        categoria.setActiva(false);
//
//        assertAll("Pruebas unitarias setters Categoria",
//                () -> assertEquals(2L, categoria.getId()),
//                () -> assertEquals("Terror", categoria.getNombre()),
//                () -> assertEquals("Novelas de suspenso y horror", categoria.getDescripcion()),
//                () -> assertFalse(categoria.isActiva()) // Validamos que cambió a false
//        );
//    }
//
//    @Test
//    public void testCategoriaToString() {
//        String str = categoria.toString();
//
//        assertAll("Validar datos de categoria con toString",
//                () -> assertTrue(str.contains("1")),
//                () -> assertTrue(str.contains("Ciencia Ficción")),
//                () -> assertTrue(str.contains("Libros sobre tecnología futurista y espacio")),
//                () -> assertTrue(str.contains("true")) // Verifica la representación en cadena del booleano
//        );
//    }
//}