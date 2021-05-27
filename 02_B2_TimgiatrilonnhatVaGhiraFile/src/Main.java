import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\16_JavaIO\\02_B2_TimgiatrilonnhatVaGhiraFile\\src\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\16_JavaIO\\02_B2_TimgiatrilonnhatVaGhiraFile\\src\\result.txt",maxValue);
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i<numbers.size();i++){
            if (max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
