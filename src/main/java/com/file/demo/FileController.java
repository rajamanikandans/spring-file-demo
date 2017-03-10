package com.file.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileRepository fileRepo;
	
	/*
	 * Initial page
	 */
	@RequestMapping("/")
	public String fileUpload(Map<String, Object> model) {
		return "index";
	}

	/*
	 * Upload the file
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String uploadFile(HttpServletRequest request,
            @RequestParam MultipartFile fileUpload,
            @RequestParam String name) throws Exception 
	{
          
        byte[] bytes = fileUpload.getBytes();
        
        FileDetail fileObj = new FileDetail();
        fileObj.setFileName(fileUpload.getOriginalFilename());
        fileObj.setName(name);
        fileObj.setFileData(bytes);
        fileObj.setFileSize(fileUpload.getSize());
        try{
        	fileRepo.save(fileObj);
        }catch(Exception ex) {
        	ex.getMessage();
        }
       
        
       
        System.out.println("Savedddd");
        return "successUpload";
    }  
	
	/*
	 * Search
	 */
	@RequestMapping("/search")
	public String searchFile() 
	{
		return "search";
	}
	
	/*
	 * Retrieve the file
	 */
	@RequestMapping(value = "/getFile", method = RequestMethod.GET)
    public ModelAndView getFile(@RequestParam(value="fileName", required=false) String fileName,
    						@RequestParam(value="name", required=false) String name) throws Exception 
	{
		
		System.out.println("Inside getfile");
          List<FileDetail> fileDetailList = null;
          
          
          if((!StringUtils.isBlank(fileName)) && (!StringUtils.isBlank(name))) {
        	  fileDetailList = fileRepo.findByFileNameAndName(fileName, name);
          } else if(!StringUtils.isBlank(fileName)) {
        	  fileDetailList = fileRepo.findByFileName(name);
          } else if(!StringUtils.isBlank(name)) {
        	  fileDetailList = fileRepo.findByName(name);
	      } else {
	    	  fileDetailList = (List<FileDetail>)fileRepo.findAll();
	      }
        
        return new ModelAndView("fileList" , "fileDetailList", fileDetailList);
        
    }  

}