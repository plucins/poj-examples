package lab8;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String folderName = "src/lab8/inbound"; // Nazwa folderu

        browseFolder(folderName);

        createAndWriteToFile("src/lab8/inbound/ccc", "dodawanie", "2+2=4");
    }

    private static void browseFolder(String folderName) {
        // Tworzymy obiekt File na podstawie nazwy folderu
        File folder = new File(folderName);

        // Sprawdzamy, czy wskazuje na istniejący folder
        if (folder.exists() && folder.isDirectory()) {
            // Lista plików i folderów wewnątrz folderu
            File[] files = folder.listFiles();

            if (files != null) {
                // Przeglądamy listę plików i folderów
                for (File file : files) {
                    if (file.isFile()) { // Jeśli to plik
                        System.out.println("Zawartość pliku " + file.getName() + ":");

                        // Odczytujemy zawartość pliku
                        try {
                            FileReader fileReader = new FileReader(file);
                            BufferedReader bufferedReader = new BufferedReader(fileReader);

                            String line;

                            while ((line = bufferedReader.readLine()) != null) {
                                System.out.println(line);
                            }

                            bufferedReader.close();
                            fileReader.close();
                        } catch (IOException e) {
                            System.out.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
                        }
                    }
                    else { // Jeśli to folder
                        System.out.println("Element " + file.getName() + " jest folderem.");

                        // Rekurencyjnie wywołujemy metodę browseFolder() dla tego folderu
                        browseFolder(file.getPath());
                    }
                }
            }
        }
        else {
            System.out.println("Folder " + folderName + " nie istnieje lub nie jest folderem.");
        }
    }

    private static void createAndWriteToFile(String folderName, String fileName, String content) {
        // Tworzymy obiekt File na podstawie nazwy folderu
        File folder = new File(folderName);

        // Sprawdzamy, czy folder istnieje lub go tworzymy
        if (!folder.exists()) {
            folder.mkdirs(); // Tworzymy wszystkie brakujące katalogi
        }

        // Tworzymy obiekt File na podstawie nazwy pliku i ścieżki folderu
        File file = new File(folder, fileName);

        // Zapisujemy do pliku podane treści
        try (FileWriter fileWriter = new FileWriter(file, true); // true oznacza tryb dopisywania
                BufferedWriter writer = new BufferedWriter(fileWriter);
                PrintWriter out = new PrintWriter(writer)) {
            out.print(content);
            System.out.println("Plik " + fileName + " został utworzony i zapisany.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }
}
