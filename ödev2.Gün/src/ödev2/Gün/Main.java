package ödev2.Gün;

public class Main {

	public static void main(String[] args) {

		products course1 = new products(1, "Yazýlým geliþtirici yetiþtirme kampý(c#+Angular)", "Engin Demiroð");
		products course2 = new products(2, "Yazýlým geliþtirici yetiþtirme kampý(java+React)", "Engin Demiroð");
		products course3 = new products(3, "Programlamaya giriþ için temel kurs", "Engin Demiroð");

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
