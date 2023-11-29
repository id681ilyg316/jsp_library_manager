package com.wwcxy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wwcxy.entity.Type;
import com.wwcxy.util.JdbcUtil;

public class TypeDao {
	//��ѯ���������Ϣ
	public List<Type> getAllTypeByPage(int page,int limit){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Type> list = new ArrayList<Type>();
		String sql = "select * from type limit ?,?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (page-1)*limit);
			pstmt.setInt(2, limit);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Type type = new Type();
				type.setTId(rs.getInt("tid"));
				type.setTCode(rs.getInt("tcode"));
				type.setTName(rs.getString("tname"));
				list.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	//������������ģ����ѯ
	public List<Type> getTypeByName(String tname,int page,int limit ){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Type> list = new ArrayList<Type>();
		String sql = "select * from type where tname like ? limit ?,?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+tname+"%");
			pstmt.setInt(2, (page-1)*limit);
			pstmt.setInt(3, limit);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Type type = new Type();
				type.setTId(rs.getInt("tid"));
				type.setTCode(rs.getInt("tcode"));
				type.setTName(rs.getString("tname"));
				list.add(type);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public int getLikeCount(String tname){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select count(*) from type where tname like ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+tname+"%");
			rs = pstmt.executeQuery();
			while(rs.next()){
				count = rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}
	//�����û�
	public int addType(Type type){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into type(tid,tcode,tname) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, type.getTId());
			pstmt.setInt(2, type.getTCode());
			pstmt.setString(3, type.getTName());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
	
	//����ID��ȡ�û���Ϣ
	public Type getTypeById(int id){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		String sql = "select * from type where tid=?";
		Type type = new Type();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()){
				
				type.setTId(rs.getInt("tid"));
				type.setTCode(rs.getInt("tcode"));
				type.setTName(rs.getString("tname"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return type;
	}
	
	//����ID�޸��û���Ϣ
	public int updateById(Type type){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "update type set tcode=?,tname=? where tid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, type.getTCode());
			pstmt.setString(2, type.getTName());
			pstmt.setInt(3, type.getTId());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
	
	//����IDɾ���û�
	public int delById(int id){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "delete from type where tid=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
	
	//��ȡ�û���������
	public int getCount(){
		JdbcUtil ju = new JdbcUtil();
		Connection conn = ju.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select count(*) from type";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				count = rs.getInt("count(*)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}	
}

