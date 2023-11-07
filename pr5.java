 class t1 {
    String name;
    int rollno;
    public t1(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void displayinfo(){
        System.out.println("student name"+name);
        System.out.println("student roll no"+rollno);
    }
}

class exam extends t1{
    double marks;
    public exam(String name,int rollno,double marks){
        super(name,rollno);
        this.marks=marks;
    }
    public void displayexaminfo(){
        System.out.println("marks obtained"+marks);

    }
}
    class result extends exam{
        public result(String name,int rollno,double marks){
            super( name,rollno,marks);
        }
        public void displayresult(){
            displayinfo();
            displayexaminfo();

        }
    }


public class pr5{
public static void main(String args[]){
result[] st1=new result[5];
st1[0]=new result("garv",5,50);
st1[1]=new result("veer",2,50);
st1[2]=new result("vee2",22,50);
st1[3]=new result("veer243",23,50);
st1[4]=new result("veer21",212,50);
for(int i=0;i<st1.length;i++){
    st1[i].displayresult();
}
}
}
