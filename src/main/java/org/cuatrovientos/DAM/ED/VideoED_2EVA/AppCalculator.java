package org.cuatrovientos.DAM.ED.VideoED_2EVA;

import java.util.Scanner;

 class AppCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * Calculadora terminada
		 */
		// falta un metodo
		/**
		 * TODO falta validar el num introducido
		 */

		System.out.print("Introduce el primer número: ");
		double num1 = input.nextDouble(); 

		System.out.print("Introduce la operacion que deseas realizar (+, -, *, /): ");
		char operator = input.next().charAt(0);

		System.out.print("Introduce el segundo número: ");
		double num2 = input.nextDouble();

		Calculator calculator = new Calculator();

		double result = Double.NaN;

		switch (operator) {
		case '+':
			result = calculator.sumar(num1, num2);
			break;
		case '-':
			result = calculator.sub(num1, num2);
			break;
		case '*':
			result = calculator.multiply(num1, num2);
			break;
		case '/':
			result = calculator.divide(num1, num2);
			break;
		default:
			result = Double.NaN; // Indicate invalid operator.
		}
		System.out.println("Resultado es: " + result + args[0]);
	}
}
