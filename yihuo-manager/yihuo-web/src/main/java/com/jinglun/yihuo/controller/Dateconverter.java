package com.jinglun.yihuo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;
/**
 * �Զ�������ת����
 * @author ����
 *
 */
@Controller
public class Dateconverter implements Converter<String, Date> {
	private String str;
	@Override
	public Date convert(String arg0) {
		if(arg0 !=null){
			try {
				SimpleDateFormat d = new SimpleDateFormat(str);
				return d.parse(arg0);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
