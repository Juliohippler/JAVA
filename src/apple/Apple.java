
package apple;

/**
 *
 * @author julio
 */
public class Apple {
    int x;
    int y;
    int RADIUS = 5 ;
    int G = 10 ; // meters per second square

Apple( int x, int y) {
    this.x = x;
    this.y = y;
    }

    public static void main(String[] args){
        Apple apple1 = new Apple(10,20);
        
        Apple apple2 = new Apple(10,20);
        
        Apple apple3 = new Apple(10,20);
    }
}
    
/**
 * Quantos atributos descrevem cada instância de Apple()? 
 * Quantos argumentos o construtor consome?
 * 
 * Cada instancia tem 4 atributos, x,y, radius e g;
 * 
 * O construtor usa 2 atributos, o x e o y.
 */
