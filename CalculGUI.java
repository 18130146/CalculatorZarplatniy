import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculGUI extends JFrame {
	private JButton button = new JButton("Выполнить расчет");
	
	private JTextField input1 = new JTextField("",4);
	private JTextField input2 = new JTextField("",4);
	private JTextField input3 = new JTextField("",4);
	private JTextField input4 = new JTextField("",4);
	private JTextField input5 = new JTextField("",4);
	
	private JLabel label1 = new JLabel("Количество отработанных дней:");
	private JLabel label2 = new JLabel("Оклад, руб.:");
	private JLabel label3 = new JLabel("Премия, руб.:");
	private JLabel label4 = new JLabel("Количество рабочих дней в месяце:");
	private JLabel label5 = new JLabel("Заработная плата сотрудника составит, руб.:");
	
	public CalculGUI() {
		super("Калькулятор расчета заработной платы"); 
		this.setBounds(100, 100,800, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		input5.disable();
		
		container.add(label1);
		container.add(input1);
		
		container.add(label2);
		container.add(input2);
		
		container.add(label3);
		container.add(input3);
		
		container.add(label4);
		container.add(input4);
		
		container.add(label5);
		container.add(input5);
		
		//ЗАДАНИЕ ИЗНАЧАЛЬНЫХ НУЛЕВЫХ ЗНАЧЕНИЙ
		input1.setText("0");
		input2.setText("0");
		input3.setText("0");
		input4.setText("0");
		
		button.addActionListener(new ButtonEventListener());
		container.add(button);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			int a1 = 0;
			Double a2 = null;
			Double a3 = null;
			int a4 = 0;
			boolean check = true;
			
	
			//ПРОВЕРКИ И ОГРАНИЧЕНИЯ
			
			//1
			if((Integer.valueOf(input1.getText()) > 31) | (Integer.valueOf(input4.getText()) % 1 != 0) | Integer.valueOf(input1.getText()) < 0) {
				check = false;
			} else {
				a1 = Integer.valueOf(input4.getText());	
			}
			
			//2
			if((Double.valueOf(input2.getText()) <= 0)) {
				
				check = false;
			} else {
				a2 = Double.valueOf(input2.getText());
			}
			
			//3
			if((Double.valueOf(input3.getText()) < 0)) {
				
				check = false;
			} else {
				a3 = Double.valueOf(input3.getText());
			}
			
			//4
			if((Integer.valueOf(input4.getText()) > 31) | (Integer.valueOf(input4.getText()) % 1 != 0) | Integer.valueOf(input4.getText()) < 0) {
				
				check = false;
			} else {
				a4 = Integer.valueOf(input4.getText());	
			}
			
			
			if(!check) {
				JOptionPane.showMessageDialog(null, "Введено недопустимое значение");
			} else {
			Double ZP = (double) ((a1*a2)/a4 + a3);
			input5.setText(String.valueOf(ZP));}
		}
	} 
}