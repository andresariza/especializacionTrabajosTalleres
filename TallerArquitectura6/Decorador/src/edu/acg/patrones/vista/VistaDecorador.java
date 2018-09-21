/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acg.patrones.vista;

import edu.acg.patrones.appExistente.FactoriaLog;
import edu.acg.patrones.appExistente.Logeable;
import edu.acg.patrones.decorador.LogCifrado;
import edu.acg.patrones.decorador.LogDecorator;
import edu.acg.patrones.decorador.LogHtml;
import edu.acg.patrones.decorador.LogXML;

/**
 *
 * @author Andres
 */
public class VistaDecorador {

    public static void main(String[] args) {
        FactoriaLog factoria = new FactoriaLog("ON");
        Logeable obj_TipoLog = factoria.getLog();
        //Utilizando el objeto existente.

        LogDecorator decoradoImpl = new LogDecorator(obj_TipoLog);
        System.out.println(decoradoImpl.mensajeLog("Un mensaje de prueba enviado al Log...."));

        //El objeto decorador proporciona la misma interface que los objetos iniciales.
        LogHtml obj_Html = new LogHtml(obj_TipoLog);
        System.out.println(obj_Html.mensajeLog("Un mensaje de prueba enviado al Log....debe estar en HTML"));
                  
        //El objeto decorador proporciona la misma interface que los objetos iniciales.
        LogCifrado obj_Cifrado = new LogCifrado(obj_Html);
        System.out.println(obj_Cifrado.mensajeLog("Un mensaje de prueba enviado al Log....debe estar cifrado"));

        //Usando en conjunto ambas funcionalidades
        System.out.println(obj_Html.mensajeLog(obj_Cifrado.mensajeLog("Un mensaje de prueba enviado al Log....debe estar cifrado")));
        
        LogXML objXML = new LogXML(obj_Cifrado);
        System.out.println(objXML.mensajeLog("Un mensaje de prueba enviado al Log....debe estar en xml"));
        
        //Usando en conjunto tres funcionalidades
        System.out.println(objXML.mensajeLog(obj_Html.mensajeLog(obj_Cifrado.mensajeLog("Un mensaje de prueba enviado al Log....debe estar cifrado  html y xml"))));
    }
}
