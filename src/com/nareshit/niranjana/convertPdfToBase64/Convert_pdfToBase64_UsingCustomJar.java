package com.nareshit.niranjana.convertPdfToBase64;  //jar: sun.misc.Base64Decorder jar

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class Convert_pdfToBase64_UsingCustomJar 
{
	public static void main(String[] args) {
		  String encodedData = null;

	        File filePath = new File("C:\\\\Users\\\\Sreenivas Bandaru\\\\Downloads\\\\Sisu\\\\Sample files\\\\TableDataWithRows.pdf");
	        try (FileInputStream stream = new FileInputStream(filePath)) 
	        {
	            byte ImageData[] = new byte[(int) filePath.length()];
	            stream.read(ImageData);
	            System.out.println("image data : "+ImageData);
	            
	            //encode the pdf data
	            encodedData = new BASE64Encoder().encode(ImageData);
	            System.out.println("Encoded data :"+encodedData);
	            
	            //decode the pdf data
	            byte[] decoded = new BASE64Decoder().decodeBuffer(encodedData);
	            System.out.println("After decoded :"+decoded);
	            
	          //write decoded data into a file
	             OutputStream out=new FileOutputStream(new File("C:\\\\Users\\\\Sreenivas Bandaru\\\\Downloads\\\\Sisu\\\\Sample files\\\\Demo1.pdf"));
	             out.write(decoded);
	             out.close();
	             System.out.println("Demo1.pdf file has created ");            
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
}
