
class HelloWorld {
   
   public static boolean isArmstrongNumber(int number) {
      int originalNumber = number;
      // Calculate the number of digits in the number
      int numberOfDigits = String.valueOf(number).length();
      int sum = 0;
      while(number != 0) {
        //   extract the last digit
        int digit = number % 10;
        sum += Math.pow(digit, numberOfDigits);
        number /= 10;
      }
      return sum == originalNumber;
   }
    public static void main(String[] args) {
      int number = 153;
      System.out.println("ArmStrong Number Output is : " + isArmstrongNumber(number));
    }
}
