package com.alameendev.librarymanagement.model;

public class Library {

	private static int uniqueId;
	private String libraryName;
	private int libraryId;
	private String phoneNo;
	private String emailId;
	private String address;

	static {
		uniqueId = 1;
	}

	public Library() {

	}

	private Library(Builder builder) {
		this.libraryName = builder.libraryName;
		this.libraryId = uniqueId++;
		this.phoneNo = builder.phoneNo;
		this.emailId = builder.emailId;
		this.address = builder.address;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getAddress() {
		return address;
	}

	public static class Builder {
		private String libraryName;
		private String phoneNo;
		private String emailId;
		private String address;

		public Builder libraryName(String libraryName) {
			this.libraryName = libraryName;
			return this;
		}

		public Builder phoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
			return this;
		}

		public Builder emailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Library build() {
			return new Library(this);
		}
	}

	@Override
	public String toString() {

		return "Library { " + libraryId + " - " + libraryName + " - " + phoneNo + " - " + emailId + " - " + address
				+ " }";
	}

}
