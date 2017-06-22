package com.choa.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileSaver {

	public String filesave(String realPath, String oriName, byte[] fileData) throws Exception{
		File f = new File(realPath);
		
		if(!f.exists()){
			f.mkdirs();
		}
		//upload폴더에 저장되는 실제 파일 name
		String fileName = UUID.randomUUID().toString()+"_"+oriName;
		File taget = new File(f, fileName);
		//저장하는 방식 1번
		FileCopyUtils.copy(fileData, taget);
		
		return fileName;
	}
	
	public String filesave(String realPath, MultipartFile m) throws Exception{
		System.out.println(realPath);
		File f = new File(realPath);
		
		if(!f.exists()){
			f.mkdirs();
		}
		
		//upload폴더에 저장되는 실제 파일 name
		//시간을 이용해서 중복 없이 파일 name 사용가능
		Calendar ca = Calendar.getInstance();
		String fileName = ca.getTimeInMillis()+"_"+m.getOriginalFilename();
		//String fileName = UUID.randomUUID().toString()+"_"+m.getOriginalFilename();
		File taget = new File(f, fileName);
		//저장하는 방식 2번
		m.transferTo(taget);
		
		return fileName;
	}
}
