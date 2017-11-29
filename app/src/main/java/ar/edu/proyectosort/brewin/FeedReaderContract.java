package ar.edu.proyectosort.brewin;

import android.provider.BaseColumns;

/**
 * Created by Juan Manuel Britos on 29/11/2017.
 */

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "fermenters";
        public static final String COLUMN_NAME_RECIPE = "recipe";
        public static final String COLUMN_NAME_CAPACITY = "capacity";
        public static final String COLUMN_NAME_ORIGINAL_GRAVITY = "original_gravity";
        public static final String COLUMN_NAME_STATUS_HISTORY = "status_history";
    }
}
