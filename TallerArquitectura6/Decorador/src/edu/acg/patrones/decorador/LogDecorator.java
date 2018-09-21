/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acg.patrones.decorador;

import edu.acg.patrones.appExistente.Logeable;

/**
 *
 * @author Andres
 */
public class LogDecorator implements Logeable{
    // Se crea una referencia a la interface superior

    Logeable unLog;

    public LogDecorator(Logeable obj_Log) {
        // Se asocia la refrencia generica al objeto recibido
        unLog = obj_Log;
    }

    public String mensajeLog(String msgLog) {
        /*Implementacion por defecto que sera redefinida por las subclases*/
        return unLog.mensajeLog(msgLog);
    }
}
