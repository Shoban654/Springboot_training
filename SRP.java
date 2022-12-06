import java.util.*;

class class_strength {
    List<String> student_names;
    class_strength(List<String> student_names2)
    {
        this.student_names=student_names2;
    }
    public void strength_of_class()
    {
        System.out.println(student_names.studentlist.size());
    }
}



 class class_Students {
    List<String> studentlist;
    public void printnames(List<String> students_list)
    {
        this.studentlist=students_list;
        System.out.println(studentlist);
    }
}

public class SRP{
    public static void main(String[] args) {
        List<String> student_names= new ArrayList<String>();
        Scanner scan=new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.next();
            if (line.isEmpty()) {
                scan.close();
                break;
            }
            student_names.add(line);
        }

        class_Students myobj= new class_Students();
        myobj.printnames(student_names);
        class_strength obj=new class_strength(student_names);
        obj.strength_of_class();
    }
}