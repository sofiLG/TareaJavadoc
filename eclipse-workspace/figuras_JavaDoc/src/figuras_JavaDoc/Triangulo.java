package figuras_JavaDoc;

import java.awt.Color;

/*
 * Clase Triangulo, se utiliza para crear y utilizar figuras del tipo triangulo
 * @author Elena
 * @version 1.2
 * @since 11-04-2023
 * @see Figura	
 */
public class Triangulo extends Figura{
	
	/*
	 * Atributo privado que almacena la medida en número decimal de un lado
	 */
	private double lado1;
	
	/*
	 * Atributo privado que almacena la medida en número decimal de un lado
	 */
	private double lado2;
	
	/*
	 * Atributo privado que almacena la medida en número decimal de un lado
	 */
	private double lado3;
	
	/*
	 * Constructor con 6 parametros de entrada
	 * @param x
	 * @param y
	 * @param color
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 * @see Figura
	 */
	public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
	super (x, y, color);
	this.lado1 = lado1;
	this.lado2 = lado2;
	this.lado3 = lado3;
	}
	
	/*
	 * @return the lado1
	 */
	public double getLado1(){
	return lado1;
	}
	
	/*
	 * @return the lado2
	 */
	public double getLado2(){
	return lado2;
	}
	
	/*
	 * @return the lado3
	 */
	public double getLado3(){
	return lado3;
	}
	
	/*
	 * @param the lado1 to set lado1
	 */
	public void setLado1(double lado1){
	this.lado1 = lado1;
	}
	
	/*
	 * @param the lado2 to set lado2
	 */
	public void setLado2(double lado2){
	this.lado2 = lado2;
	}
	
	/*
	 * @param the lado3 to set lado3
	 */
	public void setLado3(double lado3){
	this.lado3 = lado3;
	}
	
	/*
	 * Calcula el perímetro del triángulo
	 * @return el valor del perímetro
	 */
	public double perimetro (){
	   return lado1 + lado2 + lado3;
	}
	
	/*
	 * Calcula el area del triángulo
	 * @return el valor del área
	 */
	public double area (){ 
	   double sp = perimetro() / 2;
	   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
	}
	
}
