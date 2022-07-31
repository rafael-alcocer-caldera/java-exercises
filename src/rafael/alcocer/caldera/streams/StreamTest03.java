package rafael.alcocer.caldera.streams;

import java.util.LinkedList;
import java.util.stream.Stream;

public class StreamTest03 {

    public static void main(String[] args) {
        StreamTest03 x = new StreamTest03();
        x.go1();
        System.out.println("------");
        x.go2();
        System.out.println("------");
        x.go3();
        System.out.println("------");
        x.go4();
    }

    public void go1() {
        String s = "abcdef";

        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);

        Stream<String> stringStream = characterStream.map(m -> m.toString().toUpperCase());

        stringStream.forEach(x -> System.out.println(x));
    }

    public void go2() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> reverse = reverse(stream);
        reverse.forEach(System.out::println);
    }

    public boolean go3() {
        String s = "121";
        StringBuilder builder = new StringBuilder();

        Stream<Character> characterStream = s.chars().mapToObj(c -> (char) c);
        
        Stream<Character> reverse = reverse(characterStream);
        reverse.forEach(c -> builder.append(c));
        
        if (s.equals(builder.toString())) {
            return true;
        }
        
        return false;
    }
    
    public void go4() {
       LinkedList<String> l = new LinkedList<>();
       l.push("1");
       l.push("2");
       l.push("3");
       
       l.stream().forEach(System.out::println);
    }

    public static <T> Stream<T> reverse(Stream<T> stream) {
        LinkedList<T> stack = new LinkedList<>();
        stream.forEach(stack::push);

        return stack.stream();
    }
}
