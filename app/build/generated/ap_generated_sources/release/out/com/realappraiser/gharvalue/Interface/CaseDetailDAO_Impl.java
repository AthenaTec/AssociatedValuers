package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.CaseDetail;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class CaseDetailDAO_Impl implements CaseDetailDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCaseDetail;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCaseDetail;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCaseDetail;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public CaseDetailDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCaseDetail = new EntityInsertionAdapter<CaseDetail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CaseDetail`(`dummyID`,`id`,`name`,`caseid`,`caseObj`,`propertyObj`,`indpropertyObj`,`indpropertyvaluationObj`,`indpropertyfloorsObj`,`indpropertyfloorsvaluationObj`,`proximityObj`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CaseDetail value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getCaseid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCaseid());
        }
        if (value.getCaseObj() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCaseObj());
        }
        if (value.getPropertyObj() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPropertyObj());
        }
        if (value.getIndpropertyObj() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIndpropertyObj());
        }
        if (value.getIndpropertyvaluationObj() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getIndpropertyvaluationObj());
        }
        if (value.getIndpropertyfloorsObj() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIndpropertyfloorsObj());
        }
        if (value.getIndpropertyfloorsvaluationObj() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getIndpropertyfloorsvaluationObj());
        }
        if (value.getProximityObj() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getProximityObj());
        }
      }
    };
    this.__deletionAdapterOfCaseDetail = new EntityDeletionOrUpdateAdapter<CaseDetail>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CaseDetail` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CaseDetail value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__updateAdapterOfCaseDetail = new EntityDeletionOrUpdateAdapter<CaseDetail>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CaseDetail` SET `dummyID` = ?,`id` = ?,`name` = ?,`caseid` = ?,`caseObj` = ?,`propertyObj` = ?,`indpropertyObj` = ?,`indpropertyvaluationObj` = ?,`indpropertyfloorsObj` = ?,`indpropertyfloorsvaluationObj` = ?,`proximityObj` = ? WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CaseDetail value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getCaseid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCaseid());
        }
        if (value.getCaseObj() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCaseObj());
        }
        if (value.getPropertyObj() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPropertyObj());
        }
        if (value.getIndpropertyObj() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getIndpropertyObj());
        }
        if (value.getIndpropertyvaluationObj() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getIndpropertyvaluationObj());
        }
        if (value.getIndpropertyfloorsObj() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getIndpropertyfloorsObj());
        }
        if (value.getIndpropertyfloorsvaluationObj() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getIndpropertyfloorsvaluationObj());
        }
        if (value.getProximityObj() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getProximityObj());
        }
        stmt.bindLong(12, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casedetail";
        return _query;
      }
    };
  }

  @Override
  public long insertCase(CaseDetail caseDetail) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCaseDetail.insertAndReturnId(caseDetail);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCase(CaseDetail caseDetail) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCaseDetail.handle(caseDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllCase(List<CaseDetail> getallDetails) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCaseDetail.handleMultiple(getallDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCase(CaseDetail caseDetail) {
    __db.beginTransaction();
    try {
      __updateAdapterOfCaseDetail.handle(caseDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteRow() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRow.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRow.release(_stmt);
    }
  }

  @Override
  public List<CaseDetail> getallDetails() {
    final String _sql = "SELECT * FROM casedetail";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCaseid = _cursor.getColumnIndexOrThrow("caseid");
      final int _cursorIndexOfCaseObj = _cursor.getColumnIndexOrThrow("caseObj");
      final int _cursorIndexOfPropertyObj = _cursor.getColumnIndexOrThrow("propertyObj");
      final int _cursorIndexOfIndpropertyObj = _cursor.getColumnIndexOrThrow("indpropertyObj");
      final int _cursorIndexOfIndpropertyvaluationObj = _cursor.getColumnIndexOrThrow("indpropertyvaluationObj");
      final int _cursorIndexOfIndpropertyfloorsObj = _cursor.getColumnIndexOrThrow("indpropertyfloorsObj");
      final int _cursorIndexOfIndpropertyfloorsvaluationObj = _cursor.getColumnIndexOrThrow("indpropertyfloorsvaluationObj");
      final int _cursorIndexOfProximityObj = _cursor.getColumnIndexOrThrow("proximityObj");
      final List<CaseDetail> _result = new ArrayList<CaseDetail>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CaseDetail _item;
        _item = new CaseDetail();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpCaseid;
        _tmpCaseid = _cursor.getString(_cursorIndexOfCaseid);
        _item.setCaseid(_tmpCaseid);
        final String _tmpCaseObj;
        _tmpCaseObj = _cursor.getString(_cursorIndexOfCaseObj);
        _item.setCaseObj(_tmpCaseObj);
        final String _tmpPropertyObj;
        _tmpPropertyObj = _cursor.getString(_cursorIndexOfPropertyObj);
        _item.setPropertyObj(_tmpPropertyObj);
        final String _tmpIndpropertyObj;
        _tmpIndpropertyObj = _cursor.getString(_cursorIndexOfIndpropertyObj);
        _item.setIndpropertyObj(_tmpIndpropertyObj);
        final String _tmpIndpropertyvaluationObj;
        _tmpIndpropertyvaluationObj = _cursor.getString(_cursorIndexOfIndpropertyvaluationObj);
        _item.setIndpropertyvaluationObj(_tmpIndpropertyvaluationObj);
        final String _tmpIndpropertyfloorsObj;
        _tmpIndpropertyfloorsObj = _cursor.getString(_cursorIndexOfIndpropertyfloorsObj);
        _item.setIndpropertyfloorsObj(_tmpIndpropertyfloorsObj);
        final String _tmpIndpropertyfloorsvaluationObj;
        _tmpIndpropertyfloorsvaluationObj = _cursor.getString(_cursorIndexOfIndpropertyfloorsvaluationObj);
        _item.setIndpropertyfloorsvaluationObj(_tmpIndpropertyfloorsvaluationObj);
        final String _tmpProximityObj;
        _tmpProximityObj = _cursor.getString(_cursorIndexOfProximityObj);
        _item.setProximityObj(_tmpProximityObj);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CaseDetail getCaseByID(String caseidIn) {
    final String _sql = "SELECT * FROM casedetail WHERE caseid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfCaseid = _cursor.getColumnIndexOrThrow("caseid");
      final int _cursorIndexOfCaseObj = _cursor.getColumnIndexOrThrow("caseObj");
      final int _cursorIndexOfPropertyObj = _cursor.getColumnIndexOrThrow("propertyObj");
      final int _cursorIndexOfIndpropertyObj = _cursor.getColumnIndexOrThrow("indpropertyObj");
      final int _cursorIndexOfIndpropertyvaluationObj = _cursor.getColumnIndexOrThrow("indpropertyvaluationObj");
      final int _cursorIndexOfIndpropertyfloorsObj = _cursor.getColumnIndexOrThrow("indpropertyfloorsObj");
      final int _cursorIndexOfIndpropertyfloorsvaluationObj = _cursor.getColumnIndexOrThrow("indpropertyfloorsvaluationObj");
      final int _cursorIndexOfProximityObj = _cursor.getColumnIndexOrThrow("proximityObj");
      final CaseDetail _result;
      if(_cursor.moveToFirst()) {
        _result = new CaseDetail();
        _result.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpCaseid;
        _tmpCaseid = _cursor.getString(_cursorIndexOfCaseid);
        _result.setCaseid(_tmpCaseid);
        final String _tmpCaseObj;
        _tmpCaseObj = _cursor.getString(_cursorIndexOfCaseObj);
        _result.setCaseObj(_tmpCaseObj);
        final String _tmpPropertyObj;
        _tmpPropertyObj = _cursor.getString(_cursorIndexOfPropertyObj);
        _result.setPropertyObj(_tmpPropertyObj);
        final String _tmpIndpropertyObj;
        _tmpIndpropertyObj = _cursor.getString(_cursorIndexOfIndpropertyObj);
        _result.setIndpropertyObj(_tmpIndpropertyObj);
        final String _tmpIndpropertyvaluationObj;
        _tmpIndpropertyvaluationObj = _cursor.getString(_cursorIndexOfIndpropertyvaluationObj);
        _result.setIndpropertyvaluationObj(_tmpIndpropertyvaluationObj);
        final String _tmpIndpropertyfloorsObj;
        _tmpIndpropertyfloorsObj = _cursor.getString(_cursorIndexOfIndpropertyfloorsObj);
        _result.setIndpropertyfloorsObj(_tmpIndpropertyfloorsObj);
        final String _tmpIndpropertyfloorsvaluationObj;
        _tmpIndpropertyfloorsvaluationObj = _cursor.getString(_cursorIndexOfIndpropertyfloorsvaluationObj);
        _result.setIndpropertyfloorsvaluationObj(_tmpIndpropertyfloorsvaluationObj);
        final String _tmpProximityObj;
        _tmpProximityObj = _cursor.getString(_cursorIndexOfProximityObj);
        _result.setProximityObj(_tmpProximityObj);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
