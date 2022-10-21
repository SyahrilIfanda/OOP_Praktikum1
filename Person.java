public class Person {
    String nama, jenisKelamin;
    int umur;
    public static void main(String[] args) throws Exception {
        System.out.println("\tHello, World !");
        System.out.println("SYAHRIL IFANDA MEISTA PRATAMA (312110570) ");
        System.out.println("TI.21.C2");
        System.out.println("===============Pemrograman Orientasi Object===============");
        Person person1 = new Person();
        Person person2 = new Person();

        person1.nama = "Anton";
        person1.jenisKelamin = "Laki-laki";
        person1.umur = 21;

        person2.nama = "Riko";
        person2.jenisKelamin = "Laki-laki";
        person2.umur = 22;

        System.out.println("\nNama orang pertama adalah           : " + person1.nama);
        System.out.println("Jenis kelamin orang pertama adalah  : " + person1.jenisKelamin);
        System.out.println("Umur orang pertama adalah           : " + person1.umur);

        System.out.println("\nNama orang kedua adalah             : " + person2.nama);
        System.out.println("Jenis kelamin orang kedua adalah    : " + person2.jenisKelamin);
        System.out.println("Umur orang kedua adalah             : " + person2.umur);
    }
}
