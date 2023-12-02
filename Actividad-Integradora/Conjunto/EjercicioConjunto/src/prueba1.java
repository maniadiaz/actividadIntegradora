
import Backend.Conjunto;
import java.util.HashSet;
import java.util.Set;


public class prueba1 {
    
    
    public static void main(String[] args) {
        
        Conjunto argObj = new Conjunto();
        
        argObj.agregar(1);
        argObj.agregar(2);
        argObj.agregar(3);
        
        Conjunto obj = new Conjunto("A");
        
        
        
        Conjunto argObj2 = (Set<Integer>) argObj.union(obj);
        
        System.out.println(argObj2.toArray());
        
        
        
        
       
    }
}
