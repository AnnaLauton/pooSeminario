/* 
 * Material realizado para o seminário do
 * curso de Programação Orientada a Objetos 
 * do Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.factorymethod2;

/**
 * Classe Civic que implementa a interface Carro
 *
 * @author Anna Júlia Costa Lauton
 * @version 1.0, 12/12/2020
 */
public class Civic implements Carro {

    @Override
    public void exibirInformacao() {
        System.out.println("Fabricante: Honda");
        System.out.println("Ano de instalação: 1976");
    }
}
