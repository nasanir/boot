package pers.nasanir.blog.common.crypto.factroy;

import pers.nasanir.blog.common.crypto.constant.EncoderEnum;
import pers.nasanir.blog.common.crypto.itf.IEncoder;

public class CryptoFactory {
	private static String packagepath = "pers.nasanir.blog.common.crypto.encoder.";

	public static IEncoder getInstance(EncoderEnum name) {
		IEncoder encoder = null;
		try {
			encoder = (IEncoder) Class.forName(packagepath + name.getClassName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encoder;
	}
}
