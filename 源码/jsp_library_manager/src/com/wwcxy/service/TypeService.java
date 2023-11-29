package com.wwcxy.service;

import java.util.List;

import com.wwcxy.dao.TypeDao;
import com.wwcxy.entity.Type;

public class TypeService {
	TypeDao ud = new TypeDao();
	//��ѯ�����û���Ϣ
	public List<Type> getAllTypeByPage(int page,int limit){
		return ud.getAllTypeByPage(page,limit);
	}
	//������������ģ����ѯ
	public List<Type> getTypeByName(String tname,int page,int limit){
		return ud.getTypeByName(tname, page, limit);
	}
	public int getLikeCount(String tname){
		return ud.getLikeCount(tname);
	}
	//�����û�
	public int addType(Type type){
		return ud.addType(type);
	}
	//����ID��ȡ�û���Ϣ
	public Type getTypeById(int id){
		return ud.getTypeById(id);
	}
	//����ID�޸��û���Ϣ
	public int updateById(Type type){
		return ud.updateById(type);
	}
	//����IDɾ���û�
	public int delById(int id){
		return ud.delById(id);
	}
	//����ɾ��
	public void delAll(String tid){
		if(!tid.equals("")){
			String [] tids = tid.split(",");
			TypeService ts =new TypeService();
	        for(int a = 0;a<tids.length;a++){
	        	int id = Integer.parseInt(tids[a]);
	        	ts.delById(id);
	        }}
	}
	//��ȡ�û���������
	public int getCount(){
		return ud.getCount();
	}
	
}
