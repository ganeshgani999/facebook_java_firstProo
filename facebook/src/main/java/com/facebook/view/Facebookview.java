package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class Facebookview {

	public static void main(String[] args) {
		
		System.out.println("*********MAIN**********");
		System.out.println("Press 1 to Create Profile");
		System.out.println("Press 2 to View Profile");
		System.out.println("Press 3 to Delete Profile");
		System.out.println("Press 4 to Edit Profile");
		System.out.println("Press 5 to Search Profile");
		System.out.println("Press 6 to View All Profiles");
		System.out.println("Press 7 to Login Profile");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choise");
		
		int c = sc.nextInt();
		
		FacebookControllerInterface fc = new FacebookController();
		
		
		switch(c) {
		case 1: fc.createProfileController();
			break;
		case 2: fc.viewProfileController();
			break;
		case 3: fc.deleteProfileController();
			break;
		case 4: fc.editProfileController();
			break;
		case 5: fc.searchProfileController();
			break;
		case 6: fc.viewAllProfileController();
			break;
		case 7: fc.loginPageProfileController();
			break;
		default:
			System.out.println("Invalid Counter");
			
		}
	}

}
