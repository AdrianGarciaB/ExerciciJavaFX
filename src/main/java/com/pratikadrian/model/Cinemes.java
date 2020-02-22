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


