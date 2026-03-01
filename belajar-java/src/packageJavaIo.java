import java.io.File;
public class packageJavaIo {
    public static void main(String[] args) {
       File test = new File("belajar-java/src/data.txt");
       
       if (test.exists()) {
        System.out.println("File ada");
       }else{
        System.out.println("File tidak ada");
       }
    }  
}
