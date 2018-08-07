package com.ownobj.aspect.entity;


import java.io.Serializable;

public class IdCardEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1286937414269846316L;
	/**
	 * t_ image_info
	 */
	private String id;//	主键		
	private String certiType;//	证件类型		
	private String certiNo;//	证件号码		
	private String imageType;//	影像件类别		
	private String userName;//	姓名		
	private String gender;//	性别	0女 1 男
	private String birthDate;//	生日		
	private String nation;//	民族		
	private String address;//	地址	
	private String signDepart;//	签发机关		
	private String validDate;//	有效日期		
	private String validStatus;//	是否有效	0无效 1有效
	private String createTime;//	创建时间		
	private String updateTime;//	更新时间	
	public IdCardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IdCardEntity(String id, String certiType, String certiNo, String imageType, String userName, String gender,
			String birthDate, String nation, String address, String signDepart, String validDate, String validStatus,
			String createTime, String updateTime) {
		super();
		this.id = id;
		this.certiType = certiType;
		this.certiNo = certiNo;
		this.imageType = imageType;
		this.userName = userName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.nation = nation;
		this.address = address;
		this.signDepart = signDepart;
		this.validDate = validDate;
		this.validStatus = validStatus;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCertiType() {
		return certiType;
	}
	public void setCertiType(String certiType) {
		this.certiType = certiType;
	}
	public String getCertiNo() {
		return certiNo;
	}
	public void setCertiNo(String certiNo) {
		this.certiNo = certiNo;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSignDepart() {
		return signDepart;
	}
	public void setSignDepart(String signDepart) {
		this.signDepart = signDepart;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public String getValidStatus() {
		return validStatus;
	}
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	@Override
	public String toString() {
		return "IdCardEntity [id=" + id + ", certiType=" + certiType + ", certiNo=" + certiNo + ", imageType="
				+ imageType + ", userName=" + userName + ", gender=" + gender + ", birthDate=" + birthDate + ", nation="
				+ nation + ", address=" + address + ", signDepart=" + signDepart + ", validDate=" + validDate
				+ ", validStatus=" + validStatus + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
}

