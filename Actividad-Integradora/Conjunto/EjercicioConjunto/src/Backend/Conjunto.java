
package Backend;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Conjunto<T>{

    private Set<T> obj;
    private String nombre;
    
    public Conjunto(Set<T> argObj,String nombre){
        this.obj = new HashSet();
        this.nombre = nombre;
    }
    
    public Conjunto(Conjunto<T> argObj){
        
    }
    
    public Conjunto(String argDatos){
        
    }
    
    public Conjunto<T> union(Conjunto<T> argObj){
        Set<T> objSet = new HashSet(obj);
        
        objSet.addAll((Collection<? extends T>) argObj);
        
        return (Conjunto<T>) objSet;
    }
    
    public Conjunto<T> diferencia(Conjunto<T> argObj){
        return null;
    }
    
    public boolean agregar(T argE){
        
        boolean bandera = obj.add(argE);
        return bandera;
    }
    
    
    @Override
    public String toString(){
        return obj.toString();
    }
}
