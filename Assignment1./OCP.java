import java.util.*;


abstract class avg_height
{
    public void get_avg_height(List<Integer>stu_height){}
}

class student_avg_height extends avg_height
{
    List<Integer> stu_height;
    @Override
    public void get_avg_height(List<Integer>stu_height)
    {
        this.stu_height=stu_height;
    }
}


public class OCP {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Integer> student_height= new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            Integer line = scan.nextInt();
            if (line.isEmpty()) {
                break;
            }
            student_height.add(line);
        }
        student_avg_height obj= new student_avg_height();
        obj.get_avg_height(student_height);
}
}
