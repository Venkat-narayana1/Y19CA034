class ArraySearch {
  public static boolean contains(int arr[], int item) {
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
   public static void main(String[] args) {
          int myarray[] = {1,3,2,4,6,5,7,8};
         
      System.out.println(contains(myarray, 1));
      System.out.println(contains(myarray, 9));
   }
}