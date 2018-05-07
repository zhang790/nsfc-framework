package com.zhang.util.string;

/**
 * 字符串工具类.
 *
 */
public class StringUtil {
   
    private static final String CN_MATCH = "[\\u4E00-\\u9FA5]+";
    
    /**
     * 字符串格式化.
     * 
     * @param param
     *            包含需要替换的字符串.
     * @param msg
     *            需要替换的字符串.
     */
    public static String format(String param, String msg) {
        String value = param.replace("{0}", msg);
        return value;
    }
    
    public static String format(String param, Long msg) {
        String value = format("{0}", msg.toString());
        return value;
    }

    /**
     * 字符串格式化.
     * 
     * @param param
     *            包含需要替换的字符串.
     * @param msg0
     *            第一个需要替换的字符串.
     * @param msg1
     *            第二个需要替换的字符串.
     */
    public static String format(String param, String msg0, String msg1) {
        String value = param.replace("{0}", msg0).replace("{1}", msg1);
        return value;
    }
    
    public static String format(String param, String msg0, Long msg1) {
        String value = format("{0}", msg0, msg1.toString());
        return value;
    }

    /**
     * 字符串格式化.
     * 
     * @param param
     *            包含需要替换的字符串.
     * @param msg0
     *            第一个需要替换的字符串.
     * @param msg1
     *            第二个需要替换的字符串.
     * @param msg2
     *            第三个需要替换的字符串.
     */
    public static String format(String param, String msg0, String msg1,
            String msg2) {
        String value = param.replace("{0}", msg0).replace("{1}", msg1)
                .replace("{2}", msg2);
        return value;
    }

    /**
     * 字符串格式化.
     * 
     * @param param
     *            包含需要替换的字符串.
     * @param msg0
     *            第一个需要替换的字符串.
     * @param msg1
     *            第二个需要替换的字符串.
     * @param msg2
     *            第三个需要替换的字符串.
     * @param msg3 第四个需要替换的字符串.
     */
    public static String format(String param, String msg0, int msg1,
            int msg2, String msg3) {
        String value = param.replace("{0}", msg0)
                .replace("{1}", String.valueOf(msg1))
                .replace("{2}", String.valueOf(msg2)).replace("{3}", msg3);
        return value;
    }

    /**
     * 字符串格式化.
     * 
     * @param param
     *            包含需要替换的字符串.
     * @param msg0
     *            第一个需要替换的字符串.
     * @param msg1
     *            第二个需要替换的字符串.
     * @param msg2
     *            第三个需要替换的字符串.
     * @param msg3
     *            第四个需要替换的字符串.
     */
    public static String format(String param, String msg0, int msg1,
            int msg2, int msg3) {
        String value = param.replace("{0}", msg0)
                .replace("{1}", String.valueOf(msg1))
                .replace("{2}", String.valueOf(msg2))
                .replace("{3}", String.valueOf(msg3));
        return value;
    }
    
    /**
     * 验证字符串是否数字.
     * @param msg 需要验证的参数.
     */
    
    public static boolean isNumber(String msg) {
        if (Character.isDigit(msg.charAt(0))) {
            return true;
        }
        return false;
    }

    /**
     * 字符串为空.
     * @Create_by:yinsy.
     * @Create_date:2016年9月6日.
     * @param msg 判断内容参数.
     * @Edit_Description:
     */
    public static boolean isEmpty(Object msg) {
        if (msg == null || "".equals(msg.toString().trim())
                || "null".equals(msg)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断字符串不为空.
     * @param msg 判断内容参数.
     * @Edit_Description:
     */
    public static boolean notEmpty(Object msg) {
        return !isEmpty(msg);
    }

    /**
     * @Edit_Description:多个参数判空
     */
    public static boolean isBlank(Object... parms) {
        for (int i = 0; i < parms.length; i++) {
            if (isEmpty(parms[i])) {
                return true;
            }
        }
        return false;
    }


//    /**
//     * 将汉字转换为全拼.
//     * @param src 源
//     * @return t4
//     */
//    public static String getPingYin(String src) {
//        char[] t1 = null;
//        t1 = src.toCharArray();
//        String[] t2 = new String[t1.length];
//        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();
//        t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);
//        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
//        t3.setVCharType(HanyuPinyinVCharType.WITH_V);
//        String t4 = "";
//        int t0 = t1.length;
//        try {
//            for (int i = 0; i < t0; i++) {
//                // 判断是否为汉字字符
//                if (Character.toString(t1[i]).matches(CN_MATCH)) {
//                    t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);
//                    t4 += t2[0];
//                } else {
//                    t4 += Character.toString(t1[i]);
//                }
//            }
//            return t4;
//        } catch (BadHanyuPinyinOutputFormatCombination e1) {
//            e1.printStackTrace();
//        }
//        return t4;
//    }

}
