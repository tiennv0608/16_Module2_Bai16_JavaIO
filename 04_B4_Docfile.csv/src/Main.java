import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        List<String> list = read.readFile("C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\16_JavaIO\\04_B4_Docfile.csv\\src\\file.csv");
        displayCountry(list);
    }
    static void displayCountry(List<String> lists){
        for (String list: lists) {
            System.out.println(list);
        }
    }
}
