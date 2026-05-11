package com.demo;  
  
import com.itextpdf.html2pdf.HtmlConverter;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
  
public class App {  
    public static void main(String[] args) throws IOException {  
        String htmlPath = "./index.html";  
        String pdfPath = "./flexbox-support.pdf";  
          
        HtmlConverter.convertToPdf(  
            new FileInputStream(htmlPath),  
            new FileOutputStream(pdfPath)  
        );  
          
        System.out.println("PDF created successfully: " + pdfPath);  
    }  
}