import java.util.*;

class PwTest {
    public static Scanner s = new Scanner("System.in");
    public static void main(String[] args) {
        
        String key;                                         // key for generating passwords
        StringTokenizer kStk;                               // key tokenizer
        ArrayList<String> pwList = new ArrayList<String>(); // password holding list
        Iterator<String> pwListIterator;                    // list iterator for pwList
        int count;                                          // count for creating passwords
        
        System.out.print("Insert Key (-help to help): ");
        key = s.next();
        kStk = new StringTokenizer(key);
        
        System.out.print("Insert count: ");
        count = s.nextInt();
        
        for(int i = 0; i < count; i++) {
            
            StringBuilder temp = new StringBuilder(null);
            
            while(kStk.hasMoreTokens()) {
                
                switch(kStk.nextToken()) {
                case "a":
                    temp.append((char) (Math.random() * 26 + 'a'));
                    break;
                case "A":
                    temp.append((char) (Math.random() * 26 + 'A'));
                    break;
                case "0":
                    temp.append((char) (Math.random() * 10 + 1));
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