package com.jinglun.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.jinglun.news.dao.detailMapper;
import com.jinglun.news.entity.detail;

@Service
public class Dservice {
	@Autowired
	private detailMapper detailMapper;
	public List<detail> findall(){
		return detailMapper.selectByExample(null);
	}
}	
