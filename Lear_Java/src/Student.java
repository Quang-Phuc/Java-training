import java.util.Iterator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
				if(this.getAge()> this.getAge())
				{
					return 1;
				}
				if(this.getAge()> this.getAge())
				{
					return -1;
				}
				return 0;
				
	}

}
