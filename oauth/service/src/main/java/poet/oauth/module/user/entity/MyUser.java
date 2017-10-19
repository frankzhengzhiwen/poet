package poet.oauth.module.user.entity;

import armor.orm.component.BaseEntity;
import javax.persistence.*;

@Table(name = "T_B_USER")
public class MyUser extends BaseEntity {
//    @Id
//    @Column(name = "ID")
//    @SequenceGenerator(name="",sequenceName="select sys_guid() from dual")
//    private String id;

//    @Column(name = "NAME")
    private String name;

//    @Column(name = "ID_CARD")
    private String idCard;

//    /**
//     * @return ID
//     */
//    public String getId() {
//        return id;
//    }
//
//    /**
//     * @param id
//     */
//    public void setId(String id) {
//        this.id = id;
//    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return ID_CARD
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}