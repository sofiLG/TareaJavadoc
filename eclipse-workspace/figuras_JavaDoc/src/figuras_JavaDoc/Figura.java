package figuras_JavaDoc;

import java.awt.Color;

/*
 * Clase abastracta figura, se utiliza para crear y utilizar figuras
 * @author Elena
 * @version 1.2
 * @since 11-04-2023
 */
public abstract class Figura {
	
	/*
	 * Atributo privado de tipo punto que almacena el valor del centro de la figura
	 */
	private Punto centro;
	
	/*
	 * Atributo privado del tipo Color que almacena el color de la figura
	 */
	private Color color;
	
	/*
	 * Constructor de 3 parámetros
	 * @param x
	 * @param y
	 * @param color
	 */
	public Figura(double x, double y, Color color){
	centro = new Punto (x, y);
	this.color = color;
	}
	
	/*
	 * @return the centroX
	 */
	public double getXCentro(){
	return centro.getX();
	}
	
	/*
	 * @return the centroY
	 */
	public double getYCentro(){
	return centro.getY();
	}
	
	/*
	 * @return the color
	 */
	public Color getColor(){
	return color;
	}
	
	/*
	 * @param the x to set x
	 */
	public void setXCentro(double x){
	centro.setX (x);
	}
	
	/*
	 * @param the y to set y
	 */
	public void setYCentro(double y){
	centro.setY (y);
	}
	
	/*
	 * @param the color to set color
	 */
	public void setColor(Color color){
	this.color = color;
	}
	
	/*
	 * Método abstracto que calcule el perímetro, con decimales, de las diferentes figuras
	 */
	public abstract double perimetro();  
	
	/*
	 * Método abstracto que calcule el área, con decimales, de las diferentes figuras
	 */
	public abstract double area();  
	
	/*
	 * Comprueba que figura es mayor según el valor del área
	 * @return 1: Si el área de la figura imbocante es mayor que el de la figura pasada como perímetro
	 * 			-1: Si el área de la figura pasada como parámetro es mayor que el de la figura imbocante
	 * 			0: Si el valor del área de las dos figuras es exactamente igual
	 */
	public int esMayorQue (Figura otraFigura) {
		   if (this.area() > otraFigura.area())
			   return 1;
		   else
			   if (this.area() < otraFigura.area())
				   return -1;
			   else
				   return 0;
		}

	
}
