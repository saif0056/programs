class HelloWorld {
    public static String capatilizeFirstString(String str) {
     // Split the string into words using spaces as the delimiter
        String words[] = str.split(" ");
         // StringBuilder to store the resulting string
        StringBuilder result = new StringBuilder();
        
        for(String word: words) {
            if(word.length() > 0) {
 // Capitalize the first letter and append the rest of the word
              result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        // Return the final string with trailing space removed
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String str = "mohd saif khan";
        System.out.println("Capatilize Output : " + capatilizeFirstString(str));
    }
}
