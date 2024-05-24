package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.IndPropertyFloorsValuation;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceIndPropertyFloorsValuationQuery_Impl implements InterfaceIndPropertyFloorsValuationQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfIndPropertyFloorsValuation;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfIndPropertyFloorsValuation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public InterfaceIndPropertyFloorsValuationQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIndPropertyFloorsValuation = new EntityInsertionAdapter<IndPropertyFloorsValuation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `IndPropertyFloorsValuationModal`(`dummyID`,`caseId`,`floorNo`,`documentConstrRate`,`documentConstrValue`,`measuredConstrRate`,`measuredConstrValue`,`floorDepreciationValue`,`createdOn`,`createdBy`,`modifiedBy`,`floorCarpetArea`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyFloorsValuation value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getFloorNo());
        if (value.getDocumentConstrRate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDocumentConstrRate());
        }
        if (value.getDocumentConstrValue() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDocumentConstrValue());
        }
        if (value.getMeasuredConstrRate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMeasuredConstrRate());
        }
        if (value.getMeasuredConstrValue() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getMeasuredConstrValue());
        }
        if (value.getFloorDepreciationValue() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFloorDepreciationValue());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCreatedOn());
        }
        stmt.bindLong(10, value.getCreatedBy());
        stmt.bindLong(11, value.getModifiedBy());
        if (value.getFloorCarpetArea() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getFloorCarpetArea());
        }
      }
    };
    this.__deletionAdapterOfIndPropertyFloorsValuation = new EntityDeletionOrUpdateAdapter<IndPropertyFloorsValuation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `IndPropertyFloorsValuationModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyFloorsValuation value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyFloorsValuationModal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyFloorsValuationModal where CaseId = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(IndPropertyFloorsValuation indPropertyFloorsValuation) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIndPropertyFloorsValuation.insert(indPropertyFloorsValuation);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(IndPropertyFloorsValuation indPropertyFloorsValuation) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfIndPropertyFloorsValuation.handle(indPropertyFloorsValuation);
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
  public List<IndPropertyFloorsValuation> geIndPropertyFloorsValuation() {
    final String _sql = "SELECT * FROM IndPropertyFloorsValuationModal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfFloorNo = _cursor.getColumnIndexOrThrow("floorNo");
      final int _cursorIndexOfDocumentConstrRate = _cursor.getColumnIndexOrThrow("documentConstrRate");
      final int _cursorIndexOfDocumentConstrValue = _cursor.getColumnIndexOrThrow("documentConstrValue");
      final int _cursorIndexOfMeasuredConstrRate = _cursor.getColumnIndexOrThrow("measuredConstrRate");
      final int _cursorIndexOfMeasuredConstrValue = _cursor.getColumnIndexOrThrow("measuredConstrValue");
      final int _cursorIndexOfFloorDepreciationValue = _cursor.getColumnIndexOrThrow("floorDepreciationValue");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfFloorCarpetArea = _cursor.getColumnIndexOrThrow("floorCarpetArea");
      final List<IndPropertyFloorsValuation> _result = new ArrayList<IndPropertyFloorsValuation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyFloorsValuation _item;
        _item = new IndPropertyFloorsValuation();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpFloorNo;
        _tmpFloorNo = _cursor.getInt(_cursorIndexOfFloorNo);
        _item.setFloorNo(_tmpFloorNo);
        final String _tmpDocumentConstrRate;
        _tmpDocumentConstrRate = _cursor.getString(_cursorIndexOfDocumentConstrRate);
        _item.setDocumentConstrRate(_tmpDocumentConstrRate);
        final String _tmpDocumentConstrValue;
        _tmpDocumentConstrValue = _cursor.getString(_cursorIndexOfDocumentConstrValue);
        _item.setDocumentConstrValue(_tmpDocumentConstrValue);
        final String _tmpMeasuredConstrRate;
        _tmpMeasuredConstrRate = _cursor.getString(_cursorIndexOfMeasuredConstrRate);
        _item.setMeasuredConstrRate(_tmpMeasuredConstrRate);
        final String _tmpMeasuredConstrValue;
        _tmpMeasuredConstrValue = _cursor.getString(_cursorIndexOfMeasuredConstrValue);
        _item.setMeasuredConstrValue(_tmpMeasuredConstrValue);
        final String _tmpFloorDepreciationValue;
        _tmpFloorDepreciationValue = _cursor.getString(_cursorIndexOfFloorDepreciationValue);
        _item.setFloorDepreciationValue(_tmpFloorDepreciationValue);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final int _tmpCreatedBy;
        _tmpCreatedBy = _cursor.getInt(_cursorIndexOfCreatedBy);
        _item.setCreatedBy(_tmpCreatedBy);
        final int _tmpModifiedBy;
        _tmpModifiedBy = _cursor.getInt(_cursorIndexOfModifiedBy);
        _item.setModifiedBy(_tmpModifiedBy);
        final String _tmpFloorCarpetArea;
        _tmpFloorCarpetArea = _cursor.getString(_cursorIndexOfFloorCarpetArea);
        _item.setFloorCarpetArea(_tmpFloorCarpetArea);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<IndPropertyFloorsValuation> getIndPropertyFloorsValuation_caseID(int caseid_) {
    final String _sql = "SELECT * FROM IndPropertyFloorsValuationModal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfFloorNo = _cursor.getColumnIndexOrThrow("floorNo");
      final int _cursorIndexOfDocumentConstrRate = _cursor.getColumnIndexOrThrow("documentConstrRate");
      final int _cursorIndexOfDocumentConstrValue = _cursor.getColumnIndexOrThrow("documentConstrValue");
      final int _cursorIndexOfMeasuredConstrRate = _cursor.getColumnIndexOrThrow("measuredConstrRate");
      final int _cursorIndexOfMeasuredConstrValue = _cursor.getColumnIndexOrThrow("measuredConstrValue");
      final int _cursorIndexOfFloorDepreciationValue = _cursor.getColumnIndexOrThrow("floorDepreciationValue");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfFloorCarpetArea = _cursor.getColumnIndexOrThrow("floorCarpetArea");
      final List<IndPropertyFloorsValuation> _result = new ArrayList<IndPropertyFloorsValuation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyFloorsValuation _item;
        _item = new IndPropertyFloorsValuation();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpFloorNo;
        _tmpFloorNo = _cursor.getInt(_cursorIndexOfFloorNo);
        _item.setFloorNo(_tmpFloorNo);
        final String _tmpDocumentConstrRate;
        _tmpDocumentConstrRate = _cursor.getString(_cursorIndexOfDocumentConstrRate);
        _item.setDocumentConstrRate(_tmpDocumentConstrRate);
        final String _tmpDocumentConstrValue;
        _tmpDocumentConstrValue = _cursor.getString(_cursorIndexOfDocumentConstrValue);
        _item.setDocumentConstrValue(_tmpDocumentConstrValue);
        final String _tmpMeasuredConstrRate;
        _tmpMeasuredConstrRate = _cursor.getString(_cursorIndexOfMeasuredConstrRate);
        _item.setMeasuredConstrRate(_tmpMeasuredConstrRate);
        final String _tmpMeasuredConstrValue;
        _tmpMeasuredConstrValue = _cursor.getString(_cursorIndexOfMeasuredConstrValue);
        _item.setMeasuredConstrValue(_tmpMeasuredConstrValue);
        final String _tmpFloorDepreciationValue;
        _tmpFloorDepreciationValue = _cursor.getString(_cursorIndexOfFloorDepreciationValue);
        _item.setFloorDepreciationValue(_tmpFloorDepreciationValue);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final int _tmpCreatedBy;
        _tmpCreatedBy = _cursor.getInt(_cursorIndexOfCreatedBy);
        _item.setCreatedBy(_tmpCreatedBy);
        final int _tmpModifiedBy;
        _tmpModifiedBy = _cursor.getInt(_cursorIndexOfModifiedBy);
        _item.setModifiedBy(_tmpModifiedBy);
        final String _tmpFloorCarpetArea;
        _tmpFloorCarpetArea = _cursor.getString(_cursorIndexOfFloorCarpetArea);
        _item.setFloorCarpetArea(_tmpFloorCarpetArea);
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
    final String _sql = "SELECT COUNT(*) from IndPropertyFloorsValuationModal";
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
