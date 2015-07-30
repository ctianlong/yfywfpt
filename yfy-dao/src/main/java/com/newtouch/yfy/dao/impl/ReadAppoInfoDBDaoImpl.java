package com.newtouch.yfy.dao.impl;



import org.springframework.stereotype.Repository;

import com.newtouch.lion.dao.impl.BaseDaoImpl;
import com.newtouch.yfy.api.AppoInfo;
import com.newtouch.yfy.dao.ReadAppoInfoDBDao;

@Repository("readAppoInfoDBDaoImpl")
public class ReadAppoInfoDBDaoImpl extends BaseDaoImpl<AppoInfo, String>
		implements ReadAppoInfoDBDao {

}
