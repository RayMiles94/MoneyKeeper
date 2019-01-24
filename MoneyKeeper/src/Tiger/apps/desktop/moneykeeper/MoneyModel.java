package Tiger.apps.desktop.moneykeeper;

import java.sql.*;

public class MoneyModel {
	int card;
	int codecard;
	String client;
	String mp;
	int money;
	Connection conn;
	Statement mystat;
	
	public MoneyModel() throws SQLException{
	   card = 0;
	   codecard=0;
	   client="";
	   mp="";
	   money=0;
	   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneykeeper","root","");
	   mystat = conn.createStatement();
   }
	
}
