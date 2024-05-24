package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.PropertyUpdateRoomDB;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class PropertyUpdateCategory_Impl implements PropertyUpdateCategory {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPropertyUpdateRoomDB;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfPropertyUpdateRoomDB;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfPropertyUpdateRoomDB;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePropertytype;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  public PropertyUpdateCategory_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPropertyUpdateRoomDB = new EntityInsertionAdapter<PropertyUpdateRoomDB>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PropertyUpdateRoomDB`(`property_id`,`caseid`,`property_type`,`property_category_id`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PropertyUpdateRoomDB value) {
        stmt.bindLong(1, value.property_id);
        if (value.caseid == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.caseid);
        }
        if (value.property_type == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.property_type);
        }
        if (value.property_category_id == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.property_category_id);
        }
      }
    };
    this.__deletionAdapterOfPropertyUpdateRoomDB = new EntityDeletionOrUpdateAdapter<PropertyUpdateRoomDB>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PropertyUpdateRoomDB` WHERE `property_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PropertyUpdateRoomDB value) {
        stmt.bindLong(1, value.property_id);
      }
    };
    this.__updateAdapterOfPropertyUpdateRoomDB = new EntityDeletionOrUpdateAdapter<PropertyUpdateRoomDB>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PropertyUpdateRoomDB` SET `property_id` = ?,`caseid` = ?,`property_type` = ?,`property_category_id` = ? WHERE `property_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PropertyUpdateRoomDB value) {
        stmt.bindLong(1, value.property_id);
        if (value.caseid == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.caseid);
        }
        if (value.property_type == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.property_type);
        }
        if (value.property_category_id == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.property_category_id);
        }
        stmt.bindLong(5, value.property_id);
      }
    };
    this.__preparedStmtOfUpdatePropertytype = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update propertyupdateroomdb set property_type=?, property_category_id=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM propertyupdateroomdb";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(PropertyUpdateRoomDB propertyupdateroomdb) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPropertyUpdateRoomDB.insert(propertyupdateroomdb);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(PropertyUpdateRoomDB propertyupdateroomdb) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfPropertyUpdateRoomDB.handle(propertyupdateroomdb);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(PropertyUpdateRoomDB propertyupdateroomdb) {
    __db.beginTransaction();
    try {
      __updateAdapterOfPropertyUpdateRoomDB.handle(propertyupdateroomdb);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long updatePropertytype(String isproperty_type, String isproperty_category_id,
      String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePropertytype.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (isproperty_type == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isproperty_type);
      }
      _argIndex = 2;
      if (isproperty_category_id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isproperty_category_id);
      }
      _argIndex = 3;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePropertytype.release(_stmt);
    }
  }

  @Override
  public void deleteTable() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTable.release(_stmt);
    }
  }

  @Override
  public void deleteRow() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTable.release(_stmt);
    }
  }

  @Override
  public List<PropertyUpdateRoomDB> getPropertyUpdateModel() {
    final String _sql = "SELECT * FROM propertyupdateroomdb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("property_id");
      final int _cursorIndexOfCaseid = _cursor.getColumnIndexOrThrow("caseid");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("property_type");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("property_category_id");
      final List<PropertyUpdateRoomDB> _result = new ArrayList<PropertyUpdateRoomDB>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PropertyUpdateRoomDB _item;
        _item = new PropertyUpdateRoomDB();
        _item.property_id = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.caseid = _cursor.getString(_cursorIndexOfCaseid);
        _item.property_type = _cursor.getString(_cursorIndexOfPropertyType);
        _item.property_category_id = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PropertyUpdateRoomDB getPropertyUpdateRoomDB(String caseid) {
    final String _sql = "SELECT * FROM propertyupdateroomdb where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseid);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("property_id");
      final int _cursorIndexOfCaseid = _cursor.getColumnIndexOrThrow("caseid");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("property_type");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("property_category_id");
      final PropertyUpdateRoomDB _result;
      if(_cursor.moveToFirst()) {
        _result = new PropertyUpdateRoomDB();
        _result.property_id = _cursor.getInt(_cursorIndexOfPropertyId);
        _result.caseid = _cursor.getString(_cursorIndexOfCaseid);
        _result.property_type = _cursor.getString(_cursorIndexOfPropertyType);
        _result.property_category_id = _cursor.getString(_cursorIndexOfPropertyCategoryId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countdata() {
    final String _sql = "SELECT COUNT(*) from propertyupdateroomdb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
