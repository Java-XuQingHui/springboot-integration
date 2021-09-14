package com.xqh.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>字体串工具类</p>
 *
 * @author xuqinghui
 * @create 2021/8/26 16:27
 */


public class StringUtils {

	/**
	 * 判断给定参数是否为null或空字符串
	 * 若有一个参数条件成立,则返回true
	 * 否则返回 false
	 * @param param 给定的参数
	 * @author  by:long
	 */
	public static boolean isEmpty(Object ... param){
		for (Object o : param) {
			if("".equals(o) || null == o){
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断给定list是否为null或长度少于等于0
	 * 为空则返回true 否则返回false
	 * @param <T>
	 * @param param 给定的参集合
	 * @author  by:long
	 */
	public static  <T> boolean isEmpty(List<T>  param){

		return null == param || "".equals(param) || param.size() <= 0;
	}

	/**
	 * 判断给定list列表是否为null或长度少于0
	 * 若有一个参数条件成立,则返回true
	 * 否则返回false
	 * @param params    给定的可变参数集合
	 * @author  by:long
	 */
	@SuppressWarnings("unchecked")
	public static <T> boolean isEmpty(List<T> ... params){
		for (List<T> list : params) {
			if(null == list || list.size() <= 0){
				return true;
			}
		}
		return false;
	}

	/**
     * <p>验证str是否为数字</p>
     *
     * @author: longzhiqiang
     * @creed: 2019-07-08 10:13
     * @param str   给定的参数
     * @return {@link boolean}
     */
   public static boolean isNumeric(String str){
       Pattern pattern = Pattern.compile("[0-9]{0,}.[0-9]{0,}");
       Matcher isNum = pattern.matcher(str);
       if( !isNum.matches() ){
           return false;
       }
       return true;
    }

	/**
     * <p>
     *     处理特殊字符串将其替换为空
     *     并在字符串上加入模糊查询符号
     * </p>
     *
     * @author: longzhiqiang
     * @creed: 2019-07-08 10:14
     * @param oldStr    被处理的字符串
     * @return {@link String}
     */
	public static String specialStr(String oldStr){
//		String regEx="[\\s~·`!@#￥$%^……&*（()）\\-——\\-_=+【\\[\\]】｛{}｝\\|、\\\\；;：:‘'“”\"，,《<。.》>、/？?]";
		String regEx="[\\s~·`!@#￥$%^……&*\\——\\_=+【\\[\\]】｛{}｝\\|、\\\\；;：:‘'“”\"，,《<。.》>、/？?]";
        Pattern p = Pattern.compile(regEx);
        String newStr = p.matcher(oldStr).replaceAll("");
		return  "%"+newStr+"%";
	}

	/**
	 * 将字符串以逗号分隔放入集合并返回
	 * 若字符串為null 將直接返回null
	 * @param str   要分隔的字符串
	 * @author  by:long
	 */
	public static List<Integer> parseList(String str) {
		if(StringUtils.isEmpty(str)){return null;}
		List<Integer> list = new ArrayList<Integer>();
		String[] split = str.split(",");
		for (String s : split) {
			list.add(Integer.parseInt(s));
		}
		return list;
	}

	/**
     * <p>自动补零</p>
     *
     * @author: longzhiqiang
     * @creed: 2019-07-08 10:15
     * @param number    给定的数字
     * @return {@link String}
     */
	public static String zreo(Number number) throws Exception{
		String zreoAfter = "";
		int num = number.toString().length();
		if(num == 1){
			zreoAfter = "00"+number;
		}else if(num == 2){
			zreoAfter = "0"+number;
		}else if(num == 3){
			return ""+number;
		}else{
			throw new Exception("对不起、长度越界、若要继续请与管理员联系");
		}
		return zreoAfter;
	}

	/**
     * <p>若字符串为null转换为空字符串 否则原样返回</p>
     *
     * @author: longzhiqiang
     * @creed: 2019-07-08 10:15
     * @param str   被验证的字符串
     * @return {@link String}
     */
	public static String nullToEmpty(String str){
		if(null == str){
			return "";
		}
		return str;
	}


	/**
     * <p>生成随机字符串</p>
     *
     * @author: longzhiqiang
     * @creed: 2019-07-08 10:16
     * @return {@link String}
     */
	public static String GenerateSalt(){

		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
