//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170127.1453 
// See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.03 at 05:57:40 PM CEST 
//


package org.someothernamespace.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.somenamespace.c.CTestType;


/**
 * <p>Java class for BTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BTestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://somenamespace.org/c}CTestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BTestType", propOrder = {
    "b"
})
public class BTestType
    extends CTestType
{

    @XmlElement(required = true)
    protected String b;

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB(String value) {
        this.b = value;
    }

}