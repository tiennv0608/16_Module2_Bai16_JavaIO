import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String filePath){
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine())!= null){
                List<String> stringList = Arrays.asList(line.split(","));
                list.add(stringList.get(2));
            }
            br.close();
        } catch (Exception ex) {
            System.err.println("File không tồn tại hoặc bị lỗi");
        }
        return list;
    }
}
