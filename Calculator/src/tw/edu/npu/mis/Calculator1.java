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
public class Calculator1 extends AbstractModel{

    @Override
    public void reset() {
        this.result = 0;
        this.operande = "0";
        this.operateur = "";
        notifObserver(String.valueOf(this.result));
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcul() {
        if(this.operande.equals("")){
            this.result = Double.parseDouble(this.operande);
        }
        else{
            if(!this.operande.equals("")){
                if(this.operateur.equals("+"))
                    this.result += Double.parseDouble(this.operande);
                if(this.operateur.equals("-"))
                    this.result -= Double.parseDouble(this.operande);
                if(this.operateur.equals("*"))
                    this.result *= Double.parseDouble(this.operande);
                if(this.operateur.equals("/")){
                    try{
                        this.result /=Double.parseDouble(this.operande);
                    }catch(ArithmeticException e){
                        this.result = 0;
                    }
                }
            }
        }
        this.operande = "";
        notifyObserver(String.valueOf(this.result));
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getResultat() {
        calcul();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOperateur(String ope) {
        calcul();
        this.operateur = ope;
        if(!ope.equals("=")){
            this.operande = "";
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String result) {
        this.operande += result;
        notifObserver(this.operande);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void notifObserver(String operande) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
