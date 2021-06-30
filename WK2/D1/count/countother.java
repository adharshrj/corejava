package WK2.D1.count;
import java.io.*;
public class countother {
    public static void main(String[] args) throws IOException
	{
		File file = new File("C:/Users/lucky/Documents/GitHub/srmb2corejava/WK2/D1/filecopy/input.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		// Initializing counters
		int wordCount = 0;
		int vowelCount = 0;
		int characterCount = 0;
        
            

		while((line = reader.readLine()) != null)
		{
			for (int i=0 ; i<line.length(); i++){
            char ch = line.charAt(i);
				if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                	vowelCount ++;
             	} else if (ch == ' '){
					wordCount++;
				} else{
				characterCount ++;
				}
			}
		}
		
		System.out.println("Character count = " + characterCount);
		System.out.println("Word count = " + wordCount);
        System.out.println("Vowel count = " + vowelCount);
	}
}

    

