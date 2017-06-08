package com.todo.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by njw20 on 2017/6/8.
 */
public class GetTimeTool {

	private final static String NORMAL_FORMAT = "yyyy-MM-dd HH:mm";

	public static String getToday(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NORMAL_FORMAT);
		return simpleDateFormat.format(date);
	}
}
