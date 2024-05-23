package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.LatLongDetails;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceLatLongQuery_Impl implements InterfaceLatLongQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfLatLongDetails;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  public InterfaceLatLongQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLatLongDetails = new EntityInsertionAdapter<LatLongDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LatLongDetails`(`dummyID`,`caseId`,`latLongDetails`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LatLongDetails value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        if (value.getLatLongDetails() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLatLongDetails());
        }
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM LatLongDetails where CaseId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM LatLongDetails";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(LatLongDetails latLongDetails) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLatLongDetails.insert(latLongDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow(int caseid_) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRow.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, caseid_);
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
  public List<LatLongDetails> getLatLongDetails_caseID(int caseid_) {
    final String _sql = "SELECT * FROM LatLongDetails where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfLatLongDetails = _cursor.getColumnIndexOrThrow("latLongDetails");
      final List<LatLongDetails> _result = new ArrayList<LatLongDetails>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LatLongDetails _item;
        _item = new LatLongDetails();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final String _tmpLatLongDetails;
        _tmpLatLongDetails = _cursor.getString(_cursorIndexOfLatLongDetails);
        _item.setLatLongDetails(_tmpLatLongDetails);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
