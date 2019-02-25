/*
 *Programmed By: Justin Sousa, Teague Wingfelder, Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Monday, January 9, 2017.
 *Program Description: Create an application that stores a password of your choice. The application
 *                     should prompt the user for the password and then display "Welcome" if the
 *                     correct password is typed. If after three tries the correct password is not
 *                     entered, the message "Access Denied." should be displayed.
 */

 import java.util.Scanner;		//importing Scanner Package

 class Password{				//class decloration opening and closing w/ braces
 	public static void main(String [] args){	//main mehtod opening and closing w/ braces

		String passwordInput = new String("money");	//Variable decloration with assigned value
		String passwordGuess = new String("");		//Variable decloration

 		Scanner input=new Scanner(System.in);	    //Scanner Creation

 		for (int i = 1; i <= 3; i++){			    //for statement with counter (i)

 				System.out.print("Enter the password: ");		//System output
 		passwordGuess = input.nextLine();						//stores variable passwordGuess

 		if (passwordInput.compareToIgnoreCase(passwordGuess)==0){		//if statement with condition
 			System.out.println("Welcome");								//System output displaying "Accepted"
 			break;														//break
 			}else{														//else
 			System.out.print("The password you entered is wrong\n");	//System output displaying "Wrong password"

 		if (i == 3) {													//if statement with condition
 			System.out.println ("Access denied.");						//System output displaying "Access denied"

		input.close();												//closing scanner



 				}
 			}
 		}
 	}
 }