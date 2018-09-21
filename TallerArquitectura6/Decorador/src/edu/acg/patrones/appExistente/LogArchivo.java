/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acg.patrones.appExistente;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author andres
 */
public class LogArchivo implements Logeable {

    FileWriter fichero = null;
    PrintWriter pw = null;

    public String mensajeLog(String msg) {
        StringBuffer mensaje = new StringBuffer();
        mensaje.append("Archivo ");
        try {
            fichero = new FileWriter("C:\\Users\\Andres\\Documents\\especializacionTrabajosTalleres\\TallerArquitectura6\\Log2.txt");
            pw = new PrintWriter(fichero);
            pw.println(msg);
            mensaje.append("Generado");
        } catch (Exception e) {
            mensaje.append("No generado");
            e.printStackTrace();
        } finally {
            try {
// Nuevamente aprovechamos el finally para
// asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                mensaje.append("No generado");
            }
        }
        return mensaje.toString();
    }
}
