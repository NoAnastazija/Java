class Main{
 public static void main(String[] args){
  int fib, x = 0;
  int y = 1;
  
  System.out.println(x + ", " + y);
  // Fibonacci numbers 
  do{
  fib = x + y;
  x = y;
  y = fib;
  System.out.println(x + ", " + y );
  }
  // Lasts until reaches million
  while(fib < 1000000);
  }
  }