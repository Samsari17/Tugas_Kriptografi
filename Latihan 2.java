
public class Latihan2 {

	public static void main(String[] args) {
		String rd = "KILUA CUBE TV";
		System.out.println("Plaintextnya adalah	: "+rd);
		
		String id = encript(rd);
		System.out.println("Enkripsinya adalah	: "+id);
		
		String rd1 = descript(id);
		System.out.println("Dekripsinya adalah	: "+rd1);                     
        
		
	}
	
	public static final String[] pi = {"A", "B", "C", "D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	public static final String[] ci = {"D", "E", "F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	
	public static String encript (String plaintext) {
		String ciphertext = "";
		loop1:
	        for(int a = 0; a < plaintext.length(); a++)
	        {                  
	            int index_plain = -1;
	            for(int b = 0; b < pi.length; b++)
	            {
	                index_plain = (String.valueOf(plaintext.charAt(a)).equals(pi[b])) ? b : -1;
	                if(index_plain != -1)
	                {                 
	                    ciphertext += pi[(index_plain + 3) % 26];
	                    continue loop1;
	                }              
	            }
	            ciphertext +=plaintext.charAt(a);
	        }
		return ciphertext;
	}
	public static String descript (String ciphertext) {
		String plaintext= "";
		loop1:
	        for(int a = 0; a < ciphertext.length(); a++)
	        {                  
	            int index_ciphertext = -1;
	            for(int b = 0; b < ci.length; b++)
	            {
	                index_ciphertext = (String.valueOf(ciphertext.charAt(a)).equals(ci[b])) ? b : -1;
	                if(index_ciphertext != -1)
	                {                 
	                	 plaintext += ((index_ciphertext - 3) >= 0) ? ci[(index_ciphertext - 3 ) % 26] : ci[26 + (index_ciphertext - 3)];
	                        continue loop1;
	                }              
	            }
	            plaintext +=ciphertext.charAt(a);
	        }
		return plaintext;
	}
}
