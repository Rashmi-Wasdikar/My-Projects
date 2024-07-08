import java.util.Scanner;

public class Encryption 
{
    public static String alphabets = "abcdefghijklmnopqrstuvwxyz";
	public static String encryption(String input, int shiftkey)
	{
		input = input.toLowerCase(); 
		String EncryptedStr = "";
		for(int i = 0; i<input.length();i++)
		{
			int originalposition = alphabets.indexOf(input.charAt(i)); //position of character of input in alphabets
			int encryptedposition = (shiftkey+originalposition) %26;
			char encryptCharacter = alphabets.charAt(encryptedposition);
			
			EncryptedStr += encryptCharacter;
		}
		return EncryptedStr;
	}


    public static void main(String[] args)   
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for encryption  ");   
        String input = sc.nextLine();  
        System.out.println("Enter the value by which each character gets shifted: ");   
        int shiftKey = Integer.valueOf(sc.nextLine());   
        System.out.println("Encrypted string : "+encryption(input, shiftKey)); 
    }


}
