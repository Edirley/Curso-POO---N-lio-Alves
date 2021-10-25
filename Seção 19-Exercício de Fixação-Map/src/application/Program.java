package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String,Integer> log = new LinkedHashMap<>();
		
		System.out.println("Enter file full path: ");
		String path = scan.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line!= null) {
				String[] fields = line.split(",");
				int votos = Integer.parseInt(fields[1]);
				if (log.containsKey(fields[0])) {
//					int votos = Integer.parseInt(fields[0]);
					log.put(fields[0], votos + log.get(fields[0]));
				} else {
					log.put(fields[0], votos);
				}
				
//				System.out.println(Arrays.toString(fields));
				line = br.readLine();
			}
				
			for (String key : log.keySet()) {
				System.out.println(key + ": " + log.get(key));
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		scan.close();
	}
}
