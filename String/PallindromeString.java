class HelloWorld {
   
    public static boolean isPallindrome(String str){
        String normalizeString = str.toLowerCase();
        int start = 0;
        int end = normalizeString.length()-1;
        
        while(start < end) {
            // ignore alphanumeric number
            while(start < end && !Character.isLetterOrDigit(normalizeString.charAt(start))) {
                start++;
            }
             while(start < end && !Character.isLetterOrDigit(normalizeString.charAt(end))) {
                end--;
            }
         // Compare characters from the start and end
            if(normalizeString.charAt(start) != normalizeString.charAt(end)) {
                return false;
            }  
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Racecar";
        System.out.println("Pallindrome Output : " + isPallindrome(str));
    }
}
