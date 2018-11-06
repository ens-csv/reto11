/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

public class JavaApplication16 {

    public static void main(String[] args) {

        Principe personajeBuscado= new Principe("Augusto", 23, 1.85); 
        Principe propuesta2= new Principe("Augusto", 23, 1.85); 
        Principe propuesta3= new Principe("Guillermo", 30, 1.75);

        if(personajeBuscado.nombre==propuesta3.nombre){ 
            System.out.println("Era al personaje que estaba buscando");
        }else{
            System.out.println("Seguiré buscando");
        }

        if(personajeBuscado.nombre==propuesta2.nombre){
            System.out.println("Era al personaje que estaba buscando");
        }else{
            System.out.println("Seguiré buscando");
        }

}
    
}
