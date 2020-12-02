package wsaula;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author fgabrielqr
 */
@WebService
public class Conversor {
    
    /*Metodo para converter*/
    @WebMethod
    public  double realToDolar(double valor){
        double dolar = 5.43; 
        return valor/dolar;
    }
    
    /*Metodo para converter*/
    @WebMethod
    public  double dolarToReal(double valor){
        double real = 0.19; 
        return valor/real;
    }
    
    /*Metodo para converter*/
    @WebMethod
    public  double realToEuro(double valor){
        double euro = 6.34; 
        return valor/euro;
    }
    
    /*Metodo para converter*/
    @WebMethod
    public  double euroToReal(double valor){
        double real = 0.16; 
        return valor/real;
    }
    
    @WebMethod
    public  double realToPesoArgentino(double valor){
        double peso = 0.06; 
        return valor/peso;
    }
    
    /*Metodo para converter*/
    @WebMethod
    public  double pesoargentinoToReal(double valor){
        double real = 15.55; 
        return valor/real;
    }
}
