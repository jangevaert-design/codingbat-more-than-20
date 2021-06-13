package edu.cnm.deepdive;

/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20

more20(20) → false
more20(21) → true
more20(22) → true
 */

public class CodingBatMoreThan20 {

  public static void main(String[] args) {
    System.out.printf("with the number %s, the outcome is " + more20(20) + "\n", 20);
    System.out.printf("with the number %s, the outcome is " + more20(21) + "\n", 21);
    System.out.printf("with the number %s, the outcome is " + more20(22) + "\n", 22);
    System.out.printf("with the number %s, the outcome is " + more20(23) + "\n", 23);
  }

  public static boolean more20(int n) {
    return ((n - 1) % 20 == 0 || (n - 2) % 20 == 0);
  }

}
