// Based on user input - outputs the number that many times
import java.util.Scanner;
public class Main{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int number;
  int i=0;
  System.out.println("Enter a number: ");
  number=sc.nextInt();
  while(i < number){
    System.out.println(i);
      i++;
  }
}
}