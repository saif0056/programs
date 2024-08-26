
class HelloWorld {
   
   public static boolean NumberIsPallindrome(int number) {
        // Negative numbers are not considered palindromes
        if (number < 0) {
            return false;
        }
        
        int originalNumber = number;
        int reverseNumber = 0;
        
        while(number != 0) {
            int digit = number % 10; // get the last digit of n
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;  // Remove the last digit from the number
        }
        return originalNumber == reverseNumber;
   }
    public static void main(String[] args) {
      int number = 121;
      System.out.println("Pallindrome Number Output is : " + NumberIsPallindrome(number));
    }
}
