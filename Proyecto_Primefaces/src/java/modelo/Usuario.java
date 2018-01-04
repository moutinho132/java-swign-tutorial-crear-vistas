/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


/**
 *
 * @author AKDESK23
 */
@ManagedBean
public class Usuario implements Serializable{
    private String nombreUsuario;
    private String clave;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    public void ValidarUsuario(){
        FacesMessage message = null;
        boolean loggedIn = false;
            setNombreUsuario(nombreUsuario);
            setClave(clave);
            System.out.println("Datos al acceder :"+nombreUsuario);
             System.out.println("Datos al acceder :"+clave);
        if((getNombreUsuario() !=null && getNombreUsuario().equals("fmoutinho"))&& (getClave()!=null && getClave().equals("moutinho"))){
            loggedIn=true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", getNombreUsuario());
        }else{
           message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        
    }
    public String logout() {
  
        return "/salida.xhtml";
    }

    
}
