package com.alameendev.librarymanagement.librarysetup;

import java.util.Scanner;

import com.alameendev.librarymanagement.admin.AdminView;
import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.homepage.HomePageView;
import com.alameendev.librarymanagement.login.LoginView;
import com.alameendev.librarymanagement.managebook.ManageBookView;
import com.alameendev.librarymanagement.model.Library;

public class LibrarySetupView {

	// This variable should be private.
	// so that outside of this class cannot access this variable.
	private LibrarySetupModel librarySetupModel;
	private LoginView loginView;

	// This Constructor should be public.
	// so that all classes can create instance of this class.
	public LibrarySetupView() {
		librarySetupModel = new LibrarySetupModel(this);
		loginView = new LoginView();
	}

	public void init() {
		librarySetupModel.startSetup();

	}

	public void setUpLibrary() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the library name:");
		String libraryName = scanner.nextLine();
		System.out.print("Enter the phone no:");
		String phoneNo = scanner.nextLine();
		System.out.print("Enter the email id:");
		String emailId = scanner.nextLine();
		System.out.print("Enter the address:");
		String address = scanner.nextLine();
		librarySetupModel.updateLibrary(libraryName, phoneNo, emailId, address);
	}

	public void onSetupComplete() {
		System.out.println("\nLibrary setup already completed");
		// if(LibraryDatabase.getInstance().getAdminInfo().getPassword().equals("admin")){
		// 	adminView.editAdmin();
		// }
		new HomePageView().init();
	}

	public void showAlert(String alert) {
		System.out.println(alert);
	}

	public void showLibraryInformation() {
		Library library = librarySetupModel.getLibraryInformation();
		System.out.printf("Library Name:%s%nLibrary Phone:%s%nLibrary Email:%s%nLibrary Address:%s",
				library.getLibraryName(), library.getPhoneNo(), library.getEmailId(),library.getAddress());
	}

	public void initiateSetup() {
		setUpLibrary();
	}

	//Library menu.
	public void showManageLibrarySetupMenu() {
		Scanner scanner = new Scanner(System.in);
		exit: while (true) {
			System.out.printf("%nLibrary Setup Menu   : 1 %-5s| 2 %-5s| 3 %-5s| 4 %-5s%n", "Edit Library Info",
					"Show Library Info", "Logout", "Go Back");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				this.setUpLibrary();
				break;
			case 2:
				this.showLibraryInformation();
				break;
			case 3:
				System.out.println("Loged out Successfully");
				loginView.init();
				return;
			case 4:
				break exit;
			default:
				System.out.println("Enter a valid option!");
				break;
			}
		}
	}
}
