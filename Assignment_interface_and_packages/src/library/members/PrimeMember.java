package library.members;

public class PrimeMember extends Member{

	boolean primeMember;
	public PrimeMember(long id, String name, String email, String address,boolean primeMember) {
		super(id, name, email, address);
		this.primeMember = primeMember;
	}

	@Override
	void showDetails() {
		System.out.println("Name :"+this.name+" email:"+this.email+" Address:"+this.address+" Prime member:"+this.primeMember);
		
	}

	@Override
	public String toString() {
		return "PrimeMember [primeMember=" + primeMember + ", id=" + id + ", name=" + name + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
}
