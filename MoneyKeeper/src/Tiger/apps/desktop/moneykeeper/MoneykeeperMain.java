package Tiger.apps.desktop.moneykeeper;


import java.sql.SQLException;

public class MoneykeeperMain {

	public static void main(String[] args) throws SQLException {
	  MoneyModel model = new MoneyModel();
	  MoneyView view = new MoneyView();
	  @SuppressWarnings("unused")
	  MoneyConrole control = new MoneyConrole(model,view);
      view.setVisible(true);
	}

	

}
