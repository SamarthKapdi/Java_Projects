package com.rays.jdbcpreparedstatement;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// testDelete();
		// testUpdate();
		testSearch();
	}

	private static void testSearch() throws Exception, SQLException {
		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = new MarksheetBean();

		List list = model.search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.print(bean.getId());
			System.out.print("\t" + bean.getRollno());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhy());
			System.out.print("	\t" + bean.getChm());
			System.out.println("\t" + bean.getMaths());
		}
	}

	private static void testUpdate() throws Exception {

		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		bean.setId(24);
		bean.setRollno(124);
		bean.setName("ashwin");
		bean.setPhy(100);
		bean.setChm(100);
		bean.setMaths(100);
		model.update(bean);
	}

	private static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete(25);

	}

	private static void testAdd() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		bean.setId(25);
		bean.setRollno(124);
		bean.setName("ishan");
		bean.setPhy(70);
		bean.setChm(70);
		bean.setMaths(65);

		model.add(bean);

	}

}
