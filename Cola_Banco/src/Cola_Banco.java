

public class Cola_Banco 
{
    int tamaño;
    int frente;
    int ultimo;
    public String[]COLA;
    public String[] COLA2;
    
    public Cola_Banco(int tamaño) 
                {
                    
                    this.tamaño = tamaño;
                    frente = ultimo = -1;
                    COLA = new String[tamaño];
                    COLA2 = new String[tamaño];
                }
                public boolean estaLlena()
                {
                    if (ultimo>=tamaño -1)
                        return true;
                    else return false;
                }

                public boolean estaVacia()
                {
                    if (frente==-1)
                        return true;
                    else return false;
                }
                
                public boolean encolar(String dato)
                {
                  if(!estaLlena())  
                  {
                      COLA[++ultimo]=dato;
                      if (ultimo==0)
                          frente=0;
                          return true;
                  }
                  return false;          
                }
                
                public boolean encolar2(String dato)
                {
                if(!estaLlena())  
                  {
                      COLA2[++ultimo]=dato;
                      if (ultimo==0)
                          frente=0;
                          return true;
                  }
                  return false;
                }
                                
                public String desencolar()      
                {
                String dato="";
                    if (!estaVacia())
                    {
                        dato = COLA[frente];                        
                        COLA[frente]="";
                        if (frente==ultimo)
                            frente = ultimo = -1;
                        else frente++;
                    }                    
                return dato;
                }        
                public String desencolar2()
                {
                    String dato="";
                    if (!estaVacia())
                    {
                        dato = COLA2[frente];                        
                        COLA2[frente]="";
                        if (frente==ultimo)
                            frente = ultimo = -1;
                        else frente++;
                    }                    
                return dato;
                }
    
}
