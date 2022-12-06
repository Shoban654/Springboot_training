import java.util.*;

class student{
    public void get_max_height(List<int> student_height);
    public void get_least_height(List<int> student_height);
}

class max_height extends student
{
    List<int> student_height;
    public void get_max_height(List<int> student_height)
    {
        this.student_height=student_height;
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
}
class min_height extends student
{
    List<int> student_height;
    public void get_least_height(List<int> student_height)
    {
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


class LSP
{
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
        student_avg_height obj= new student_avg_height(List<int> student_height);
    }
}