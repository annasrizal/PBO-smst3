	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	class Mahasiswa {
	 int nimMahasiswa;
	 String namaMahasiswa, alamatMahasiswa, jenisKelaminMahasiswa;

	 Mahasiswa(
	 int nimMahasiswa,
	 String namaMahasiswa,
	 String alamatMahasiswa,
	 String jenisKelaminMahasiswa
	 ){
	 this.nimMahasiswa = nimMahasiswa;
	 this.alamatMahasiswa = alamatMahasiswa;
	 this.namaMahasiswa = namaMahasiswa;
 this.jenisKelaminMahasiswa = jenisKelaminMahasiswa;
	 }

	 void printMahasiswa(){
	 System.out.println("NIM Mahasiswa : " + nimMahasiswa);
	 System.out.println("Nama Mahasiswa : " + namaMahasiswa);
	 System.out.println("Gender Mahasiswa : " + jenisKelaminMahasiswa);
	 System.out.println("Alamat Mahasiswa : " + alamatMahasiswa);
	  }
 }

	 class pendaftaranMahasiswaBaru {
	 public static void main(String[] args) throws IOException {
 Mahasiswa newMahasiswa;
	 BufferedReader reader = new BufferedReader(
	 new InputStreamReader(System.in)
	 );
	 System.out.print("Masukkan Nim : ");
	 int nim = Integer.parseInt(reader.readLine());

	 System.out.print("Masukkan Nama : ");
	 String nama = reader.readLine();

	 System.out.print("Masukkan Jenis Kelamin : ");
 String jenisKelamin = reader.readLine();

System.out.print("Masukkan Alamat : ");
