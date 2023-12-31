/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exa15brevep;

import exa15brevep.Platos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Tengo que copiar y pegar la clase Platos.java en mi paquete para poder utilizar el tipo creo
 * @author dam2
 */
public class DatosSerializados {
    String ruta_fich_serializado = "/home/ubuntu/DAM2/AD/ejercicios_examen/exa15brevep/enun/platoss";
    
    /**
     * 
     * @param codigoBuscado
     * @return codigo correcto si lo encuentra, si no lo encuentra devuelve null
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public ArrayList leerPorCodigo(String codigoBuscado) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList <String> valoresEncontrados= new ArrayList();
        System.out.println("Abrimos flujo para leer fich serializado...");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(ruta_fich_serializado)));
        
        System.out.println("Leo objetos serializado:...");        
        Platos plato;
        //String codigoEncontrado = null;
        while ((plato = (Platos) ois.readObject()) != null) {
            if(codigoBuscado.equals(plato.getCodigop())){
                valoresEncontrados.add(plato.getCodigop());
                valoresEncontrados.add(plato.getNomep());
                //codigoEncontrado = plato.getCodigop();
            } 
        }
        ois.close();
        //return codigoEncontrado;
        return valoresEncontrados;
    }
    
}
