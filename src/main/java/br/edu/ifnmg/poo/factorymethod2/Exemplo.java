/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod2;

/**
 * Classe para testes.
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class Exemplo {

    public static void main(String[] args) {
        FabricaCarro fabrica = new FabricaChevrolet();
        Carro carro = fabrica.criarCarro();
        carro.exibirInformacao();
        fabrica = new FabricaFiat();
        carro = fabrica.criarCarro();
        carro.exibirInformacao();
    }
}
