package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import controller.ToDangKyThueTNCN;
import dao.DAO;
import dao.DangKyThueDao;

class DangKyThueTest {

/*	@Test
	void testSql() {
		ToDangKyThueTNCN dangKyThue = new ToDangKyThueTNCN();
		DangKyThueDao dkt = new DangKyThueDao();
		List<String> colName = Arrays.asList("ct1_tenNNT", "ct4a_soNha", "ct4b_maPhuong");
		List<String> values = Arrays.asList("one", "two", "three");
		String sqlInsert = dangKyThue.sql(colName, values);
		dkt.themDangKy(sqlInsert);
		assertEquals(true, dkt.check("dangkythue", "one", "ct1_tenNNT"));
		assertEquals(true, dkt.check("dangkythue", "two", "ct4a_soNha"));
		assertEquals(true, dkt.check("dangkythue", "three", "ct4b_maPhuong"));
		dkt.delete();
	}*/
	
	@Test
	void testThemDangKy() {
		ToDangKyThueTNCN dangKyThue = new ToDangKyThueTNCN();
		DangKyThueDao dkt = new DangKyThueDao();
		List<String> colName = Arrays.asList("ct1_tenNNT", "ct4a_soNha", "ct4b_maPhuong");
		List<String> values = Arrays.asList("one", "two", "three");
		dangKyThue.saveData(colName, values);
		assertEquals(true, dkt.check("dangkythue", "one", "ct1_tenNNT"));
		assertEquals(true, dkt.check("dangkythue", "two", "ct4a_soNha"));
		assertEquals(true, dkt.check("dangkythue", "three", "ct4b_maPhuong"));
		dkt.delete();
	}

}
