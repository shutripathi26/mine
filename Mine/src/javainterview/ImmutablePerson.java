package javainterview;

public final class ImmutablePerson {
	private final String name;
	private final int age;

	public ImmutablePerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// No setter methods

	@Override
	public String toString() {
		return "ImmutablePerson{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
