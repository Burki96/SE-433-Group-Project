package Controllers;


import Calculators.BasicConverter.BasicConverter;
import Calculators.Enums.AreaEnum;
import Calculators.Enums.DigitalStorageEnum;
import Calculators.Enums.LengthEnums;
import Calculators.Enums.MassEnums;
import Calculators.Enums.TempEnums;
import Calculators.Enums.TimeEnums;
import Calculators.Enums.TypeEnums;
import Calculators.Enums.VolumeEnum;
import Calculators.Operations.Operation;
import Calculators.Windows.UnitConverterWindow;

public class UnitConverterController 
{
	private static UnitConverterController instance = null;
	private BasicConverter converter;
	private UnitConverterWindow converterWindow;
	private static UnitConverterController GetInstance()
	{
		if(instance == null) 
		{
			instance = new UnitConverterController();
		}
		return instance;
	}
	public static UnitConverterWindow GetWindow() 
	{
		return GetInstance().converterWindow;
	}
	private UnitConverterController() 
	{
		
	
		this.converter = new BasicConverter();
		this.converterWindow = new UnitConverterWindow();
		
		//initialize();
	}
	public static void SelectType(TypeEnums t) 
	{
		GetInstance().converterWindow.SelectType(t);
	}
	public static void SelectConversion(TempEnums t) 
	{
		GetInstance().converterWindow.SelectConversionType(t);
	}
	public static void SelectConversion(MassEnums t) 
	{
		GetInstance().converterWindow.SelectConversionType(t);
	}
	public static void SelectConversion(TimeEnums t) 
	{
		GetInstance().converterWindow.SelectConversionType(t);
	}
	public static void SelectConversion(LengthEnums l) 
	{
		GetInstance().converterWindow.SelectConversionType(l);
	}
	public static void SelectConversion(DigitalStorageEnum ds) 
	{
		GetInstance().converterWindow.SelectConversionType(ds);
	}
	public static void SelectConversion(AreaEnum a) 
	{
		GetInstance().converterWindow.SelectConversionType(a);
	}
	public static void SelectConversion(VolumeEnum v) 
	{
		GetInstance().converterWindow.SelectConversionType(v);
	}
	public static BasicConverter GetConverter() 
	{
		return GetInstance().converter;
	}
	//Hard terminate, does soft terminate, but will also deletes the singleton
	public static void Terminate() 
	{
		//GetInstance().list.clear();
		GetInstance().converterWindow.Shutdown();
		instance = null;
	}
	//Soft terminate, clears list and returns all buttons back to the button factory
	public static void Turnoff() 
	{
		GetInstance().converterWindow.Shutdown();
	}
	public static String GetText() 
	{
		return GetInstance().converterWindow.GetText();
	}
	//Sets the textbox on the calculator window, for interal use only, not for JUNIT
	public static void SetInput(String s)
	{
		GetInstance().converterWindow.SetInput(s);
	}

	//starts the calculator window
	public static void Start() 
	{
		GetInstance().converterWindow.initialize(true);
	}
	public static void StartJUNIT() 
	{
		GetInstance().converterWindow.initialize(false);
	}
	public static double GetAnswer()
	{
		return GetInstance().converter.GetResultNumber();
	}
	public static void PressConvert()
	{
		GetInstance().converterWindow.PressConvert();
	}

	public static void Compute()
	{
		GetInstance().privConverterAction();
	}

	private void privConverterAction() 
	{
		double firstnumber = Double.parseDouble(converterWindow.GetText());
		converter.SetFirstNumber(firstnumber);
		Operation OpToSendOperation = converterWindow.GetCurrentSelected();
		this.converter.SetOperation(OpToSendOperation);
		this.converter.Execute();
		this.converterWindow.SetOutput(this.converter.GetAnswer());

		
	}
}
