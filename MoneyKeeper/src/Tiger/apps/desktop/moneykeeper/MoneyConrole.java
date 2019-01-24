package Tiger.apps.desktop.moneykeeper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoneyConrole implements ActionListener {
	MoneyView view;
	MoneyModel model;
	
	
	public MoneyConrole(MoneyModel m,MoneyView v){
		this.view     = v;
		this.model = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.AddMoney){
			
		}
		
	}
}
