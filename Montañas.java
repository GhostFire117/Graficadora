public double[] Mont(){
    double m[];
    for(int a=0;a<k;a++){
        for(int b=0;b<numero;b++){
            m[a]+=Math.exp(-(dist(v[b][0],v[b][1],pun[b][0],pun[b][1])/(2*sigma*sigma)));
        }
    }
    return m[];
}


public double[][] AddM(double Am[]){
    for(int bc=0;bc<k;bc++){
        v[bc][2]=Am[bc];
    }
    return v[][];
}



public double dist(double x1,double y1,double x2,double y2){
    double d;
    d=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
    return d;
}

public int Mayor(double m){
    double mayor=-1.0;
    int pos;
    for(int l=0;l<totalv;l++){
        if(m[l]>mayor){
            mayor=m[l];
            pos=l;
        }
    }
    return pos;
}

/*Programacion para el boton iterar:*/
if(cont<1){
    Mont();
}
else{
   m[cont]=m[cont]-m[cont-1]*(Math.exp((dist(v[cont][1],v[cont][2],v[cont][1],v[cont][2]))/(2*beta*beta))
}
cont++;


package proyecto;

public class Pr { 
    private double[][] v;
    private double salto;
    private int tama; 
   
    public double getSalto() {
        return salto;      
    }
    
    public int gettama() {               
        return tama;
    }
  
    public double[][] Intersecciones() {
        double x=0.0;
       int k=0;
        while(true){        
        x=x+salto;
        k=k+1;
        if(x>=100.0){
            tama=k*k;
              break;      
            }
        }        
        v=new double[tama][2];
         double p=0.0;
         for(int i=0;i<=Math.sqrt(tama);i++){
         x=0.0;         
        for(int j=0;j<=Math.sqrt(tama);j++){            
        v[i][0]=p;
        v[j][1]=x;
        System.out.println(v[i][0]+"\t"+v[j][1]+"\n");
        x=x+salto;       
        }
         p=p+salto;
         }
    return v;
    }
  
      public void setSalto(double salt) {
        this.salto = salt;        
    }
    
      public void settama(int t) {
        this.tama=t;      
      }
}