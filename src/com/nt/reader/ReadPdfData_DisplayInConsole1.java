package com.nt.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdfData_DisplayInConsole1 {
	public static void main(String[] args)throws  Exception {
		File file = new File("C:\\Users\\Sreenivas Bandaru\\Downloads\\Sisu\\Eidiko\\TableDataWithRows.pdf");
		FileInputStream fis = new FileInputStream(file);
		PDDocument document =PDDocument.load(fis);
	
		 System.out.println("Total page count in pdf:"+document.getPages().getCount());
		
	//To fetch data from pdf, we create PDfTextStripper class and use getText() method for read the data from given pdf file
		PDFTextStripper dataStripper = new PDFTextStripper();
		String str=dataStripper.getText(document);
		System.out.println("PDF Extracted Data:"+str);
		 String line="";
			try {
				BufferedReader br = new BufferedReader(new FileReader(str));
				try {
					while((line=br.readLine())!=null)
					{
						String[] values = line.split("");
						System.out.println("Day:"+values[1]);
					}
				}
			catch(FileNotFoundException fe)
			{
				fe.printStackTrace();
			}
			}
			catch (IOException e) {
					e.printStackTrace();
				}
			document.close();
			 fis.close();
		}//close main method	 
	
}
