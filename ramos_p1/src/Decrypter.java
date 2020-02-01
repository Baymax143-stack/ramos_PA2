public class Decrypter{

	public static int[] decrypt(int message)
	{
		int decryptArr[] = new int[4];
		
		//Will first store each digit of the message into an array using modulus
		for(int i = 3; i >= 0; i--)
		{
			decryptArr[i] = message % 10;
			message /= 10;
		}
		
		/* Will switch order of the array utilizing a temp variable
		 * Third and first digit switched first, followed by the switching of the fourth and second digit
		 */
		int temp;
		
		temp = decryptArr[2];
		decryptArr[2] = decryptArr[0];
		decryptArr[0] = temp;
		
		temp = decryptArr[3];
		decryptArr[3] = decryptArr[1];
		decryptArr[1] = temp;
		
		/* Will take each digit that was stored and undo the modification of the value (assuming it was originally encrypted)
		 * Will use the method of adding three and then taking the remainder when dividing by ten
		 * Will restore into decryption array
		 */
		for(int i = 0; i <= 3; i++)
		{decryptArr[i] = (decryptArr[i] + 3) % 10;}
			
		//Returns array with the newly modified message
		return decryptArr;
	}
}