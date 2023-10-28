import java.util.Arrays;

class Pertemuan6 {
    public static void main(String[] args) {
        /*
         * Array dan String
         * 
         * Defini Array:
         * - Kumpulan tipe data yang sejenis dan berbatas
         * - deklarasi array bersifat pointer (tidak mempunyai alokasi di memory)
         * - membutuhkan inisialisasi (menentukan jumlah element)
         * String -> Kumpulan karakter --> berbatas... 255 karakter, sebanyak jumlah
         * memory
         * 
         */

        // type[] identifier;
        // type identifier[];
        String iniString; // sebuah var String tanpa mengarah ke manapun (tidak ada alamat memory untuk
                          // nilai var tersebut)

        int arrayInt[]; // pointer dengan alamat memory null (tidak menujuk kemanapun)
        arrayInt = new int[5];

        int arrayInt7Element[] = new int[7]; // pointer dengan alamat memory menunjuk ke alamat new int[7]

        int arrayIntDenganInisialiasi[] = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        };

        /*
         * Array akan memunculkan error jika diakses dengan index < 0 atau index >= max
         * index
         * index array dimulai dari 0 sampai dengan MAX_ELEMENT-1
         * 
         * untuk mengakses/menugaskan nilai yang ada pada array bisa menggunakn
         * index-nya
         *
         */
        arrayInt[3] = 100; // ini berarti arrayInt index ke 3 di tugaskan nilai integer 100
        System.out.println(arrayIntDenganInisialiasi[5]); // mengkases/mendapatkan nilai array index ke 5 (elemen ke 6)
                                                          // dari variable arrayIntDenganInisialiasi

        // System.out.println(arrayInt[-1]); // Akan menghasilkan
        // ArrayIndexOutOfBoundsException --> sebuah runtime error
        // System.out.println(arrayInt[arrayInt.length]); //menghasilkan error yang sama
        // dengan statemen diatas

        // sangat erat dengan perulangan for, while, do..while
        // menugaskan nilai atau mengambil nilai dari array;

        int penugasanArrayDenganLoops[] = new int[(int) (Math.random() * 10000) + 1];
        int counter = 0;
        System.out.println("Memulai looping dengan array " + penugasanArrayDenganLoops.length + " element");
        while (counter < penugasanArrayDenganLoops.length) {
            penugasanArrayDenganLoops[counter++] = (int) (Math.random() * 10000);
        }
        for (int idx = 0; idx < penugasanArrayDenganLoops.length; idx++) {
            System.out.print(penugasanArrayDenganLoops[idx] + " ");
        }
        System.out.println();
        /*
         * String, --> kumpulan karakter
         * --> karakter adalah repersentasi simbol dari angka yang disepakati, atau
         * encoding
         */
        String s;
        char hurufRandom[] = new char[255];
        counter = 0;
        do {
            hurufRandom[counter] = (char) (65 + (int) (Math.random() * 26));
        } while (++counter < hurufRandom.length);

        s = new String(hurufRandom);
        System.out.println(s);
        System.out.println("element ke 100 dari hurufRandom[100] adalah: " + hurufRandom[99]);
        System.out.println("element ke 100 dari string adalah: " + s.charAt(99));

        /*
         * +1
         * Yoga (25)
         * Hilmi (26)
         * Naufal (25)
         */

        /*
         * Operasi pada Array & String
         * - Array combining + concatination
         * - Array Slicing --> ada library
         * 
         * String
         * - String concatination --> native java
         * - Left --> mengambil karakter dari kiri sebanyak beberapa elemen
         * - Right --> mengambil karakter dari kanan sebanyak beberapa elemen
         * - Mid/Substring --> native java 
         */
        System.out.println();

        int varInt1[] = new int[] { 1, 2, 3, 4, 5 };
        int varInt2[] = new int[] { 6, 7, 8, 9, 0 };

        int varInt1Dan2[] = new int[varInt1.length + varInt2.length];
        System.out.println("varInt1Dan2 = " + varInt1Dan2.length);
        for (int idx = 0; idx < varInt1Dan2.length; idx++) {
            varInt1Dan2[idx] = idx < varInt1.length ? varInt1[idx] : varInt2[idx - varInt1.length];
        }
        for (int idx = 0; idx < varInt1Dan2.length; idx++) {
            System.out.print(varInt1Dan2[idx] + " ");
        }

        // Array Slicing
        int slice[] = Arrays.copyOfRange(varInt1Dan2, 4, 7);
        System.out.println("Slicing array dari element 4 sampai 7");
        for (int i : slice) {
            System.out.print(i + " ");
        }

        System.out.println();
        String s1 = "Helo, ", s2 = "World";
        String s3;
        System.out.println(s3 = s1 + s2);
        System.out.println(s3.substring(6, 8));

        //Buat fungsi left dan right di java-- sampai jam 10:15;
        // Hello, World
        // left("Hello, World", 5) --> Hello
        // right("Hello, World", 5) --> World

        // Yoga +3
    }
}