package cola_banco;

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
    
}
