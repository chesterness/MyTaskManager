import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import model.Task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DiskIO {
    public static void writeToFile(String filename, List<String> lines, boolean append) {
        try (OutputStream output = new FileOutputStream(filename, append)) {
            for (String line : lines) {
                output.write(line.getBytes());
                output.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeToFile(String filename, Object object, boolean append){
        try (OutputStream output = new FileOutputStream(filename, append)){
            output.write(Integer.parseInt(object.toString()));
            output.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFromFile(String filename) throws IOException {
        Path file = Paths.get(filename);
        return Files.lines(file).collect(Collectors.toList());
    }
}
