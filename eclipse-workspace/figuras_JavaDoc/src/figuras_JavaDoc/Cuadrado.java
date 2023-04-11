package figuras_JavaDoc;

import java.awt.Color;

/*
 * Clase cuadrado, se utiliza para crear figuras de tipo cuadrado
 * @author Elena
 * @version 1.2
 * @see Rectangulo
 * @since 11-04-2023
 */
public class Cuadrado extends Rectangulo{
	
	/*
	 * Constructor con 4 parámetros
	 * @param x
	 * @param y
	 * @param color
	 * @param lado
	 * @see Rectangulo
	 */
	public Cuadrado (double x, double y, Color color, double lado){
		super (x, y, color, lado, lado);
		}
	
}
