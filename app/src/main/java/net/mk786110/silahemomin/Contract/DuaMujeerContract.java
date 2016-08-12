package net.mk786110.silahemomin.Contract;

import android.provider.BaseColumns;


public class DuaMujeerContract {
    public DuaMujeerContract() {
    }

    public static abstract class DuaMujeerEntry implements BaseColumns {
        public static final String TABLE_NAME = "tbl_dua_mujeer";
        public static final String COLUMN_NAME_ID_ = "id";
        public static final String COLUMN_NAME_ARABIC_PART = "arabic_part";
        public static final String COLUMN_NAME_URDU_PART = "urdu_part";

    }

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = " ,";

    public static final String SQL_CREATE = "CREATE TABLE " + DuaMujeerEntry.TABLE_NAME + "(" + DuaMujeerEntry._ID
            + " INTEGER PRIMERY KEY," + DuaMujeerEntry.COLUMN_NAME_ID_
            + TEXT_TYPE + COMMA_SEP + DuaMujeerEntry.COLUMN_NAME_ARABIC_PART
            + TEXT_TYPE + COMMA_SEP + DuaMujeerEntry.COLUMN_NAME_URDU_PART
            + ")";


    public static final String SQL_SELECT_ALL = "SELECT * FROM " + DuaMujeerEntry.TABLE_NAME;
    public static final String SQL_DELETE_ALL = "DELETE FROM " + DuaMujeerEntry.TABLE_NAME;
    public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + DuaMujeerEntry.TABLE_NAME;
}
