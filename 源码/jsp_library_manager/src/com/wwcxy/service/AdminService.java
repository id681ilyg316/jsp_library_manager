package com.wwcxy.service;

import java.util.List;

import com.wwcxy.dao.AdminDao;
import com.wwcxy.entity.AdminEntity;
public class AdminService {
	AdminDao ad =new AdminDao();
	//��ѯ���й���Ա��Ϣ
	public List<AdminEntity> getAllAdmin(int page,int limit){
		List<AdminEntity> list = ad.getAllAdmin(page,limit);
		return list;
	}
	public int getCount() {
		int count = ad.getCount();
		return count;
	}
	//���ݹ���Ա����(uname)����ģ����ѯ
	public List<AdminEntity> getAdminByusername(String username,int page,int limit){
		return ad.getAdminByusername(username, page, limit);
	}
	public int getLikeCount(String username){
		return ad.getLikeCount(username);
	}
	//��������Ա
	public int addAdmin(AdminEntity ae){
		return ad.addAdmin(ae);
	}
	//���ݹ���Ա���(uid)��ȡ����Ա��Ϣ
	public AdminEntity getAdminByuid(int uid){
		return ad.getAdminByuid(uid);	
	}
	//���ݹ���Ա���(uid)�޸Ĺ���Ա��Ϣ
	public int updateByuid(AdminEntity ae){
		return ad.updateByuid(ae);
	}
	//���ݹ���Ա���(uid)ɾ������Ա��Ϣ
		public int delAdminByuid(int uid){
			return ad.delAdminByuid(uid);
		}
		public void delSelect(String uid) {
			if(!uid.equals("")){
				String [] uids = uid.split(",");
				AdminService as =new AdminService();
		        for(int a = 0;a<uids.length;a++){
		        	int id = Integer.parseInt(uids[a]);
		        	as.delAdminByuid(id);
		        }
			}
		}
}
