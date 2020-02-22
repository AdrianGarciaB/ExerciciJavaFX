package com.pratikadrian.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datarootType", propOrder = {
    "cinemes"
})
public class Cinemes {

    @XmlElement(name = "CINEMES")
    protected List<Cinema> cinemes;
    @XmlAttribute(name = "generated")
    protected String generated;

    /**
     * Gets the value of the cinemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cinemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCINEMES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cinema }
     * 
     * 
     */
    public List<Cinema> getCINEMES() {
        if (cinemes == null) {
            cinemes = new ArrayList<Cinema>();
        }
        return this.cinemes;
    }

    /**
     * Obtiene el valor de la propiedad generated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerated() {
        return generated;
    }

    /**
     * Define el valor de la propiedad generated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerated(String value) {
        this.generated = value;
    }

}

@XmlAccessorType(XmlAccessType.FIELD)
class Cinema {

    @XmlElement(name = "CINEID", required = true)
    protected String cineid;
    @XmlElement(name = "CINENOM", required = true)
    protected String cinenom;
    @XmlElement(name = "CINEADRECA", required = true)
    protected String cineadreca;
    @XmlElement(name = "LOCALITAT", required = true)
    protected String localitat;
    @XmlElement(name = "COMARCA", required = true)
    protected String comarca;
    @XmlElement(name = "PROVINCIA", required = true)
    protected String provincia;

    /**
     * Obtiene el valor de la propiedad cineid.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCINEID() {
        return cineid;
    }

    /**
     * Define el valor de la propiedad cineid.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCINEID(String value) {
        this.cineid = value;
    }

    /**
     * Obtiene el valor de la propiedad cinenom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCINENOM() {
        return cinenom;
    }

    /**
     * Define el valor de la propiedad cinenom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCINENOM(String value) {
        this.cinenom = value;
    }

    /**
     * Obtiene el valor de la propiedad cineadreca.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCINEADRECA() {
        return cineadreca;
    }

    /**
     * Define el valor de la propiedad cineadreca.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCINEADRECA(String value) {
        this.cineadreca = value;
    }

    /**
     * Obtiene el valor de la propiedad localitat.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLOCALITAT() {
        return localitat;
    }

    /**
     * Define el valor de la propiedad localitat.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLOCALITAT(String value) {
        this.localitat = value;
    }

    /**
     * Obtiene el valor de la propiedad comarca.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOMARCA() {
        return comarca;
    }

    /**
     * Define el valor de la propiedad comarca.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOMARCA(String value) {
        this.comarca = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPROVINCIA() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPROVINCIA(String value) {
        this.provincia = value;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cineid='" + cineid + '\'' +
                ", cinenom='" + cinenom + '\'' +
                ", cineadreca='" + cineadreca + '\'' +
                ", localitat='" + localitat + '\'' +
                ", comarca='" + comarca + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
