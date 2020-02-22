//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.22 a las 12:31:07 AM CET 
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
    "cicle"
})
public class Cicles {

    @XmlElement(name = "CICLE")
    protected List<Cicle> cicle;
    @XmlAttribute(name = "generated")
    protected String generated;

    /**
     * Gets the value of the cicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCICLE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cicle }
     * 
     * 
     */
    public List<Cicle> getCICLE() {
        if (cicle == null) {
            cicle = new ArrayList<Cicle>();
        }
        return this.cicle;
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
        return "Cicles{" +
                "cicle=" + cicle +
                ", generated='" + generated + '\'' +
                '}';
    }
}

@XmlAccessorType(XmlAccessType.FIELD)
class Cicle {

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
