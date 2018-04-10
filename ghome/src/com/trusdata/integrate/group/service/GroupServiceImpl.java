package com.trusdata.integrate.group.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trusdata.common.util.PageUtil;
import com.trusdata.integrate.group.bean.GroupMappingListBean;
import com.trusdata.integrate.group.bean.GroupSearchBean;
import com.trusdata.integrate.group.bean.PairGroup;
import com.trusdata.integrate.group.bean.PairGroupSearchBean;
import com.trusdata.integrate.group.mapper.GroupMapper;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	GroupMapper connMapper;

	@Override
	public List<GroupMappingListBean> selectAll(GroupSearchBean queryBean) {

		// 查询数据总数
		int sumItems = connMapper.selectCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return connMapper.selectInfo(queryBean);
	}

	@Override
	public List<PairGroup> selectAll(PairGroupSearchBean queryBean) {

		// 查询数据总数
		int sumItems = connMapper.pairCount(queryBean);
		PageUtil.resetPageBean(queryBean, sumItems);
		// 查询所有信息
		return connMapper.pairInfo(queryBean);
	}
}
