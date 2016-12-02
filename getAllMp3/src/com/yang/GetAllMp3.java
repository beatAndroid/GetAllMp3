package com.yang;

import java.io.File;

/**
 * 4.音乐文件读取工具
 * @author Administrator
 *
 */
public class GetAllMp3 {
	
	public static void main(String[] args) {
		File file = new File("d://");
		getAllMp3(file);
	}
	/**
	 * 读取指定目录的所有mp3文件，包括所有子目录。
	 * @param filePath
	 * 2016-11-25 00:18:32 修改：使用递归方式
	 */
	public static void getAllMp3(File file){
		if(!file.isDirectory()){
			System.out.println("指定路径不是一个合法的目录！");
			return;
		}
		//获取目录下的所有文件
		 File[] files =file.listFiles();
		 //过滤掉空目录
		 if(files!=null){
			 for(File v_file:files){
				 if(v_file.isDirectory()){
					 //递归调用
					 getAllMp3(v_file);
				 }else{
					 //打印输出所有MP3文件
					 if(v_file.getName().endsWith(".mp3")){
						 System.out.println(v_file.getAbsolutePath());
					 }
				 }
			 }
		 }
	}
}
