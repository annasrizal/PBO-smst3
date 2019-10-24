class switchCase{
  public static void main(String[] args) {
    String musim = "Dingin";
    String bulan;

    switch(musim.toLowerCase()){
        case "Dingin":
          bulan ="Desember, Januari, dan Februari";
          break;

        case "Semi":
          bulan ="Maret, April, dan Mei";
          break;

        case "Panas":
          bulan ="Juni, Juli, dan Agustus";
          break;

        case "Gugur":
          bulan ="September, Oktober, dan November";
          break;

      default:
        bulan =" ";
        break;
    }
    System.out.println("Musim "+musim+"berada pada bulan "+bulan);
  }
}
