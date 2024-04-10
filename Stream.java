import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    
    private List<StudentGroup> studentGroups;

    public Stream() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup group) {
        studentGroups.add(group);
    }

    public StudentGroup getStudentGroup(String name){
        for (StudentGroup group : studentGroups) {
            if(group.getName().equals(name)){
                return group;
            }            
        }
        return null;
    }

    public int getNumberOfGroups() {
        return studentGroups.size();
    }

    public void sort(Comparator<StudentGroup> comparator){
        Collections.sort(studentGroups, comparator);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator();
    }

    @Override
    public String toString() {
        return studentGroups.toString();
    }

    private class StreamIterator implements Iterator<StudentGroup> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < studentGroups.size();
        }

        @Override
        public StudentGroup next() {
            return studentGroups.get(index++);
        }
    }


}
