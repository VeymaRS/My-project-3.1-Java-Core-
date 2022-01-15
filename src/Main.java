import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static final String dirParent = "C:/Users/weyma/Documents/Games/";
    private static final StringBuilder log = new StringBuilder();

    private static void logging(String textLog, StringBuilder sb) {
        sb.append(textLog + "\n");
    }

    private static void makeDir(String dirName) {
        File dir = new File(dirParent + dirName);
        if (dir.exists()) {
            logging("Каталог уже существует", log);
        } else {
            if (dir.mkdir()) {
                logging("Каталог " + dirName + " создан", log);
            } else {
                logging("Каталог " + dirName + " не создан", log);
            }
        }
    }

    private static void makeFile(String fileName) {
        File file = new File(dirParent + fileName);
        if (file.exists()) {
            logging("Файл уже существует", log);
        } else {
            try {
                if (file.createNewFile()) {
                    logging("Файл " + fileName + " создан", log);
                }
            } catch (IOException err) {
                logging("Файл " + fileName + " не создан", log);
            }
        }
    }

    public static void main(String[] args) {
        makeDir("src");
        makeDir("res");
        makeDir("savegames");
        makeDir("temp");
        makeDir("main");
        makeDir("test");
        makeDir("res/drawables");
        makeDir("res/vectors");
        makeFile("main/Main.java");
        makeFile("main/Utils.java");
        makeFile("temp/temp.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dirParent + "temp/temp.txt", true))) {
            bw.write(log.toString());
            bw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
