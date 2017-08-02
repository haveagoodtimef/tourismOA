package com.fhz.entity;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable{
		private static final long serialVersionUID = 7623309444016996833L;
		/**表示项目id对应表中的物理主键*/
		private Integer id;
		/**项目名称(例如 纽约马拉松)*/
		private String name;
		/**项目编码(类似产品的序列号,具备业务特征)*/
		private String code;
		/**项目开始时间*/
		private Date beginDate;
		/**项目结束时间*/
		private Date endDate;
		/**项目的有效性*/
		private Integer valid;
		/**项目备注*/
		private String note;
		/**项目的创建时间*/
		private Date createdTime;
		/**项目的修改时间*/
		private Date modifiedTime;
		/**项目的创建人*/
		private String createUser;
		/**项目的修改*/
	    private String modifiedUser;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public Date getBeginDate() {
			return beginDate;
		}
		public void setBeginDate(Date beginDate) {
			this.beginDate = beginDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public Integer getValid() {
			return valid;
		}
		public void setValid(Integer valid) {
			this.valid = valid;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getCreatedTime() {
			return createdTime;
		}
		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		public Date getModifiedTime() {
			return modifiedTime;
		}
		public void setModifiedTime(Date modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
		public String getCreateUser() {
			return createUser;
		}
		public void setCreateUser(String createdUser) {
			this.createUser = createdUser;
		}
		public String getModifiedUser() {
			return modifiedUser;
		}
		public void setModifiedUser(String modifiedUser) {
			this.modifiedUser = modifiedUser;
		}
		

}
