import java.io.*;

class JavaFileHandling {

	public static void main(String[] args) {
			
		try {
			// open file using BufferedReader
			BufferedReader br = new BufferedReader(new FileReader("basicTxtFile.txt"));
			
			String line = br.readLine();
			
			// loop through lines in file, as long as line is not null
			while (line != null) {
				// print line out to console
				System.out.println(line);
				// read next line of file
				line = br.readLine();
			}
			
		}
		catch (Exception e) {
			// an error has occurred, so print out the following message to the console
			System.out.println("An error has occurred");
		}
		
	}
	
}