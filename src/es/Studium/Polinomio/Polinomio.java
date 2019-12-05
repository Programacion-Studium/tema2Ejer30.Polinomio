package es.Studium.Polinomio;

import java.util.Scanner;

public class Polinomio {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println( "Indique el número: ");
		int x = teclado.nextInt();
		System.out.println("El resultado de la funcion es "+((3*(funcPotencia(x, 5)))-(5*(funcPotencia(x, 3)))+(2*(funcPotencia(x, 1)))-7));
		teclado.close();
	}
	public static int funcPotencia(int a, int b)
	{
		int resultado, i;
		resultado=1;
		for(i=1; i<=b;i++) 
		{
			resultado=resultado*a;
		}
		return resultado;
	}
}