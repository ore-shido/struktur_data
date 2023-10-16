public class VariableAndConst{
    public static void main(String[] args) {
        /*
         * 
         *  Tipe data:
         *   - Primitif/ Basic/ Dasar
         *     integer -- bilangan bulat
         *     real/desimal -- asli/pecahan
         *     character ---> A..Z a..z 1..0 ~..+
         *     boolean -- true | false
         * 
         *   - Non-Primitif/ Enumerasi/ Obyek/ Record
         *     String --> kumpulan/deretan karakter 1 atau lebih 
         *     Object --> Map / Dictionary
         *     List -- Array Dinamis / Tupple
         *     Queue -- Antrian -- FIFO
         *     Stack -- Tumpukan -- LIFO
         */

         //Bilangan Bulat / Integer
         
         byte byteVar;  // 8bit | 1 byte -- unsigned -128 sd 127
         short shortVar; // 10bit | 1 byte -- signed -32768 sd 32767
         int intVar; // 2 bytes -2147483648 sd 2147483647
         long longVar; // 4 bytes -9223372036854775808 sd 9223372036854775807


         shortVar = 1==1?100:50;
         
        // 1999 + 077 = 0x????

        // 63 + 1999 = 2062

        /*
         * 2062 / 2 = 1031 -> 0
         * 1031 / 2 = 515 --> 1
         * 515 /2 = 257 --> 1
         * 257 / 2 = 128 --> 1
         * 128 / 2 = 64 --> 0
         * 64 /2 = 32 --> 0
         * 32 / 2 = 16 --> 0
         * 16 / 2 = 8 --> 0
         * 8 / 2 = 4 --> 0
         * 4 /2 = 2 --> 0
         * 2 / 2 = 1 --> 0
         * 1 / 2 = 0 --> 1
         *  1000 0000 1110  ->8 0 14-E --> 0x80E
         */

         intVar = 1999 + 077;
         System.err.println(Integer.toBinaryString(intVar));
         System.err.println(Integer.toHexString(intVar));
         System.err.println(0x80e);
         char charVar;

         float floatVar = 1.11e2f;
         double doubleVar = 1.23e3;

         boolean kondisi1 = true;
         boolean kondisi2 = false;

    }
}

