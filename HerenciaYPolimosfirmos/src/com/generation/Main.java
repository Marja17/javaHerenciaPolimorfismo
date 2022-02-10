package com.generation;

public  abstract class Main {

	public static void main(String[] args) {
		
		//Herencia: cuando una clase hereda de otra, esta tiene acceso 
		//a sus atributos y métodos 
				Cuadrado cuadrado1 = new Cuadrado();
				cuadrado1.setAlto(15f);
				cuadrado1.setAncho(10f);
				System.out.println("El cuadrado con nombre " + cuadrado1.getNombre()+ ", con area de "+ cuadrado1.calcularArea());
				
				Triangulo triangulo1 = new Triangulo();
				triangulo1.setAlto(15f);
				triangulo1.setAncho(12f);
				System.out.println("El triangulo con nombre " + triangulo1.getNombre()+ ", con area de "+ triangulo1.calcularArea());
			}

		}

	


