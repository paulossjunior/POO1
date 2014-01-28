package br.sr.ifes.edu.poo.fileexamples.cgd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class ExampleBufferedReader {

	public void printSimpleFile(String fileName, String path) throws IOException{
		
		BufferedReader bufferedReader = null;
		
		FileReader fileReader = null;
		
		String linha;
		
		try{
			
			System.out.println("File Path: "+path+File.separator+fileName);
			
			fileReader = new FileReader(path+File.separator+fileName);
			
			bufferedReader = new BufferedReader(fileReader);
			
			linha = bufferedReader.readLine();
			
			while (linha != null)
			{
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
			
		}
		finally{
			//Fechando o arquivo
			bufferedReader.close();
		}
	}
	
	public void printSimpleFile(String fileName) throws IOException{
		
		URL filePath = getClass().getResource(fileName);
		
		BufferedReader bufferedReader = null;
		
		FileReader fileReader = null;
		
		String linha;
		
		try{
			
			System.out.println("File Path: "+filePath.getPath());
			
			fileReader = new FileReader(filePath.getPath());
			
			bufferedReader = new BufferedReader(fileReader);
			
			linha = bufferedReader.readLine();
			
			while (linha != null)
			{
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
			
		}
		finally{
			//Fechando o arquivo
			bufferedReader.close();
		}
	}

}
