package OperacionesMatematicasP;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OperacionesMatematicasTest {
    private OperacionesMatematicas operacionesMatematicas;

    @BeforeEach
    void setUp() {
        operacionesMatematicas = new OperacionesMatematicas();
    }

    @AfterEach
    void tearDown() {
        operacionesMatematicas=null;
    }

    @Test
    void testCalcularRaizCuadradaNumeroPositivo() {
        double num=25;
        double resultadoEsperado=5;
        double resultado = operacionesMatematicas.calcularRaizCuadrada(num);
        assertEquals(resultadoEsperado,resultado);


    }

    @Test
    void testCalcularRaizCuadradaCero() {
        double num=0;
        double resultadoEsperado=0;
        double resultado = operacionesMatematicas.calcularRaizCuadrada(num);
        assertTrue(resultadoEsperado==resultado);

    }

    @Test
    void testCalcularRaizCuadradaNumeroNegativo() {
        double num = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            operacionesMatematicas.calcularRaizCuadrada(num);
        });

    }
}