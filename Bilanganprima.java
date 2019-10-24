class Bilanganprima{
    public static void main (String[] args){
        int input = 100;
        System.out.println("Bilangan Prima 1 hingga 100 adalah : ");
        for(int i=2; i<input; i++) {
            boolean isPrima = true;

            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    isPrima = false;
                    break;

                }
            }
            if(isPrima==true){
                System.out.print(i+",");
            }
        }
    }
}
