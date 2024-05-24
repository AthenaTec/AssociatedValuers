package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.TypeOfProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class TypeofPropertyQuery_Impl implements TypeofPropertyQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTypeOfProperty;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTypeOfProperty;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTypeOfProperty;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  public TypeofPropertyQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTypeOfProperty = new EntityInsertionAdapter<TypeOfProperty>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `TypeOfProperty`(`dummyID`,`TypeOfPropertyId`,`Name`,`isActive`,`PropertyCategoryId`,`CreatedOn`,`CreatedBy`,`ModifiedOn`,`ModifiedBy`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TypeOfProperty value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.TypeOfPropertyId);
        if (value.Name == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.Name);
        }
        if (value.isActive == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.isActive);
        }
        if (value.PropertyCategoryId == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.PropertyCategoryId);
        }
        if (value.CreatedOn == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.CreatedOn);
        }
        if (value.CreatedBy == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.CreatedBy);
        }
        if (value.ModifiedOn == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.ModifiedOn);
        }
        if (value.ModifiedBy == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.ModifiedBy);
        }
      }
    };
    this.__deletionAdapterOfTypeOfProperty = new EntityDeletionOrUpdateAdapter<TypeOfProperty>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `TypeOfProperty` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TypeOfProperty value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__updateAdapterOfTypeOfProperty = new EntityDeletionOrUpdateAdapter<TypeOfProperty>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TypeOfProperty` SET `dummyID` = ?,`TypeOfPropertyId` = ?,`Name` = ?,`isActive` = ?,`PropertyCategoryId` = ?,`CreatedOn` = ?,`CreatedBy` = ?,`ModifiedOn` = ?,`ModifiedBy` = ? WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TypeOfProperty value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.TypeOfPropertyId);
        if (value.Name == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.Name);
        }
        if (value.isActive == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.isActive);
        }
        if (value.PropertyCategoryId == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.PropertyCategoryId);
        }
        if (value.CreatedOn == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.CreatedOn);
        }
        if (value.CreatedBy == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.CreatedBy);
        }
        if (value.ModifiedOn == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.ModifiedOn);
        }
        if (value.ModifiedBy == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.ModifiedBy);
        }
        stmt.bindLong(10, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM typeofproperty";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(TypeOfProperty dataModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTypeOfProperty.insert(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(TypeOfProperty dataModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfTypeOfProperty.handle(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(TypeOfProperty dataModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTypeOfProperty.handle(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
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
  public List<TypeOfProperty> getTypeofPropertyModels() {
    final String _sql = "SELECT * FROM typeofproperty";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfIsActive = _cursor.getColumnIndexOrThrow("isActive");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("CreatedBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("ModifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("ModifiedBy");
      final List<TypeOfProperty> _result = new ArrayList<TypeOfProperty>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TypeOfProperty _item;
        _item = new TypeOfProperty();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        _item.TypeOfPropertyId = _cursor.getInt(_cursorIndexOfTypeOfPropertyId);
        _item.Name = _cursor.getString(_cursorIndexOfName);
        _item.isActive = _cursor.getString(_cursorIndexOfIsActive);
        _item.PropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.CreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.CreatedBy = _cursor.getString(_cursorIndexOfCreatedBy);
        _item.ModifiedOn = _cursor.getString(_cursorIndexOfModifiedOn);
        _item.ModifiedBy = _cursor.getString(_cursorIndexOfModifiedBy);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countdata() {
    final String _sql = "SELECT COUNT(*) from typeofproperty";
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
