import java.io.*;

class JavaFileHandling {

	public static void main(String[] args) {
			
		try {
			BufferedReader br = new BufferedReader(new FileReader("basicTxtFile.txt"));
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("An error has occurred");
		}
		
	}
	
}