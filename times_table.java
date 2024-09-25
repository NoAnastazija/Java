import java.util.Scanner;
public class Main{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int number=0;
// Get user input
System.out.println("Enter a number: ");
number=sc.nextInt();
// Times table for given number
for(int i=1; i<=12; i++){
System.out.println(number + "x" + i + "=" + number * i);
            }
        }
    }
