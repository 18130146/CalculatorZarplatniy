package Calcul;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonEventListener implements ActionListener {
	public int a1 = 0;
	public Double a2 = null;
	public Double a3 = null;
	public int a4 = 0;
	public Double RE = (double) 0;
	public void actionPerformed (ActionEvent e) {
	
		
		//проверка полей ввода
		Obrabotka.proverka(CalculGUI.input1,1);
		Obrabotka.proverka(CalculGUI.input2,2);
		Obrabotka.proverka(CalculGUI.input3,3);
		Obrabotka.proverka(CalculGUI.input4,4);
		

		//ПРОВЕРКИ И ОГРАНИЧЕНИЯ
		if(!CalculGUI.check) {
			JOptionPane.showMessageDialog(null, "Проверьте значения", "", JOptionPane.INFORMATION_MESSAGE);}
		else if (CalculGUI.check) {
		//1
		if((Integer.valueOf(CalculGUI.input1.getText()) > 31) | (Integer.valueOf(CalculGUI.input4.getText()) % 1 != 0)) {
			//JOptionPane.showMessageDialog(null, "Введено недопустимое значение", "", JOptionPane.INFORMATION_MESSAGE);
			CalculGUI.check = false;
		} else {
			a1 = Integer.valueOf(CalculGUI.input1.getText());
			CalculGUI.check = true;
		}
		
		//2
		if((Double.valueOf(CalculGUI.input2.getText()) == 0)) {
			//JOptionPane.showMessageDialog(null, "Введено недопустимое значение", "", JOptionPane.INFORMATION_MESSAGE);
			CalculGUI.check = false;
		} else {
			a2 = Double.valueOf(CalculGUI.input2.getText());
			CalculGUI.check = true;
		}
		
		//3
			a3 = Double.valueOf(CalculGUI.input3.getText());
		
		//4
		if((Integer.valueOf(CalculGUI.input4.getText()) > 31) | (Integer.valueOf(CalculGUI.input4.getText()) % 1 != 0)) {
			//JOptionPane.showMessageDialog(null, "Введено недопустимое значение", "", JOptionPane.INFORMATION_MESSAGE);
			CalculGUI.check = false;
		} else {
			a4 = Integer.valueOf(CalculGUI.input4.getText());
			CalculGUI.check = true;
		}
		}
	
		if(!CalculGUI.check) {
			JOptionPane.showMessageDialog(null, "Проверьте значения", "", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
		Double ZP = (double) ((a1*a2)/a4 + a3); 
		RE = ZP;//вычисление заработной платы сотрудника
		CalculGUI.input5.setText(String.valueOf(ZP));}	
	}
} 
