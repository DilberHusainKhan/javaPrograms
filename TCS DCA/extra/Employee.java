import org.apache.commons.lang3.StringUtils;

public class EmployeeInfo {

 int EmployeeId = 0;
 String EmployeeName = "";
 int age =0;
 double salary = 0.0;
 String designation ="";
	
 public int getEmployeeId() {
  return EmployeeId;
 }
 public void setEmployeeId(int employeeId) {
  EmployeeId = employeeId;
 }

 public String getEmployeeName() {
  return EmployeeName;
 }

 public void setEmployeeName(String employeeName) {
  EmployeeName = employeeName;
 }
 
 public int getAge() {
  return age;
 }
 
 public void setAge(int age) {
  this.age = age;
 }

 public double getSalary() {
  return salary;
 }
 
 public void setSalary(double salary) {
  this.salary = salary;
 }

 public String getDesignation() {
  return designation;
 }

 public void setDesignation(String designation) {
  this.designation = designation;
 }

 public boolean employeeInfoValidator() {
  boolean isValid = true;
  if(StringUtils.isBlank(EmployeeName)) 
     isValid = false;
  if(StringUtils.isBlank(designation))
     isValid =false;
  if((age==0 || age < 18 || age > 60) || (salary == 0) || (EmployeeId == 0))
     isValid =false;
  return isValid;
 }
}












// Base class EligibilityCalculator.java 
public class EligibilityCalculator {

 EmployeeInfo employeeInfo= new EmployeeInfo();

 public boolean eligibleForHike(EmployeeInfo empInfo) {
  if (empInfo.employeeInfoValidator()) {
   if (empInfo.salary > 24000 && empInfo.designation.equals("Manager")) {
    return true;
   } else {
    return false;
   }
  } else {
   throw new IllegalArgumentException("Incorrect Employee Info passed");
  }
 }
} 






// Junit Testing Test class for EligibilityCalculator.java

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class EligibilityCalculatorTest {

 EmployeeInfo employeeInfo = null;
 EligibilityCalculator eligibilityCalculator = new EligibilityCalculator();

 @BeforeEach
 public void setUp() throws Exception {
   employeeInfo = new EmployeeInfo();
 }

 @AfterEach
 public void tearDown() throws Exception {
   employeeInfo = null;
 }

 @Test
 public void testEligibleForHike_ValidDesignation() {
   employeeInfo.age = 35;
   employeeInfo.designation = "Manager";
   employeeInfo.EmployeeName = "Niket";
   employeeInfo.salary = 49000.00;
   employeeInfo.EmployeeId = 526234;
   assertTrue(eligibilityCalculator.eligibleForHike(employeeInfo));
 }

 @Test
 public void testEligibleForHike_BlankDesignation() throws IllegalArgumentException {
   employeeInfo.age = 35;
   employeeInfo.designation = " ";
   employeeInfo.EmployeeName = "Niket";
   employeeInfo.salary = 49000.00;
   employeeInfo.EmployeeId = 526234;
   assertThrows(IllegalArgumentException.class, () -> {
	eligibilityCalculator.eligibleForHike(employeeInfo);
   });
 }

 @Test
 public void testEligibleForHike_InvalidEmpID() throws IllegalArgumentException {
   employeeInfo.age = 35;
   employeeInfo.designation = " ";
   employeeInfo.EmployeeName = "Niket";
   employeeInfo.salary = 49000.00;
   employeeInfo.EmployeeId = 0;
   assertThrows(IllegalArgumentException.class, () -> {
       eligibilityCalculator.eligibleForHike(employeeInfo);
     });
 }
}