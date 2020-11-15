package com.revature.daoimpl;


import com.revature.dao.CustomerDao;
import com.revature.util.ConnFactory;

public class CustomerDaolmpl implements CustomerDao{
	
	public static ConnFactory cf = ConnFactory.getInstance();


	
//	@Override
//	public List<Album> getAllAlbums() throws SQLException{
//		List<Album> albumList = new ArrayList<Album>();
//		
//		Connection conn = cf.getConnection(); // jdb stuff
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from \"Album\" ");
//		
//		Album a = null;
//		while(rs.next()){
//			a = new Album(rs.getInt(1), rs.getString(2), rs.getInt(3));
//			albumList.add(a);
//		}
//		return albumList;
//	}


}
