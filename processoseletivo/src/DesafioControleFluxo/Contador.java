// Desafio: criar um contador que receba dois parâmetros 
// e imprima os números entre eles
package DesafioControleFluxo;

import java.util.Scanner;

/**
 *
 * @author Carlos Eduardo dos Santos Figueiredo
 * @link https://www.linkedin.com/in/carlos-eduardo-dos-s-figueiredo/
 * @link https://github.com/carloseduardonit
 */
public class Contador {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
            terminal.close();
        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
            terminal.close();
        }

    }

    /**
     * Método que recebe dois parâmetros 
     * ou lança uma exceção caso o segundo parâmetro seja menor que o primeiro
     * ou imprime que não há números para serem impressos caso os parâmetros forem iguais
     * ou imprime os números entre eles caso o primeiro parâmetro seja menor que o segundo
     * @param parametroUm 
     * @param parametroDois 
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        if (contagem == 0) {
            System.out.println("\nNão há números para serem impressos");
            return;
        }
        System.out.println("");
        for (int contador = 1; contador <= contagem; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}
