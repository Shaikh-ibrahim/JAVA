public class PR8 {
    public static void main(String args[]){
        int row=4;
        for(int i=0;i<row;i++){
int number=1;
for(int j=0;j<=i;j++){
    System.out.println(number+" ");
    number=number*(i-j)/(j+1);
}
System.out.println();
        }
    }
}
