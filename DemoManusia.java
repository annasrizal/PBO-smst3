class Manusia{
  private String nama;
  private int umur;
  //definisi constrktor
  public Manusia(){ }//constructor pertama = default tanpa parameter
  public Manusia(String a){//constrktor kedua
    nama=a;
  }
  public Manusia(String a,int b){//constrktor kedua
    nama=a;
    umur=b;
  }
  //definisi void meyhod
  public void setNama(String a){
    nama=a;
    }
  public String getNama(){
      return nama;
    }
  public void setUmur(int a){
      umur=a;
    }
  public int getUmur(){
      return umur;
    }
}
public class DemoManusia {
public static void main(String[]args){//program utama
        Manusia arrMns[] = new Manusia[3];//buat array of object
        Manusia objMns1 = new Manusia();//constrktor pertama

        objMns1.setNama("Mukaromah");
        objMns1.setUmur(76);

        Manusia objMns2 = new Manusia("mat conan");//constructor kedua
        Manusia objMns3 = new Manusia("Bajuri",13);//constrktor ketiga

        arrMns[0] = objMns1;
                arrMns[1] = objMns2;
                        arrMns[2] = objMns3;
        for (int i=0; i<3 ; i++ ) {
            System.out.println("Nama : "+arrMns[i].getNama());
              System.out.println("Umur : "+arrMns[i].getUmur());
                System.out.println();

        }

  }
}
