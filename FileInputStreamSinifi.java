package ders0205;
import java.io.*;

public class FileInputStreamSinifi {
	public static void main(String[] args){
		File f = new File ("C:\\kitap\\ornek2.txt");
		try{
			FileInputStream oku = new FileInputStream(f);
			byte dizi[]= new byte[(int) f.length()];
			oku.read(dizi);
			String okunan = new String (dizi);
			System.out.println(okunan);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
