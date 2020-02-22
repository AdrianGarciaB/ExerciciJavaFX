package com.pratikadrian.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cicle {

    @XmlElement(name = "CICLEID", required = true)
    protected String cicleid;
    @XmlElement(name = "CICLENOM", required = true)
    protected String ciclenom;
    @XmlElement(name = "CICLEINFO", required = true)
    protected String cicleinfo;
    @XmlElement(name = "IMGCICLE", required = true)
    protected String imgcicle;
    @XmlElement(name = "WEB")
    protected String web;

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
     * Obtiene el valor de la propiedad ciclenom.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCICLENOM() {
        return ciclenom;
    }

    /**
     * Define el valor de la propiedad ciclenom.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCICLENOM(String value) {
        this.ciclenom = value;
    }

    /**
     * Obtiene el valor de la propiedad cicleinfo.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCICLEINFO() {
        return cicleinfo;
    }

    /**
     * Define el valor de la propiedad cicleinfo.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCICLEINFO(String value) {
        this.cicleinfo = value;
    }

    /**
     * Obtiene el valor de la propiedad imgcicle.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMGCICLE() {
        return imgcicle;
    }

    /**
     * Define el valor de la propiedad imgcicle.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMGCICLE(String value) {
        this.imgcicle = value;
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

    @Override
    public String toString() {
        return "Cicle{" +
                "cicleid='" + cicleid + '\'' +
                ", ciclenom='" + ciclenom + '\'' +
                ", cicleinfo='" + cicleinfo + '\'' +
                ", imgcicle='" + imgcicle + '\'' +
                ", web='" + web + '\'' +
                '}';
    }
}
