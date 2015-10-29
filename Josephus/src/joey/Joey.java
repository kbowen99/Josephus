package joey;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Joey {
	
	public ArrayList<String> deathNote = new ArrayList<String>();
	public String deathString = "";
	
	public String joeDoesMath(int peoples, int skips){
		
		fillList(peoples);
		slowlyMurder(skips);
		informFamily(deathNote.get(0) + " Lived");
		Toolkit.getDefaultToolkit().beep();
		return deathString;
	}
	
	public void fillList(int thingsToFill){
		for(int i=1; i <= thingsToFill; i++){
			deathNote.add("#" + i);
		}
		System.out.println("People Added to List");
	}
	
	public void slowlyMurder(int skips){
		int count = 0;
		for(int i = 0; (deathNote.size() > 1); i++){
			count++;
			if (count == skips){
				count = 0;
				murder(i);
				i--;
			}
			if ((i == (deathNote.size() - 1)))
				i=-1;
		}
		
		System.out.println("Alive: ");
		for(int i=0; i<deathNote.size(); i++) {
			System.out.println(deathNote.get(i));
		}
		System.out.println("Dead:");
		
	}
	
	private void murder(int WhoWeKillin){
		System.out.println(deathNote.get(WhoWeKillin));
		deathString = deathString + deathNote.get(WhoWeKillin) + " ";
		deathNote.remove(WhoWeKillin);
	}
	
	private void informFamily(String toInform){
		JOptionPane.showMessageDialog(null, toInform);
	}
	
}
