
package wsaula;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsaula package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DolarToReal_QNAME = new QName("http://wsaula/", "dolarToReal");
    private final static QName _DolarToRealResponse_QNAME = new QName("http://wsaula/", "dolarToRealResponse");
    private final static QName _EuroToReal_QNAME = new QName("http://wsaula/", "euroToReal");
    private final static QName _EuroToRealResponse_QNAME = new QName("http://wsaula/", "euroToRealResponse");
    private final static QName _PesoargentinoToReal_QNAME = new QName("http://wsaula/", "pesoargentinoToReal");
    private final static QName _PesoargentinoToRealResponse_QNAME = new QName("http://wsaula/", "pesoargentinoToRealResponse");
    private final static QName _RealToDolar_QNAME = new QName("http://wsaula/", "realToDolar");
    private final static QName _RealToDolarResponse_QNAME = new QName("http://wsaula/", "realToDolarResponse");
    private final static QName _RealToEuro_QNAME = new QName("http://wsaula/", "realToEuro");
    private final static QName _RealToEuroResponse_QNAME = new QName("http://wsaula/", "realToEuroResponse");
    private final static QName _RealToPesoArgentino_QNAME = new QName("http://wsaula/", "realToPesoArgentino");
    private final static QName _RealToPesoArgentinoResponse_QNAME = new QName("http://wsaula/", "realToPesoArgentinoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsaula
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarToReal }
     * 
     */
    public DolarToReal createDolarToReal() {
        return new DolarToReal();
    }

    /**
     * Create an instance of {@link DolarToRealResponse }
     * 
     */
    public DolarToRealResponse createDolarToRealResponse() {
        return new DolarToRealResponse();
    }

    /**
     * Create an instance of {@link EuroToReal }
     * 
     */
    public EuroToReal createEuroToReal() {
        return new EuroToReal();
    }

    /**
     * Create an instance of {@link EuroToRealResponse }
     * 
     */
    public EuroToRealResponse createEuroToRealResponse() {
        return new EuroToRealResponse();
    }

    /**
     * Create an instance of {@link PesoargentinoToReal }
     * 
     */
    public PesoargentinoToReal createPesoargentinoToReal() {
        return new PesoargentinoToReal();
    }

    /**
     * Create an instance of {@link PesoargentinoToRealResponse }
     * 
     */
    public PesoargentinoToRealResponse createPesoargentinoToRealResponse() {
        return new PesoargentinoToRealResponse();
    }

    /**
     * Create an instance of {@link RealToDolar }
     * 
     */
    public RealToDolar createRealToDolar() {
        return new RealToDolar();
    }

    /**
     * Create an instance of {@link RealToDolarResponse }
     * 
     */
    public RealToDolarResponse createRealToDolarResponse() {
        return new RealToDolarResponse();
    }

    /**
     * Create an instance of {@link RealToEuro }
     * 
     */
    public RealToEuro createRealToEuro() {
        return new RealToEuro();
    }

    /**
     * Create an instance of {@link RealToEuroResponse }
     * 
     */
    public RealToEuroResponse createRealToEuroResponse() {
        return new RealToEuroResponse();
    }

    /**
     * Create an instance of {@link RealToPesoArgentino }
     * 
     */
    public RealToPesoArgentino createRealToPesoArgentino() {
        return new RealToPesoArgentino();
    }

    /**
     * Create an instance of {@link RealToPesoArgentinoResponse }
     * 
     */
    public RealToPesoArgentinoResponse createRealToPesoArgentinoResponse() {
        return new RealToPesoArgentinoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "dolarToReal")
    public JAXBElement<DolarToReal> createDolarToReal(DolarToReal value) {
        return new JAXBElement<DolarToReal>(_DolarToReal_QNAME, DolarToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "dolarToRealResponse")
    public JAXBElement<DolarToRealResponse> createDolarToRealResponse(DolarToRealResponse value) {
        return new JAXBElement<DolarToRealResponse>(_DolarToRealResponse_QNAME, DolarToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "euroToReal")
    public JAXBElement<EuroToReal> createEuroToReal(EuroToReal value) {
        return new JAXBElement<EuroToReal>(_EuroToReal_QNAME, EuroToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "euroToRealResponse")
    public JAXBElement<EuroToRealResponse> createEuroToRealResponse(EuroToRealResponse value) {
        return new JAXBElement<EuroToRealResponse>(_EuroToRealResponse_QNAME, EuroToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoargentinoToReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "pesoargentinoToReal")
    public JAXBElement<PesoargentinoToReal> createPesoargentinoToReal(PesoargentinoToReal value) {
        return new JAXBElement<PesoargentinoToReal>(_PesoargentinoToReal_QNAME, PesoargentinoToReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoargentinoToRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "pesoargentinoToRealResponse")
    public JAXBElement<PesoargentinoToRealResponse> createPesoargentinoToRealResponse(PesoargentinoToRealResponse value) {
        return new JAXBElement<PesoargentinoToRealResponse>(_PesoargentinoToRealResponse_QNAME, PesoargentinoToRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToDolar")
    public JAXBElement<RealToDolar> createRealToDolar(RealToDolar value) {
        return new JAXBElement<RealToDolar>(_RealToDolar_QNAME, RealToDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToDolarResponse")
    public JAXBElement<RealToDolarResponse> createRealToDolarResponse(RealToDolarResponse value) {
        return new JAXBElement<RealToDolarResponse>(_RealToDolarResponse_QNAME, RealToDolarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToEuro")
    public JAXBElement<RealToEuro> createRealToEuro(RealToEuro value) {
        return new JAXBElement<RealToEuro>(_RealToEuro_QNAME, RealToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToEuroResponse")
    public JAXBElement<RealToEuroResponse> createRealToEuroResponse(RealToEuroResponse value) {
        return new JAXBElement<RealToEuroResponse>(_RealToEuroResponse_QNAME, RealToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToPesoArgentino }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToPesoArgentino")
    public JAXBElement<RealToPesoArgentino> createRealToPesoArgentino(RealToPesoArgentino value) {
        return new JAXBElement<RealToPesoArgentino>(_RealToPesoArgentino_QNAME, RealToPesoArgentino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToPesoArgentinoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToPesoArgentinoResponse")
    public JAXBElement<RealToPesoArgentinoResponse> createRealToPesoArgentinoResponse(RealToPesoArgentinoResponse value) {
        return new JAXBElement<RealToPesoArgentinoResponse>(_RealToPesoArgentinoResponse_QNAME, RealToPesoArgentinoResponse.class, null, value);
    }

}
