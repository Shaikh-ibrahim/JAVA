public class pr4 {
public static void main (String args[]){
    String str="hhhh";
String rev="";
    for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
    }
    if (str.equals(rev)) {
        System.out.println("its plalindrome");
    }
else {
    System.out.println("its not plalindrome");
}
    
}
    
}
