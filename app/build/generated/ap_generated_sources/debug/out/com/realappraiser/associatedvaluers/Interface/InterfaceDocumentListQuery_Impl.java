package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.Document_list;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceDocumentListQuery_Impl implements InterfaceDocumentListQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDocument_list;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  public InterfaceDocumentListQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDocument_list = new EntityInsertionAdapter<Document_list>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Document_list`(`dummyID`,`Id`,`DocumentName`,`VisibleToFieldStaff`,`Title`,`Document`,`CaseId`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Document_list value) {
        stmt.bindLong(1, value.dummyID);
        if (value.Id == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.Id);
        }
        if (value.DocumentName == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.DocumentName);
        }
        if (value.VisibleToFieldStaff == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.VisibleToFieldStaff);
        }
        if (value.Title == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.Title);
        }
        if (value.Document == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.Document);
        }
        stmt.bindLong(7, value.CaseId);
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Document_list where CaseId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Document_list";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(Document_list document_list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDocument_list.insert(document_list);
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
  public List<Document_list> getDocument_list() {
    final String _sql = "SELECT * FROM Document_list";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final List<Document_list> _result = new ArrayList<Document_list>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Document_list _item;
        _item = new Document_list();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        _item.Id = _cursor.getString(_cursorIndexOfId);
        _item.DocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.VisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.Title = _cursor.getString(_cursorIndexOfTitle);
        _item.Document = _cursor.getString(_cursorIndexOfDocument);
        _item.CaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Document_list> getDocument_list_caseID(int caseid_) {
    final String _sql = "SELECT * FROM Document_list where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final List<Document_list> _result = new ArrayList<Document_list>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Document_list _item;
        _item = new Document_list();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        _item.Id = _cursor.getString(_cursorIndexOfId);
        _item.DocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.VisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.Title = _cursor.getString(_cursorIndexOfTitle);
        _item.Document = _cursor.getString(_cursorIndexOfDocument);
        _item.CaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
