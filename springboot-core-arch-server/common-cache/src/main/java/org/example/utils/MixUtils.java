package org.example.utils;

import cn.hutool.core.codec.Base32;
import cn.hutool.core.codec.Base64;
/**
 * 混合工具类
 * 提供字符串的加密和解密功能，采用双重编码方式（Base64 + Base32）
 */
public class MixUtils {

    /**
     * 对字符串进行双重编码（先Base64编码，再Base32编码）
     *
     * @param str 需要编码的原始字符串
     * @return 双重编码后的字符串
     */
    public static String encode(String str) {
        str = Base64.encode(str);
        str = Base32.encode(str);
        return str;
    }

    /**
     * 对双重编码的字符串进行解码（先Base32解码，再Base64解码）
     *
     * @param str 需要解码的双重编码字符串
     * @return 解码后的原始字符串
     */
    public static String decode(String str) {
        str = Base32.decodeStr(str);
        str = Base64.decodeStr(str);
        return str;
    }

}

