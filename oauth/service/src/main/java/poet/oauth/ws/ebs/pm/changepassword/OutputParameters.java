//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.22 时间 10:30:52 PM CST 
//


package poet.oauth.ws.ebs.pm.changepassword;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X_RETURN_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="X_RETURN_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xreturnstatus",
    "xreturnmessage"
})
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "X_RETURN_STATUS", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xreturnstatus;
    @XmlElementRef(name = "X_RETURN_MESSAGE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_pm_webservice_pkg/changepassword/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xreturnmessage;

    /**
     * 获取xreturnstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXRETURNSTATUS() {
        return xreturnstatus;
    }

    /**
     * 设置xreturnstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXRETURNSTATUS(JAXBElement<String> value) {
        this.xreturnstatus = value;
    }

    /**
     * 获取xreturnmessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXRETURNMESSAGE() {
        return xreturnmessage;
    }

    /**
     * 设置xreturnmessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXRETURNMESSAGE(JAXBElement<String> value) {
        this.xreturnmessage = value;
    }

}
