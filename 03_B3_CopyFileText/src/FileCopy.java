import java.util.List;

public class FileCopy {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\16_JavaIO\\03_B3_CopyFileText\\src\\string.txt");
        int countLetter = countLetter(list);
        readAndWriteFile.writeFile("C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\16_JavaIO\\03_B3_CopyFileText\\src\\result.txt",list,countLetter);
    }
    public static int countLetter(List<String> list){
        int count = 0;
        for (String str: list) {
            count+=str.length();
        }
        return count;
    }
}
