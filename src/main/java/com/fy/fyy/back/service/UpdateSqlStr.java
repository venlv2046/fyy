package com.fy.fyy.back.service;

import com.fy.fyy.back.bean.BaseBean;


public interface UpdateSqlStr<T extends BaseBean> {

  public String get( T bean );
  
  
}
