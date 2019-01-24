package Tiger.apps.desktop.moneykeeper;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MoneyView extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MoneyView() {
		setTitle("MoneyKeeper");
		setFont(new Font("Modern No. 20", Font.PLAIN, 11));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenu Edit = new JMenu("Edit");
		menuBar.add(Edit);
		
		JMenu Search = new JMenu("Search");
		menuBar.add(Search);
	}
}
