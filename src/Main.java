import java.util.*;

public class Main {
    public static void main(String[] args) {


        Collection list = new ArrayList();
        List list2 = new ArrayList();
        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Max");
        names.add("Max");
        names.add("Olga");
        names.add("Maria");
        names.add("Maria");

        TreeSet<String> treeSet = new TreeSet<>(names);
        // Ivan, Maria, Max, Olga

        class Student implements Comparable<Student>{
            public String name;
            public int mark;

            public Student(String name, int mark) {
                this.name = name;
                this.mark = mark;
            }

            @Override
            public int compareTo(Student o) {
               // return this.mark - o.mark;
                return this.name.compareTo(o.name);
            }
        }



        Comparator<Student> rule = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.mark-o2.mark;
            }
        };

      //  Collections.sort(arrayList222, rule);

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Ivan",70));
        students.add(new Student("Petr",40));
        students.add(new Student("Olga",60));
        students.add(new Student("Maria",80));
        for(Student s: students) {
            System.out.println(s.mark + ", "+s.name);
        }

        // > 50

        SortedSet<Student> result = students.tailSet(new Student("",50)); // => 60,70,80
        for(Student s: result) {
            System.out.println(s.mark + ", "+s.name);
        }


        SortedSet<Student> result2 = students.subSet(new Student("",50), new Student("",Integer.MAX_VALUE));
        //students.headSet()


        // Maps => мапы, словари, ассоц. массивы, карты
        // key => value

        // HashMap, TreeMap

        // Hash => числовым значение

        Object object = new Object();
        System.out.println(object.hashCode());

        HashMap<String, String> phones = new HashMap<>();
      //  phones.put("Ivan", "234234234");
        phones.put("Ivan", "2342342347777");
        phones.put("Petr", "2342342347777");
        phones.put("Max", "27557677");
        phones.put("Maria", "2134234234");
        // 245923952359, "Maria", 23402342304

        for(Map.Entry<String,String> p: phones.entrySet()) {
            System.out.println(p.getKey() + " => "+p.getValue());
        }
        phones.get("Ivan");

        System.out.println();
        TreeMap<String,String> phones2 = new TreeMap<>();
        phones2.put("Ivan", "234234234");
        phones2.put("Ivan", "234234234");
        phones2.put("Max", "27557677");
        phones2.put("Maria", "2134234234");
        for(Map.Entry<String,String> p: phones2.entrySet()) {
            System.out.println(p.getKey() + " => "+p.getValue());
        }
        phones.get("Ivan");
    }
}