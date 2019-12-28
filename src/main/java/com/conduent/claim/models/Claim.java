//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.27 at 04:52:29 PM IST 
//


package com.conduent.claim.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claimType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pricingCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalReimbAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimLines">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="claimLine" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lineReimbAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pricingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcn",
    "claimType",
    "memberID",
    "providerID",
    "pricingCode",
    "totalReimbAmount",
    "pricingType",
    "claimLines"
})
@XmlRootElement(name = "claim")
public class Claim {

    @XmlElement(required = true)
    protected String tcn;
    @XmlElement(required = true)
    protected String claimType;
    @XmlElement(required = true)
    protected String memberID;
    @XmlElement(required = true)
    protected String providerID;
    @XmlElement(required = true)
    protected String pricingCode;
    protected String totalReimbAmount;
    protected String pricingType;
    @XmlElement(required = true)
    protected Claim.ClaimLines claimLines;

    /**
     * Gets the value of the tcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcn() {
        return tcn;
    }

    /**
     * Sets the value of the tcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcn(String value) {
        this.tcn = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the memberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberID() {
        return memberID;
    }

    /**
     * Sets the value of the memberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberID(String value) {
        this.memberID = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the pricingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingCode() {
        return pricingCode;
    }

    /**
     * Sets the value of the pricingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingCode(String value) {
        this.pricingCode = value;
    }

    /**
     * Gets the value of the totalReimbAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalReimbAmount() {
        return totalReimbAmount;
    }

    /**
     * Sets the value of the totalReimbAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalReimbAmount(String value) {
        this.totalReimbAmount = value;
    }

    /**
     * Gets the value of the pricingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingType(String value) {
        this.pricingType = value;
    }

    /**
     * Gets the value of the claimLines property.
     * 
     * @return
     *     possible object is
     *     {@link Claim.ClaimLines }
     *     
     */
    public Claim.ClaimLines getClaimLines() {
        return claimLines;
    }

    /**
     * Sets the value of the claimLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim.ClaimLines }
     *     
     */
    public void setClaimLines(Claim.ClaimLines value) {
        this.claimLines = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="claimLine" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lineReimbAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pricingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "claimLine"
    })
    public static class ClaimLines {

        @XmlElement(required = true)
        protected List<Claim.ClaimLines.ClaimLine> claimLine;

        /**
         * Gets the value of the claimLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claimLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaimLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Claim.ClaimLines.ClaimLine }
         * 
         * 
         */
        public List<Claim.ClaimLines.ClaimLine> getClaimLine() {
            if (claimLine == null) {
                claimLine = new ArrayList<Claim.ClaimLines.ClaimLine>();
            }
            return this.claimLine;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lineReimbAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pricingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lineNumber",
            "lineReimbAmount",
            "pricingType"
        })
        public static class ClaimLine {

            protected String lineNumber;
            protected String lineReimbAmount;
            protected String pricingType;

            /**
             * Gets the value of the lineNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineNumber() {
                return lineNumber;
            }

            /**
             * Sets the value of the lineNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineNumber(String value) {
                this.lineNumber = value;
            }

            /**
             * Gets the value of the lineReimbAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineReimbAmount() {
                return lineReimbAmount;
            }

            /**
             * Sets the value of the lineReimbAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineReimbAmount(String value) {
                this.lineReimbAmount = value;
            }

            /**
             * Gets the value of the pricingType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPricingType() {
                return pricingType;
            }

            /**
             * Sets the value of the pricingType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPricingType(String value) {
                this.pricingType = value;
            }

        }

    }

}
