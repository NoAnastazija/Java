 class Main {
 public static void main(String[] args) {
 // Leap years from 1900 - 2030
 for (int i = 1900; i < 2030; i++) {
  if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
  System.out.println(i);
  }
  }
  }
 }