import java.util.*;

interface student{
    public void max_height(List<Integer> student_height);
    public void avg_height(List<Integer> student_height);
    public void min_height(List<Integer> student_height);
}
class height_max implements student{
    List<Integer> student_height=new ArrayList<Integer>();
    public void max_height(List<Integer> student_height)
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
    public void avg_height(List<Integer> student_height){}
    public void min_height(List<Integer> student_height){}
}
class height_min implements student{
    List<Integer> student_height;
    public void max_height(List<Integer> student_height){}
    public void avg_height(List<Integer> student_height){}

    public void min_height(List<Integer> student_height){
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
        height_min obj1=new height_min();
        obj1.min_height(student_height);
        height_max obj2=new height_max();
        obj2.max_height(student_height);
    }
    

}
