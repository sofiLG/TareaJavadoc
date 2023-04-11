package figuras_JavaDoc;

/*
 * Clase Punto, se utiliza para crear y utilizar puntos
 * @author Elena
 * @version 1.2
 * @since 11-04-2023
 */
public class Punto {
	/*
	 * Atributo privado numerico con decimales que representa la coordenada x del punto
	 */
	private double x;
	
	/*
	 * Atributo privado numerico con decimales que representa la coordenada y del punto
	 */
	private double y;
	
	/*
	 * Constructor sin parámetros
	 */
	public Punto(){
	x = 0;
	y= 0;
	}
	
	/*
	 * Constructor con 2 parámetros
	 * @param x
	 * @param y
	 */
	public Punto(double x, double y){
	this.x = x;
	this.y = y;
	}
	
	/*
	 * Constructor con 1 parámetro
	 * @param Punto p
	 */
	public Punto(Punto p){
	x = p.x;
	y = p.y;
	}
	
	/*
	 * @return the x
	 */
	public double getX(){
	return x;
	}
	
	/*
	 * @return the y
	 */
	public double getY(){
	return y;
	}
	
	/*
	 * @param the x to set x
	 */
	public void setX(double x){
	this.x = x;
	}
	
	/*
	 * @param the y to set y
	 */
	public void setY(double y){
	this.y = y;
	}
	
	/*
	 * Calcula la distancia entre dos Objetos del tipo punto
	 * @param p
	 * @return distancia entre dos puntos
	 */
	public double distancia(Punto p){
	return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
	}
	
	/*
	 * Genera un punto simétrico al punto que le invoca desde el punto del eje de ordenadas
	 * @return punto simétrico al imbocante del método  
	 */
	public Punto simetrico(){
	Punto nuevoP = new Punto (this.x * -1, this.y);	
	return nuevoP ;
	}
	
	/*
	 * Compara y comprueba si dos puntos son identicamente iguales
	 * @param Punto p
	 * @return true: si el punto que imboca el método tiene las mismas coordenadas que el punto pasado como parámetro
	 * 			false: si el punto que imboca el método tiene distintas coordenadas que el punto pasado como parámetro
	 */
	public boolean compara(Punto p){
	if (p.x == x && p.y == y)
	   return true;
	else
	   return false;
	}
	
	/*
	 * Crea una cadena con toda la información del Punto
	 * @return cadena con las coordenadas del punto
	 */
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
	
}
