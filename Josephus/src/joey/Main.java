package joey;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peeps = 0;
		int skippy = 0;
		Joey Joe = new Joey();
		
		while (peeps == 0) {
			try {
				String hurro = JOptionPane.showInputDialog("How Many People we killing today?");
				peeps = Integer.parseInt(hurro);
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Someone Screwed Up");
			}
		}
		
		while (skippy == 0){
			try {
				String hurroAgain = JOptionPane.showInputDialog("How Often We Be Killin these " + peeps + " People?");
				skippy = Integer.parseInt(hurroAgain);
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, "Someone Screwed Up");
			}
		}
		
		System.out.println(Joe.joeDoesMath(peeps, skippy));

	}

}
