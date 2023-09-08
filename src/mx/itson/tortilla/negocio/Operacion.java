package mx.itson.tortilla.negocio;
/**
 * contiene metodos para trabajar con cadenas de texto
 * @author vagui Victor Rocha
 */


public class Operacion {
    
    /**
     * Separa una cadena de texto en donde encuentre el caracter guion medio
     * @param Oracion Es la oracion que sera separada en francciones
     * @return Array de String en cuto cada componente sera un fraccion de la cadena
     */
    
    public String[] separar(String Oracion){
        
        //hola a todos jajajajaja xD
        
        String [] resultado = Oracion.split("-");
        
        return resultado;
    }
    
}