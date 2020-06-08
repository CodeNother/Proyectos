/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_huffman.Modelo;

/**
 *
 * @author Jhonatan Alexander P
 */
public class Cls_Texto {
    public String Letra;
    public double Probabilidad;
    public String Texto;
    public String[][] Matriz=new String[0][0];
    
    public void setMatriz(String [][] mat){
        this.Matriz=mat;
    }
    public String[][] getMatriz()
    {
        return this.Matriz;
    }
    public Cls_Texto(){
    
    }
    public Cls_Texto(String Letra,double Probabilidad){
        this.Letra=Letra;
        this.Probabilidad=Probabilidad;
    }
    
    public String getLetra(){
        return this.Letra;
    }
    public String getTexto(){
        return this.Texto;
    }
    public double getProbabilidad(){
        return this.Probabilidad;
    }
    public void setLetra(String letra){
        this.Letra=letra;
    }
    public void setTexto(String Text){
        this.Texto=Text;
    }
    public void setProbabilidad(double prop){
        this.Probabilidad=prop;
    }
    
}
