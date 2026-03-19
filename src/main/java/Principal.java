
import javax.swing.JOptionPane;





public class Principal {
//variaveis
    public static void main(String[] args) {
        double base, altura, area;
        //entrada
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Digite base"));
         //processamento
          area = (base * altura)/ 2.0;
          //saida
                  JOptionPane.showMessageDialog(null, "A area é: " + area);
    }
}
