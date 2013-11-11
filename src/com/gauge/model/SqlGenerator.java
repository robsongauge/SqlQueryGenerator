package com.gauge.model; 

public class SqlGenerator {

	public String buildSelect(String table, String... columns) {
		StringBuilder sqlSelect = new StringBuilder();
		sqlSelect.append("select ");
		sqlSelect.append(this.format(columns));
		sqlSelect.append(" from ");
		sqlSelect.append(table);
		return sqlSelect.toString();
	}

	public String buildSelect(String table, String[] columns, String where) {
		StringBuilder sb = new StringBuilder();
		sb.append(buildSelect(table, columns));
		sb.append(" where ").append(where);

		return sb.toString();
	}
	
	private String format(String... elements){
		StringBuilder formatted = new StringBuilder();

		for (String element : elements) {
			formatted.append(element);
			if (!element.equals(elements[elements.length - 1]))
				formatted.append(", ");
		}
		
		return formatted.toString();
	}

}
