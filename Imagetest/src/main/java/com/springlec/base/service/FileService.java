package com.springlec.base.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public interface FileService {

	public void upload(MultipartFile file, MultipartHttpServletRequest request, Model model) throws Exception;
}
