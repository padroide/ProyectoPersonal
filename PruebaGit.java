package pruebagit;
import javax.swing.JOptionPane;
/**
 *
 * @author Pablo
 */
public class PruebaGit {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
        JOptionPane.showMessageDialog(null,"Tu Nombre es: "+nombre);
        JOptionPane.showMessageDialog(null,"Saliendo del Programa");
    }
}
