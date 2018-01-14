
public class TUTORIALTWO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 8 primative data types not based on any other data type.
 * byte 8 bit signed integer. no decimals  min value 128 max 127 because 0 to 127. 
 * short 16 bit. a range of -32768 to +32,767. 
 * int 32 bit signed twos complement integer. min -2.147 billion and pos around +2.147 billion
 * long 64 bits min 9223 quadrillion max around +9223 quadrillion
 * float is single precision 32 bit. can have decimals
 * double often used. 64 bit really big can have decimals  ex 6.2 because has a decimal.
 * 
 * People mostly use 4 primative data types int and doubles, and boolean or char 16 bit (unicode charater) 
 */
		
/*		int myInt = 4;  /* single equal is an assignment */
		/*now you can cast to an int if need be to assign a float to an int var 
		 * example below
		 * */
		int myInt = (int)4.8; /*This (int)is a int cast of 4.8 to an int, It prints 4 it truncates or drops the decimal no matter how large, not rounding */
		System.out.println(myInt); /* no quotes give value of var, not the text in the parenthasis */
		/* when you use quotes it is called a string literal*/
		myInt = myInt+5; /* he had no spaces */
		System.out.println (myInt);/* this will be a ero because it is cast to int, truncates and answer was less than 1 so it shows a zero */
		
		
		double myDouble = 4.77;
		myDouble = myDouble/5;
		System.out.println(myDouble); /* since it is a double it does not truncate any decimals here */
		
		/* strings is a non-permited data type, it is an array of charachters. */
		int[] myArray = new int[5];   /*using an array to store so it is 0 through 4*/
		myArray[0]=3; /* stores a 3 in position 0 */
		System.out.println(myArray[0]);
		
		String myString = "Hello World!";
		System.out.println(myString);
		
		boolean myBool = false;  /* purple means it is a key word*/
		boolean a2a =false;	
		char b2b = 'b';
		System.out.println(a2a);
		System.out.println(b2b);
		
	}

}
