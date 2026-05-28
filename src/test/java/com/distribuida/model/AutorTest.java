package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp() {
        // Inicializamos el autor usando tu constructor parametrizado
        autor = new Autor(
                1L,
                "Gabriel",
                "García Márquez",
                "Colombiano",
                LocalDate.of(1927, 3, 6)
        );
    }

    @Test
    public void testAutorConstructorAndGetters() {
        assertAll("Pruebas unitarias constructor Autor",
                () -> assertEquals(1L, autor.getId()),
                () -> assertEquals("Gabriel", autor.getNombre()),
                () -> assertEquals("García Márquez", autor.getApellido()),
                // Nota: Añadimos nacionalidad y fecha si tuvieras los getters correspondientes creados
                () -> assertEquals("Gabriel García Márquez", autor.getNombreCompleto())
        );

        System.out.println("====================== Test unitarias en autor =================");
        System.out.println(autor.toString());
        // Nota: Asegúrate de generar el método toString() en tu clase Autor si no lo tienes aún
    }

    @Test
    public void testAutorSetters() {
        // Modificamos los valores usando los setters de tu clase
        autor.setId(2L);
        autor.setNombre("Julio");
        autor.setApellido("Cortázar");

        assertAll("Pruebas unitarias setters Autor",
                () -> assertEquals(2L, autor.getId()),
                () -> assertEquals("Julio", autor.getNombre()),
                () -> assertEquals("Cortázar", autor.getApellido()),
                () -> assertEquals("Julio Cortázar", autor.getNombreCompleto())
        );
    }

    @Test
    public void testAutorNombreCompleto() {
        // Test explícito para tu método de utilidad personalizado
        autor.setNombre("Mario");
        autor.setApellido("Vargas Llosa");

        assertEquals("Mario Vargas Llosa", autor.getNombreCompleto(), "El nombre completo no se concatenó correctamente");
    }
}