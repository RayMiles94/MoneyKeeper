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
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoneyView extends JFrame {

	private JPanel contentPane;
	private JTextField nclient;
	private JTextField mpclient;
	private JTextField ncard;
	private JTextField codecard;
	private JTextField money;

	
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
		newfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				nclient.setText(null); 
				mpclient.setText(null);
				ncard.setText(null);
				codecard.setText(null);
				money.setText(null);
			}
		});
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
		
		JPanel bluebar = new JPanel();
		bluebar.setBackground(Color.BLUE);
		bluebar.setForeground(Color.BLUE);
		bluebar.setBounds(0, 22, 116, 454);
		contentPane.add(bluebar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(119, 22, 458, 57);
		contentPane.add(panel);
		
		JLabel lblNomClient = new JLabel("Nom client");
		lblNomClient.setBounds(162, 90, 64, 30);
		contentPane.add(lblNomClient);
		
		nclient = new JTextField();
		nclient.setBounds(236, 90, 116, 30);
		contentPane.add(nclient);
		nclient.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("mot de passe");
		lblMotDePasse.setBounds(162, 131, 64, 14);
		contentPane.add(lblMotDePasse);
		
		mpclient = new JTextField();
		mpclient.setBounds(236, 128, 116, 24);
		contentPane.add(mpclient);
		mpclient.setColumns(10);
		
		JLabel lblNCard = new JLabel("N Card");
		lblNCard.setBounds(162, 166, 64, 14);
		contentPane.add(lblNCard);
		
		ncard = new JTextField();
		ncard.setBounds(236, 163, 116, 21);
		contentPane.add(ncard);
		ncard.setColumns(10);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(162, 213, 46, 14);
		contentPane.add(lblCode);
		
		codecard = new JTextField();
		codecard.setBounds(236, 207, 53, 20);
		contentPane.add(codecard);
		codecard.setColumns(10);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setBounds(162, 248, 46, 14);
		contentPane.add(lblMoney);
		
		money = new JTextField();
		money.setBounds(236, 245, 86, 20);
		contentPane.add(money);
		money.setColumns(10);
		
		JButton btnAddMoney = new JButton("Add Money");
		btnAddMoney.setBounds(233, 306, 89, 23);
		contentPane.add(btnAddMoney);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(346, 306, 89, 23);
		contentPane.add(btnAnnuler);
	}
}
