package org.one.gene.domain.entity;
// Generated Dec 14, 2014 1:21:34 AM by One Data Tools 1.0.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * PrimerProductOperation.
* 
 */
@Entity
@Table(name="primer_product_operation"
    , uniqueConstraints = @UniqueConstraint(columnNames={"primer_product_id", "type", "back_times"}) 
)
public class PrimerProductOperation  implements java.io.Serializable {

    /**
    * 唯一标识id.
    */
    private Long id;
    /**
    * 引物生产数据ID.
    */
    private Integer primerProductId;
    /**
    * 类型.
    */
    private String type;
    /**
    * 类型描述.
    */
    private String typeDesc;
    /**
    * 工艺循环次数.
    */
    private Byte backTimes;
    /**
    * 用户代码.
    */
    private String userCode;
    /**
    * 用户名称.
    */
    private String userName;
    /**
    * 操作时间.
    */
    private Date createTime;
    /**
    * 失败原因.
    */
    private String failReason;

    public PrimerProductOperation() {
    }

	
    public PrimerProductOperation(Integer primerProductId, String type, String typeDesc, String userCode, String userName, Date createTime, String failReason) {
        this.primerProductId = primerProductId;
        this.type = type;
        this.typeDesc = typeDesc;
        this.userCode = userCode;
        this.userName = userName;
        this.createTime = createTime;
        this.failReason = failReason;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true)
    public Long getId() {
    return this.id;
    }

    public void setId(Long id) {
    this.id = id;
    }
    
    @Column(name="primer_product_id")
    public Integer getPrimerProductId() {
    return this.primerProductId;
    }

    public void setPrimerProductId(Integer primerProductId) {
    this.primerProductId = primerProductId;
    }
    
    @Column(name="type", length=31)
    public String getType() {
    return this.type;
    }

    public void setType(String type) {
    this.type = type;
    }
    
    @Column(name="type_desc", length=63)
    public String getTypeDesc() {
    return this.typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
    this.typeDesc = typeDesc;
    }
    
    @Column(name="back_times")
    public Byte getBackTimes() {
    return this.backTimes;
    }

    public void setBackTimes(Byte backTimes) {
    this.backTimes = backTimes;
    }
    
    @Column(name="user_code", length=15)
    public String getUserCode() {
    return this.userCode;
    }

    public void setUserCode(String userCode) {
    this.userCode = userCode;
    }
    
    @Column(name="user_name", length=31)
    public String getUserName() {
    return this.userName;
    }

    public void setUserName(String userName) {
    this.userName = userName;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", length=19)
    public Date getCreateTime() {
    return this.createTime;
    }

    public void setCreateTime(Date createTime) {
    this.createTime = createTime;
    }
    
    @Column(name="fail_reason", length=511)
    public String getFailReason() {
    return this.failReason;
    }

    public void setFailReason(String failReason) {
    this.failReason = failReason;
    }


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}


