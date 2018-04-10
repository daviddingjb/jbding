package com.trusdata.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JBDING
 *
 */
public class DateUtil {
    public static final SimpleDateFormat STD_DATE_FMT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static Date formatDate(Timestamp t) {
        try {
            // Timestamp#toString() yyyy-mm-dd hh:mm:ss.fffffffff
            return STD_DATE_FMT.parse(t.toString().substring(0, 19));
        } catch (ParseException e) {
            return null;
        }
    }
}
