package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;

public class CSVFileReader {
	
	
	
	
	public List<CSVBean> readFile(String fileName ) throws FileNotFoundException, IOException 
	{
		var csvFile = new ClassPathResource(fileName);
		List<CSVBean> csvList = new ArrayList<CSVBean>();
		String result = "";	
		CSVBean csvresult;
		try (Scanner myScanner = new Scanner(csvFile.getFile())) {
			while(myScanner.hasNextLine())
			{
				csvresult = processLine(myScanner.nextLine());
				csvList.add(csvresult);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return csvList;
	}
	
	public CSVBean processLine(String textLine) {
		String result = "";
		int index = 0;
		CSVBean csvresult = new CSVBean();
		
		Scanner rowScanner = new Scanner(textLine);
		rowScanner.useDelimiter(",");

		while(rowScanner.hasNext())
		{
			result = rowScanner.next();
			
			if (index == 0)
				csvresult.setOrderdate(result);
			else if (index == 1)
				csvresult.setRegion(result);
			else if (index == 2)
				csvresult.setLastName(result);
			else if (index == 3)
				csvresult.setFirstName(result);
			else if(index == 4)
				csvresult.setItem(result);
			else if (index == 5)
				csvresult.setUnits(result);
			else if (index == 6)
				csvresult.setUnitCost(result);
			else if (index == 7)
				csvresult.setTotalCost(result);
			else 
				System.out.println("wrong data");
			index++;
			
			
		}
		

		return csvresult;
	}

}
