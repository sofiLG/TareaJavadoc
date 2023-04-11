package figuras_JavaDoc;

import java.awt.Color;

/*
 * Clase Rectangulo, se utiliza para crear y utilizar figuras del tipo rectángulo
 * @author Elena
 * @version 1.2
 * @since 11-04-2023
 * @see Figura
 */
public class Rectangulo extends Figura{
	
	/*
	 * Atributo privado que almacena con decimales la base de un rectángulo
	 */
	private double base;
	
	/*
	 * Atributo privado que almacena con decimales la altura de un rectángulo
	 */
	private double altura;
	
	/*
	 * Constructor con 5 parámetros de entrada
	 * @param x
	 * @param y
	 * @param color
	 * @param base
	 * @param altura
	 * @see Figura
	 */
	public Rectangulo (double x, double y, Color color, double base, double altura){
	super (x, y, color);
	this.setBase(base);
	this.altura = altura;
	}
	
	/*
	 * @return the base
	 */
	public double getBase(){
	return base;
	}
	
	/*
	 * @return the altura
	 */
	public double getAltura(){
	return altura;
	}
	
	/*
	 * @param the base to set base
	 */
	public void setBase(double base){
	this.base = base;
	}
	
	/*
	 * @param the altura to set altura
	 */
	public void setAltura(double altura){
	this.altura = altura;
	}
	
	/*
	 * Cacula el perímetro de un rectángulo
	 * @return el valor del perímetro
	 */
	public double perimetro (){
	   return 2 * getBase() + 2 * altura;
	}
	
	/*
	 * Calcula el área de un rectángulo
	 * @return el valor del área
	 */
	public double area (){ 
	   return getBase() * altura;
	}
	
}
