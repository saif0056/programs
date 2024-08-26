
class HelloWorld {
   
    public static long factorial(int number) {
        // .check number is -
        if(number < 0) {
               throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        // base case
        if(number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number-1);
    }
    public static void main(String[] args) {
      int number = 5;
      System.out.println("Factorial Output is : " + factorial(number));
    }
}
