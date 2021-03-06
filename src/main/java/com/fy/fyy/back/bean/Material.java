package com.fy.fyy.back.bean;

import java.sql.Date;

public class Material extends BaseBean {

	private String name;
	private Category category;
	private Integer categoryId;
	private Unit unit;
	private Integer unitId;
	private String note;
	private Date createDate;
	private Date updateDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
		setCategory(CodeBean.get(Category.class, categoryId));
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
		setUnit(CodeBean.get(Unit.class, unitId));
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public static class Category extends CodeBean {

		public static final Category outer = new Category(1, "外包装");
		public static final Category inner = new Category(2, "内包装");
		public static final Category desiccant = new Category(3, "干燥剂");
		public static final Category semiprd = new Category(4, "半成品");
		public static final Category prd = new Category(5, "成品");

		private Category(int id, String name) {
			super(id, name);
		}
	}

	public static class Unit extends CodeBean {

		public static final Unit per = new Unit(1, "个");
		public static final Unit kg = new Unit(2, "公斤");
		public static final Unit pkg = new Unit(3, "箱");

		private Unit(int id, String name) {
			super(id, name);
		}
	}
}
