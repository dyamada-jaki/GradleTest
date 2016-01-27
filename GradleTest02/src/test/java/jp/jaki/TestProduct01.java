package jp.jaki;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class TestProduct01 {

	@Test
	public void testCase01() {
		Product01 p01 = new Product01();
		
		int res = p01.add(1, 2);
		assertThat(res, is(4));
	}

}
