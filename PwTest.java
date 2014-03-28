package pwt5.mainP;

import java.io.*;
import java.util.*;

public class PwTest {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        String key;                                         // key for generating passwords
        StringTokenizer kStk;                               // key tokenizer
        ArrayList<String> pwList = new ArrayList<String>(); // password holding list
        Iterator<String> pwListIterator;                    // list iterator for pwList
        int count;                                          // count for creating passwords
        
		do {
	        System.out.print("Insert Key (-help to help): ");
	        key = s.nextLine();
	        if(key.equalsIgnoreCase("-help")) {
		        try {
					BufferedReader br = new BufferedReader(new FileReader(new File("help.txt")));
					String buf;
			        while((buf = br.readLine()) != null) {
			        	System.out.print(buf);
			        }
		        	br.close();
				} catch (FileNotFoundException e) {
					System.out.println("Couldn't find file.");
				} catch (IOException e) {
					System.out.println("Failed to read file.");
				}
	        }
        } while(key.equalsIgnoreCase("-help"));
        
        
        System.out.print("Insert count: ");
        count = Integer.parseInt(s.nextLine());
        
        for(int i = 0; i < count; i++) {
        	
        	kStk = new StringTokenizer(key);				// tokenize key every sequence
            StringBuffer temp = new StringBuffer("");
            
            while(kStk.hasMoreTokens()) {
                
                switch(kStk.nextToken()) {
                case "a":
                    temp.append((char) (Math.random() * 26 + 'a'));
                    break;
                case "A":
                    temp.append((char) (Math.random() * 26 + 'A'));
                    break;
                case "0":
                    temp.append((char) (Math.random() * 10 + '0'));
                    break;
                }
            }
            
            pwList.add(temp.toString());
        }
        pwListIterator = pwList.iterator();
        
        while(pwListIterator.hasNext())
            System.out.println(pwListIterator.next());
    }
}
