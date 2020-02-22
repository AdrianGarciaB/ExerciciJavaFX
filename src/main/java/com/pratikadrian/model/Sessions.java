//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.22 a las 12:42:20 AM CET 
//


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
    "sessions"
})
public class Sessions {

    @XmlElement(name = "SESSIONS")
    protected List<Sessio> sessions;
    @XmlAttribute(name = "generated")
    protected String generated;

    /**
     * Gets the value of the sessions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSESSIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sessio }
     * 
     * 
     */
    public List<Sessio> getSESSIONS() {
        if (sessions == null) {
            sessions = new ArrayList<Sessio>();
        }
        return this.sessions;
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

    @Override
    public String toString() {
        return "Sessions{" +
                "sessions=" + sessions +
                ", generated='" + generated + '\'' +
                '}';
    }
}


@XmlAccessorType(XmlAccessType.FIELD)
class Sessio {

    @XmlElement(name = "IDFILM", required = true)
    protected String idfilm;
    @XmlElement(name = "ses_id", required = true)
    protected String sesId;
    @XmlElement(name = "CINEID", required = true)
    protected String cineid;
    @XmlElement(name = "TITOL", required = true)
    protected String titol;
    @XmlElement(name = "ses_data", required = true)
    protected String sesData;
    @XmlElement(name = "CINENOM", required = true)
    protected String cinenom;
    @XmlElement(name = "LOCALITAT", required = true)
    protected String localitat;
    @XmlElement(name = "COMARCA", required = true)
    protected String comarca;
    @XmlElement(name = "CICLEID", required = true)
    protected String cicleid;
    @XmlElement(required = true)
    protected String ver;
    @XmlElement(required = true)
    protected String preu;
    @XmlElement(name = "ORDRESESSIO", required = true)
    protected String ordresessio;

    /**
     * Obtiene el valor de la propiedad idfilm.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDFILM() {
        return idfilm;
    }

    /**
     * Define el valor de la propiedad idfilm.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDFILM(String value) {
        this.idfilm = value;
    }

    /**
     * Obtiene el valor de la propiedad sesId.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSesId() {
        return sesId;
    }

    /**
     * Define el valor de la propiedad sesId.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSesId(String value) {
        this.sesId = value;
    }

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
     * Obtiene el valor de la propiedad titol.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTITOL() {
        return titol;
    }

    /**
     * Define el valor de la propiedad titol.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTITOL(String value) {
        this.titol = value;
    }

    /**
     * Obtiene el valor de la propiedad sesData.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSesData() {
        return sesData;
    }

    /**
     * Define el valor de la propiedad sesData.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSesData(String value) {
        this.sesData = value;
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
     * Obtiene el valor de la propiedad cicleid.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCICLEID() {
        return cicleid;
    }

    /**
     * Define el valor de la propiedad cicleid.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCICLEID(String value) {
        this.cicleid = value;
    }

    /**
     * Obtiene el valor de la propiedad ver.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVer() {
        return ver;
    }

    /**
     * Define el valor de la propiedad ver.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Obtiene el valor de la propiedad preu.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreu() {
        return preu;
    }

    /**
     * Define el valor de la propiedad preu.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreu(String value) {
        this.preu = value;
    }

    /**
     * Obtiene el valor de la propiedad ordresessio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORDRESESSIO() {
        return ordresessio;
    }

    /**
     * Define el valor de la propiedad ordresessio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORDRESESSIO(String value) {
        this.ordresessio = value;
    }

    @Override
    public String toString() {
        return "Sessio{" +
                "idfilm='" + idfilm + '\'' +
                ", sesId='" + sesId + '\'' +
                ", cineid='" + cineid + '\'' +
                ", titol='" + titol + '\'' +
                ", sesData='" + sesData + '\'' +
                ", cinenom='" + cinenom + '\'' +
                ", localitat='" + localitat + '\'' +
                ", comarca='" + comarca + '\'' +
                ", cicleid='" + cicleid + '\'' +
                ", ver='" + ver + '\'' +
                ", preu='" + preu + '\'' +
                ", ordresessio='" + ordresessio + '\'' +
                '}';
    }
}
