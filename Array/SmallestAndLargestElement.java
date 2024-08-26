class HelloWorld {
    public static void largestAndSmallest(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("Array is empty Can not find largest and smallest element");
            return;
        }
        int largest=arr[0];
        int smallest=arr[0];
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element in an Array is :" + smallest);
         System.out.println("Largest Element in an Array is :" + largest);
    }
    public static void main(String[] args) {
       int[] arr = {45, 67, 23, 89, 12, 99, 4, 78};
       largestAndSmallest(arr);
    }
}
