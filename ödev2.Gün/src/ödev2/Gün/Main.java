package �dev2.G�n;

public class Main {

	public static void main(String[] args) {

		products course1 = new products(1, "Yaz�l�m geli�tirici yeti�tirme kamp�(c#+Angular)", "Engin Demiro�");
		products course2 = new products(2, "Yaz�l�m geli�tirici yeti�tirme kamp�(java+React)", "Engin Demiro�");
		products course3 = new products(3, "Programlamaya giri� i�in temel kurs", "Engin Demiro�");

		products[] courses = { course1, course2, course3 };

		for (products Courses : courses) {
			System.out.println(Courses.name);
		}
		System.out.println("------------------");
		courseManager courseManager = new courseManager();
		courseManager.registerCourse(course1);
		courseManager.completeCourses(course1);
		System.out.println("------------------");

		courseManager.registerCourse(course2);
		courseManager.completeCourses(course2);
		System.out.println("------------------");
		courseManager.registerCourse(course3);
		courseManager.completeCourses(course3);

	}

}
