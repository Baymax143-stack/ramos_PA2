import java.lang.Math;

public class Encrypter{
	
	public static int[] encrypt(int message)
	{
		int encryptArr[] = new int[4];
		
		/* Will first take each digit of message to be later stored into the array through modulus
		 * Will then transform by adding 7, then modulus 7
		 * Will store into encryption array
		 */
		for(int i = 3; i >= 0; i--)
		{
			int digit = message % 10;
			encryptArr[i] = (digit + 7) % 10;
			
			message /= 10;
		}
		
		/* Will switch order of the array utilizing a temp variable
		 * First and third digit switched first, followed by the switching of the second and fourth digit
		 */
		int temp;
		
		temp = encryptArr[0];
		encryptArr[0] = encryptArr[2];
		encryptArr[2] = temp;
		
		temp = encryptArr[1];
		encryptArr[1] = encryptArr[3];
		encryptArr[3] = temp;
		
		//Returns array with the newly modified message
		return encryptArr;
	}
}