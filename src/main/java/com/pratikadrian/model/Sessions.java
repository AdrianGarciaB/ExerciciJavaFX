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

