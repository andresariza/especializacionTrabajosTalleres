/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acg.patrones.appExistente;

/**
 *
 * @author andres
 */
public class FactoriaLog {

    private String VariableLog;

    public FactoriaLog(String VariableLog) {
        this.VariableLog = VariableLog;
    }

    public boolean isLogArchivo() {
        try {
            if (VariableLog.equalsIgnoreCase("ON") == true) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public Logeable getLog() {

        if (isLogArchivo()) {
            return new LogArchivo();
        } else {
            return new LogConsola();
        }
    }

    public String getVariableLog() {
        return VariableLog;
    }

    public void setVariableLog(String variableLog) {
        VariableLog = variableLog;
    }

}
