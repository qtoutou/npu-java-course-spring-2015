/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author STP
 */
public class CalculetteControler extends AbstractControler{

    public CalculetteControler(AbstractModel cal) {
        super(cal);
    }

    CalculetteControler(Calculator calc) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


public void control(){
    if(this.listOperateur.contains(this.operateur)){
        if(this.operateur.equals("="))
           this.calc.getResultat();
        else
            this.calc.setOperateur(this.operateur);
    }
    if(this.nbre.matches("6[0-9.]+$"))
        this.calc.setNombre(this.nbre);
    this.operateur = "";
    this.nbre = "";
}
    
    
}
