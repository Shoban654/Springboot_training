import java.util.*;

private class class_strength {
    class_Students class_students;
    public void class_strength(class_Students class_students)
    {
        this.class_students;
    }
    public static void strength_of_class()
    {
        System.out.println(class_students.studentlist.size());
    }
}



public class class_Students {
    List<String> studentlist;
    public void printnames(List<String> students_list)
    {
        this.studentlist=students_list;
        System.out.println(studentlist);
    }
}

public class SRP{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> student_names= new ArrayList<String>();

        while (scan.hasNextLine()) {
            String line = scan.next();
            if (line.isEmpty()) {
                break;
            }
            student_names.add(line);
        }

        class_Students myobj= new class_Students();
        myobj.printnames(student_names);
        class_strength obj=new  class_strength();
        obj.strength_of_class();
    }
}