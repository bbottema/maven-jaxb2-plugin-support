//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.20 at 10:09:09 PM CET 
//


package jaxb_version;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CoinGameRecipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoinGameRecipient"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="type" type="{http://bird.kartaca.com/xmlschema/admin/delivery}RecipientType" default="USER_ID" /&gt;
 *       &lt;attribute name="packageId" type="{http://bird.kartaca.com/xmlschema/admin/delivery}IntegerIdentifier" /&gt;
 *       &lt;attribute name="ttl" type="{http://bird.kartaca.com/xmlschema/admin/delivery}Ttl" default="7776000" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoinGameRecipient", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery", propOrder = {
    "value"
})
public class CoinGameRecipientDto {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
    protected RecipientType type;
    @XmlAttribute(name = "packageId", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
    protected Long packageId;
    @XmlAttribute(name = "ttl", namespace = "http://bird.kartaca.com/xmlschema/admin/delivery")
    protected Integer ttl;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getType() {
        if (type == null) {
            return RecipientType.USER_ID;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setType(RecipientType value) {
        this.type = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageId(Long value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTtl() {
        if (ttl == null) {
            return  7776000;
        } else {
            return ttl;
        }
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTtl(Integer value) {
        this.ttl = value;
    }

}