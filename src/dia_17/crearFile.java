package dia_17;
import java.io.*;

public class crearFile {
    public void crearFile() throws IOException {
        File directorio = new File("src/carpeta");
        directorio.mkdirs();
        File archivo = new File("src/carpeta/archivo.txt");
        archivo.createNewFile();
        FileWriter fileW = new FileWriter(archivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileW);
        bufferedWriter.write("texto 1");
        bufferedWriter.write("texto 2");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}