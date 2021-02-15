package Calculators;

import java.util.ArrayList;
import javax.swing.JButton;

public class ButtonFactory {
		private ArrayList<JButton> list;
		private static ButtonFactory instance= null;
		private ButtonFactory() 
		{
			list = new ArrayList<JButton>();
			privCreate(10);
		}
		private static ButtonFactory GetInstance() 
		{
			if(instance == null) 
			{
				instance = new ButtonFactory();
			}
			return instance;
		}
		private void privCreate(int a)
		{
			if(list.size() == 0) 
			{
				for(int i = 0; i < a; i++) 
				{
					JButton newbButton = new JButton();
					list.add(newbButton);
				}
			}
		}
		public static JButton GetButton(String name) 
		{
			return GetInstance().privGetButton(name);
		}
		private JButton privGetButton(String name) 
		{
			privCreate(10);
			JButton rButton = list.remove(0);
			rButton.setText(name);
			return rButton;
		}
		public static JButton returnButton(JButton j) 
		{
			return GetInstance().privReturn(j);
		}
		private JButton privReturn(JButton j) 
		{
			list.add(j);
			return null;
		}
		public static void Terminate() 
		{
			GetInstance().list.clear();
			GetInstance().list = null;
			instance = null;
		}
}
