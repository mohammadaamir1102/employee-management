package com.employee.dto;

import java.util.List;

public class FindByIdInDTO {

	private List<Long> ids;

	private FindByIdInDTO() {
		super();
	}

	private FindByIdInDTO(List<Long> ids) {
		super();
		this.ids = ids;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "FindByIdInDTO [ids=" + ids + "]";
	}

}
