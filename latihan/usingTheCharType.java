package latihan;

public class usingTheCharType {
    public static void main (String args []){
        // tipe data char hanya dapat menampung 1 karakter
        char myLittleChar = 'b';
        char myBigChar = Character.toUpperCase(myLittleChar);

        System.out.println(myBigChar);
    }
}
