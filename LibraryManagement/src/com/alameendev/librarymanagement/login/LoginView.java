package com.alameendev.librarymanagement.login;

import java.util.Scanner;

import com.alameendev.librarymanagement.LibraryManagement;
import com.alameendev.librarymanagement.librarysetup.LibrarySetupView;

public class LoginView {

	private LoginModel loginModel;

	public LoginView() {
		loginModel = new LoginModel(this);
	}

	public void init() {
		System.out.println("--- " + LibraryManagement.getInstance().getAppname() + " --- \nVersion "
				+ LibraryManagement.getInstance().getAppVersion());
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nPlease login to proceed.");
		System.out.print("\nEnter the user name:");
		String userName = scanner.next();
		System.out.print("Enter the password:");
		String password = scanner.next();
		loginModel.validateUser(userName, password);
	}

	public void onSuccess() {
		System.out.flush();
		System.out.println("\nLogin successful....\n\n ----Welcome to " + LibraryManagement.getInstance().getAppname()
				+ " -v " + LibraryManagement.getInstance().getAppVersion());
		LibrarySetupView librarySetupView = new LibrarySetupView();
		librarySetupView.init();
	}

	public void showAlert(String alertText) {
		System.out.println(alertText);
	}

}
