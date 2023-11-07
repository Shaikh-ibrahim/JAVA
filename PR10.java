class cyclinder{
    double radius;
    double height;
    public  cyclinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public double display(){
        return 3.14*radius*height;
        
    }

    
}
class cube{
    double side;
     public  cube(double side){
        this.side=side;
        
    }
    public double display(){
        return side*side*side;
        
    }

}
class cubiod{
    double length;
    double height;
    double width;
    public cubiod(double length,double height,double width){
        this.length=length;
        this.height=height;
        this.width=width;
        

    }
    public double display(){
        return length*height*width;
        
    }
}



public class PR10 {
    public static void main(String args[]){
cube c1=new cube(4.0);
cyclinder c2=new cyclinder(20,20);
cubiod c3=new cubiod(10,20,20);
double cubere=c1.display();
double cyclindere=c2.display();
double cubiodre=c3.display();
System.out.println("cube is "+cubere);
System.out.println(" "+cyclindere);
System.out.println("cubiod is "+cubiodre);


    }
}
