package com.rest.example;

public class SystemInterbal {
	
	private int initiate_level;
	public float fp_count;
	public float near_found;
	private int common_count;
	private float average_found;
	private String str_error;
	
	LogData log_one = new LogData();
	LogDataDao log_one_dao = new LogDataDao();
	
	
	
	public SystemInterbal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SystemInterbal(int initiate_level, float fp_count, float near_found, int common_count, float average_found,
			String str_error, LogData log_one, LogDataDao log_one_dao) {
		super();
		this.initiate_level = initiate_level;
		this.fp_count = fp_count;
		this.near_found = near_found;
		this.common_count = common_count;
		this.average_found = average_found;
		this.str_error = str_error;
		this.log_one = log_one;
		this.log_one_dao = log_one_dao;
	}
	public int getInitiate_level() {
		return initiate_level;
	}
	public void setInitiate_level(int initiate_level) {
		this.initiate_level = initiate_level;
	}
	public float getFp_count() {
		return fp_count;
	}
	public void setFp_count(float fp_count) {
		this.fp_count = fp_count;
	}
	public float getNear_found() {
		return near_found;
	}
	public void setNear_found(float near_found) {
		this.near_found = near_found;
	}
	public int getCommon_count() {
		return common_count;
	}
	public void setCommon_count(int common_count) {
		this.common_count = common_count;
	}
	public float getAverage_found() {
		return average_found;
	}
	public void setAverage_found(float average_found) {
		this.average_found = average_found;
	}
	public String getStr_error() {
		return str_error;
	}
	public void setStr_error(String str_error) {
		this.str_error = str_error;
	}
	public LogData getLog_one() {
		return log_one;
	}
	public void setLog_one(LogData log_one) {
		this.log_one = log_one;
	}
	public LogDataDao getLog_one_dao() {
		return log_one_dao;
	}
	public void setLog_one_dao(LogDataDao log_one_dao) {
		this.log_one_dao = log_one_dao;
	}

	

	
}
