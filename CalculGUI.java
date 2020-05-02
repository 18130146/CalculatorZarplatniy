package Calcul;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculGUI extends JFrame {
	public JButton button = new JButton("Выполнить расчет"); //объект кнопка
	
	public static JTextField input1 = new JTextField("",4); //объект тектовое поле
	public static JTextField input2 = new JTextField("",4); //объект тектовое поле
	public static JTextField input3 = new JTextField("",4); //объект тектовое поле
	public static JTextField input4 = new JTextField("",4); //объект тектовое поле
	public static JTextField input5 = new JTextField("",4); //объект тектовое поле
	
	private JLabel label1 = new JLabel("Количество отработанных дней:"); //объект текстовая строка
	private JLabel label2 = new JLabel("Оклад, руб.:"); //объект текстовая строка
	private JLabel label3 = new JLabel("Премия, руб.:"); //объект текстовая строка
	private JLabel label4 = new JLabel("Количество рабочих дней в месяце:"); //объект текстовая строка
	private JLabel label5 = new JLabel("Заработная плата сотрудника составит, руб.:"); //объект текстовая строка
	
	public static boolean check = true;
	
	public CalculGUI() { // конструктор
		super("Калькулятор расчета заработной платы"); //заголовок окна программы
		this.setBounds(100, 100,800, 200); //параметры окна
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3,2,2,2));
		input5.disable(); //
		
		//Добавление элементов окна на панель
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
		
		ButtonEventListener action = new ButtonEventListener();
		button.addActionListener(action); //присвоение отработчика кнопке
		container.add(button); // добавление кнопки на панель
		
	}
}
