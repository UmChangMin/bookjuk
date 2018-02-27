package com.bookjuk.service.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.service.dto.ServiceContactDto;

@Component
public class ServiceDaoImp implements ServiceDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int listCount() {
		// TODO Auto-generated method stub

		return sqlSession.selectOne("listCount");
	}

	@Override
	public int ServiceWrite(ServiceContactDto serviceContactDto) {
		
		int check=0;
		
		if(serviceContactDto.getContact_file_size()==0) {	// 파일이 들어오지 않았을때
			check=sqlSession.insert("boardInsert", serviceContactDto);
		}else {												// 파일이 들어왔을 때
			check=sqlSession.insert("fileBoardInsert",serviceContactDto);
		}
		
		return check;
	}

	@Override
	public int getBoardCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("getBoardCount");
	}

	@Override
	public List<ServiceContactDto> ServiceContactList(int startRow, int endRow) {
		Map<String,Integer>hmap=new HashMap<String, Integer>();
		hmap.put("startRow", startRow);
		hmap.put("endRow", endRow);
		
		return sqlSession.selectList("ServiceContactList",hmap);
	}

	@Override
	public ServiceContactDto ServiceRead(long contact_num) {
		
		return null;
	}


	
	
}
