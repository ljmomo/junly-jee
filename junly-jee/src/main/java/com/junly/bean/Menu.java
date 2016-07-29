package com.junly.bean;

public class Menu {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public Long getRightId() {
		return rightId;
	}

	public void setRightId(Long rightId) {
		this.rightId = rightId;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getLeftId() {
		return leftId;
	}

	public void setLeftId(Long leftId) {
		this.leftId = leftId;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", leftId=" + leftId + ", rightId=" + rightId + ", level=" + level
				+ "]";
	}

	private Long id;
	private String name;
	private Long leftId;
	private Long rightId;
	private Long level;

}
