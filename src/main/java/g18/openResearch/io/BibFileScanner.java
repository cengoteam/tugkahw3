package g18.openResearch.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.jbibtex.BibTeXDatabase;
import org.jbibtex.BibTeXEntry;
import org.jbibtex.BibTeXParser;
import org.jbibtex.ParseException;


public class BibFileScanner {

  

    public static void scanDirectoryForBibTeXFiles(String directoryPath, List<File> bibFiles) {
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().toLowerCase().endsWith(".bib")) {
                        // Add BibTeX file to the list
                        bibFiles.add(file);
                    }
                }
            }
        }
    }

    //import org.jbibtex.BibTeXEntry;

    public static void parseBibTeXFile(File file) {
        try {
            FileReader reader = new FileReader(file);
            BibTeXParser parser = new BibTeXParser();
            BibTeXDatabase database = parser.parse(reader);
            reader.close();

            // Access the parsed entries and their fields
            for (BibTeXEntry entry : database.getEntries().values()) {
                String entryType = entry.getType().getValue(); // Get entry type (e.g., article, book)
                String title = entry.getField(BibTeXEntry.KEY_TITLE).toUserString(); // Get title field
                String author = entry.getField(BibTeXEntry.KEY_AUTHOR).toUserString(); // Get author field

                // Do something with the extracted information
                System.out.println("Entry Type: " + entryType);
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);

                // You can extract more fields or perform additional processing here
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

}

