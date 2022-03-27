package com.java;

public class SwitchCase {

	public static void main(String[] args) {
		char input= 'A';

		switch(input) {
		case 'A':
		case 'B':
		case 'c':
		case 'D':{
			System.out.println("This is a Alphabet");
			break;//For Upper case Alphabets(A-D)
		}
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
			System.out.println("This is a Digit");
			break;//For Digit(1-5)



	case '@':
	case '$':
	case '#':{
		System.out.println("This is a Special Character");

	}
default:
	System.out.println("Invalid");
	}
}

}

