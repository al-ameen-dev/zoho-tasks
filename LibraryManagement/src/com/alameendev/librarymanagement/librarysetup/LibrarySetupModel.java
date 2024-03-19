package com.alameendev.librarymanagement.librarysetup;

import com.alameendev.librarymanagement.db.LibraryDatabase;
import com.alameendev.librarymanagement.model.Library;

//Access modifier for this LibrarySetupModel class should be default.
//So that outside of the package this class cannot be accessed.
class LibrarySetupModel {

	// This variable should be private.
	// so that outside of this class cannot access this variable.
	private LibrarySetupView librarySetupView;
	private Library library;
	// Access modifier for this LibrarySetupModel constructor should be default.
	// So that outside of the package this constructor cannot be accessed.
	LibrarySetupModel(LibrarySetupView librarySetupView){
		this.librarySetupView = librarySetupView;
		library = new Library
				.Builder()
				.libraryName("Please add library name!")
				.address("Please add address!")
				.emailId("Please add email!")
				.phoneNo("Please add phone!")
				.build();
		LibraryDatabase.getInstance().updateLibrary(library);
	}
	
	public void startSetup() {
		if(library == null || library.getLibraryId() == 0) {
			librarySetupView.initiateSetup();
		}else {
			librarySetupView.onSetupComplete();
		}
	}

    public void updateLibrary(String libraryName, String phoneNo, String emailId, String address) {
		Library library = new Library.Builder().libraryName(libraryName).phoneNo(phoneNo).emailId(emailId).address(address).build();
        LibraryDatabase.getInstance().updateLibrary(library);
    }

	public Library getLibraryInformation(){
		return LibraryDatabase.getInstance().getLibrary();
	}
}
