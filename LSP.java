import java.util.*;

class student{
    public void get_max_height(List<Integer> student_height){}
    public void get_least_height(List<Integer> student_height){}
}

class max_height extends student
{
    List<Integer> student_height;
    public void get_max_height(List<Integer> student_height)
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
    List<Integer> student_height;
    public void get_least_height(List<Integer> student_height)
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

    public void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        List<Integer> student_height= new ArrayList<Integer>();

        while (scan.hasNextInt()) {
            Integer line = scan.nextInt();
            if (line.isEmpty()) {
                break;
            }
            student_height.add(line);
        }
        max_height obj1= new max_height();
        obj1.get_max_height(student_height);
        min_height obj2=new min_height();
        obj2.get_least_height(student_height);
        
    }
}