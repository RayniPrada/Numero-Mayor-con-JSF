/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hp
 */
@ManagedBean
@RequestScoped
public class comparacion {
int n1;
int n2;
int n3;
int r;
    /**
     * Creates a new instance of comparacion
     */
    public comparacion() {
    }
    
    public void compara(){
if(n1>n2 && n1>n2){
    
FacesContext c = FacesContext.getCurrentInstance();
    c.addMessage(null,new FacesMessage("EL MAYOR ES :","NUMERO"+n1));
    
   }else{
       
       if(n2>n1 && n2>n3){
     FacesContext c = FacesContext.getCurrentInstance();
    c.addMessage(null,new FacesMessage("EL MAYOR ES : ","NUMERO "+n2));
       }else{
     if(n3>n1 && n3>n2){

                FacesContext c = FacesContext.getCurrentInstance();
    c.addMessage(null,new FacesMessage("EL MAYOR ES : ","NUMERO "+n3));
   
   } 
   } }
       
}

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
}
