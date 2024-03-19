package com.alameendev.librarymanagement.model;

public class Customer {
	private static int uniqueId;
	private int customerId;
	private String name;
	private String emailId;
	private long phone;
	private String address;
	private boolean membership;

	static {
		uniqueId = 1;
	}

	private Customer(Builder builder) {
		this.name = builder.name;
		this.address = builder.address;
		this.emailId = builder.emailId;
		this.phone = builder.phone;
		this.customerId = Customer.uniqueId++;
		this.membership = builder.membership;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public long getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public boolean isMembership() {
		return membership;
	}

	public static class Builder {
		private String name;
		private String emailId;
		private long phone;
		private String address;
		private boolean membership;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder emailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public Builder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder membership(boolean membership) {
			this.membership = membership;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}

	@Override
	public String toString() {

		return "Customer { " + customerId + " - " + name + " - " + phone + " }";
	}
}
