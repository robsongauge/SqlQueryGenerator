package com.gauge.model;


import org.junit.Assert;
import org.junit.Test;


public class SqlGeneratorTest {

	@Test
	public void shouldGeneratorSelectWithOneColumn(){
		SqlGenerator sqlGenerator = new SqlGenerator();
		String sql = sqlGenerator.buildSelect("table","column");
		Assert.assertEquals("select column from table", sql);
	}
	
	@Test
	public void shouldGeneratorSelectWithOneOrMoreColumn(){
		SqlGenerator sqlGenerator = new SqlGenerator();
		String sql = sqlGenerator.buildSelect("table","column1", "column2");
		Assert.assertEquals("select column1, column2 from table", sql);
	}
	
	@Test
	public void shouldGeneratorSelectWithWhere(){
		SqlGenerator sqlGenerator = new SqlGenerator();
		String[] columns = new String[]{"column1", "column2"};
		String sql = sqlGenerator.buildSelect("table", columns, "a=a");
		Assert.assertEquals("select column1, column2 from table where a=a", sql);
	}
	
}
