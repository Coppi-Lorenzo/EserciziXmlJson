package it.fi.itismeucci;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main2 {
    
    public static void main( String[] args ) throws IOException
    {
        File file = new File("classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Classe value = xmlMapper.readValue(file, Classe.class);
    }
}
