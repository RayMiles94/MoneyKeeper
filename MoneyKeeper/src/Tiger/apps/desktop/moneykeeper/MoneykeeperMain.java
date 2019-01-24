package Tiger.apps.desktop.moneykeeper;

public class MoneykeeperMain {

	public static void main(String[] args) {
	  MoneyModel model = new MoneyModel();
	  MoneyView view = new MoneyView();
	  MoneyConrole control = new MoneyConrole(model,view);
      view.setVisible(true);
	}

}
