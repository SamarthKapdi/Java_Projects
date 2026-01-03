package com.rays.jdbcpreparedstatement;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestUserModel {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testDelete();
		// testUpdate();
		testSearch();
	}

	private static void testSearch() throws Exception, SQLException {

		UserModel model = new UserModel();

		UserBean bean = new UserBean();

		List list = model.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (UserBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLogin());
			System.out.print("	\t" + bean.getPassword());
			System.out.println("\t" + bean.getDob());
		}
	}

	private static void testUpdate() throws Exception {

		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(10);
		bean.setFirstName("Capt. Rohit");
		bean.setLastName("Sharma");
		bean.setLogin("shana@gmail.com");
		bean.setPassword("rohit45");
		bean.setDob(sdf.parse("1987-04-30"));
		model.update(bean);

	}

	private static void testDelete() throws Exception {
		UserModel model = new UserModel();
		model.delete(21);

	}

	private static void testAdd() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		bean.setId(10);
		bean.setFirstName("Rohit");
		bean.setLastName("Sharma");
		bean.setLogin("shana@gmail.com");
		bean.setPassword("rohit45");
		bean.setDob(sdf.parse("1987-04-30"));

		model.add(bean);

	}
}