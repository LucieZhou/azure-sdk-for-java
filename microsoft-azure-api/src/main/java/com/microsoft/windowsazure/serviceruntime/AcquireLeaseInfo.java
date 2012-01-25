/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.14 at 04:34:45 PM PST 
//


package com.microsoft.windowsazure.serviceruntime;

import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AcquireLeaseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcquireLeaseInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Incarnation" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="Status" type="{}CurrentStatusEnum"/>
 *         &lt;element name="StatusDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireLeaseInfo", propOrder = {

})
class AcquireLeaseInfo {

    @XmlElement(name = "Incarnation", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger incarnation;
    @XmlElement(name = "Status", required = true)
    protected CurrentStatusEnum status;
    @XmlElement(name = "StatusDetail", required = true)
    protected String statusDetail;
    @XmlElement(name = "Expiration", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expiration;

    /**
     * Gets the value of the incarnation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncarnation() {
        return incarnation;
    }

    /**
     * Sets the value of the incarnation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncarnation(BigInteger value) {
        this.incarnation = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentStatusEnum }
     *     
     */
    public CurrentStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentStatusEnum }
     *     
     */
    public void setStatus(CurrentStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDetail(String value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(Calendar value) {
        this.expiration = value;
    }

}