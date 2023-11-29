package com.wwcxy.service;

import java.util.List;

import com.wwcxy.dao.LendRecordDao;
import com.wwcxy.entity.Card;
import com.wwcxy.entity.LendRecord;

public class LendrecordService {
	LendRecordDao lrd = new LendRecordDao();
	//��ѯ����ͼ����Ϣ
	public List<LendRecord> getAllLendRecordBypage(int page,int limit){
		return lrd.getAllLendRecordBypage(page,limit);
	}
	//����id��ѯͼ����Ϣ
	public LendRecord getLrByLid(int lid){
		return lrd.getLrByLid(lid);
	}
	//����cid��ѯͼ����Ϣ
	public List<LendRecord> getlrByCid(int cid ,int page,int limit){
			return lrd.getlrByCid(cid, page, limit);
	}
	//����ͼ����Ϣ
	public int addLr(LendRecord lr){
		return lrd.addLr(lr);
	}
	//ɾ��ͼ����Ϣ
	public int delLrByLid(int lid){
		return lrd.delLrByLid(lid);
	}
	//�޸�ͼ����Ϣ
	public int updateLrByLid(LendRecord lr){
		return lrd.updateLrByLid(lr);
	}
	public int getCount(){
		return lrd.getCount();
	}
	public int getLikeCount(int cid){
		return lrd.getLikeCount(cid);
	}
	//����
	public LendRecord getlrBycid(int cid){
	return lrd.getlrBycid(cid);		
	}
	public void delAll(String lid) {
		System.out.println(lid);
		if(!lid.equals("")){
			String [] lids = lid.split(",");
			LendrecordService ld=new LendrecordService();
	        for(int a = 0;a<lids.length;a++){
	        	int id = Integer.parseInt(lids[a]);
	        	ld.delLrByLid(id);
	        }
		}
	}
	public List<LendRecord> getCid(){
		return lrd.getCid();
	}
	public List<LendRecord> getBid(){
		return lrd.getBid();
	}
}
