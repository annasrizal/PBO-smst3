class dataKaryawan {
	String namaKaryawan, alamatKaryawan, jabatanKaryawan,nipKaryawan;
	int umurKaryawan;

	dataKaryawan() {}

	 void printdataKaryawan() {
	 System.out.println("Nama Karyawan : " + namaKaryawan);
	 System.out.println("NIP Karyawan : " + nipKaryawan);
	 System.out.println("Alamat Karyawan : " + alamatKaryawan);
	 System.out.println("Jabatan Karyawan : " + jabatanKaryawan);
	 System.out.println("Umur Karyawan : " + umurKaryawan);
	 	}
	 }

	 class Karyawan {
	 public static void main(String[] args) {

	 dataKaryawan newdataKaryawan = new dataKaryawan();
	 newdataKaryawan.namaKaryawan = "Annas";
	 newdataKaryawan.nipKaryawan = "1807198998";
	 newdataKaryawan.alamatKaryawan = "Kebumen";
	 newdataKaryawan.jabatanKaryawan = "CEO";
	 newdataKaryawan.umurKaryawan = 19;

	 newdataKaryawan.printdataKaryawan();
	 	}
	 }
