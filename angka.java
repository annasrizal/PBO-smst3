  class angka{
    public static void main(String[] args) {
      int i;
      System.out.println("\nPerulangan dengan End");
        for(i=1; i<10; i++){
          System.out.println(Integer.toString(i));
        }
      System.out.println("\nPerulangan dengan while");
      i=1;
      while (i<=10){
          System.out.println(Integer.toString(i));
          i++;
      }
      System.out.println("\nPerulangan dengan while");
      i=1;
      do{
        System.out.println(Integer.toString(i));
        i++;
      }while (i<=10);
        
    }
}
