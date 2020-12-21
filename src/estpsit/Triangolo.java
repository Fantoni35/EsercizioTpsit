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
public class Triangolo {
    private int lato1;
    private int lato2;
    private int base;

    /*Triangolo(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public  Triangolo (int lato1, int lato2, int base){
        this.lato1=lato1;
        this.lato2=lato2;
        this.base=base;
       
    }
   /* public int getlato1(){
        return lato1;
    }
    public int getlato2(){
        return lato2;
    }
    public int getbase(){
        return base;
    }
    public int getaltezza(){
        return altezza;
    }
    public int getipotenusa(){
        return ipotenusa;
    }*/
    
    public String riconoscimentotriangolo()
    {
         String nome="rettangolo";  

        if(lato1==lato2 && lato1==base && lato2==base)
        {
            nome= "equilatero"; 
        }
        if(lato1== lato2 && lato1!=base && lato2!=base)
        {
           nome="isoscele";
        }
       if(lato1!=lato2 && lato1!=base && lato2!=base)
       {
           nome="scaleno";
       }




       return nome;

    }
    
    public double areaTriangolo (){
        double area=0.0;
        double altezza=0.0;
        altezza=lato1*lato2*base/2;
        area=altezza*(altezza-lato1)*(altezza-lato2)*(altezza-base);
       
        area=Math.sqrt(area); //comando radice quadrata//
        return area;
    }
    public double  perimetroTriangolo(){
        double perimetro=0.0;
        perimetro=lato1+lato2+base;
        return perimetro;
   
    }
   
}
