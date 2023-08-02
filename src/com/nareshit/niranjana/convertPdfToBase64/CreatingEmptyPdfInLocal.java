package com.nareshit.niranjana.convertPdfToBase64; //jar: commons-logging.1.2.jar,   pdfBox.2.0.23.jar

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreatingEmptyPdfInLocal
{
	public static void main(String args[]) throws IOException 
	{
	      PDDocument document = new PDDocument();
	      document.addPage(new PDPage());
	      document.save("C:\\Users\\Sreenivas Bandaru\\Downloads\\Sisu\\Sample files\\Empty1.pdf");
	      System.out.println("PDF created");
	      document.close();
	   }
}
