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
