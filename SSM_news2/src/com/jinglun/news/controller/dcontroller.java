package com.jinglun.news.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jinglun.news.entity.detail;
import com.jinglun.news.service.Dservice;

@Controller
public class dcontroller {
	Gson G = new Gson();
	11
/*	Gson gson = new GsonBuilder()  
			  .setDateFormat("yyyy-MM-dd HH:mm:ss")  
			  .create();  */
	@Autowired
	private Dservice dservice;
	@RequestMapping("/findall.do")
	@ResponseBody
	public String findall() throws IOException{
		List<detail> list = dservice.findall();
		for (detail detail : list) {
			System.out.println(detail.getCreatedate());
		}
		return G.toJson(list);
	}
	@RequestMapping("/findall2.do")
	public void findall2(Writer w) throws IOException{
		List<detail> list = dservice.findall();
		for (detail detail : list) {
			System.out.println(detail.getTitle());
		}
		w.write(G.toJson(list));
	}
}
