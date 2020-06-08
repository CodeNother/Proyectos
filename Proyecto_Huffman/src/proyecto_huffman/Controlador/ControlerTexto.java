/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_huffman.Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import proyecto_huffman.Modelo.Cls_Texto;

/**
 *
 * @author Jhonatan Alexander P
 */
public class ControlerTexto {

    Contabilizador contabilizador = new Contabilizador();
    Cls_Texto ClTex = new Cls_Texto();
    public String[][] mat;
    public String[][] Codificada;
    public double Entropia = 0;
    int cont = 0;
    String cod1="0";
    String cod2="1";
    //List<List<String>> ListaCaracteres = new ArrayList<List<String>>();

    /*Metodo para capturar el texto*/
    public String ObtenerTexto(String Txt) {
        this.Entropia=0;
        File myFile; // clase para manipular el archivo
        FileReader leer; // clse para leer
        myFile = new File(Txt);
        String cadena;
        String texto="";
        try {
            leer = new FileReader(myFile);
            BufferedReader buffer = new BufferedReader(leer);
            cadena = "";
            while (cadena != null) {
                try {
                    cadena = buffer.readLine(); // almacena una linea del texto en el buffer
                    if (cadena != null) {
                        if(texto !=""){
                            texto+="\n"+cadena;
                        }else if(texto==""){
                            texto=cadena;
                        }
                       
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                ClTex.setTexto(texto); 
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return ClTex.getTexto();
    }

    /*Metodo para quitar Carateres Espciales*/
    public static String remove1(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "��������������u�������������������";
        // Cadena de caracteres ASCII que reemplazar�n los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }//for i
        return output;
    }

    /*Metodo para contar carateres*/
    public String[][] Cantidad_caracteres(String Txt) {
        String txt = remove1(Txt);//Linea para quitar caracteres especiales
        contabilizador.contabiliza(txt);//Linea para llamar a la clase contablizar, la cual llama al metodo
        Map<String, Long> ocurrencias = contabilizador.getOcurrencias();
        Set<String> keys = ocurrencias.keySet();
        Iterator<String> iterator = keys.iterator();
        Iterator<String> iterator2 = keys.iterator();
        String key = null;
        String cad = null;
        while (iterator2.hasNext()) {//ciclo para saber las filas de la matriz
            cad = iterator2.next();
            cont++;
        }
        mat = new String[cont][3];
        int z = 0;
        //crear();
        while (iterator.hasNext()) {//ciclo para recorer el mapeado de la mtriz	        	
            key = iterator.next();
            double x = ocurrencias.get(key).intValue();
            double y = txt.length();
            mat[z][0] = key;
            mat[z][1] = Double.toString(x / y);
            mat[z][2]="";
            z++;

        }
       
        return mat;
    }

    /*Metodo para Guardar la informacion*/
    public void Guardar_Caracteres(int c, String[][] matriz) {
       String[][]mat;
       if(ClTex.getMatriz().length==0){
          mat =matriz;
           for (int x = 0; x < c; x++) {
               mat[x][2]=Integer.toString(x);
           }
          ClTex.setMatriz(mat);
       }else {
           mat=matriz;
           String[][] comparar=ClTex.getMatriz();
           String lv1="";
            String lvl2="";
            for(int z=0;z<comparar.length;z++){
               for(int f=0;f<mat.length;f++){
                   if(mat[f][1].equals(comparar[z][1])&&mat[f][0].equals(comparar[z][0])){
                       mat[f][2]=comparar[z][2];                       
                   }                   
               }
            }
            int num1=0;
            int num2=0;
           for(int x=0;x<comparar.length;x++){
               for(int y=0;y<mat.length;y++){                   
                   double a=Double.parseDouble(mat[(c-1)][1]);
                   double b=Double.parseDouble(mat[(c-2)][1]);
                   double d=Double.parseDouble(comparar[x][1]);
                    if((a+b)==d){
                       String tex=mat[mat.length-2][0]+mat[mat.length-1][0];
                       if(tex.equals(comparar[x][0])){
                           lv1+=(comparar[x][2]+"1");
                          lvl2+=(comparar[x][2]+"0");
                           mat[mat.length-1][2]=lv1;
                           mat[mat.length-2][2]=lvl2;
                           x=comparar.length;
                           y=mat.length;
                       }
                   }
                   
               }
               
           }
        
       ClTex.setMatriz(mat);
       }
      
    }
    /*Metodo para devolver la cantidad de carateres diferentes*/
    public int DevolverFilas() {
        return this.cont;
    }
    /*Metodo por el cual devuelve la entropia*/
    public double GenerarEntropia(String[][] matriz, int c) {
        
           for (int x = 0; x < c; x++) {
            this.Entropia += ((Double.parseDouble(matriz[x][1])) * (Math.log(1 / Double.parseDouble(matriz[x][1]) / Math.log(2))));
        }
        return this.Entropia;
    }
    /*Metodo por el cual se organiza la matriz*/
    public String[][] Organizar_Matriz(String[][] matriz,int c){
        String[][] mat=matriz; 
        String cod="";
            for(int x=0;x<c;x++){
                for(int y=0;y<c;y++){
                    if(Double.parseDouble(mat[x][1])>Double.parseDouble(mat[y][1])){
                        ClTex.setLetra(mat[y][0]); 
                        ClTex.setProbabilidad(Double.parseDouble(mat[y][1]));
                        cod=mat[y][2];
                        mat[y][0]=mat[x][0];
                        mat[y][1]=mat[x][1];
                        mat[y][2]=mat[x][2];
                        mat[x][0]=ClTex.getLetra();
                        mat[x][1]=Double.toString(ClTex.getProbabilidad());  
                        mat[x][2]=cod;
                    }
                }
            }
        return mat;
    }
    
    /*Metodo Huffman*/
    public String[][] Huffman(String[][] mat,int c){
      double a=0;
      double b=0;
      String[][]matriz;
      if(c>2){
          matriz=new String[c-1][3];
          a=Double.parseDouble(mat[c-1][1]);
          b=Double.parseDouble(mat[c-2][1]);
          for(int x=0;x<(c-1);x++){       
              matriz[x][0]=mat[x][0];
              matriz[x][1]=mat[x][1];             
          }         
        matriz[c-2][0]=mat[c-2][0]+mat[c-1][0];
        matriz[c-2][1]=Double.toString(Double.parseDouble(mat[c-2][1])+Double.parseDouble(mat[c-1][1]));  
          matriz=Organizar_Matriz(matriz, c-1);          
          mat=Huffman(matriz, c-1); 
          Guardar_Caracteres(c-1, matriz);
          //ClTex.setMatriz(matriz);
      }   
      
       
      return mat;
    }
    
    public String[][] AsignarCodigo(){
    String[][] num=ClTex.getMatriz();         
    
    return num;
    }
    
}
