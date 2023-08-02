package com.nareshit.niranjana.convertPdfToBase64;  //no need to take any jar....Bydefault pre-defined jar will be there

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Base64;

public class Convert_pdfToBase64 
{
	public static void main(String[] args) {
        String encodedData = null;

        File filePath = new File("C:\\Users\\Sreenivas Bandaru\\Downloads\\Sisu\\Sample files\\TableDataWithRows.pdf");
        try (FileInputStream stream = new FileInputStream(filePath)) {

            byte ImageData[] = new byte[(int) filePath.length()];
            stream.read(ImageData);
            System.out.println("Image Data : "+ImageData);
            
            //encode the data
            byte[] encoded = Base64.getEncoder().encode(ImageData);
            System.out.println("After encoded :"+encoded);
            
            //decode the data
            byte[] decoded = Base64.getDecoder().decode(encoded);
            System.out.println("After decoded :"+decoded);
            
            //write decoded data into a file
             OutputStream out=new FileOutputStream(new File("C:\\\\Users\\\\Sreenivas Bandaru\\\\Downloads\\\\Sisu\\\\Sample files\\\\Demo.pdf"));
             out.write(decoded);
             out.close();
             System.out.println("Demo.pdf file has created ");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
