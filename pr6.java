interface area{
    double pi=3.14;
    double cal(double x,double y);
}
class circ implements area{
    public double cal(double x,double y){
        return pi*x*x;
    }
}

public class pr6 {
    public static void main(String args[]){
        area a;
        circ c1=new circ();
        a=c1;
        System.out.println("area of cirlce is "+a.cal(15,15));

    }
}
