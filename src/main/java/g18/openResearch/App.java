package g18.openResearch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import g18.openResearch.io.BibFileScanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String directoryPath = "data/";
        List<File> bibFiles = new ArrayList<>();
        
        BibFileScanner.scanDirectoryForBibTeXFiles(directoryPath, bibFiles);
        
        // Process the BibTeX files in the list
        for (File file : bibFiles) {
        	BibFileScanner.parseBibTeXFile(file);
        }
    }
}
