package lesson29.hw;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
Создать 2 текстовых файла: test1.txt и test2.txt.
Один в корневой папке проекта с помощью
относительного пути, другой в папке TestFile,
которая находится на рабочем столе.
В первый файл записать информацию с помощью
BufferWriter и прочесть с помощью BufferReader.
Во втором файле проделать то же с помощью
Buffers и Channels. (Использовать методы flip(),
read, clear(), write())
Создать папку PathExample на рабочем столе и в
ней файл testPath.txt с помощью интерфейса Path.
Использовать методы: getFileName(), getParent(),
getRoot(), isAbsolute(), toAbsolute().
Использовать try with resources
 */

public class Main {
    public static void main(String[] args) {
        String fileName = "test1.txt";
        try (BufferedWriter test1Writer = new BufferedWriter(new FileWriter(fileName));
        ){
            test1Writer.write("I like pizza rancho 2");
        }
        catch (IOException exception){
            System.out.println("Ошибочка вышла");
        }

        try (BufferedReader test1Reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = test1Reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String userHome = System.getProperty("user.home");
        Path test2FilePath = Paths.get(userHome,"Desktop","TestFile","test2.txt");

        try(FileChannel fileChannel = FileChannel.open(test2FilePath, StandardOpenOption.WRITE)){
            ByteBuffer buffer = ByteBuffer.allocate(48);
            buffer.put("I really like pizza".getBytes());
            buffer.flip();
            fileChannel.write(buffer);
            buffer.clear();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }

        try (FileChannel fileChannel = FileChannel.open(test2FilePath, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(48);
            fileChannel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        Path pathExampleDir = Paths.get(userHome, "Desktop", "PathExample");
        Path testPathFile = pathExampleDir.resolve("testPath.txt");

        try {
            Files.createDirectories(pathExampleDir);
            Files.createFile(testPathFile);
            System.out.println();
            System.out.println("File name: " + testPathFile.getFileName());
            System.out.println("Parent directory: " + testPathFile.getParent());
            System.out.println("Root directory: " + testPathFile.getRoot());
            System.out.println("Is absolute: " + testPathFile.isAbsolute());
            System.out.println("Absolute path: " + testPathFile.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
