package lab7;

public class Q10_9 {
	public static void main(String[] args) {
		Course math101 = new Course("math101");
		math101.addStudent("Lifehouse");
		math101.addStudent("Muse");
		math101.addStudent("Modest Mouse");

		math101.dropStudent("Lifehouse");

		System.out.println("\nThe students in the course " + 
			math101.getCourseName() + ":");
		String[] students = math101.getStudents();
		for (int i = 0; i < math101.getNumberOfStudents(); i++) {
			System.out.print(students[i] + "  ");
		}
		System.out.println();
	}
}
