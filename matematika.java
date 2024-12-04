public class matematika{

    private int tambah;
    private int kurang;
    private int kali;
    private int bagi;

    public void pertambahan(int a , int b){
        this.tambah = a + b;
        System.out.println("Hasil Pertambahan Pertama : " + this.tambah);
    }
    public void pertambahan(int a , int b , int c){
        this.tambah = a + b + c;
        System.out.println("Hasil Pertambahan Kedua : " + tambah);
    }
    public void pertambahan(double a , double b){
        double tambah = a + b;
        System.out.println("Hasil Pertambahan Ketiga : " + tambah);
    }
    public void pertambahan(double a , double b , double c){
        double tambah = a + b + c;
        System.out.println("Hasil Pertambahan Keempat : " + tambah);
    }
    
    
        public void pengurangan(int a , int b){
            this.kurang = a - b;
            System.out.println("Hasil Pengurangan Pertama : " + kurang);
        }
        public void pengurangan(int a , int b , int c){
            this.kurang = a - b - c;
            System.out.println("Hasil Pengurangan Kedua : " + kurang);
        }
        public void pengurangan(double a , double b){
            double kurang = a - b;
            System.out.println("Hasil Pengurangan Ketiga : " + kurang);
        }
        public void pengurangan(double a , double b , double c){
            double kurang = a - b - c;
            System.out.println("Hasil Pengurangan Keempat : " + kurang);
        }


            public void perkalian(int a , int b){
                this.kali = a * b;
                System.out.println("Hasil Perkalian Pertama : " + kali);
            }
            public void perkalian(int a , int b , int c){
                this.kali = a * b * c;
                System.out.println("Hasil Perkalian Kedua : " + kali);
            }
            public void perkalian(double a , double b){
                double kali = a * b;
                System.out.println("Hasil Perkalian Ketiga : " + kali);
            }
            public void perkalian(double a , double b , double c){
                double kali = a * b * c;
                System.out.println("Hasil Perkalian Keempat : " + kali);
            }

                public void pembagian(int a , int b){
                    this.bagi = a / b;
                    System.out.println("Hasil Pembagian Pertama : " + bagi);
                }
                public void pembagian(int a , int b , int c){
                    this.bagi = a / b;
                    System.out.println("Hasil Pembagian Kedua : " + bagi);
                }
                public void pembagian(double a , double b){
                    double bagi = a / b;
                    System.out.println("Hasil Pembagian Ketiga : " + bagi);
                }
                public void pembagian(double a , double b , double c){
                    double bagi = a / b;
                    System.out.println("Hasil Pembagian Keempat : " + bagi);
                }
                 
}