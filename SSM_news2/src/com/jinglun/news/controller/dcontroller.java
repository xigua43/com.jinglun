package com.jinglun.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.jinglun.news.entity.detail;
import com.jinglun.news.service.Dservice;

@Controller
public class dcontroller {
	@Autowired
	private Dservice dservice;
	@RequestMapping("/findall.do")
	public void findall(){
		List<detail> list = dservice.findall();
		for (detail detail : list) {
			System.out.println(detail.getTitle());
		}
	}
}
