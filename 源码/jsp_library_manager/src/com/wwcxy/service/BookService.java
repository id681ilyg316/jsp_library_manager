package com.wwcxy.service;

import java.util.List;

import com.wwcxy.dao.BookDao;
import com.wwcxy.entity.Book;


public class BookService {
	//��ѯ�����鼮��Ϣ
		BookDao bd=new BookDao();
		public List<Book> getAllBook(int limit, int page){
			List<Book> list =bd.getAllBook(limit,page);
			return list;
		}
		public int getCount() {
			int count = bd.getCount();
			return count;
		}
		//�����鼮��bname�����ƽ���ģ����ѯ
		public List<Book> getBookBybname(String bname,int page,int limit){
			return bd.getBookBybname(bname, page, limit);
		}
		public int getLikeCount(String bname){
			return bd.getLikeCount(bname);
		}
		//ɾ���鼮
		public int delBybid(int bid){
			return bd.delBybid(bid);
		}
		public void delSelect(String bid) {
			System.out.println(bid);
			if(!bid.equals("")){
				String [] bids = bid.split(",");
				BookService bs= new BookService();
		        for(int a = 0;a<bids.length;a++){
		        	int id = Integer.parseInt(bids[a]);
		        	bs.delBybid(id);
		        }
			}
		}
		public int addBook(Book book){
			return bd.addBook(book);
		}
		public Book getBookByBid(int bid){
			return bd.getBookByBid(bid);
		}
		public Book getBookBybid(int bid){
			return bd.getBookBybid(bid);
		}
		public int updateBybid(Book book){
			return bd.updateBybid(book);
		}
		public List<Book> getalltname(){
			return bd.getalltname();
		}
		public int gettid(String tname){
			return bd.gettid(tname);
		}
}
