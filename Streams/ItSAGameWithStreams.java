import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class ItSAGameWithStreams {
	static ArrayList<Integer> list; 

	public static void main(String[] args) {
		list = new ArrayList<>();
		Collections.addAll(list, -1, 14, 466, -98, -56, 7894, 444, 666, -79, 0);

		List<Integer> stream = list.stream()
		.peek(System.out::println)
		.peek(Class::method)
		.peek(System.out::println)
		.skip(2)
		.limit(29)
		.filter(x -> (x > (-75)))
		.filter(x -> (x < 600))
		.sorted((s, x) -> (x - s))
		.collect(Collectors.toList());

		stream.forEach(System.out::println);
		stream.stream().map(Class::method).forEach(System.out::println);
	}

	
}

