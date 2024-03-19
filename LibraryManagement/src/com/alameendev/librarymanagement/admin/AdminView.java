package com.alameendev.librarymanagement.admin;

import java.util.Scanner;

import com.alameendev.librarymanagement.login.LoginView;
import com.alameendev.librarymanagement.model.Admin;

public class AdminView {

    private AdminModel adminModel;
    private LoginView loginView;

    public AdminView(){
        adminModel = new AdminModel(this);
        this.loginView = new LoginView();
    }
    
    //Admin menu.
	public void showManageAdminMenu() {
		Scanner scanner = new Scanner(System.in);
		exit: while (true) {
			System.out.printf("%nAdmin Setup Menu   : 1 %-5s| 2 %-5s| 3 %-5s| 4 %-5s%n", "Edit admin Info",
					"Show Admin Info", "Logout", "Go Back");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				this.editAdmin();
				break;
			case 2:
				this.showAdminInfo();
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

    private void showAdminInfo() {
        Admin admin = adminModel.getAdminInfo();
		System.out.printf("Admin Name:%s%nAdmin Phone:%s%nAdmin Email:%s%nadmin Address:%s",
				admin.getName(), admin.getPhoneNo(), admin.getEmailId(),admin.getAddress());
    }

    public void editAdmin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter admin name:");
        String adminName = scanner.nextLine();
        System.out.print("Enter the pasword:");
        String password = scanner.next();
        System.out.print("Enter the phone no:");
        String phoneNo = scanner.next();
        System.out.print("Enter the email:");
        String emailId = scanner.next();
        scanner.nextLine();
        System.out.print("Enter the admin address:");
        String address = scanner.nextLine();
        adminModel.updateAdmin(adminName,password,phoneNo,emailId,address);
    }
}
