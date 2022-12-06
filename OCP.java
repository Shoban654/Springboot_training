import java.util.*;


abstract class avg_height
{
    public void get_avg_height(List<int>stu_height);
}

class student_avg_height extends avg_height
{
    List<int> stu_height;
    @Override
    public void get_avg_height(List<int>stu_height)
    {
        this.stu_height=stu_height;
    }
}


public class OCP {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<int> student_height= new ArrayList<int>();

        while (scan.hasNextInt()) {
            String line = scan.next();
            if (line.isEmpty()) {
                break;
            }
            student_height.add(line);
        }
        student_avg_height obj= new student_avg_height();
}
}
