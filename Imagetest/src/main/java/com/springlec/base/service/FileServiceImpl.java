package com.springlec.base.service;

import java.io.File;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public void upload(MultipartFile file, MultipartHttpServletRequest request, Model model) throws Exception {
		HttpSession session=request.getSession();
		ServletContext context=session.getServletContext();
		// 원래 파일 이름 추출
        String origName = file.getOriginalFilename();

        // 파일 이름으로 쓸 uuid 생성
        String uuid = UUID.randomUUID().toString();

        // 확장자 추출(ex : .png)
        String extension = origName.substring(origName.lastIndexOf("."));

        // uuid와 확장자 결합
        String savedName = uuid + extension;

        // 파일을 불러올 때 사용할 파일 경로
        String savedPath = context.getRealPath("/") + savedName;
        
        file.transferTo(new File(savedPath));
        
		model.addAttribute("filename", savedName);
	}

}
