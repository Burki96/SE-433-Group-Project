package basic.ui;

import java.util.ArrayList;
import javax.swing.JButton;

public class ButtonFactory {

		private static ButtonFactory instance= null;
		private static ButtonFactory GetInstance() 
		{
			if(instance == null) 
			{
				instance = new ButtonFactory();
			}
			return instance;
		}
		
		public static JButton GetButton(String name,int x, int y,int width,int height) 
		{
			return GetInstance().privGetButton(name,x,y,width,height);
		}
		private JButton privGetButton(String name,int x, int y,int width,int height) 
		{
			
			JButton rButton = new JButton();
			rButton.setText(name);
			rButton.setBounds(x, y, width, height);
			return rButton;
		}
				
		public static void Terminate() 
		{
			instance = null;
		}
}
