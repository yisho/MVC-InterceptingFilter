import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class Controller {

	private JFrame frame;
	private JTextField textFieldU;
	private JTextField textFieldP;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UserModel acc = UserModel.getAccount();
		FilterManager filterManager = new FilterManager(new Target());
		Client client = new Client();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller window = new Controller(acc, filterManager, client);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Controller(UserModel acc, FilterManager filterManager, Client client) {
		initialize(acc, filterManager, client);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(UserModel acc, FilterManager filterManager, Client client) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInputUsername = new JLabel("Input Username");
		lblInputUsername.setBounds(6, 9, 160, 14);
		frame.getContentPane().add(lblInputUsername);
		
		textFieldU = new JTextField();
		textFieldU.setBounds(172, 6, 260, 20);
		textFieldU.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					acc.setUsername(textFieldU.getText());
				}
			}
		});
		frame.getContentPane().add(textFieldU);
		textFieldU.setColumns(10);
		
		JLabel lblInputPassword = new JLabel("Input Password");
		lblInputPassword.setBounds(8, 35, 158, 14);
		frame.getContentPane().add(lblInputPassword);
		
		textFieldP = new JTextField();
		textFieldP.setBounds(172, 32, 260, 20);
		textFieldP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					acc.setPassword(textFieldP.getText());
				}
			}
		});
		frame.getContentPane().add(textFieldP);
		textFieldP.setColumns(10);
		
		JLabel lblFilter = new JLabel("Choose Filter 1");
		lblFilter.setBounds(6, 81, 160, 14);
		frame.getContentPane().add(lblFilter);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setBounds(172, 58, 260, 61);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"EasyPasswordFilter", "OffensivePasswordFilter", "SaltingFilter"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		frame.getContentPane().add(list);
		
		JLabel lblFilter_1 = new JLabel("Choose Filter 2");
		lblFilter_1.setBounds(6, 148, 160, 14);
		frame.getContentPane().add(lblFilter_1);
		
		JList list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(172, 125, 260, 61);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"EasyPasswordFilter", "OffensivePasswordFilter", "SaltingFilter"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setSelectedIndex(0);
		frame.getContentPane().add(list_1);
		
		JLabel lblFilter_2 = new JLabel("Choose Filter 3");
		lblFilter_2.setBounds(6, 215, 160, 14);
		frame.getContentPane().add(lblFilter_2);
		
		JList list_2 = new JList();
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_2.setBounds(172, 192, 260, 61);
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"EasyPasswordFilter", "OffensivePasswordFilter", "SaltingFilter"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setSelectedIndex(0);
		frame.getContentPane().add(list_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(172, 259, 260, 23);
		
		
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(6, 288, 160, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsernameGoesHere = new JLabel("Current username goes here");
		lblUsernameGoesHere.setBounds(172, 288, 260, 14);
		frame.getContentPane().add(lblUsernameGoesHere);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(6, 308, 160, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCurrentPassword = new JLabel("Current password + salt goes here");
		lblCurrentPassword.setBounds(172, 308, 260, 14);
		frame.getContentPane().add(lblCurrentPassword);
		
		JLabel lbUserNameResults = new JLabel("UserName Filter Results Here");
		lbUserNameResults.setVerticalAlignment(SwingConstants.TOP);
		lbUserNameResults.setBounds(6, 356, 416, 14);
		frame.getContentPane().add(lbUserNameResults);
		
		JLabel lblPasswordResultS = new JLabel("Password Filter Results Here");
		lblPasswordResultS.setVerticalAlignment(SwingConstants.TOP);
		lblPasswordResultS.setBounds(6, 373, 406, 14);
		frame.getContentPane().add(lblPasswordResultS);
		
//		JLabel lblFinalResults = new JLabel("Final Status of registration here");
//		lblFinalResults.setVerticalAlignment(SwingConstants.TOP);
//		lblFinalResults.setBounds(6, 390, 406, 14);
//		frame.getContentPane().add(lblFinalResults);
		
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				acc.setUsername(textFieldU.getText());
				acc.setPassword(textFieldP.getText());
				
				filterManager.clear();
				System.out.println(acc.getPassword());
				System.out.println(acc.getUsername());
				
				
				
				String filter1 = list.getSelectedValue().toString();
				if(filter1.equalsIgnoreCase("EASYPASSWORDFILTER")){
					filterManager.setFilter(new EasyPasswordFilter());
				}
				if(filter1.equalsIgnoreCase("OFFENSIVEPASSWORDFILTER")){
					filterManager.setFilter(new OffensiveWordFilter());
				}
				if(filter1.equalsIgnoreCase("SALTINGFILTER")){
					filterManager.setFilter(new SaltingFilter());
				}
				
				String filter2 = list_1.getSelectedValue().toString();
				if(filter2.equalsIgnoreCase("EASYPASSWORDFILTER")){
					filterManager.setFilter(new EasyPasswordFilter());
				}
				if(filter2.equalsIgnoreCase("OFFENSIVEPASSWORDFILTER")){
					filterManager.setFilter(new OffensiveWordFilter());
				}
				if(filter2.equalsIgnoreCase("SALTINGFILTER")){
					filterManager.setFilter(new SaltingFilter());
				}
				
				String filter3 = list_2.getSelectedValue().toString();
				if(filter3.equalsIgnoreCase("EASYPASSWORDFILTER")){
					filterManager.setFilter(new EasyPasswordFilter());
				}
				if(filter3.equalsIgnoreCase("OFFENSIVEPASSWORDFILTER")){
					filterManager.setFilter(new OffensiveWordFilter());
				}
				if(filter3.equalsIgnoreCase("SALTINGFILTER")){
					filterManager.setFilter(new SaltingFilter());
				}
				
				client.setFilterManager(filterManager);
				client.sendRequest(acc);
				
				lblUsernameGoesHere.setText(acc.getUsername());
				lblCurrentPassword.setText(acc.getPassword());
				lbUserNameResults.setText(acc.getStatusU());
				lblPasswordResultS.setText(acc.getStatusP());
				//lblFinalResults.setText(acc.getStatusF());
			}
		});
		
	}
}
