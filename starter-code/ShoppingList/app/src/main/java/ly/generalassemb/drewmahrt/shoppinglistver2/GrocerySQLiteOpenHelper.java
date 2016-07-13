package ly.generalassemb.drewmahrt.shoppinglistver2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by TuckingFypos on 7/12/16.
 */
public class GrocerySQLiteOpenHelper extends SQLiteOpenHelper{
    private static final String TAG = GrocerySQLiteOpenHelper.class.getCanonicalName();

    private static GrocerySQLiteOpenHelper instance;

    private static final int DATABASE_VERSION = 7;
    public static final String DATABASE_NAME = "SHOPPING_DB";
    public static final String TABLE_NAME = "SHOPPING_LIST";
    /*public static final String COL_ID = "_id";
    public static final String COL_NAME = "ITEM_NAME";*/





    public static GrocerySQLiteOpenHelper getInstance(Context context){
        if(instance == null){
            instance = new GrocerySQLiteOpenHelper(context.getApplicationContext());
        }
        return instance;
    }




    private GrocerySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }

    public Cursor getAllItems(){
        SQLiteDatabase db = getReadableDatabase();
        return db.query(TABLE_NAME,null,null,null,null,null,null,null);
    }
}
