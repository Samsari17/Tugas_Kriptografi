
public class Latihan {

	public static void main(String[] args) {
		String rd = "AYAM JAGO";
		System.out.println("Plaintextnya adalah : "+rd);
		
		String id = encript(rd);
		System.out.println("Enkripsinya adalah  : "+id);
		
		String rd1 = decript(id);
		System.out.println("Dekripsinya adalah  : "+rd1);  
		
		
	}
	public static final String[] rd = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
	public static final String[] id = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
	
	
	public static String encript(String plaintext){
		String ciphertext = "";
		for(int i=0 ; i<plaintext.length(); i++){
			String s0 = plaintext.substring(i, i+1);
			String s1 = " ";							
			//
			for(int j=0; j<rd.length; j++){				
				if(s0.equals(rd[j])){					
					s1 = id[j];
					break;
				}
			}
			ciphertext+=s1;
		}
				
		return ciphertext;
	}
	public static String decript(String ciphertext){
		String plaintext = "";
				for(int i=0 ; i<ciphertext.length(); i++){
					String s0 = ciphertext.substring(i, i+1);
					String s1 = " ";							
					//
					for(int j=0; j<id.length; j++){				
						if(s0.equals(id[j])){					
							s1 = rd[j];
							break;
						}
					}
					plaintext+=s1;
				}
		return plaintext;
	}
}