package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o Primeiro Valor: ");
		a = scan.nextInt();
		System.out.println("Digite o Primeiro Valor: ");
		b = scan.nextInt();
		
		float soma = soma(a,b);
		float subtracao = subtracao(a,b);
		float divisao = divisao(a,b);
		float multiplicacao = multiplicacao(a,b);
		
		System.out.println("A soma dos números é " + soma);
		System.out.println("A subtração dos números é " + subtracao);
		System.out.println("A Divisão dos números é " + divisao);
		System.out.println("A Multiplicação dos números é " + multiplicacao);
		
	}

	public static float soma(float a, float b) {
		return a + b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
}
