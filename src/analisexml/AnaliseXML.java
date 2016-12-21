/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisexml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.StringReader;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.List;

/**
 *
 * @author anne
 */
public class AnaliseXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String xmlTeste = "<aluno><matricula>0001</matricula><nome>Anne</nome></aluno>"; // o XML vai aqui!
        
        XStream stream = new XStream(new DomDriver());
        
        stream.alias("aluno", Aluno.class);
        Aluno aluno = (Aluno) stream.fromXML(xmlTeste);
        
        System.out.println(aluno.getNome());
        
    }
    
}
