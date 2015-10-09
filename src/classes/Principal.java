/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.omg.CORBA.MARSHAL;

/**
 *
 * @author Inovax
 */
public class Principal {
 
    
    public static void main(String[]args) throws JAXBException, IOException{
    
        String teste="doommm";
        
        pessoas p = new pessoas();
    
    p.setPes_nome("Helio Franca");
    p.setPes_rg("sdsdfsa");
    p.setPes_id(23);
    
        JAXBContext context = JAXBContext.newInstance(pessoas.class); // Criar XML.
        Marshaller marshal = context.createMarshaller();
        
        marshal.marshal(p, System.out);
        
        FileWriter writer = new FileWriter(teste+".xml");  
        marshal.marshal(p, writer);
    
    }//Fim da main
}//Fim da calsse principal.
