package Java8Features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<User> users= Stream.of(
                new User("Nilesh Shinde","8380854583", Arrays.asList("nilesh17shinde@gmail.com","nilesh@gmail.com")),
                new User("Deva Shinde","9890308080", Arrays.asList("deva17shinde@gmail.com","deva@gmail.com")))
        .collect(Collectors.toList());

        List<String> collect = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(collect);

        List<String> list=users.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
        System.out.println(list);
    }
}
