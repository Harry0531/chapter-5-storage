package com.camp.bit.todolist.db;

import android.print.PrinterId;
import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE "+Todo.TABLE_NAME+" ("+Todo._ID+
            " INTEGER PRIMARY KEY,"+Todo.COLUMN_STATE+" INTEGER,"+Todo.COLUMN_CONTENT+" TEXT,"+Todo.COLUMN_DATE+" INTEGER)";
    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " +  Todo.TABLE_NAME;

    private TodoContract() {
    }

    public static class Todo implements BaseColumns{
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_DATE = "date";
    }
}
