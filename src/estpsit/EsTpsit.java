/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;

/**
 *
 * @author PC
 */
public class EsTpsit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangolo uno=new Triangolo(1,1,1);
       uno.riconoscimentotriangolo();
       System.out.println(uno.riconoscimentotriangolo());
        uno.perimetroTriangolo();
        System.out.println(uno.perimetroTriangolo());
        uno.areaTriangolo();
        System.out.println(uno.areaTriangolo());
    }
    
}
