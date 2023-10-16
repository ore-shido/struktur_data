class Operasi {
    public static void main(String[] args) {
        /*
         * Operasi -- segala bentuk/upaya untuk memanipulasi operand
         * Operand -- sesuatu yang operasi
         * 
         * Contoh: Aritmatika, Logika, Bitwize, String
         * 
         * Aritmatika = Penjumlahan, Pengurangan, Pengalian, Pembagian, Modulus
         * Logika = Equal, And, Or, Not, Nor, Xor
         * Bitwize = Left Bitwize, Right Bitwize
         * String = Left, Right, Mid/Substring
         * 
         */

        /*
         * Aritmatika (Derajat Operasi)
         * ()
         * power()
         * Perkalian (*), Pembagian (/), modulo (%) --> Ketika derajat operasi setara maka dikerjakan dari kiri ke kanan
         * Penjumalahn (+), Pengurangan (-)
         */

        System.out.println("--Contoh Operasi--");
        float luasSegitiga;
        int alas = 10;
        int tinggi = 20;
        luasSegitiga = 1 / 2f * alas * tinggi;
        System.out.println(luasSegitiga);
        luasSegitiga = alas * tinggi * 1 / 2;
        System.out.println(luasSegitiga);

        /*
         * Logika
         * & -- And --
         * | -- or
         * == -- Equal
         * != -- Not Equal
         * ! -- not
         * ^ -- XOr
         */
        boolean bool;
        System.out.println("AND");
        System.out.println(bool = true & true);
        System.out.println(bool = false & true);
        System.out.println(bool = true & false);
        System.out.println(bool = false & false);
        System.out.println("XOR");
        System.out.println(bool = true ^ true);
        System.out.println(bool = false ^ true);
        System.out.println(bool = true ^ false);
        System.out.println(bool = false ^ false);

         /*
          * Bitwize
          * 100 << 2 --> 10000 -- Left bitwize
          * 100 >> 2 --> 1 -- Right bitwize
          */
        System.out.println("--Contoh Bitwize--");
        int bit = 7;
        System.out.println(Integer.toBinaryString(bit));
        bit = bit << 2;
        System.out.println(Integer.toBinaryString(bit));
        bit = bit >> 3;
        System.out.println(Integer.toBinaryString(bit));

        /*
         * Operasi 1 Operator, 1 Operand / unary Operation
         * Operasi 1 Operator, 2 Operand / binary Operation
         * Operasi 2 Operator, 3 Operand / thirnay Operation
         */

        // Unary -- Increment/Decrement
        int unary = 0;
        System.out.println(unary++); //Nilai variable di pakai terlebih dahulu, baru di naikan 1;
        System.out.println(++unary); //Nilai variable ditambahkan 1 terlebih dahulu baru di kembalikan nilai yang baru;
        System.out.println(unary--);
        System.out.println(--unary);

        // Binary
        int hasilATambahB;
        int a=10, b=10;
        hasilATambahB=a+b;
        System.out.println(hasilATambahB = a++ + (--b + ++a));
        System.out.println(a+b);

        //Thirnay
        int c = hasilATambahB > 50 ? 100 : 50;
        System.out.println(c);

        char enter= '\n';
        String kalimat = "Selamat malam,"+enter+"selamat datang di kuliah struktur data";
        System.out.println(kalimat);
        System.out.println(kalimat.charAt(6));
        
        //Left
        System.out.println(kalimat.substring(0, 7));
        //Right
        System.out.println(kalimat.substring(kalimat.length()-4));
        //Mid / Substring
        System.out.println(kalimat.substring(8,8+5));
    }
}