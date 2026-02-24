import java.util.Scanner;
class Odd{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter an Integer:");
int a=sc.nextInt();
if (a%2!=0){
throw new ArithmeticException("Number is odd");
}
System.out.print(a);
}
}
