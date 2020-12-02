package wsaula;

/*Responsavel por deixar o serviço disponivel*/
import javax.xml.ws.Endpoint;

/**
 *
 * @author fgabrielqr
 */
/*Classe principal que vai ser responsavel por publicar o serviço*/
public class PublishWS {

    public static void main(String[] args) {
        Conversor c = new Conversor();
        Endpoint.publish("http://localhost:8000/conversor", c);
        System.out.println("Server started");

    }

}
