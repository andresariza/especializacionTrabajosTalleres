/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acg.patrones.vista;

import edu.acg.patrones.appExistente.FactoriaLog;
import edu.acg.patrones.appExistente.Logeable;

/**
 *
 * @author Andres
 */
public class VistaExistente {

    public static void main(String[] args) {
        FactoriaLog factoria = new FactoriaLog("ON");
        Logeable obj_TipoLog = factoria.getLog();
        System.out.println(obj_TipoLog.mensajeLog("Un mensaje de prueba enviado Log..."));
    }
}
