import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// by Nag
public class PayRollManager {

	// Create methods and type your code here
	public static void main(String[] args) throws FileNotFoundException {
		PayRollManager prm = new PayRollManager();
		Map<Integer, Map<Integer, EmployeeVO>> result = prm.getEmployeeSalaryDetails("data/employees.txt",
				"data/payroll.txt");
		System.out.println(result);
	}

	public Map<Integer, Map<Integer, EmployeeVO>> getEmployeeSalaryDetails(String employeesFile, String payrollFile)
			throws FileNotFoundException {

		Map<Integer, Map<Integer, EmployeeVO>> map = new HashMap<>();

		List<String> employees = new ArrayList<>();
		List<String> payroll = new ArrayList<>();

		Scanner scanner = new Scanner(new File(employeesFile));
		while (scanner.hasNextLine()) {
			employees.add(scanner.nextLine());
		}
		scanner.close();

		scanner = new Scanner(new File(payrollFile));
		while (scanner.hasNextLine()) {
			payroll.add(scanner.nextLine());
		}
		scanner.close();

		// --------------------------------------------------------------------

		for (String empData : employees) {

			int recordCount = 0;

			String[] empTokens = empData.split(",");

			EmployeeVO employeeVO = new EmployeeVO();
			employeeVO.setEmployeeName(empTokens[1]);

			for (String payrollRecord : payroll) {
				String[] payrollTokens = payrollRecord.split(",");
				System.out.println(empTokens[0] + "=" + payrollTokens[0]);
				if (empTokens[0].equals(payrollTokens[0])) {
					recordCount++;
				}
			}
			if (recordCount == 1) {
				Map<Integer, EmployeeVO> empMap = new HashMap<>();
				empMap.put(Integer.parseInt(empTokens[0]), employeeVO);
				map.put(1, empMap);
			} else {
				// ...
			}

		}

		return map;

	}

}

class EmployeeVO {
	private int employeeID;
	private String employeeName;
	private Map<String, Integer> salaryDetails;
	private Date joiningDate;
	private Date resignationDate;
	private char departmentCode;
	private int mobileNumber;
	private String emailID;
	private int numberOfLeave;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Map<String, Integer> getSalaryDetails() {
		return salaryDetails;
	}

	public void setSalaryDetails(Map<String, Integer> salaryDetails) {
		this.salaryDetails = salaryDetails;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public char getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(char departmentCode) {
		this.departmentCode = departmentCode;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getNumberOfLeave() {
		return numberOfLeave;
	}

	public void setNumberOfLeave(int numberOfLeave) {
		this.numberOfLeave = numberOfLeave;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeVO [employeeID=");
		builder.append(employeeID);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", salaryDetails=");
		builder.append(salaryDetails);
		builder.append(", joiningDate=");
		builder.append(joiningDate);
		builder.append(", resignationDate=");
		builder.append(resignationDate);
		builder.append(", departmentCode=");
		builder.append(departmentCode);
		builder.append(", mobileNumber=");
		builder.append(mobileNumber);
		builder.append(", emailID=");
		builder.append(emailID);
		builder.append(", numberOfLeave=");
		builder.append(numberOfLeave);
		builder.append("]");
		return builder.toString();
	}
}

class PayRollProcessingException extends Exception {
	public PayRollProcessingException(String message) {
		super(message);
	}

	public PayRollProcessingException(Throwable throwable) {
		super(throwable);
	}

	public PayRollProcessingException(Throwable throwable, String message) {
		super(message, throwable);
	}

}
