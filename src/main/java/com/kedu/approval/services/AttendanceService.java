package com.kedu.approval.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kedu.approval.dao.AttendanceDAO;
import com.kedu.approval.dto.AttendanceDTO;

@Service
public class AttendanceService {

	
	@Autowired
	private AttendanceDAO dao;
	
	
	public List<AttendanceDTO> countSelect(){
		return dao.CountSelect();	
		}
}
