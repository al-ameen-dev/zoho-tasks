package com.alameendev.librarymanagement.customer;

import java.util.List;

import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.model.Customer;

public class CustomerModel {
	private CustomerView customerView;
	
	public CustomerModel(CustomerView customerView) {
		this.customerView = customerView;
	}

	// Adding the customer object to the database.
	public void addCustomer(Customer customer) {
		LibraryDatabase.getInstance().addCustomer(customer);
	}
	
	// Deleting the customer from the database.
	public void deleteCustomer(int id) {
		if(LibraryDatabase.getInstance().getAllCutomers().size()==0){
			customerView.showAlert("There is no customer to delete!");
			return;
		}
		LibraryDatabase.getInstance().deleteCustomer(id);
	}
	
	// Retrieving all customers from the database.
	public List<Customer> getCustomerList(){
		return LibraryDatabase.getInstance().getAllCutomers();
	}
}
