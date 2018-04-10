package com.trusdata.integrate.group.service;

import java.util.List;

import com.trusdata.integrate.group.bean.GroupMappingListBean;
import com.trusdata.integrate.group.bean.GroupSearchBean;
import com.trusdata.integrate.group.bean.PairGroup;
import com.trusdata.integrate.group.bean.PairGroupSearchBean;

public interface GroupService {

	public List<GroupMappingListBean> selectAll(GroupSearchBean queryBean);

	public List<PairGroup> selectAll(PairGroupSearchBean queryBean);
}
