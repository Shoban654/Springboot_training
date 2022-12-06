import java.util.*;

public interface student{
    public void max_height();
    public void avg_height();
    public void min_height();
}
class height_max implements student{
    List<int> student_height=new ArrayList<int>();
    public void max_height(List<int> student_height)
    {
        this.List<int> student_height;
        int max=0;
        for (int i=0; i<student_height.size();i++)
        {
            if(max<student_height.indexOf(i))
            {
                 max=student_height.indexOf(i);
            }
        }
        System.out.println(max);
    }
    public void avg_height(List<int> student_height);
    public void min_height(List<int> student_height);
}
class height_min implements student{
    List<int> student_height;
    public void max_height(List<int> student_height);
    public void avg_height(List<int> student_height);

    public void min_height(List<int> student_height){
        this.student_height=student_height;
        int min=0;
        for (int i=0; i<student_height.size();i++)
        {
            if(min<student_height.indexOf(i))
            {
                 min=student_height.indexOf(i);
            }
        }
        System.out.println(min);
    }
}

public class ISP {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        List<int> student_height= new ArrayList<int>();

        while (scan.hasNextInt()) {
            String line = scan.next();
            if (line.isEmpty()) {
                break;
            }
            student_height.add(line);
        }
    }

}
