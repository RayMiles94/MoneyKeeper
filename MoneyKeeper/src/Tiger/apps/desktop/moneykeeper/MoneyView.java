package Tiger.apps.desktop.moneykeeper;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		menuBar.setBounds(0, 0, 577, 21);
		contentPane.add(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem newfile = new JMenuItem("New ");
		file.add(newfile);
		
		JMenuItem openfile = new JMenuItem("Open");
		file.add(openfile);
		
		JMenuItem Closeapp = new JMenuItem("Close");
		file.add(Closeapp);
		
		JMenu Edit = new JMenu("Edit");
		menuBar.add(Edit);
		
		JMenuItem mntmCut = new JMenuItem("Cut");
		Edit.add(mntmCut);
		
		JMenuItem mntmCopy = new JMenuItem("Copy");
		Edit.add(mntmCopy);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		Edit.add(mntmPaste);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		Edit.add(mntmDelete);
		
		JMenu Search = new JMenu("Search");
		menuBar.add(Search);
		
		JMenu Help = new JMenu("Help");
		menuBar.add(Help);
		
		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		Help.add(mntmWelcome);
		
		JMenuItem mntmPageWeb = new JMenuItem("Page Web");
		Help.add(mntmPageWeb);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		Help.add(mntmAbout);
	}
}
