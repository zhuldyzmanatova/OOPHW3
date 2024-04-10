import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        Stream stream1 = new Stream();
        stream1.addStudentGroup(new StudentGroup("Программисты", 147));
        stream1.addStudentGroup(new StudentGroup("Тестировщики", 238));
        stream1.addStudentGroup(new StudentGroup("Аналитики", 282));
        stream1.addStudentGroup(new StudentGroup("Проджект-менеджеры", 112));
        stream1.addStudentGroup(new StudentGroup("Продакт-менеджеры", 138));

        StreamComparator comparator1 = new StreamComparator();
        stream1.sort(comparator1);

        Iterator<StudentGroup> iterator = stream1.iterator();
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
        
        Stream stream2 = new Stream();
        stream2.addStudentGroup(new StudentGroup("<Бухгалтеры>", 25));
        stream2.addStudentGroup(new StudentGroup("Финансисты", 29));
        stream2.addStudentGroup(new StudentGroup("Аудиторы", 54));
        StreamSizeComparator comparator3 = new StreamSizeComparator();
        System.out.println(comparator3.compare(stream1, stream2));
        

    }
}
