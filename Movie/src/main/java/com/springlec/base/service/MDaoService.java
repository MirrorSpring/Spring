package com.springlec.base.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springlec.base.model.MDto;

@Service
public interface MDaoService {

	public List<MDto> listDao() throws Exception;
}
