package edu.kh.project.common.scheduling.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.kh.project.common.scheduling.mapper.SchedulingMapper;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class SchedulingServiceImpl implements SchedulingService {

	private final SchedulingMapper mapper;
	
	@Override
	public List<String> selectImageList() {
		return mapper.selectImageList();
	}
	
}
