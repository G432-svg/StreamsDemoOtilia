package be.intecbrussel.Collection;

import be.intecbrussel.Gender;
import be.intecbrussel.opdracht1.Person;

import java.util.*;

public class CollectionDemo {


    public static void main(String[] args) {

        //Collection
        //List,Set en Queue

 //      Set<String> groceries = new HashSet<>();

//        Collection<String> importantGroceries = new LinkedHashSet<>();
//        //->Toch geordend!
//
////        List<String> groceries = new ArrayList<>();
//        groceries.add("apples");
//        groceries.add("milk");
//        groceries.add("bananas");
//        groceries.add("milk");
//        groceries.add("toilepaper");
//        groceries.add("toothbrush");

//       groceries.set(1, "oil");
//        groceries.remove("oil");
//        System.out.println(groceries.remove("oil"));
//        System.out.println(groceries.remove(2) + " has been removed");
//
//        for (String s : groceries) {
//            System.out.println(s);
//        }

        Person[] people = {new Person("Jef", "Blum", Gender.MALE, 23, 78.3F, 176.2F), new Person("Laura", "Perez", Gender.FEMALE, 41, 66.5F, 166.7F), new Person("Anja", "Blum", Gender.FEMALE, 16, 60.0F, 150.0F),
                new Person("John", "Claiderman", Gender.OTHER, 53, 80.3F, 166.2F), new Person("Don", "Sleiman", Gender.OTHER, 22, 65.3F, 170.7F),
                new Person("Manny", "Lowell", Gender.MALE, 92, 109.3F, 200.5F), new Person("Mick ", "Patches", Gender.MALE, 63, 78.3F, 190.2F),
                new Person("Lala", "Fell", Gender.FEMALE, 32, 68.3F, 175.2F)};


//        Deque<Person> personQueue = new LinkedList<>();
//        personQueue.addAll(Arrays.stream(people).collect(Collectors.toList()));
//
//        System.out.println(personQueue.peek().getFirstName() + " is de volgende");
//        System.out.println(personQueue.peek().getFirstName() + " is de volgende");
//
//        System.out.println(personQueue.poll().getFirstName() + " wordt bedient");
//        System.out.println("----");
//
//        System.out.println(personQueue.peek().getFirstName() + " is de volgende");
//        System.out.println(personQueue.poll().getFirstName() + " wordt bedient");
//        System.out.println("-----");
//
//        System.out.println(personQueue.peek().getFirstName() + " is de volgende");


//        List<Integer> numbers = new ArrayList<>(3, 8, 2, 9, 78, 23, 30, 4);
//        numbers.forEach(System.out::println);

//        Collection<String> col = new LinkedList<>();
//        people.nextInt(Arrays.stream(people).collect(Collectors.toList()));

//        String[] song = {"Always", "look", "on", "the", "bright", "side", "of", "life!"};
//        Collection<String> list = new LinkedList<>();
//
//        list.add(0, new String("Always"));
//        list.add(1, new String("look"));
//        list.add(2, new String("on"));
//        list.add(3, new String("the"));
//        list.add(4, new String("bright"));
//        list.add(5, new String("side"));
//        list.add(6, new String("of"));
//        list.add(7, new String("Life!"));
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(5));
//        }
//        List<String> song = new ArrayList<>();
//        Collection<String> list = new ArrayList<>();

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        for(String s : list){
//            System.out.println(s);
//
//        }
//        list.forEach(s -> System.out.println(s));

//        List<Person> personList = new ArrayList<>();
//
//        personList.sort(Comparator.naturalOrder());
//
//        personList.sort(Comparator.comparing(Person::getLastName));
//        System.out.println(personList.getLastName + "this are the person sorted by Last name");

//        while (zin.charAt(zin.length() - 1) != '.') {
//
//        }
//        List<String> sentence = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String word = "";
//
//        while(!word.endsWith(".")){
//            word = scanner.next();
//            sentence.add(word);
//        }
//        List<String> listStr = new ArrayList<>();
//        nextScanner(listStr);
//        listStr.forEach(t-> System.out.print(t + " "));
//
//        while(true){
//            String str = scan.nextLine();
//            list.add(str);
//            if (str.endsWith(".")){
//                break;
//            }
//        }
//    }
//
//    sentence.forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);

        Set<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 6) {
            int number = scanner.nextInt();
            if(lottoNumbers.contains(number)) System.out.println("You already picked " + number);
            if (number > 45 || number < 1) System.out.println("this number is not in between 1 and 45");
            else lottoNumbers.add(number);

        }
    }
}