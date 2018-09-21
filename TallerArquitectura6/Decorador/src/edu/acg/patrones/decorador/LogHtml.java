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
public class LogHtml extends LogDecorator {

    public LogHtml(Logeable objLogeable) {
        super(objLogeable);
    }

    @Override
    public String mensajeLog(String msgLog) {
        /* Funcionalidad adicionada por el decorador */
        msgLog = formatoHtml(msgLog);
        /*Ahora se envia el mensaje al tipo de instancia que se selecciono */
        return msgLog;
    }

    public String formatoHtml(String msgLog) {
        /*Convertir el log en un formato diferente (HTML). */
        msgLog = "<HTML><HEAD></HEAD><BODY>" + "<b>" + msgLog + "</b>" + "</BODY></HTML>";
        return msgLog;
    }
}
