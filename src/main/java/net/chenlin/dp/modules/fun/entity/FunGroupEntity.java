package net.chenlin.dp.modules.fun.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class FunGroupEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	private Long groupId;
	
	/**
	 * 分组名称
	 */
	private String groupName;
	
	/**
	 * 分组状态
	 */
	private String groupState;
	
	/**
	 * 创建时间
	 */
	private Date addTime;
	
	/**
	 * 拥有人id
	 */
	private Long userId;

	//创建人姓名
	private String username;
	
    /**
     * FunGroupEntity constructor
     */
	public FunGroupEntity() {
		super();
	}

    /**
     * setter for groupId
     * @param groupId
     */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

    /**
     * getter for groupId
     */
	public Long getGroupId() {
		return groupId;
	}

    /**
     * setter for groupName
     * @param groupName
     */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

    /**
     * getter for groupName
     */
	public String getGroupName() {
		return groupName;
	}

    /**
     * setter for groupState
     * @param groupState
     */
	public void setGroupState(String groupState) {
		this.groupState = groupState;
	}

    /**
     * getter for groupState
     */
	public String getGroupState() {
		return groupState;
	}

    /**
     * setter for addTime
     * @param addTime
     */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

    /**
     * getter for addTime
     */
	public Date getAddTime() {
		return addTime;
	}

    /**
     * setter for userId
     * @param userId
     */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

    /**
     * getter for userId
     */
	public Long getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
     * FunGroupEntity.toString()
     */
    @Override
    public String toString() {
        return "FunGroupEntity{" +
               "groupId='" + groupId + '\'' +
               ", groupName='" + groupName + '\'' +
               ", groupState='" + groupState + '\'' +
               ", addTime='" + addTime + '\'' +
               ", userId='" + userId + '\'' +
               '}';
    }

}
