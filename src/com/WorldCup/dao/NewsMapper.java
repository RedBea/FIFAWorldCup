package com.WorldCup.dao;

import com.WorldCup.pojo.News;
import java.util.List;

public interface NewsMapper {
	//����ʵʱ����
		 void insert(News news);
	//��ѯȫ������
		 List<News> queryAllNews();
	//����idɾ������
		 void deleteNewsById(Integer nId);
	//����id��ѯ����
	     News queryNewsById(Integer nId);	
	     
	     void updateNewsById(News news);
	     
	     void updateNewsThumpById(Integer nId);
}