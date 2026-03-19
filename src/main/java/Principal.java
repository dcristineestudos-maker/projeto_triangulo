
import javax.swing.JOptionPane;





public class Principal {

    public static void main(String[] args) {
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Digite base"));
          area = (base * altura)/ 2.0;
                  JOptionPane.showMessageDialog(null, "A area é: " + area);
    }
}
