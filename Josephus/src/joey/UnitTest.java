package joey;

import javax.swing.JOptionPane;

public class UnitTest {
	void run(){
		Joey Joe = new Joey();
		disp("5 Should Live");
		Joe.joeDoesMath(6, 2);
		Joe = new Joey();
		disp("29 Should Live");
		Joe.joeDoesMath(30, 7);
		Joe = new Joey();
		disp("1 Should Live");
		Joe.joeDoesMath(2, 10);
		Joe = new Joey();
	}
	
	void disp(Object stuff){
		JOptionPane.showMessageDialog(null, stuff);
	}
}
