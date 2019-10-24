	class Suhu {
	   Suhu(){

	}

	float celciusToFahrenheit(float celcius){
	return ((float)(1.8) * celcius + 32);
	}

	float fahrenheitToKelvin(float fahrenheit){
	return ((fahrenheit - 32) * 5) / 9 + 273;
	}

	float kelvinToReamur(float kelvin) {
	return ((kelvin - 273) * (float)0.8);
	}
	float reamurToCelcius(float reamur) {
	return (float)1.25 * reamur;
	 }
	}

	class Konversi {
	   public static void main(String[]args) {
	      Suhu suhu = new Suhu();

	       System.out.println("Konversi Suhu");

	        float fahrenheit = suhu.celciusToFahrenheit(100);
	        float kelvin = suhu.fahrenheitToKelvin(fahrenheit);
	        float reamur = suhu.kelvinToReamur(kelvin);
	        float celcius = suhu.reamurToCelcius(reamur);

	System.out.println("Celcius (100) toFahrenheit = " + fahrenheit);
  }
}
