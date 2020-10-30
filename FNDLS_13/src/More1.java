import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class More1 {

    static public class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//generic argument ->
        Map<String, Person> peopleByMap= new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int age = scanner.nextInt();
            peopleByMap.put(name, new Person(name,age));
        }
        String name = scanner.next();
        Person result = peopleByMap.get(name);

        if(result!=null){
            System.out.println(result.getAge());
        } else {
            System.out.println("not found");
        }

    }

}
