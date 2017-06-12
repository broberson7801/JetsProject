package jets;

public class PilotAbstractClass {
	private String name;
	private int age;
	private int experience;

	public PilotAbstractClass(String name, int age, int experience) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "name: " + name + ", age: " + age + ", experience: " + experience;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
