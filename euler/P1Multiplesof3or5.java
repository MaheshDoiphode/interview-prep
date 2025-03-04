package euler;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below the provided parameter value number.

Tests
1. multiplesOf3Or5(10) should return a number.
2. multiplesOf3Or5(49) should return 543.
3. multiplesOf3Or5(1000) should return 233168.
4. multiplesOf3Or5(8456) should return 16687353.
5. multiplesOf3Or5(19564) should return 89301183.
*/
public class P1Multiplesof3or5 {
  public static void main(String[] args) {
    System.out.println(multiplesOf3Or5(10)); // 23
    System.out.println(multiplesOf3Or5(49)); // 543
    System.out.println(multiplesOf3Or5(1000)); // 233168
    System.out.println(multiplesOf3Or5(8456)); // 16687353
    System.out.println(multiplesOf3Or5(19564)); // 89301183
  }

  public static int multiplesOf3Or5(int number) {
    int sum = 0;
    for(int i=1; i<number; i++){
      if(i % 3 == 0 || i % 5 == 0){
        sum+=i;
      }
    }
    return sum;
  }
}