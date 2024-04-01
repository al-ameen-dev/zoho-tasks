public class EmployeeDTO {

    private long employeeId;
    private String employeeName;
    private String gender;
    private String email;
    private String phoneNo;
    private long salary;
    private String address;
    private String employmentStatus;
    private String position;

    public EmployeeDTO() {
    }

    public EmployeeDTO(long employeeId, String employeeName, long salary, String gender, String email, String phoneNo, String address, String employmentStatus, String position) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.address = address;
        this.employmentStatus = employmentStatus;
        this.position = position;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getSalary(User user) {
        if (user.hasPermission("HR")) {
            return salary;
        } else {
            throw new UnAuthorizedException("You don't have permission to access salary!");
        }
    }

    public void setSalary(long salary, User user) {
        if (user.hasPermission("HR")) {
            this.salary = salary;
        } else {
            throw new UnAuthorizedException("You don't have permission to access salary!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", gender='" + gender + '\'' + ", email='" + email + '\'' + ", phoneNo='" + phoneNo + '\'' + ", address='" + address + '\'' + ", employmentStatus='" + employmentStatus + '\'' + ", position='" + position + '\'' + '}';
    }
}
