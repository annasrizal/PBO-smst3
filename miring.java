class miring{
  public static void main(String[] args) {
    int j=10;
    int k;
    while(j>=1){
      k=1;
      while (k<=j) {
        System.out.println(Integer.toString(j));
        k++;
      }
      System.out.println(Integer.toString(j));
      j--;
    }
  }
}
