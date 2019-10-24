public class IfElse{
  public static void main(String[]args){
    int month = 4;
    String season;
      if(month == 12 || month == 1 || month == 2){
        season = "Dingin";
      }else if (month == 3 || month == 4 || month == 5){
        season = "semi";
      }else if (month == 6 || month == 7 || month == 8){
        season = "panas";
      }else if (month == 9 || month == 10 || month == 11){
        season = "gugur";
      }else{
        season =" ";
      }
      System.out.println("Bulan ke - "+month+"-Memiliki musim-"+season);
  }
}
