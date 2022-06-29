import javax.swing.JOptionPane;

public class reverso {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Digit seu nome: ");
		 String fraseInvertida = new StringBuilder(nome).reverse().toString();
		   System.out.println(fraseInvertida);
	}

}

