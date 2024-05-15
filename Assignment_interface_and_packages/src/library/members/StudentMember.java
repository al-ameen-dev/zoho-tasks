package library.members;

public class StudentMember extends Member {

	boolean studentDiscount;

	public StudentMember(long id, String name, String email, String address) {
		super(id, name, email, address);
	}

	@Override
	void showDetails() {
		System.out.println("Name :" + this.name + " email:" + this.email + " Address:" + this.address
				+ " Student Discount:" + this.studentDiscount);
	}

	@Override
	public String toString() {
		return "StudentMember [studentDiscount=" + studentDiscount + ", id=" + id + ", name=" + name + ", email="
				+ email + ", address=" + address + "]";
	}

}
