package marcusobyrne.bankingapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;
import android.widget.EditText;

public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "user.db";
    public static final String TABLE_USER = "user";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ADDRESS1 = "address1";
    public static final String COLUMN_ADDRESS2 = "address2";
    public static final String COLUMN_ACCNO = "accNo";
    public static final String COLUMN_PIN = "PIN";
    public static final String COLUMN_BALANCE = "currentbalance";


    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_USER + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_ADDRESS1 + " TEXT, " +
                COLUMN_ADDRESS2 + " TEXT, " +
                COLUMN_ACCNO + " INTEGER, " +
                COLUMN_PIN + " INTEGER UNIQUE, " +
                COLUMN_BALANCE + " INTEGER " +
                ");";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER + ";");
        onCreate(db);
    }

    //Add new row
    public void addUser(User user){
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, user.get_name());
        values.put(COLUMN_ADDRESS1, user.get_address1());
        values.put(COLUMN_ADDRESS2, user.get_address2());
        values.put(COLUMN_ACCNO, user.get_accNo());
        values.put(COLUMN_PIN, user.get_PIN());
        values.put(COLUMN_BALANCE, user.get_currentbalance());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_USER, null, values);
        db.close();

    }

    public void searchPIN(int PIN){

        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_USER + " WHERE " + COLUMN_PIN + " LIKE " + PIN + ";";

        Cursor cursor = db.rawQuery(query, null);
        String a, b, c, d, e, f;

        if(cursor.moveToFirst()){
            do{

                e = cursor.getString(4);
                if(e.equals(PIN)){

                    a = cursor.getString(0);
                    b = cursor.getString(1);
                    c = cursor.getString(2);
                    d = cursor.getString(3);
                    f = cursor.getString(5);
                    break;
                }

            }while(cursor.moveToNext());
        }
    }

    //Delete a user from the database
    public void deleteUser(String name){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_USER + " WHERE " + COLUMN_NAME + "=\"" + name + "\";");
    }

    //Display DB as string
    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();

        String query = "SELECT * FROM " + TABLE_USER + " WHERE 1";

        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();

        while(!c.isAfterLast()){

            if(c.getString(c.getColumnIndex("name")) != null){
                dbString += c.getString(c.getColumnIndex("name"));
                dbString += "\n";
            }
        }

        db.close();
        return dbString;
    }

    public int updateUser(User user) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, user.get_name());
        values.put(COLUMN_ADDRESS1, user.get_address1());
        values.put(COLUMN_ADDRESS2, user.get_address2());
        values.put(COLUMN_ACCNO, user.get_accNo());
        values.put(COLUMN_PIN, user.get_PIN());
        values.put(COLUMN_BALANCE, user.get_currentbalance());

        // updating row
        return db.update(TABLE_USER, values, COLUMN_ID + " = ?",
                new String[]{String.valueOf(user.get_id())});

    }

    public boolean checkUser(String PIN) {

        // array of columns to fetch
        String[] columns = {
                COLUMN_ID
        };
        SQLiteDatabase db = this.getReadableDatabase();
        // selection criteria
        String selection = COLUMN_PIN + " = ?";

        // selection arguments
        String[] selectionArgs = {PIN};

        Cursor cursor = db.query(TABLE_USER,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null);                      

        int cursorCount = cursor.getCount();

        cursor.close();
        db.close();
        if (cursorCount > 0) {
            return true;
        }

        return false;
    }


}
