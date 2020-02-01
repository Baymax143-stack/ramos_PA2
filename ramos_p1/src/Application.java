

import java.util.Scanner;

public class Application{
	
	public static void main(String[] args){
		//Creates scanner object to take in user input
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter a 4-digit integer that will be both encrypted and decrypted: %n");
		int message = input.nextInt();
		
		//Creates two integer arrays to store new encrypted/decrypted message
		int encrypted[] = new int[4];
		int decrypted[] = new int[4];
		
		//Calls Encrypter.encrypt() function to encrypt given message
		encrypted = Encrypter.encrypt(message);
		//Prints out result looping through the array in which it is stored
		System.out.printf("%nEncrypted: ");
		for(int encrypt = 0; encrypt < 4; encrypt++)
		{System.out.print(encrypted[encrypt]);}
		
		System.out.println();
		
		//Calls Decrypter.decrypt() function to decrypt given message
		decrypted = Decrypter.decrypt(message);
		//Prints out result looping through the array in which it is stored
		System.out.printf("Decrypted: ");
		for(int decrypt = 0; decrypt < 4; decrypt++)
		{System.out.print(decrypted[decrypt]);}
	}
}