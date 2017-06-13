package com.lzairport.ais.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/** 
 * 大写金额转换Scriptlet类 
 * 
 * @author Spark (Email: spark.unt@gmail.com)  
 */  

/**
 * 
 * FileName      TransChineseMoneyScriptlet.java
 * @Description  TODO(用一句话描述该文件做什么)
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2015-9-22 
 * @ModificationHistory
 * Date         Author     Version   Discription
 * <p>---------------------------------------------
 * <p>2015-9-22      Yu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

public class TransChineseMoneyScriptlet extends JRDefaultScriptlet {  
    /* 
     * 默认构造方法 
     */  
    public TransChineseMoneyScriptlet() {  
      
    }  
  
    /** 
     * 获得金额的汉字大写格式 <br> 
     * @param money 小写金额字符串 
     * @return 大写的汉字金额 
     */  
    public static String getChineseMoney(String money) {  
        String text = transChineseMoney1(money) + transChineseMoney2(money);  
        Pattern p = Pattern.compile("零分", Pattern.CASE_INSENSITIVE);  
        Matcher m = p.matcher(text);  
        text = m.replaceAll("");  
        return text;  
    }  
  
    /** 
     * 截得输入金额的整数部分，并将其转换成中文大写的格式 <br> 
     * <br> 
     * 其他描述：输入数字超过接受范围时拒绝转换并退出。<br> 
     * @param 传递参数字符串S 参数描述 
     * @return 返回转换后的字符串 
     */  
    public static String transChineseMoney1(String s) {  
        String ss = s;  
        String tmpnewchar = "";  
        String[] part = ss.split("\\.");  
  
        if (part[0].length() > 10) {  
            // 超出可转换位数  
            return "";  
        }  
        for (int i = 0; i < part[0].length(); i++) {  
            char perchar = part[0].charAt(i);  
            if (perchar == '0')  
                tmpnewchar = tmpnewchar + "零";  
            if (perchar == '1')  
                tmpnewchar = tmpnewchar + "壹";  
            if (perchar == '2')  
                tmpnewchar = tmpnewchar + "贰";  
            if (perchar == '3')  
                tmpnewchar = tmpnewchar + "叁";  
            if (perchar == '4')  
                tmpnewchar = tmpnewchar + "肆";  
            if (perchar == '5')  
                tmpnewchar = tmpnewchar + "伍";  
            if (perchar == '6')  
                tmpnewchar = tmpnewchar + "陆";  
            if (perchar == '7')  
                tmpnewchar = tmpnewchar + "柒";  
            if (perchar == '8')  
                tmpnewchar = tmpnewchar + "捌";  
            if (perchar == '9')  
                tmpnewchar = tmpnewchar + "玖";  
  
            int j = part[0].length() - i - 1;  
            if (j == 0)  
                tmpnewchar = tmpnewchar + "圆";  
            if (j == 1 && perchar != 0)  
                tmpnewchar = tmpnewchar + "拾";  
            if (j == 2 && perchar != 0)  
                tmpnewchar = tmpnewchar + "佰";  
            if (j == 3 && perchar != 0)  
                tmpnewchar = tmpnewchar + "仟";  
            if (j == 4 && perchar != 0)  
                tmpnewchar = tmpnewchar + "万";  
            if (j == 5 && perchar != 0)  
                tmpnewchar = tmpnewchar + "拾";  
            if (j == 6 && perchar != 0)  
                tmpnewchar = tmpnewchar + "佰";  
            if (j == 7 && perchar != 0)  
                tmpnewchar = tmpnewchar + "仟";  
            if (j == 8 && perchar != 0)  
                tmpnewchar = tmpnewchar + "亿";  
            if (j == 9 && perchar != 0)  
                tmpnewchar = tmpnewchar + "拾";  
        }  
        return tmpnewchar;  
    }  
  
    /** 
     * 截得输入金额的小数部分，并将其转换成中文大写的格式 <br> 
     * <br> 
     * 其他描述：小数部分超过两位时系统自动截断。<br> 
     *  
     * @param 传递参数字符串 
     *  
     * @return 返回转换后的字符串 
     */  
    public static String transChineseMoney2(String s) {  
        String ss = s;  
        String tmpnewchar1 = "";  
        String[] part = ss.split("\\.");  
  
        if (ss.indexOf(".") != -1) {  
            if (part[1].length() > 2) {  
                // MessageDialog.openInformation(null,"提示","小数点之后只能保留两位,系统将自动截段");  
                part[1] = part[1].substring(0, 2);  
            }  
            for (int i = 0; i < part[1].length(); i++) {  
                char perchar = part[1].charAt(i);  
//              System.out.println(perchar);  
                if (perchar == '0')  
                    tmpnewchar1 = tmpnewchar1 + "零";  
                if (perchar == '1')  
                    tmpnewchar1 = tmpnewchar1 + "壹";  
                if (perchar == '2')  
                    tmpnewchar1 = tmpnewchar1 + "贰";  
                if (perchar == '3')  
                    tmpnewchar1 = tmpnewchar1 + "叁";  
                if (perchar == '4')  
                    tmpnewchar1 = tmpnewchar1 + "肆";  
                if (perchar == '5')  
                    tmpnewchar1 = tmpnewchar1 + "伍";  
                if (perchar == '6')  
                    tmpnewchar1 = tmpnewchar1 + "陆";  
                if (perchar == '7')  
                    tmpnewchar1 = tmpnewchar1 + "柒";  
                if (perchar == '8')  
                    tmpnewchar1 = tmpnewchar1 + "捌";  
                if (perchar == '9')  
                    tmpnewchar1 = tmpnewchar1 + "玖";  
  
                if (i == 0 && perchar != 0)  
                    tmpnewchar1 = tmpnewchar1 + "角";  
                if (i == 1 && perchar != 0)  
                    tmpnewchar1 = tmpnewchar1 + "分";  
            }  
        }  
        return tmpnewchar1;  
    }  
  
  
/** Begin EVENT_AFTER_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */  
public void afterColumnInit() throws JRScriptletException  
{  
    super.beforeColumnInit();  
}  
/** End EVENT_AFTER_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_AFTER_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */  
public void afterDetailEval() throws JRScriptletException  
{  
    Double sumTaxMoney = getVariableValue("SumPrice") == null ? new Double(0.0)  
    : (java.lang.Double) getVariableValue("SumPrice");  
  
//  System.out.println("sumTaxMoney = " + sumTaxMoney);  
    String cnMoney = getChineseMoney(sumTaxMoney+"");  
//  System.out.println("cnMoney = " + cnMoney);  
    this.setVariableValue("cnPrice", cnMoney);  
    super.afterDetailEval();  
}  
/** End EVENT_AFTER_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_AFTER_GROUP_INIT This line is generated by iReport. Don't modify or move please! */  
public void afterGroupInit(String groupName) throws JRScriptletException  
{  
    super.afterGroupInit(groupName);  
}  
/** End EVENT_AFTER_GROUP_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_AFTER_PAGE_INIT This line is generated by iReport. Don't modify or move please! */  
public void afterPageInit() throws JRScriptletException  
{  
    super.afterPageInit();  
}  
/** End EVENT_AFTER_PAGE_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_AFTER_REPORT_INIT This line is generated by iReport. Don't modify or move please! */  
public void afterReportInit() throws JRScriptletException  
{  
      
      
      
}  
/** End EVENT_AFTER_REPORT_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_BEFORE_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */  
public void beforeColumnInit() throws JRScriptletException  
{  
          
}  
/** End EVENT_BEFORE_COLUMN_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_BEFORE_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */  
public void beforeDetailEval() throws JRScriptletException  
{  
      
}  
/** end EVENT_BEFORE_DETAIL_EVAL Please don't touch or move this comment*/  
  
/** End EVENT_BEFORE_DETAIL_EVAL This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_BEFORE_GROUP_INIT This line is generated by iReport. Don't modify or move please! */  
public void beforeGroupInit(String groupName) throws JRScriptletException  
{  
      
}  
/** End EVENT_BEFORE_GROUP_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_BEFORE_PAGE_INIT This line is generated by iReport. Don't modify or move please! */  
public void beforePageInit() throws JRScriptletException  
{  
      
}  
/** End EVENT_BEFORE_PAGE_INIT This line is generated by iReport. Don't modify or move please! */  
/** Begin EVENT_BEFORE_REPORT_INIT This line is generated by iReport. Don't modify or move please! */  
public void beforeReportInit() throws JRScriptletException  
{  
      
}  
  
/** End EVENT_BEFORE_REPORT_INIT This line is generated by iReport. Don't modify or move please! */  
  
}  