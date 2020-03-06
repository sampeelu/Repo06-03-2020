package responsePayload;

public class Data {
	private String id;
	private String employee_name;
	private String employee_salary;
	private String employee_age;
	private String profile_image;
	
	public Data(String id,String employee_name,String employee_salary,String employee_age,String profile_image){
		
		this.id = id;
		this.employee_age = employee_age;
		this.employee_name = employee_name;
		this.employee_salary = employee_salary;
		this.profile_image = profile_image;
		
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the employee_name
	 */
	public String getEmployee_name() {
		return employee_name;
	}
	/**
	 * @param employee_name the employee_name to set
	 */
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	/**
	 * @return the employee_salary
	 */
	public String getEmployee_salary() {
		return employee_salary;
	}
	/**
	 * @param employee_salary the employee_salary to set
	 */
	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}
	/**
	 * @return the employee_age
	 */
	public String getEmployee_age() {
		return employee_age;
	}
	/**
	 * @param employee_age the employee_age to set
	 */
	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}
	/**
	 * @return the profile_image
	 */
	public String getProfile_image() {
		return profile_image;
	}
	/**
	 * @param profile_image the profile_image to set
	 */
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	
	
	

}
