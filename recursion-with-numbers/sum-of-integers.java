// Print the sum of numbers from 1 to given number

class SumOfIntegers {
  public static void main(String args[]) {
    int num = 5;
    System.out.println("Result: "+ getSum(num));
  }

  public static int getSum(int num) {
      //STEP 1: base class
      if(num == 1) {
          return num;
      }

      //STEP 2: recursive function call
      return num + getSum(num-1);
  }
}