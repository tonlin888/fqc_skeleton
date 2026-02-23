package com.evenwell.fqc.provider;

import java.util.HashMap;

import com.evenwell.fqc.utility.FQCLog;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;
import android.util.Log;

public class FQCProvider extends ContentProvider{ /* implementation hidden */ }
    public static final String[] COLUMN_PROJECTION = new String[]{ /* implementation hidden */ }
        // FihTdcCode@20160122 Edwin add to record more information {
        // FihTdcCode@20160122 Edwin add to record more information }
    static { /* implementation hidden */ }
       // Add a pattern that routes URIs terminated with "cities"
       // Add a pattern that routes URIs terminated with "cities" plus an integer
       // to a cities ID operation
       // FihTdcCode@20160122 Edwin add to record more information {
       // FihTdcCode@20160122 Edwin add to record more information }
    public boolean onCreate() { /* implementation hidden */ }
    public Uri insert(Uri uri, ContentValues initialValues) { /* implementation hidden */ }
        // A map to hold the new record's values.
        // Opens the database object in "write" mode.
        // Performs the insert and returns the ID of the new note.
        // If insert succeeded, the row ID exists.
            // Creates a URI with the note ID pattern and the new row ID appended to it.
            // Notifies observers registered against this provider that the data changed.
}

        // If the insert didn't succeed, then the rowID is <= 0. Throws an exception.
    @Override
    public int delete(Uri uri, String where, String[] whereArgs) { /* implementation hidden */ }
        // Opens the database object in "write" mode.
            // If there were additional selection criteria, append them to the final
            // WHERE clause
}
             // If the incoming pattern is invalid, throws an exception.

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) { /* implementation hidden */ }
        // Opens the database object in "write" mode.
                // Does the update and returns the number of rows updated.
                // From the incoming URI, get the note ID
                /*
                 * Starts creating the final WHERE clause by restricting it to the incoming
                 * note ID.
                 */
                // If there were additional selection criteria, append them to the final WHERE clause
}


                // Does the update and returns the number of rows updated.
                                              // placeholders for selectionArgs
                                              // null if the values are in the where argument.

    @Override
            String sortOrder) { /* implementation hidden */ }
                        // the position of the note ID itself in the incoming URI
                // If the URI doesn't match any of the known patterns, throw an exception.
}


        // Opens the database object in "read" mode, since no writes need to be done.

        /*
         * Performs the query. If no problems occur trying to read the database, then a Cursor
         * object is returned; otherwise, the cursor variable contains null. If no records were
         * selected, then the Cursor object is empty, and Cursor.getCount() returns 0.
         */

        // Tells the Cursor what URI to watch, so it knows when its source data changes

    @Override
    public String getType(Uri arg0) { /* implementation hidden */ }
}
    public static class FQCSQLiteHelper extends SQLiteOpenHelper{ /* implementation hidden */ }
        //private FQCSQLiteHelper sSingleton = null;
        // FihTdcCode@20160122 Edwin modify DATABASE_VERSION from 307 to 308 to record more information in database
        // Tony modify DATABASE_VERSION from 308 to 309 to record display category of test item
        public FQCSQLiteHelper(Context context) { /* implementation hidden */ }
        public void onCreate(SQLiteDatabase db) { /* implementation hidden */ }
        public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) { /* implementation hidden */ }
        public void createTable(SQLiteDatabase db){ /* implementation hidden */ }
                    // FihTdcCode@20160122 Edwin add to record more information {
                    // FihTdcCode@20160122 Edwin add to record more information }
        private void dropTables(SQLiteDatabase db){ /* implementation hidden */ }
}
    public static class FQCColumn implements BaseColumns{ /* implementation hidden */ }
        /**
         * The scheme part for this provider's URI
         */
        /**
         * Path part for the Notes URI
         */
        /**
         * Path part for the Note ID URI
         */
        /**
         * 0-relative position of a note ID segment in the path part of a note ID URI
         */
        /**
         * The content:// style URL for this table
         */
        /**
         * The content URI base for a single note. Callers must
         * append a numeric item id to this Uri to retrieve a note
         */
        /**
         * The content URI match pattern for a single note, specified by its ID. Use this to match
         * incoming URIs or to construct an Intent.
         */
        /*
         * MIME type definitions
         */
        /**
         * The MIME type of {@link #CONTENT_URI} providing a directory of notes.
         */
        /**
         * The MIME type of a {@link #CONTENT_URI} sub-directory of a single
         * note.
         */
        /*
         * Column definitions
         */
        // this  column records english name of fqc's item ,it must be English
        // <P>Type: TEXT</P>
        // this  column records Chinese name of fqc's item
        //<P>Type: TEXT</P>
        // this column for costing time for test the items
        //<P>Type: INTEGER</P>
        // this column for recording the result of testing item
        //<P>Type: BOOLEAN </P>
        // this column for recording the test times of testing item
        //<P>Type: INTEGER </P>
        // FihTdcCode@20160122 Edwin add to record more information {
        // FihTdcCode@20160122 Edwin add to record more information }
        // keep DISP_CATEGORY_FAIL, DISP_CATEGORY_PASS or DISP_CATEGORY_UNTEST
}
