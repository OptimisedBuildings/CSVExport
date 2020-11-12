package com.optimised_buildings_ltd.CSVExport;

import javax.baja.sys.BFrozenEnum;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

public final class BTimeRange extends BFrozenEnum {

    //FROZEN ENUM. ALLOWS EASY SELECTION OF TIME RANGE

    public static final int TODAY = 0;
    public static final int LAST24HOURS = 1;
    public static final int YESTERDAY = 2;
    public static final int WEEK_TO_DATE = 3;
    public static final int LASTWEEK = 4;
    public static final int LAST7DAYS = 5;
    public static final int MONTH_TO_DATE = 6;
    public static final int LASTMONTH = 7;
    public static final int YEAR_TO_DATE = 8;
    public static final int LASTYEAR = 9;
    public static final int ALL = 10;

    public static final BTimeRange today = new BTimeRange(0);
    public static final BTimeRange last24Hours = new BTimeRange(1);
    public static final BTimeRange yesterday = new BTimeRange(2);
    public static final BTimeRange weekToDate = new BTimeRange(3);
    public static final BTimeRange lastWeek = new BTimeRange(4);
    public static final BTimeRange last7Days = new BTimeRange(5);
    public static final BTimeRange monthToDate = new BTimeRange(6);
    public static final BTimeRange lastMonth = new BTimeRange(7);
    public static final BTimeRange yearToDate = new BTimeRange(8);
    public static final BTimeRange lastYear = new BTimeRange(9);
    public static final BTimeRange all = new BTimeRange(10);

    public static final Type TYPE = Sys.loadType(BTimeRange.class);
    public static final BTimeRange DEFAULT;

    public Type getType() { return TYPE; }

    public static BTimeRange make(int ordinal){ return (BTimeRange)yesterday.getRange().get(ordinal, false);}

    public static BTimeRange make (String tag){ return (BTimeRange)yesterday.getRange().get(tag);}

    private BTimeRange(int ordinal){super(ordinal);}

    static {
        DEFAULT = yesterday;
    }

    public final String decodeToString(int timeRange){
        switch(timeRange){
            case 0 :
                return "?period=today";
            case 1 :
                return "?period=last24Hours";
            case 2 :
                return "?period=yesterday";
            case 3 :
                return "?period=weekToDate";
            case 4 :
                return "?period=lastWeek";
            case 5 :
                return "?period=last7Days";
            case 6 :
                return "?period=monthToDate";
            case 7 :
                return "?period=lastMonth";
            case 8 :
                return "?period=yearToDate";
            case 9 :
                return "?period=lastYear";
            default :
                return "";
        }
    }

}
