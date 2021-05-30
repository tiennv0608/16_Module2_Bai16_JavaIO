import java.util.List;

public class FileCopy {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> list = readAndWriteFile.readFile("string.txt");
        int countLetter = countLetter(list);
        readAndWriteFile.writeFile("result.txt",list,countLetter);
    }
    public static int countLetter(List<String> list){
        int count = 0;
        for (String str: list) {
            count+=str.length();
        }
        return count;
    }
}
