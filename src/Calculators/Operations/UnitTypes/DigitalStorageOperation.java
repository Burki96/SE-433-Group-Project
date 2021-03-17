package Calculators.Operations.UnitTypes;


import Calculators.Operations.Operation;
import Calculators.Operations.BasicConversionOperations.GeneralConversion;
import Calculators.Windows.UnitConverterWindow;
import Controllers.UnitConverterController;

public class DigitalStorageOperation extends Operation
{
	private final static GeneralConversion KilobitToBit = new GeneralConversion(1000 , 0);
	private final static GeneralConversion MegabitToBit = new GeneralConversion(1000000, 0);
	private final static GeneralConversion GigabitToBit = new GeneralConversion(1000000000 , 0);
	//private final static GeneralConversion TerabitToBit = new GeneralConversion(1000000000000 , 0);
	private final static GeneralConversion ByteToBit = new GeneralConversion(8 , 0);
	private final static GeneralConversion KilobyteToBit = new GeneralConversion(8000 , 0);
	private final static GeneralConversion MegabyteToBit = new GeneralConversion(8000000 , 0);
	//private final static GeneralConversion GigabyteToBit = new GeneralConversion(8000000000 , 0);
	//private final static GeneralConversion TerabyteToBit = new GeneralConversion(8000000000000 , 0);
	
	private final static GeneralConversion MegabitToKilobit = new GeneralConversion(1000 , 0);
	private final static GeneralConversion GigabitToKilobit = new GeneralConversion(1000000 , 0);
	private final static GeneralConversion TerabitToKilobit = new GeneralConversion(1000000000 , 0);
	private final static GeneralConversion ByteToKilobit = new GeneralConversion(0.008, 0);
	private final static GeneralConversion KilobyteToKilobit = new GeneralConversion(8 , 0);
	private final static GeneralConversion MegabyteToKilobit = new GeneralConversion(8000 , 0);
	private final static GeneralConversion GigabyteToKilobit = new GeneralConversion(8000000 , 0);
	//private final static GeneralConversion TerabyteToKilobit = new GeneralConversion(8000000000 , 0);
	private final static GeneralConversion BitToKilobit = new GeneralConversion(1.0/1000 , 0);
	
	private final static GeneralConversion KilobitToMegabit = new GeneralConversion(1.0/1000 , 0);
	private final static GeneralConversion GigabitToMegabit = new GeneralConversion(1000 , 0);
	private final static GeneralConversion TerabitToMegabit = new GeneralConversion(1000000 , 0);
	private final static GeneralConversion ByteToMegabit = new GeneralConversion(1.0/125000 , 0);
	private final static GeneralConversion KilobyteToMegabit = new GeneralConversion(1.0/125 , 0);
	private final static GeneralConversion MegabyteToMegabit = new GeneralConversion(8 , 0);
	private final static GeneralConversion GigabyteToMegabit = new GeneralConversion(8000 , 0);
	private final static GeneralConversion TerabyteToMegabit = new GeneralConversion(8000000 , 0);
	private final static GeneralConversion BitToMegabit = new GeneralConversion(1.0/1000000 , 0);
	
	private final static GeneralConversion KilobitToGigabit = new GeneralConversion(1.0/1000000 , 0);
	private final static GeneralConversion MegabitToGigabit = new GeneralConversion(1.0/1000 , 0);
	private final static GeneralConversion TerabitToGigabit = new GeneralConversion(1000.0 , 0);
	private final static GeneralConversion ByteToGigabit = new GeneralConversion(1.0/125000000, 0);
	private final static GeneralConversion KilobyteToGigabit = new GeneralConversion(1.0/125000 , 0);
	private final static GeneralConversion MegabyteToGigabit = new GeneralConversion(1.0/125 , 0);
	private final static GeneralConversion GigabyteToGigabit = new GeneralConversion(8 , 0);
	private final static GeneralConversion TerabyteToGigabit = new GeneralConversion(8000 , 0);
	private final static GeneralConversion BitToGigabit = new GeneralConversion(1.0/1000000000 , 0);
	
	private final static GeneralConversion KilobitToTerabit = new GeneralConversion(1.0/1000000000 , 0);
	private final static GeneralConversion MegabitToTerabit = new GeneralConversion(1.0/1000000 , 0);
	private final static GeneralConversion GigabitToTerabit = new GeneralConversion(1.0/1000 , 0);
	//private final static GeneralConversion ByteToTerabit = new GeneralConversion(1.0/125000000000 , 0);
	private final static GeneralConversion KilobyteToTerabit = new GeneralConversion(1.0/125000000 , 0);
	private final static GeneralConversion MegabyteToTerabit = new GeneralConversion(1.0/125000 , 0);
	private final static GeneralConversion GigabyteToTerabit = new GeneralConversion(1.0/125 , 0);
	private final static GeneralConversion TerabyteToTerabit = new GeneralConversion(8 , 0);
	//private final static GeneralConversion BitToTerabit = new GeneralConversion(1.0/1000000000000 , 0);
	
	private final static GeneralConversion KilobitToByte = new GeneralConversion(125 , 0);
	private final static GeneralConversion MegabitToByte = new GeneralConversion(125000 , 0);
	private final static GeneralConversion GigabitToByte = new GeneralConversion(125000000 , 0);
	//private final static GeneralConversion TerabitToByte = new GeneralConversion(125000000000 , 0);
	private final static GeneralConversion KilobyteToByte = new GeneralConversion(1000 , 0);
	private final static GeneralConversion MegabyteToByte = new GeneralConversion(1000000 , 0);
	private final static GeneralConversion GigabyteToByte = new GeneralConversion(1000000000 , 0);
	//private final static GeneralConversion TerabyteToByte = new GeneralConversion(1000000000000 , 0);
	private final static GeneralConversion BitToByte = new GeneralConversion(1.0/8 , 0);
	
	private final static GeneralConversion KilobitToKilobyte = new GeneralConversion(1.0/8 , 0);
	private final static GeneralConversion MegabitToKilobyte = new GeneralConversion(125 , 0);
	private final static GeneralConversion GigabitToKilobyte = new GeneralConversion(125000 , 0);
	private final static GeneralConversion TerabitToKilobyte = new GeneralConversion(125000000 , 0);
	private final static GeneralConversion ByteToKilobyte = new GeneralConversion(1.0/1000 , 0);
	private final static GeneralConversion MegabyteToKilobyte = new GeneralConversion(1000 , 0);
	private final static GeneralConversion GigabyteToKilobyte = new GeneralConversion(1000000 , 0);
	private final static GeneralConversion TerabyteToKilobyte = new GeneralConversion(1000000000 , 0);
	private final static GeneralConversion BitToKilobyte = new GeneralConversion(1.0/8000 , 0);
	
	private final static GeneralConversion KilobitToMegabyte = new GeneralConversion(1.0/8000 , 0);
	private final static GeneralConversion MegabitToMegabyte = new GeneralConversion(1.0/8 , 0);
	private final static GeneralConversion GigabitToMegabyte = new GeneralConversion(125 , 0);
	private final static GeneralConversion TerabitToMegabyte = new GeneralConversion(125000 , 0);
	private final static GeneralConversion ByteToMegabyte = new GeneralConversion(1.0/1000000 , 0);
	private final static GeneralConversion KilobyteToMegabyte = new GeneralConversion(1.0/1000 , 0);
	private final static GeneralConversion GigabyteToMegabyte = new GeneralConversion(1000 , 0);
	private final static GeneralConversion TerabyteToMegabyte = new GeneralConversion(1000000 , 0);
	private final static GeneralConversion BitToMegabyte = new GeneralConversion(1.0/8000000 , 0);
	
	private final static GeneralConversion KilobitToGigabyte = new GeneralConversion(1.0/8000000 , 0);
	private final static GeneralConversion MegabitToGigabyte = new GeneralConversion(1.0/8000 , 0);
	private final static GeneralConversion GigabitToGigabyte = new GeneralConversion(1.0/8 , 0);
	private final static GeneralConversion TerabitToGigabyte = new GeneralConversion(125 , 0);
	private final static GeneralConversion ByteToGigabyte = new GeneralConversion(1.0/1000000000 , 0);
	private final static GeneralConversion KilobyteToGigabyte = new GeneralConversion(1.0/1000000 , 0);
	private final static GeneralConversion MegabyteToGigabyte = new GeneralConversion(1.0/1000 , 0);
	private final static GeneralConversion TerabyteToGigabyte = new GeneralConversion(1000 , 0);
	//private final static GeneralConversion BitToGigabyte = new GeneralConversion(1.0/8000000000 , 0);
	
	//private final static GeneralConversion KilobitToTerabyte = new GeneralConversion(1.0/8000000000 , 0);
	private final static GeneralConversion MegabitToTerabyte = new GeneralConversion(1.0/8000000 , 0);
	private final static GeneralConversion GigabitToTerabyte = new GeneralConversion(1.0/8000 , 0);
	private final static GeneralConversion TerabitToTerabyte = new GeneralConversion(1.0/8 , 0);
	//private final static GeneralConversion ByteToTerabyte = new GeneralConversion(1.0/1000000000000 , 0);
	private final static GeneralConversion KilobyteToTerabyte = new GeneralConversion(1.0/1000000000 , 0);
	private final static GeneralConversion MegabyteToTerabyte = new GeneralConversion(1.0/1000000 , 0);
	private final static GeneralConversion GigabyteToTerabyte = new GeneralConversion(1.0/1000 , 0);
	//private final static GeneralConversion BitToTerabyte = new GeneralConversion(1.0/8000000000000, 0);

	
	@Override
	public void Execute() 
	{
	
		UnitConverterWindow window = UnitConverterController.GetWindow();
		window.ClearUnitSelection();
		window.AddToUnitSelection("Kilobit to Bit",KilobitToBit);
		window.AddToUnitSelection("Megabit to Bit",MegabitToBit);
		window.AddToUnitSelection("Gigabit to Bit",GigabitToBit);
		//window.AddToUnitSelection("Terabit to Bit",TerabitToBit);
		window.AddToUnitSelection("Byte to Bit",ByteToBit);
		window.AddToUnitSelection("Kilobyte to Bit",KilobyteToBit);
		window.AddToUnitSelection("Megabyte to Bit",MegabyteToBit);
		//window.AddToUnitSelection("Gigabyte to Bit",GigabyteToBit);
		//window.AddToUnitSelection("Terabyte to Bit",TerabyteToBit);
		window.AddToUnitSelection("Megabit to Kilobit",MegabitToKilobit);
		window.AddToUnitSelection("Gigabit to Kilobit",GigabitToKilobit);
		window.AddToUnitSelection("Terabit to Kilobit",TerabitToKilobit);
		window.AddToUnitSelection("Byte to Kilobit",ByteToKilobit);
		window.AddToUnitSelection("Kilobyte to Kilobit",KilobyteToKilobit);
		window.AddToUnitSelection("Megabyte to Kilobit",MegabyteToKilobit);
		window.AddToUnitSelection("Gigabyte to Kilobit",GigabyteToKilobit);
		//window.AddToUnitSelection("Terabyte to Kilobit",TerabyteToKilobit);
		window.AddToUnitSelection("Bit to Kilobit",BitToKilobit);
		window.AddToUnitSelection("Kilobit to Megabit",KilobitToMegabit);
		window.AddToUnitSelection("Gigabit to Megabit",GigabitToMegabit);
		window.AddToUnitSelection("Terabit to Megabit",TerabitToMegabit);
		window.AddToUnitSelection("Byte to Megabit",ByteToMegabit);
		window.AddToUnitSelection("Kilobyte to Megabit",KilobyteToMegabit);
		window.AddToUnitSelection("Megabyte to Megabit",MegabyteToMegabit);
		window.AddToUnitSelection("Gigabyte to Megabit",GigabyteToMegabit);
		window.AddToUnitSelection("Terabyte to Megabit",TerabyteToMegabit);
		window.AddToUnitSelection("Bit to Megabit",BitToMegabit);
		window.AddToUnitSelection("Kilobit to Gigabit",KilobitToGigabit);
		window.AddToUnitSelection("Megabit to Gigabit",MegabitToGigabit);
		window.AddToUnitSelection("Terabit to Gigabit",TerabitToGigabit);
		window.AddToUnitSelection("Byte to Gigabit",ByteToGigabit);
		window.AddToUnitSelection("Kilobyte to Gigabit",KilobyteToGigabit);
		window.AddToUnitSelection("Megabyte to Gigabit",MegabyteToGigabit);
		window.AddToUnitSelection("Gigabyte to Gigabit",GigabyteToGigabit);
		window.AddToUnitSelection("Terabyte to Gigabit",TerabyteToGigabit);
		window.AddToUnitSelection("Bit to Gigabit",BitToGigabit);
		window.AddToUnitSelection("Kilobit to Terabit",KilobitToTerabit);
		window.AddToUnitSelection("Megabit to Terabit",MegabitToTerabit);
		window.AddToUnitSelection("Gigabit to Terabit",GigabitToTerabit);
		//window.AddToUnitSelection("Byte to Terabit",ByteToTerabit);
		window.AddToUnitSelection("Kilobyte to Terabit",KilobyteToTerabit);
		window.AddToUnitSelection("Megabyte to Terabit",MegabyteToTerabit);
		window.AddToUnitSelection("Gigabyte to Terabit",GigabyteToTerabit);
		window.AddToUnitSelection("Terabyte to Terabit",TerabyteToTerabit);
		//window.AddToUnitSelection("Bit to Terabit",BitToTerabit);
		window.AddToUnitSelection("Kilobit to Byte",KilobitToByte);
		window.AddToUnitSelection("Megabit to Byte",MegabitToByte);
		window.AddToUnitSelection("Gigabit to Byte",GigabitToByte);
		//window.AddToUnitSelection("Terabit to Byte",TerabitToByte);
		window.AddToUnitSelection("Kilobyte to Byte",KilobyteToByte);
		window.AddToUnitSelection("Megabyte to Byte",MegabyteToByte);
		window.AddToUnitSelection("Gigabyte to Byte",GigabyteToByte);
		//window.AddToUnitSelection("Terabyte to Byte",TerabyteToByte);
		window.AddToUnitSelection("Bit to Byte",BitToByte);
		window.AddToUnitSelection("Kilobit to Kilobyte",KilobitToKilobyte);
		window.AddToUnitSelection("Megabit to Kilobyte",MegabitToKilobyte);
		window.AddToUnitSelection("Gigabit to Kilobyte",GigabitToKilobyte);
		window.AddToUnitSelection("Terabit to Kilobyte",TerabitToKilobyte);
		window.AddToUnitSelection("Byte to Kilobyte",ByteToKilobyte);
		window.AddToUnitSelection("Megabyte to Kilobyte",MegabyteToKilobyte);
		window.AddToUnitSelection("Gigabyte to Kilobyte",GigabyteToKilobyte);
		window.AddToUnitSelection("Terabyte to Kilobyte",TerabyteToKilobyte);
		window.AddToUnitSelection("Bit to Kilobyte",BitToKilobyte);
		window.AddToUnitSelection("Kilobit to Megabyte",KilobitToMegabyte);
		window.AddToUnitSelection("Megabit to Megabyte",MegabitToMegabyte);
		window.AddToUnitSelection("Gigabit to Megabyte",GigabitToMegabyte);
		window.AddToUnitSelection("Terabit to Megabyte",TerabitToMegabyte);
		window.AddToUnitSelection("Byte to Megabyte",ByteToMegabyte);
		window.AddToUnitSelection("Kilobyte to Megabyte",KilobyteToMegabyte);
		window.AddToUnitSelection("Gigabyte to Megabyte",GigabyteToMegabyte);
		window.AddToUnitSelection("Terabyte to Megabyte",TerabyteToMegabyte);
		window.AddToUnitSelection("Bit to Megabyte",BitToMegabyte);
		window.AddToUnitSelection("Kilobit to Gigabyte",KilobitToGigabyte);
		window.AddToUnitSelection("Megabit to Gigabyte",MegabitToGigabyte);
		window.AddToUnitSelection("Gigabit to Gigabyte",GigabitToGigabyte);
		window.AddToUnitSelection("Terabit to Gigabyte",TerabitToGigabyte);
		window.AddToUnitSelection("Byte to Gigabyte",ByteToGigabyte);
		window.AddToUnitSelection("Kilobyte to Gigabyte",KilobyteToGigabyte);
		window.AddToUnitSelection("Megabyte to Gigabyte",MegabyteToGigabyte);
		window.AddToUnitSelection("Terabyte to Gigabyte",TerabyteToGigabyte);
		//window.AddToUnitSelection("Bit to Gigabyte",BitToGigabyte);
		//window.AddToUnitSelection("Kilobit to Terabyte",KilobitToTerabyte);
		window.AddToUnitSelection("Megabit to Terabyte",MegabitToTerabyte);
		window.AddToUnitSelection("Gigabit to Terabyte",GigabitToTerabyte);
		window.AddToUnitSelection("Terabit to Terabyte",TerabitToTerabyte);
		//window.AddToUnitSelection("Byte to Terabyte",ByteToTerabyte);
		window.AddToUnitSelection("Kilobyte to Terabyte",KilobyteToTerabyte);
		window.AddToUnitSelection("Megabyte to Terabyte",MegabyteToTerabyte);
		window.AddToUnitSelection("Gigabyte to Terabyte",GigabyteToTerabyte);
		//window.AddToUnitSelection("Bit to Terabyte",BitToTerabyte);


	
	}

}
