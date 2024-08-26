class HelloWorld {
    public static String reverseString(String str) {
        char[] characters = str.toCharArray();
        int start = 0;
        int end = characters.length-1;
        
        while(start < end) {
            // swap the characters from left to right
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            
            // move pointers 
            start++;
            end--;
        }
        return new String(characters);
    }
    public static void main(String[] args) {
       String str = "hello world";
       String output = reverseString(str);
       System.out.println(str);
       System.out.println("reverse String is : "+output);
    }
}
