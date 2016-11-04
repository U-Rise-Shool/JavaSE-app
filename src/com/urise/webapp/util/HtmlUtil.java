package com.urise.webapp.util;

import com.urise.webapp.model.Organization;

/**
 * gkislin
 * 04.11.2016
 */
public class HtmlUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String formatDates(Organization.Position position) {
        return DateUtil.format(position.getStartDate()) + " - " + DateUtil.format(position.getEndDate());
    }

}
