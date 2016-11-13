
package tallermecanico;




public class precioacobrar  {
    private static final  int EUROSFIJOS=30;
    private static final  double MECANICA=1.1;
    private static final  double CHAPA =1.3;
    private static final int FIJOREVISION=20;
    
    int numerohoras;
    int costematerial;

    public precioacobrar(int numerohoras, int costematerial) {
        this.numerohoras = numerohoras;
        this.costematerial = costematerial;
    }

    
    
    //los getters y setter por si acaso
    public void setNumerohoras(int numerohoras) {
        this.numerohoras = numerohoras;
    }
    public void setCostematerial(int costematerial) {
        this.costematerial = costematerial;
    }
    public int getNumerohoras() {
        return numerohoras;
    }
    public int getCostematerial() {
        return costematerial;
    }
   
    
    //metodos calcular chapa,mecanica o revision
    public double calculoreparacionchapa(){
    double calculo = (CHAPA*getCostematerial())+(getNumerohoras()*EUROSFIJOS);
    return calculo;
    } 
    
        public double calculoreparacionmecanica(){
    double calculo = (MECANICA*getCostematerial())+(getNumerohoras()*EUROSFIJOS);
    return calculo;
    } 
     
        public double calculorevision(){
    double calculo = (FIJOREVISION +(getNumerohoras()*EUROSFIJOS));
    return calculo;
    }     
        
        
        
    } 
    
    


