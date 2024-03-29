package hibernate_one_to_many_bi.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String departmentsName;

	@Column(name = "max_salary")
	private int maxSalary;

	@Column(name = "min_salary")
	private int minSalary;

//	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE })
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.LAZY) // mappedBy - где искать связь
	private List<Employee> emps;

	public Department() {
	}

	public Department(String departmentsName, int maxSalary, int minSalary) {
		super();
		this.departmentsName = departmentsName;
		this.maxSalary = maxSalary;
		this.minSalary = minSalary;
	}

	public void addEmployeeToDepartment(Employee employee) {
		if (emps == null) {
			emps = new ArrayList<>();
		}
		emps.add(employee);
		employee.setDepartment(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentsName() {
		return departmentsName;
	}

	public void setDepartmentsName(String departmentsName) {
		this.departmentsName = departmentsName;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentsName=" + departmentsName + ", maxSalary=" + maxSalary
				+ ", minSalary=" + minSalary + "]";
	}

}
