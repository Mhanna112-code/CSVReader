import static org.junit.jupiter.api.Assertions.fail;

import java.io.*;

import org.junit.jupiter.api.Test;

import com.opencsv.*;
import static org.junit.Assert.*;

public class CSVParsing{
	

public String readDataLineByLine(String file)
{
	String data="";
	try {


		FileReader filereader = new FileReader(file);


		CSVReader csvReader = new CSVReader(filereader);
		String[] nextRecord;


		while ((nextRecord = csvReader.readNext()) != null) {
			for (String cell : nextRecord) {
				data = data+cell+" ";
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return data;
	
}



}