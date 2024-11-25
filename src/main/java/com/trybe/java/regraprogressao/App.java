package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */

public class App {

  /**
   * Metodo main.
   */

  public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantidade = scanner.nextInt();
    scanner.nextLine();


    String[] totalNomesAtividades = new String[quantidade];
    int[] totalPeso = new int[quantidade];
    int[] notas = new int[quantidade];

    for (int numero = 0; numero < quantidade;numero++) {
      System.out.println("Digite o nome da atividade " + (numero + 1) + ":");

      totalNomesAtividades[numero] = scanner.nextLine();

      System.out.println("Digite o peso da atividade" + (numero + 1) + ":");
      totalPeso[numero] = scanner.nextInt();

      System.out.println("Digite a nota obtida para" + totalNomesAtividades[numero] + ":");
      notas[numero] = scanner.nextInt();

      scanner.nextLine();
    }

    int resultado = 0;
    int valorTotalPeso = 0;

    for (int i = 0; i < quantidade; i += 1) {
      int valoresMultiplicados = totalPeso[i] * notas[i];
      valorTotalPeso = valorTotalPeso + totalPeso[i];
      resultado = resultado + valoresMultiplicados;
    }

    if (valorTotalPeso != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    int resultadoFinal = resultado / valorTotalPeso;

    if (resultadoFinal >= 85) {
      System.out.println("Parabéns! Você alcançou " + resultadoFinal
              + ".0%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println("Lamentamos informar que, "
              + "com base na sua pontuação alcançada neste período, "
              + resultadoFinal
              + ".0%, você não atingiu a pontuação mínima necessária para sua aprovação.");

    }

  }
}