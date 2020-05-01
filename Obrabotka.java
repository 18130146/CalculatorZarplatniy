package Calcul;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Obrabotka { 
public static boolean proverka(JTextField field, int a) { 

	try { //проверка на отсутствие пустых полей
	switch ((field.getText())) {
	case "" : throw new Exception();
	}
}
    catch (Exception e) {
    if(CalculGUI.check) {	
	JOptionPane.showMessageDialog(null, "Заполните все поля" , "", JOptionPane.INFORMATION_MESSAGE);}
	CalculGUI.check = false;
	field.setText("0");
	return false;
}
	if(a == 1) {
	try {
		if(field.getText() == "0") {throw new Exception();}
	else { 
		CalculGUI.check = true;}
		}
	
	catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Вводить можно только числа" , "", JOptionPane.INFORMATION_MESSAGE);}
	return false;
	}
	
	if(a == 4) {
		try {
			if(field.getText() == "0") {throw new Exception();}
		else { 
			CalculGUI.check = true;}
			}
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Вводить можно только числа" , "", JOptionPane.INFORMATION_MESSAGE);}
		return false;
		}
	
	
	
	try {Double.parseDouble(field.getText()); //проверка на воод чисел
	} 
	catch (NumberFormatException e) {
		if(CalculGUI.check) {
		JOptionPane.showMessageDialog(null, "Вводить можно только числа" , "", JOptionPane.INFORMATION_MESSAGE);}
		CalculGUI.check = false;
		field.setText("0");
		return false;
	}
	
	
	try {
	double k = Double.parseDouble(field.getText()); //провека на неотрицательность
	if(k < 0) {
		throw new Exception();
		}
	} 
	catch (Exception e) {
		if(CalculGUI.check) {
		JOptionPane.showMessageDialog(null, "Значение может быть только положительным" , "", JOptionPane.INFORMATION_MESSAGE);}
		CalculGUI.check = false;
		field.setText("0");
		return false;
	}
	
	
	
	return true;
}

}
