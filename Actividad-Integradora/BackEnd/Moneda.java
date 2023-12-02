import java.util.Random;

public class Moneda{

    private int frecuenciaCara;
    private int frecuenciaCruz;
    private String lado;

    public Moneda(){

    }

    public String lanzarMoneda(){
        
        Random random = new Random();
        String ladoMoneda;
        int lado = random.nextInt(2)+1;
        if(lado == 1){
            frecuenciaCara = frecuenciaCara +1;
            ladoMoneda = "Cara";
        }else{
            frecuenciaCruz = frecuenciaCruz +1;
            ladoMoneda = "Cruz";
        }

        return ladoMoneda;
    }

    public String getLado(){

        return lado;

    }

    public int getCara(){

        return frecuenciaCara;
    }

    public int getCruz(){

        return frecuenciaCruz;
    }
}