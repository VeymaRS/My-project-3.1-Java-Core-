import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static void logging(String textLog, StringBuilder sb) {
        sb.append(textLog + "\n");
    }

    public static void main(String[] args) {
        File src = new File("C:/Users/weyma/Documents/Games/src");
        File res = new File("C:/Users/weyma/Documents/Games/res");
        File savegames = new File("C:/Users/weyma/Documents/Games/savegames");
        File temp = new File("C:/Users/weyma/Documents/Games/temp");
        File tempFile = new File("C:/Users/weyma/Documents/Games/temp", "temp.txt");
        File main = new File("C:/Users/weyma/Documents/Games/src/main");
        File test = new File("C:/Users/weyma/Documents/Games/src/test");
        File fileMain = new File("C:/Users/weyma/Documents/Games/src/main", "Main.java");
        File fileUtils = new File("C:/Users/weyma/Documents/Games/src/main", "Utils.java");
        File drawables = new File("C:/Users/weyma/Documents/Games/res/drawables");
        File vectors = new File("C:/Users/weyma/Documents/Games/res/vectors");
        File icons = new File("C:/Users/weyma/Documents/Games/res/icons");

        StringBuilder log = new StringBuilder();

        String makeSrcDirectory = (src.mkdir()) ? "Создан каталог с именем src" : "Каталог с именем src не создан";
        logging(makeSrcDirectory, log);

        String makeResDirectory = (res.mkdir()) ? "Создан каталог с именем res" : "Каталог с именем res не создан";
        logging(makeResDirectory, log);

        String makeSavegamesDirectory = (savegames.mkdir()) ? "Создан каталог с именем savegames" : "Каталог с именем savegames не создан";
        logging(makeSavegamesDirectory, log);

        String makeTempDirectory = (temp.mkdir()) ? "Создан каталог с именем temp" : "Каталог с именем temp не создан";
        logging(makeTempDirectory, log);

        String makeMainDirectory = (main.mkdir()) ? "Создан каталог с имененм main" : "Каталог с именем main не создан";
        logging(makeMainDirectory, log);

        String makeTestDirectory = (test.mkdir()) ? "Создан каталог с именем test" : "Каталог с именем test не создан";
        logging(makeTestDirectory, log);

        String makeDrawablesDirectory = (drawables.mkdir()) ? "Создан каталог с именем drawables" : "Каталог с именем drawables не создан";
        logging(makeDrawablesDirectory, log);

        String makeVectorsDirectory = (vectors.mkdir()) ? "Создан каталог с именем vectors" : "Каталог с именем vectors не создан";
        logging(makeVectorsDirectory, log);

        String makeIconsDirectory = (icons.mkdir()) ? "Создан каталог с именем icons" : "Каталог с именем icons не создан";
        logging(makeIconsDirectory, log);

        try {
            if (fileMain.createNewFile()) {
                log.append("Создан файл с именем Main.java" + "\n");
            }
        } catch (IOException err) {
            log.append("Файл с именем Main.java не создан" + "\n");
        }

        try {
            if (fileUtils.createNewFile()) {
                log.append("Создан файл с именем Utils.java" + "\n");
            }
        } catch (IOException err) {
            log.append("Файл с именем Utils.java не создан" + "\n") ;
        }

        try {
            if (fileUtils.createNewFile()) {
                log.append("Создан файл с именем Utils.java" + "\n");
            }
        } catch (IOException err) {
            log.append("Файл с именем Utils.java не создан" + "\n");
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
            bw.write(log.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
