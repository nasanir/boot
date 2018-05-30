package pers.nasanir.blog.common.sql.factroy;

import java.util.HashMap;

import pers.nasanir.blog.common.sql.constant.SqlEnum;
import pers.nasanir.blog.common.sql.itf.ISqlbuilder;
import pers.nasanir.blog.common.sql.service.MysqlSqlBuilder;

public class SqlManager {
	public static ISqlbuilder getSqlBuilder(String type){
		HashMap<String, ISqlbuilder> typeMap=new HashMap<String,ISqlbuilder>();
		typeMap.put("mysql", new MysqlSqlBuilder());
		return typeMap.get(type);
	}
}
