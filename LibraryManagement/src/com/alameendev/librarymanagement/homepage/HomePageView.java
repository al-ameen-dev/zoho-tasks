package com.alameendev.librarymanagement.homepage;

import java.util.Scanner;

import com.alameendev.librarymanagement.admin.AdminView;
import com.alameendev.librarymanagement.customer.CustomerView;
import com.alameendev.librarymanagement.issuebooks.IssueBooksView;
import com.alameendev.librarymanagement.librarysetup.LibrarySetupView;
import com.alameendev.librarymanagement.login.LoginView;
import com.alameendev.librarymanagement.managebook.ManageBookView;

public class HomePageView {

	private HomePageModel homePageModel;
	private ManageBookView manageBookView;
	private CustomerView customerView;
	private LoginView loginView;
	private IssueBooksView issueBooksView;
	private LibrarySetupView librarySetupView;
	private AdminView adminView;

	public HomePageView() {
		this.homePageModel = new HomePageModel(this);
		this.manageBookView = new ManageBookView();
		this.customerView = new CustomerView();
		this.loginView = new LoginView();
		this.issueBooksView = new IssueBooksView();
		this.librarySetupView = new LibrarySetupView();
		this.adminView = new AdminView();
	}

	public void init() {
		this.showHomePage();
	}

	public void showHomePage() {

		Scanner scanner = new Scanner(System.in);
		exit: while (true) {
			System.out.printf("%nMenu   : 1 %-5s| 2 %-5s| 3 %-5s| 4 %-5s| 5 %-5s| 8 %-5s| 9 %-5s%n", 
					"Manage Books", "Manage Customer","Manage Issued Books","Library Setup","Admin Setup","Logout", "Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				manageBookView.showManageBookMenu();
				break;
			case 2:
				customerView.showManageCustomerMenu();
				break;
			case 3:
				issueBooksView.showManageIssuedBookMenu();
				break;
			case 4:
				librarySetupView.showManageLibrarySetupMenu();
				break;
			case 5:
				adminView.showManageAdminMenu();
				break;
			case 8:
				System.out.println("Loged out Successfully");
				loginView.init();
				return;
			case 9:
				System.out.println("Thank you, Visit again!");
				break exit;
			default:
				System.out.println("Enter a valid option!");
				break;
			}

		}
	}
}
