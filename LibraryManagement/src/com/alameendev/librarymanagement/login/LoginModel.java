package com.alameendev.librarymanagement.login;

import com.alameendev.librarymanagement.admin.AdminModel;
import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.model.Admin;

public class LoginModel {

	private LoginView loginView;
	private AdminModel adminModel;

	LoginModel(LoginView loginView) {
		this.loginView = loginView;
		
		if(LibraryDatabase.getInstance().getAdmin() == null){
			LibraryDatabase.getInstance().createAdmin("zsgs", "admin");
		}
	}

	public void validateUser(String userName, String password) {
		if (isValidUserName(userName)) {
			if (isValidPassword(password)) {
				loginView.onSuccess();
			} else {
				loginView.showAlert("Invalid password!");
				loginView.init();
			}
		}else {
			loginView.showAlert("invalid User Name!");
			loginView.init();
		}
	}


	// this method should be private because this method used only with in this
	// class.
	private boolean isValidUserName(String userName) {
		return userName.equals(LibraryDatabase.getInstance().getAdmin().getName());
	}

	// this method should be private because this method used only with in this
	// class.
	private boolean isValidPassword(String password) {
		return password.equals(LibraryDatabase.getInstance().getAdmin().getPassword());
	}
}
