package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.GetPhoto_measurment;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceGetPhotoMeasurmentQuery_Impl implements InterfaceGetPhotoMeasurmentQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfGetPhoto_measurment;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfGetPhoto_measurment;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  public InterfaceGetPhotoMeasurmentQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGetPhoto_measurment = new EntityInsertionAdapter<GetPhoto_measurment>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `GetPhoto_measurmentModel`(`dummyID`,`Id`,`Logo`,`Title`,`newimage`,`defaultimage`,`PropertyId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GetPhoto_measurment value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getId());
        if (value.getLogo() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLogo());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        final int _tmp;
        _tmp = value.isNewimage() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isDefaultimage() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        stmt.bindLong(7, value.getPropertyId());
      }
    };
    this.__deletionAdapterOfGetPhoto_measurment = new EntityDeletionOrUpdateAdapter<GetPhoto_measurment>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `GetPhoto_measurmentModel` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GetPhoto_measurment value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM GetPhoto_measurmentModel where propertyId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM GetPhoto_measurmentModel";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(GetPhoto_measurment getPhoto) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfGetPhoto_measurment.insert(getPhoto);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(GetPhoto_measurment delacase) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfGetPhoto_measurment.handle(delacase);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow(int propertyid) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRow.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, propertyid);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRow.release(_stmt);
    }
  }

  @Override
  public void deleteRow() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRow_1.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRow_1.release(_stmt);
    }
  }

  @Override
  public List<GetPhoto_measurment> getPhoto() {
    final String _sql = "SELECT * FROM GetPhoto_measurmentModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfLogo = _cursor.getColumnIndexOrThrow("Logo");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfNewimage = _cursor.getColumnIndexOrThrow("newimage");
      final int _cursorIndexOfDefaultimage = _cursor.getColumnIndexOrThrow("defaultimage");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final List<GetPhoto_measurment> _result = new ArrayList<GetPhoto_measurment>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final GetPhoto_measurment _item;
        _item = new GetPhoto_measurment();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpLogo;
        _tmpLogo = _cursor.getString(_cursorIndexOfLogo);
        _item.setLogo(_tmpLogo);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final boolean _tmpNewimage;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNewimage);
        _tmpNewimage = _tmp != 0;
        _item.setNewimage(_tmpNewimage);
        final boolean _tmpDefaultimage;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDefaultimage);
        _tmpDefaultimage = _tmp_1 != 0;
        _item.setDefaultimage(_tmpDefaultimage);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<GetPhoto_measurment> getPhoto_propertyid(int propertyid) {
    final String _sql = "SELECT * FROM GetPhoto_measurmentModel where propertyId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, propertyid);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfLogo = _cursor.getColumnIndexOrThrow("Logo");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfNewimage = _cursor.getColumnIndexOrThrow("newimage");
      final int _cursorIndexOfDefaultimage = _cursor.getColumnIndexOrThrow("defaultimage");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final List<GetPhoto_measurment> _result = new ArrayList<GetPhoto_measurment>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final GetPhoto_measurment _item;
        _item = new GetPhoto_measurment();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpLogo;
        _tmpLogo = _cursor.getString(_cursorIndexOfLogo);
        _item.setLogo(_tmpLogo);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final boolean _tmpNewimage;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNewimage);
        _tmpNewimage = _tmp != 0;
        _item.setNewimage(_tmpNewimage);
        final boolean _tmpDefaultimage;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDefaultimage);
        _tmpDefaultimage = _tmp_1 != 0;
        _item.setDefaultimage(_tmpDefaultimage);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
