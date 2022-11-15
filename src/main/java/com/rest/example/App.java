package com.rest.example;

public class App {
	public static void main(String args[]) throws Exception {
		
		LogDataDao logdao = new LogDataDao();
		
		LogData log1 = new LogData(1,"fgqeqwesdfdsf","fggeret3312","mlkmkjihi3","uqebnsdbfhdsbf213");
		
		SystemInterbal sys_int = new SystemInterbal();
		logdao.SaveLog(log1);
		
		System.out.println(sys_int.getLog_one().getId());
	}
}
