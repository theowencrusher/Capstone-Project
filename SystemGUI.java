package emailMangement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SystemGUI {

	
	private JFrame frame;
	private JPanel panel;
	private JPanel inputPanel;
	private JLabel question;
	private JComboBox<String> optionsDropdown;
	private JTextField answer;
	private JButton submitAnswer;
	
	
	public SystemGUI(){
		frame = new JFrame("Gmail Management Scripts");
		panel = new JPanel();
		inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		panel.setLayout(new BorderLayout(15,15));
		question = new JLabel("Filter Selection");
		panel.add(question, BorderLayout.NORTH);
		String[] filters = {"By Date", "By Sender", "By Keyword", "has Attachment?"};
		optionsDropdown = new JComboBox<>(filters);
		answer = new JTextField(25);
		submitAnswer = new JButton("Submit");
		submitAnswer.setBorder(BorderFactory.createEmptyBorder(5,20,5,10));
		
		
		inputPanel.add(optionsDropdown);
		inputPanel.add(answer);
		inputPanel.add(submitAnswer);
		
		answer.setVisible(false);
		
		panel.add(inputPanel, BorderLayout.CENTER);
		
		
		submitAnswer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (optionsDropdown.isVisible()) {
					String selection = (String)optionsDropdown.getSelectedItem();
					switch(selection) {
					case "By Date":
						question.setText("Enter Date");
						optionsDropdown.setVisible(false);
						answer.setVisible(true);
						break;
						
					case "By Sender":
						question.setText("Enter Sender's name");
						optionsDropdown.setVisible(false);
						answer.setVisible(true);
						break;
						
					case "By Keyword":
						question.setText("Enter Keyword");
						optionsDropdown.setVisible(false);
						answer.setVisible(true);
						break;
						
					case "has Attachment?" :
						question.setText("Choose Attachment Type");
						inputPanel.remove(optionsDropdown);
						String[] attachments = {"image", "video", "audio", "pdf", "executable"};
						optionsDropdown = new JComboBox<>(attachments);
						inputPanel.add(optionsDropdown, BorderLayout.CENTER);
						optionsDropdown.setVisible(true );
						break;
					}
					
				panel.revalidate();
				panel.repaint();
				}
			}
			
			
		});
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		SystemGUI gui = new SystemGUI();
	}
}
