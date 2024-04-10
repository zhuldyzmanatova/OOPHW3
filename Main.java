import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        Stream stream = new Stream();
        stream.addStudentGroup(new StudentGroup("Программисты", 147));
        stream.addStudentGroup(new StudentGroup("Тестировщики", 238));
        stream.addStudentGroup(new StudentGroup("Аналитики", 282));
        stream.addStudentGroup(new StudentGroup("Проджект-менеджеры", 112));
        stream.addStudentGroup(new StudentGroup("Продакт-менеджеры", 138));

        StreamComparator comparator1 = new StreamComparator();
        stream.sort(comparator1);

        Iterator<StudentGroup> iterator = stream.iterator();
        while (iterator.hasNext()) {
            StudentGroup streamGroup = iterator.next();
            System.out.println(streamGroup);
        }
        

        StreamComparator comparator2 = new StreamComparator();
        StudentGroup group1 = new StudentGroup("Дизайнеры", 7);
        StudentGroup group2 = new StudentGroup("Таргетологи", 38);
        StudentGroup group3 = new StudentGroup("Контент-мэйкеры", 112);
        StudentGroup group4 = new StudentGroup("Верстальщики", 51);
        System.out.println(comparator2.compare(group1, group2));
        System.out.println(comparator2.compare(group3, group4));      

    }
}
