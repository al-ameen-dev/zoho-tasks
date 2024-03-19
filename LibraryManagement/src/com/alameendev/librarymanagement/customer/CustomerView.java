package com.alameendev.librarymanagement.customer;

import java.util.List;
import java.util.Scanner;

import com.alameendev.librarymanagement.login.LoginView;
import com.alameendev.librarymanagement.model.Customer;

public class CustomerView {

	private CustomerModel customerModel;
	private LoginView loginView;

	public CustomerView() {
		customerModel = new CustomerModel(this);
		loginView = new LoginView();
	}

	// Manage Customers Menu.
	public void showManageCustomerMenu() {
		Scanner scanner = new Scanner(System.in);
		exit: while (true) {
			System.out.printf("%nManage Customers Menu   : 1 %-5s| 2 %-5s| 3 %-5s| 4 %-5s| 5 %-5s%n", "Add Customers",
					"Show Customers", "Delete Customer", "Logout", "Go Back");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				this.addCustomer();
				break;
			case 2:
				this.showCustomers();
				break;
			case 3:
				this.deleteCustomer();
				break;
			case 4:
				System.out.println("Loged out Successfully");
				loginView.init();
				return;
			case 5:
				break exit;
			default:
				System.out.println("Enter a valid option!");
				break;
			}
		}
	}

	// Add customer view.
	public void addCustomer() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the cutomer name:");
		String name = scanner.nextLine();
		System.out.print("Enter the Phone number:");
		long phone = scanner.nextLong();
		System.out.print("Email Id:");
		scanner.nextLine();
		String emailId = scanner.nextLine();
		System.out.print("Enter the address:");
		String address = scanner.nextLine();
		Customer customer = new Customer.Builder().address(address).emailId(emailId).membership(true).name(name)
				.phone(phone).build();
		customerModel.addCustomer(customer);
	}

	// Show customer list view.
	public void showCustomers() {
		List<Customer> customerList = customerModel.getCustomerList();
		showCustomerTable(customerList);
	}

	// Helper function to format and print the customer list.
	public void showCustomerTable(List<Customer> customerList) {
		if (customerList.size() == 0) {
			System.out.println("Currently there is no customers in the library.");
		} else {
			System.out.printf("%n%-15s|%-15s|%-15s|%-15s|%-15s|%-15s%n", "Customer Id", "Customer Name", "Email Id",
					"Phone", "Address", "Membership");
			for (Customer customer : customerList) {
				System.out.printf("%n%-15d|%-15s|%-15s|%-15d|%-15s|%-15b%n", customer.getCustomerId(),
						customer.getName(), customer.getEmailId(), customer.getPhone(), customer.getAddress(),
						customer.isMembership());
			}
		}
	}

	// Delete view to get the customer id.
	public void deleteCustomer() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the customer Id:");
		int id = scanner.nextInt();
		customerModel.deleteCustomer(id);
	}

    public void showAlert(String alert) {
		System.out.println(alert);
    }

}
