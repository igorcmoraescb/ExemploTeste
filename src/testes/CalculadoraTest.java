/*Aqui eu só coloquei dois testes e obviamente só da função de soma da calculadora, porque só
ela foi implementada na classe Calculadora. A esta altura, no curso,
vocês devem ser capazes de a partir de um exemplo simples, adquirirem de forma
independente a resolução de enunciados mais complexos.
 */

package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codigos.Calculadora;

class CalculadoraTest {

    @Test
    void testSomar1() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 2);
        int esperado = 4;
        assertTrue(resultado == esperado);
    }

    @Test
    void testSomar2() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 5);
        int esperado = 8;
        assertTrue(resultado == esperado);
    }

}