package com.my.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @author JSF
 *
 */

@Entity
@Table(name="MP_APP_USERS")
public class MpAppUsers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name="USER_ID")
    //@GeneratedValue(strategy=GenerationType.AUTO)
	private String 	userId;
	
	@Column(name = "LOGIN_ID", nullable = false, length = 100)
	private String loginId;
	
	@Column(name = "USER_NAME", nullable = false, length = 100)
	private String userName;
	
	@Column(name = "DEPT_NAME", nullable = false, length = 100)
	private String deptName;
	
	@Column(name = "DEPT_ID", nullable = false, length = 100)
	private String deptId;
	
	@Column(name = "BIRTHDAY", nullable = false)
	private String birthday;
	
	@Column(name = "IDENTITY_CARD", nullable = false, length = 100)
	private String identityCard;
	
	@Column(name = "SEX", nullable = false, length = 100)
	private String sex;
	
	
	@Column(name = "JOB", nullable = false, length = 100)
	private String job;
	
	@Column(name = "POST", nullable = false, length = 100)
	private String post;
	
	@Column(name = "PASS_WORD", nullable = false, length = 100)
	private String passWord;
	
	@Column(name = "USER_LX", nullable = false, length = 100)
	private String userLx;
	
	/*@Column(name = "APP_ID", nullable = false, length = 100)
	private String appId;*/
	
	@Column(name = "DISPLAY_ORDER", nullable = false, length = 100)
	private String displayOrder;	

	@Column(name = "REMARK", nullable = false, length = 100)
	private String remark;	
	
	@Column(name = "R_CREATOR", nullable = false, length = 100)
	private String rCreator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "R_CREATIONDATE", nullable = false)
	private Date rCreationDate;
	
	@Column(name = "R_UPDATOR", nullable = false, length = 100)
	private String rUpdator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "R_UPDATIONDATE", nullable = false)
	private Date rUpdationDate;

	@Column(name = "R_VERTION", nullable = false, length = 100)
	private String rVertion;
	
	@Column(name = "R_ISLOCKED", nullable = false, length = 1)
	private String rIslocked;
	
	@Column(name = "R_ISVALID", nullable = false, length = 1)
	private String risvalid;
	
	@Column(name = "R_ISDELETE", nullable = false, length = 1)
	private String rIsdelete;
	
	@Column(name = "R_EXTENDFIELD", nullable = false, length = 500)
	private String rExtendfield;
	
	@Column(name = "E_MAIL", nullable = false, length = 100)
	private String eMail;

	@Column(name = "MOBILE_NUM", nullable = false, length = 100)
	private String mobileNum;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserLx() {
		return userLx;
	}

	public void setUserLx(String userLx) {
		this.userLx = userLx;
	}

	/*public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}*/

	public String getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getrCreator() {
		return rCreator;
	}

	public void setrCreator(String rCreator) {
		this.rCreator = rCreator;
	}

	public Date getrCreationDate() {
		return rCreationDate;
	}

	public void setrCreationDate(Date rCreationDate) {
		this.rCreationDate = rCreationDate;
	}

	public String getrUpdator() {
		return rUpdator;
	}

	public void setrUpdator(String rUpdator) {
		this.rUpdator = rUpdator;
	}

	public Date getrUpdationDate() {
		return rUpdationDate;
	}

	public void setrUpdationDate(Date rUpdationDate) {
		this.rUpdationDate = rUpdationDate;
	}

	public String getrVertion() {
		return rVertion;
	}

	public void setrVertion(String rVertion) {
		this.rVertion = rVertion;
	}

	public String getrIslocked() {
		return rIslocked;
	}

	public void setrIslocked(String rIslocked) {
		this.rIslocked = rIslocked;
	}

	public String getRisvalid() {
		return risvalid;
	}

	public void setRisvalid(String risvalid) {
		this.risvalid = risvalid;
	}

	public String getrIsdelete() {
		return rIsdelete;
	}

	public void setrIsdelete(String rIsdelete) {
		this.rIsdelete = rIsdelete;
	}

	public String getrExtendfield() {
		return rExtendfield;
	}

	public void setrExtendfield(String rExtendfield) {
		this.rExtendfield = rExtendfield;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
}
