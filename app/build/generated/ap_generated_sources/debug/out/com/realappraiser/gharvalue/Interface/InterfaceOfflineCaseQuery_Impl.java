package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.OflineCase;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceOfflineCaseQuery_Impl implements InterfaceOfflineCaseQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOflineCase;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  public InterfaceOfflineCaseQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOflineCase = new EntityInsertionAdapter<OflineCase>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `OflineCase`(`dummyID`,`caseId`,`PropertyId`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OflineCase value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getPropertyId());
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM OflineCase where CaseId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM OflineCase";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(OflineCase oflineCase) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOflineCase.insert(oflineCase);
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
  public List<OflineCase> get_OflineCase() {
    final String _sql = "SELECT * FROM OflineCase";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final List<OflineCase> _result = new ArrayList<OflineCase>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OflineCase _item;
        _item = new OflineCase();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
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
  public List<OflineCase> getOflineCase_caseID(int caseid_) {
    final String _sql = "SELECT * FROM OflineCase where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final List<OflineCase> _result = new ArrayList<OflineCase>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OflineCase _item;
        _item = new OflineCase();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
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
