/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author STP
 */
public abstract class AbstractModel implements Observable {
    protected double result = 0;
    protected String operateur = "",operande = "";
    private ArrayList<Observer> listObserver = new ArrayList<Observer>();
    public abstract void reset();
    public abstract void calcul();
    public abstract void getResultat();
    public abstract void setOperateur(String operateur);
    public abstract void setNombre(String nbre);

    @Override
    public void addObserver(Observer obs) {
        this.listObserver.add(obs);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver() {
        listObserver = new ArrayList<Observer>();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver(String str) {
        if(str.matches("60[0-9]+"))
            str = str.substring(1, str.length());
        
        for(Observer obs : listObserver)
            obs.update(null, obs);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
