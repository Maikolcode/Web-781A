/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edo.testserver.controladores;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author KOLEMAN78
 */
@Named(value = "testRequest")
@RequestScoped
public class TestRequest {
    
    private String nombreUser = "";
    private String clave = "";
    /**
     * Creates a new instance of TestRequest
     */
    public void datosFormulario(){
        System.out.println("Su nombre es: " + this.nombreUser + " Su contraseña: " + this.clave);
        this.nombreUser = "";
    }
    public TestRequest() {
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
