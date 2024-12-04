public class matematikaBeraksi {
    public static void main(String[] args) {
        matematikaCanggih run = new matematikaCanggih();

        run.pertambahan(23 , 34);
        run.pertambahan(12 , 28, 14);
        run.pertambahan(3.4 ,4.9);
        run.pertambahan(12.5 , 28.7 , 14.2);

        run.pengurangan(23 , 34);
        run.pengurangan(12 , 28, 14);
        run.pengurangan(3.4 ,4.9);
        run.pengurangan(12.5 , 28.7 , 14.2);

        run.perkalian(23 , 34);
        run.perkalian(12 , 28, 14);
        run.perkalian(3.4 ,4.9);
        run.perkalian(12.5 , 28.7 , 14.2);

        run.pembagian(23 , 3);
        run.pembagian(100 , 2, 4);
        run.pembagian(3.4 ,4.9);
        run.pembagian(12.5 , 28.7 , 14.2);

        run.modulus(23 , 34);
        run.modulus(12.5, 28.7, 14.2);
        run.modulus(3.4 ,4.9);
        run.modulus(12.5, 28.7, 14.2);
    }
}
