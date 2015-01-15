import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


//attempt to make a drop down box, referenced: http://stackoverflow.com/questions/13408238/simple-java-gui-as-a-popup-window-and-drop-down-menu

public class HangmanLettersToChooseFromPane 
{
	public static void main(String[] args)
	{
		new HangmanLettersToChooseFromPane();
	}
	
	public HangmanLettersToChooseFromPane()
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
		public void run()
		{
			//	try
			//	{
			//		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//	}
				//catch (ClassNotFoundException | InstantiontionException | IllegalAccessException | UnsupportedLookAndFeelException ex)
				//{
				//}
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("Please choose a letter:"));
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		model.addElement("a");
		model.addElement("b");
		model.addElement("c");
		model.addElement("d");
		model.addElement("e");
		model.addElement("f");
		model.addElement("g");
		model.addElement("h");
		model.addElement("i");
		model.addElement("j");
		model.addElement("k");
		model.addElement("l");
		model.addElement("m");
		model.addElement("n");
		model.addElement("o");
		model.addElement("p");
		model.addElement("q");
		model.addElement("r");
		model.addElement("s");
		model.addElement("t");
		model.addElement("u");
		model.addElement("v");
		model.addElement("w");
		model.addElement("x");
		model.addElement("y");
		model.addElement("z");
		JComboBox comboBox = new JComboBox(model);
		panel.add(comboBox);
		
		int result = JOptionPane.showConfirmDialog(null,  panel, "Letter Choice", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			switch (result)
			{
				case JOptionPane.OK_OPTION:
				System.out.println("You selected " + comboBox.getSelectedItem());
				break;
			}
		  }
		});
	}
}
