/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.ArrayList;

/**
 *
 * @author STP
 */
public abstract class AbstractControler {
    protected AbstractControler calc;
    protected String operateur = "",nbre = "";
    protected ArrayList<String> listOperateur = new ArrayList<String>();
    public AbstractControler(AbstractModel cal){
        this.calc = calc;
        this.listOperateur.add("+");
        this.listOperateur.add("-");
        this.listOperateur.add("*");
        this.listOperateur.add("/");
        this.listOperateur.add("=");
    }
    public void setOperateur(String ope){
        this.operateur = ope;
        control();
    }
    public void setNombre(String nombre){
        this.nbre = nombre;
        control();
    }
    public void reset(){
        this.calc.reset();
    }

    private void control() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getResultat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
