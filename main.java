public class main{
  public static void main(String[] args){
    shinobi[] m = new shinobi[3];

    m[0] = new shinobi();
    m[0].setNoRegistrasI("012606");
    m[0].setNama("Uchiha Sasuke");
    m[0].setPeringkat("Genin");


    m[1] = new shinobi();
    m[1].setNoRegistrasI("012607");
    m[1].setNama("Uzumaki Naruto");
    m[1].setPeringkat("Genin");

    m[2] = new shinobi();
    m[2].setNoRegistrasI("012601");
    m[2].setNama("Haruno Sakura");
    m[2].setPeringkat("Chunin");

    System.out.println("Data shinobi \n");
    for(shinobi x:m){
      System.out.println("No Registrasi : " +x.getNoRegistrasI());
      System.out.println("Nama : " +x.getNama());
      System.out.println("Peringkat : " +x.getPeringkat());
      System.out.println();
    }
  }
}
