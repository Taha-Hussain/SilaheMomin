package net.mk786110.silahemomin.Contract;

import android.provider.BaseColumns;


public class ShabeEidFitrContract {
    public ShabeEidFitrContract() {
    }

    public static abstract class ShabeEidFitrEntry implements BaseColumns {
        public static final String TABLE_NAME = "tbl_shabe_eid_fitr";
        public static final String COLUMN_NAME_ID_ = "id";
        public static final String COLUMN_NAME_ARABIC_PART = "arabic_part";
        public static final String COLUMN_NAME_URDU_PART = "urdu_part";

    }

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = " ,";

    public static final String SQL_CREATE = "CREATE TABLE " + ShabeEidFitrEntry.TABLE_NAME + "(" + ShabeEidFitrEntry._ID
            + " INTEGER PRIMERY KEY," + ShabeEidFitrEntry.COLUMN_NAME_ID_
            + TEXT_TYPE + COMMA_SEP + ShabeEidFitrEntry.COLUMN_NAME_ARABIC_PART
            + TEXT_TYPE + COMMA_SEP + ShabeEidFitrEntry.COLUMN_NAME_URDU_PART
            + ")";


    public static final String SQL_SELECT_ALL = "SELECT * FROM " + ShabeEidFitrEntry.TABLE_NAME;
    public static final String SQL_DELETE_ALL = "DELETE FROM " + ShabeEidFitrEntry.TABLE_NAME;
    public static final String SQL_DROP_TABLE = "DROP TABLE IF EXISTS " + ShabeEidFitrEntry.TABLE_NAME;
}
