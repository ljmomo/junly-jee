package com.junly.mapper;

import com.junly.bean.Menu;

public interface MenuMapper  extends BaseMapper<Long,Menu> {
	public void updateLeft(Long right);
	public void updateRight(Long right);
}
