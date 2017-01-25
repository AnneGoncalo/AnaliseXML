/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisexml;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import com.sun.org.apache.xpath.internal.XPathAPI;
import com.sun.xml.internal.txw2.output.XmlSerializer;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author anne
 */
public class AnaliseXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException, TransformerException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(new File("src/analisexml/alunos.xml"));

        doc.getDocumentElement().normalize();

        System.out.println("Root element : " + doc.getDocumentElement().getNodeName());

        Element raiz = doc.getDocumentElement();
        System.out.println("Raiz: " + raiz.getNodeName());

        NodeList alunos = raiz.getChildNodes();
        for (int i = 0; i < alunos.getLength(); i++) {
            Aluno a = new Aluno();

//            System.out.println("?: " + lista.item(i).getTextContent());
//            System.out.println("#: " + lista.item(i).getNodeValue());
            //a.setMatricula(lista.item(i).getNodeName());

        }
        //NodeList lista = XPathAPI.selectNodeList(raiz, "aluno");
//        List<Aluno> alunos = (List<Aluno>) lista;
//        for(Aluno a : alunos){
//            System.out.println("Nome: "+a.getNome());
//            System.out.println("Matricula: "+a.getMatricula());
//        }

//        String xmlTeste = "<alunos><aluno><matricula>0001</matricula><nome>Anne</nome></aluno><aluno><matricula>0002</matricula><nome>Ana</nome></aluno></alunos>"; // o XML vai aqui!
//
//        XStream stream = new XStream(new DomDriver());
//        
//                
//        stream.alias("aluno", Aluno.class);
//        List<Aluno> alunos = (List<Aluno>)stream.fromXML(xmlTeste);
//        Aluno aluno = (Aluno) stream.fromXML(xmlTeste);
//
//        System.out.println("Nome: "+aluno.getNome());
//        System.out.println("Matricula: "+aluno.getMatricula());
    }

}
