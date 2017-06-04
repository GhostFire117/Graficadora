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
