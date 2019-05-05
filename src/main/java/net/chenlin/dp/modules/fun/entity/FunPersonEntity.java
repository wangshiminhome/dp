package net.chenlin.dp.modules.fun.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class FunPersonEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 人员id
	 */
	private Integer personId;
	
	/**
	 * 人员姓名
	 */
	private String personName;
	
	/**
	 * 人员描述
	 */
	private String personDescription;
	
	/**
	 * 组id
	 */
	private Integer groupId;
	
    /**
     * FunPersonEntity constructor
     */
	public FunPersonEntity() {
		super();
	}

    /**
     * setter for personId
     * @param personId
     */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

    /**
     * getter for personId
     */
	public Integer getPersonId() {
		return personId;
	}

    /**
     * setter for personName
     * @param personName
     */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

    /**
     * getter for personName
     */
	public String getPersonName() {
		return personName;
	}

    /**
     * setter for personDescription
     * @param personDescription
     */
	public void setPersonDescription(String personDescription) {
		this.personDescription = personDescription;
	}

    /**
     * getter for personDescription
     */
	public String getPersonDescription() {
		return personDescription;
	}

    /**
     * setter for groupId
     * @param groupId
     */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

    /**
     * getter for groupId
     */
	public Integer getGroupId() {
		return groupId;
	}

    /**
     * FunPersonEntity.toString()
     */
    @Override
    public String toString() {
        return "FunPersonEntity{" +
               "personId='" + personId + '\'' +
               ", personName='" + personName + '\'' +
               ", personDescription='" + personDescription + '\'' +
               ", groupId='" + groupId + '\'' +
               '}';
    }

}
