
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Collections;

public class ReflectionAttributes {

	public static void main(final String... args) {
		Class student = Student.class;
		Method[] methods = student.getDeclaredMethods();
		
		List<String> nameMethods = Stream.of(methods)
			.map(Method::getName)
			.collect(Collectors.toList());

		Collections.sort(nameMethods);
		nameMethods.forEach(System.out::println);

	}

	private static class Student {
		
		private String name;

		private String id;

		private String email;

		public String getName(){
			return this.name;
		}

		public String getId() {
			return this.id;
		}

		public String getEmail() {
			return this.email;
		}

		public void setId(String id) {
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
	}

}
