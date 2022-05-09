package hibernate_many_to_many.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Children")
public class Child {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String firstname;

	@Column(name = "age")
	private int age;

	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	@JoinTable(name = "child_section", joinColumns = @JoinColumn(name = "child_id"), inverseJoinColumns = @JoinColumn(name = "section_id"))
	private List<Section> sections;

	public Child() {
	}

	public Child(String firstname, int age) {
		this.firstname = firstname;
		this.age = age;
	}

	public void addSectionToChild(Section section) {
		if (sections == null) {
			sections = new ArrayList<>();
		}
		sections.add(section);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", firstname=" + firstname + ", age=" + age + "]";
	}

}
