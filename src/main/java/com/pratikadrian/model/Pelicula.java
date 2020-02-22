package com.pratikadrian.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pelicula {

    @XmlElement(name = "IDFILM", required = true)
    protected String idfilm;
    @XmlElement(name = "PRIORITAT", required = true)
    protected String prioritat;
    @XmlElement(name = "TITOL", required = true)
    protected String titol;
    @XmlElement(name = "SITUACIO", required = true)
    protected String situacio;
    @XmlElement(name = "ANY", required = true)
    protected String any;
    @XmlElement(name = "CARTELL", required = true)
    protected String cartell;
    @XmlElement(name = "ORIGINAL", required = true)
    protected String original;
    @XmlElement(name = "DIRECCIO", required = true)
    protected String direccio;
    @XmlElement(name = "INTERPRETS", required = true)
    protected String interprets;
    @XmlElement(name = "SINOPSI", required = true)
    protected String sinopsi;
    @XmlElement(name = "VERSIO", required = true)
    protected String versio;
    @XmlElement(name = "IDIOMA_x0020_ORIGINAL", required = true)
    protected String idiomax0020ORIGINAL;
    @XmlElement(name = "QUALIFICACIO", required = true)
    protected String qualificacio;
    @XmlElement(name = "TRAILER", required = true)
    protected String trailer;
    @XmlElement(name = "WEB", required = true)
    protected String web;
    @XmlElement(name = "ESTRENA", required = true)
    protected String estrena;

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
     * Obtiene el valor de la propiedad prioritat.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPRIORITAT() {
        return prioritat;
    }

    /**
     * Define el valor de la propiedad prioritat.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPRIORITAT(String value) {
        this.prioritat = value;
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
     * Obtiene el valor de la propiedad situacio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSITUACIO() {
        return situacio;
    }

    /**
     * Define el valor de la propiedad situacio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSITUACIO(String value) {
        this.situacio = value;
    }

    /**
     * Obtiene el valor de la propiedad any.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getANY() {
        return any;
    }

    /**
     * Define el valor de la propiedad any.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setANY(String value) {
        this.any = value;
    }

    /**
     * Obtiene el valor de la propiedad cartell.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCARTELL() {
        return cartell;
    }

    /**
     * Define el valor de la propiedad cartell.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCARTELL(String value) {
        this.cartell = value;
    }

    /**
     * Obtiene el valor de la propiedad original.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getORIGINAL() {
        return original;
    }

    /**
     * Define el valor de la propiedad original.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setORIGINAL(String value) {
        this.original = value;
    }

    /**
     * Obtiene el valor de la propiedad direccio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDIRECCIO() {
        return direccio;
    }

    /**
     * Define el valor de la propiedad direccio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDIRECCIO(String value) {
        this.direccio = value;
    }

    /**
     * Obtiene el valor de la propiedad interprets.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getINTERPRETS() {
        return interprets;
    }

    /**
     * Define el valor de la propiedad interprets.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setINTERPRETS(String value) {
        this.interprets = value;
    }

    /**
     * Obtiene el valor de la propiedad sinopsi.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSINOPSI() {
        return sinopsi;
    }

    /**
     * Define el valor de la propiedad sinopsi.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSINOPSI(String value) {
        this.sinopsi = value;
    }

    /**
     * Obtiene el valor de la propiedad versio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVERSIO() {
        return versio;
    }

    /**
     * Define el valor de la propiedad versio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVERSIO(String value) {
        this.versio = value;
    }

    /**
     * Obtiene el valor de la propiedad idiomax0020ORIGINAL.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDIOMAX0020ORIGINAL() {
        return idiomax0020ORIGINAL;
    }

    /**
     * Define el valor de la propiedad idiomax0020ORIGINAL.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDIOMAX0020ORIGINAL(String value) {
        this.idiomax0020ORIGINAL = value;
    }

    /**
     * Obtiene el valor de la propiedad qualificacio.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQUALIFICACIO() {
        return qualificacio;
    }

    /**
     * Define el valor de la propiedad qualificacio.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQUALIFICACIO(String value) {
        this.qualificacio = value;
    }

    /**
     * Obtiene el valor de la propiedad trailer.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTRAILER() {
        return trailer;
    }

    /**
     * Define el valor de la propiedad trailer.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTRAILER(String value) {
        this.trailer = value;
    }

    /**
     * Obtiene el valor de la propiedad web.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWEB() {
        return web;
    }

    /**
     * Define el valor de la propiedad web.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWEB(String value) {
        this.web = value;
    }

    /**
     * Obtiene el valor de la propiedad estrena.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESTRENA() {
        return estrena;
    }

    /**
     * Define el valor de la propiedad estrena.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESTRENA(String value) {
        this.estrena = value;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idfilm='" + idfilm + '\'' +
                ", prioritat='" + prioritat + '\'' +
                ", titol='" + titol + '\'' +
                ", situacio='" + situacio + '\'' +
                ", any='" + any + '\'' +
                ", cartell='" + cartell + '\'' +
                ", original='" + original + '\'' +
                ", direccio='" + direccio + '\'' +
                ", interprets='" + interprets + '\'' +
                ", sinopsi='" + sinopsi + '\'' +
                ", versio='" + versio + '\'' +
                ", idiomax0020ORIGINAL='" + idiomax0020ORIGINAL + '\'' +
                ", qualificacio='" + qualificacio + '\'' +
                ", trailer='" + trailer + '\'' +
                ", web='" + web + '\'' +
                ", estrena='" + estrena + '\'' +
                '}';
    }
}
