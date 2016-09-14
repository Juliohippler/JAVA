
package construtor;

/**
 *
 * @author julio
 */
public class Image {
    int height;
    int width;
    String source;
    String quality;
    
    //construtor
    public Image(int height, int width, String source, String quality){
        this.height = height;
        this.width = width;
        this.source = source;
        this.quality = quality;
    }
    public static void main(String[] args){
        Image Image1, Image2;
        Image1 = new Image(12, 20, "imagem 1", "FULL HD");
        Image2 = new Image(20, 40, "imagem 2", "HD");
    }
}
