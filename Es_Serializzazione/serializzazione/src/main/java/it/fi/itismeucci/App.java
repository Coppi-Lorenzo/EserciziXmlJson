package it.fi.itismeucci;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Classe classe = new Classe();

        Alunno lorenzo = new Alunno("Lorenzo", "Coppi", new Date(2004,2,13));
        Alunno samuele = new Alunno("Samuele", "Maranghi", new Date(2004,10,13));
        Alunno gioele = new Alunno("Gioele", "Falaschi", new Date(2004,4,9));
        Alunno leonardo = new Alunno ("Leonardo", "Canu", new Date(2005,1,2));

        classe.aggiungi(lorenzo);
        classe.aggiungi(samuele);
        classe.aggiungi(gioele);
        classe.aggiungi(leonardo);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(classe);
        xmlMapper.writeValue(new File("classe.xml"), classe);
        File file = new File("classe.xml");
    }
}
