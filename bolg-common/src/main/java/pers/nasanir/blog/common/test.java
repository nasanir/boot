package pers.nasanir.blog.common;

import java.security.NoSuchAlgorithmException;

import pers.nasanir.blog.common.crypto.constant.EncoderEnum;
import pers.nasanir.blog.common.crypto.factroy.CryptoFactory;
import pers.nasanir.blog.common.crypto.itf.IEncoder;
import pers.nasanir.blog.common.sql.abst.AbstractSqlBuilder;
import pers.nasanir.blog.common.user.entity.UserVO;

public class test {
	public static void main(String[] args){
//		IEncoder hex256Encoder=CryptoFactory.getInstance(EncoderEnum.HEX256);
//		try {
//			System.out.println(hex256Encoder.encode2Hex("nasanirlyz@black1"));
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String a="gets";
		
		UserVO u=new UserVO();
		u.setValue("usercode", "a");
		AbstractSqlBuilder a=new AbstractSqlBuilder();
		a.getQuerySql(u).getSql();
		System.out.println(a.getQuerySql(u).getSql());
	}
}
