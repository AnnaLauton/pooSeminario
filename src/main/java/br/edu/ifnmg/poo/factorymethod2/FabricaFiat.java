/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod2;

/**
 * Classe FabricaFiat que implementa a interface FabricaCarro
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class FabricaFiat implements FabricaCarro {

    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}
