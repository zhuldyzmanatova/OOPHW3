public class StudentGroup implements Comparable<StudentGroup> {
    private String name;
    private int numberOfStudents;

    public StudentGroup (String name, int numberOfStudents){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return numberOfStudents - o.getNumberOfStudents();
    }

    @Override
    public String toString() {
        // return "Группа: "+name+"   "+"Количество студентов: "+Integer.toString(numberOfStudents);
        return name + ": " + "кол-во студентов - " + getNumberOfStudents();
    }
}