import java.util.*;
class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int grade;
    public Student(String name,int age,int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public int compareTo(Student o){
        if(o.grade != this.grade){
            return this.grade - o.grade;
        }else{
            if(o.name.compareTo(this.name) == 0){
                return this.age - o.age;
            }else{
                return this.name.compareTo(o.name);
            }
        }
    }
    public String toString(){
        return name+" "+age+" "+grade;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList();
        int n=Integer.valueOf(scanner.nextLine());
        for(int i = 0;i<n;i++){
            String strLine = scanner.nextLine();
            String[] str = strLine.split(" ");
            list.add(new Student(str[0],
                       Integer.valueOf(str[1]),Integer.valueOf(str[2])));
        }
        Collections.sort(list);
        for(Student stu:list){
             System.out.println(stu.toString());
        }
        scanner.close();
    }
}
