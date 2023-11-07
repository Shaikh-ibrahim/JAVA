public class pr1{


    public double calcluateArea(double length,double width){
        return length*width;


    }
    public double calcluateArea(double length,double width,double base,double height){
        return 0.5*base*height;

    }
    public static void main(String args[]){
        pr1 calulator=new pr1();
        double rectangle=calulator.calcluateArea(50,40);
        System.out.println("area of the rectangle is:"+rectangle);
    
        double traingle=calulator.calcluateArea(50,40,10,5);
        System.out.println("area of traingle is:"+traingle);
    }
}