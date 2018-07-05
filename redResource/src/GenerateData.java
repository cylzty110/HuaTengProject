import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.print.DocFlavor.STRING;


public class GenerateData {

	public static void main(String[] agrs){
		File file = new File("E:/SCR_TNAC.csv");
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
			Random random = new Random();
			for(int i = 1; i <= 50000; i++){
				String str = "";
				int userid = random.nextInt(50000) + 1;
				int fundid = random.nextInt(1000) + 1;
				int num = 5 - String.valueOf(i).length();
				//str += String.valueOf(userid) + "," ;
				
				//str += String.valueOf(fundid);
				str += i + "," ;
				for(int j = 0;j < num; j++) str+=" ";
				str +=i;
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				System.out.println(i);
 			}
			bufferedWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
