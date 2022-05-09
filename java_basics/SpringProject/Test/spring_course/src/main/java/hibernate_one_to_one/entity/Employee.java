//package hibernate_one_to_one.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import hibernate_one_to_one.entity.Detail;
//
//@Entity
//@Table(name = "employees")
//public class Employee {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private int id;
//	@Column
//	private String name;
//	@Column
//	private String surname;
//	@Column
//	private String department;
//	@Column
//	private int salary;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "details_id") //Для связи с классом Detail 
//	private Detail empDetail;
//
//	public Employee() {
//	}
//
//	public Employee(String name, String surname, String department, int salary) {
//		this.name = name;
//		this.surname = surname;
//		this.department = department;
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", department=" + department
//				+ ", salary=" + salary + "]";
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getSurname() {
//		return surname;
//	}
//
//	public void setSurname(String surname) {
//		this.surname = surname;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	public Detail getEmpDetail() {
//		return empDetail;
//	}
//
//	public void setEmpDetail(Detail empDetail) {
//		this.empDetail = empDetail;
//	}
//
//}
