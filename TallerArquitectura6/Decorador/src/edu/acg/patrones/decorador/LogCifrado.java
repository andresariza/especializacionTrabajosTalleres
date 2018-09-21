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
public class LogCifrado extends LogDecorator {

    public LogCifrado(Logeable objLog) {
        /*Recibir por parametro el objeto inicialmente instanciado*/
        super(objLog);
    }

    @Override
    public String mensajeLog(String msgLog) {
        /*Adicionar funcionalidad */
        msgLog = cifrarLog(msgLog);
        /* Enviar el objeto decorado para escribir en el medio adecuado */
        return msgLog;
    }

    public String cifrarLog(String msgLog) {
        /*Aplicar un cifrado muy simple, correr los caracteres una posición */
        msgLog = msgLog.substring(msgLog.length() - 1)
                + msgLog.substring(0, msgLog.length() - 1);
        return msgLog;
    }
}
