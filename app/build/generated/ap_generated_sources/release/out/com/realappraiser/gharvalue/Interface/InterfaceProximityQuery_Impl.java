package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.Proximity;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceProximityQuery_Impl implements InterfaceProximityQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfProximity;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfProximity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public InterfaceProximityQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProximity = new EntityInsertionAdapter<Proximity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ProximityModal`(`dummyID`,`id`,`caseId`,`proximityId`,`proximityName`,`proximityDistance`,`createdOn`,`createdBy`,`modifiedOn`,`modifiedBy`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Proximity value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getId());
        stmt.bindLong(3, value.getCaseId());
        stmt.bindLong(4, value.getProximityId());
        if (value.getProximityName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getProximityName());
        }
        if (value.getProximityDistance() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProximityDistance());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreatedOn());
        }
        stmt.bindLong(8, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getModifiedOn());
        }
        stmt.bindLong(10, value.getModifiedBy());
      }
    };
    this.__deletionAdapterOfProximity = new EntityDeletionOrUpdateAdapter<Proximity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ProximityModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Proximity value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ProximityModal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ProximityModal where CaseId = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(Proximity proximity) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfProximity.insert(proximity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Proximity proximity) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfProximity.handle(proximity);
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
  public List<Proximity> getProximity() {
    final String _sql = "SELECT * FROM ProximityModal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfProximityId = _cursor.getColumnIndexOrThrow("proximityId");
      final int _cursorIndexOfProximityName = _cursor.getColumnIndexOrThrow("proximityName");
      final int _cursorIndexOfProximityDistance = _cursor.getColumnIndexOrThrow("proximityDistance");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final List<Proximity> _result = new ArrayList<Proximity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Proximity _item;
        _item = new Proximity();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpProximityId;
        _tmpProximityId = _cursor.getInt(_cursorIndexOfProximityId);
        _item.setProximityId(_tmpProximityId);
        final String _tmpProximityName;
        _tmpProximityName = _cursor.getString(_cursorIndexOfProximityName);
        _item.setProximityName(_tmpProximityName);
        final String _tmpProximityDistance;
        _tmpProximityDistance = _cursor.getString(_cursorIndexOfProximityDistance);
        _item.setProximityDistance(_tmpProximityDistance);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final int _tmpCreatedBy;
        _tmpCreatedBy = _cursor.getInt(_cursorIndexOfCreatedBy);
        _item.setCreatedBy(_tmpCreatedBy);
        final String _tmpModifiedOn;
        _tmpModifiedOn = _cursor.getString(_cursorIndexOfModifiedOn);
        _item.setModifiedOn(_tmpModifiedOn);
        final int _tmpModifiedBy;
        _tmpModifiedBy = _cursor.getInt(_cursorIndexOfModifiedBy);
        _item.setModifiedBy(_tmpModifiedBy);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Proximity> getProximity_caseID(int caseid_) {
    final String _sql = "SELECT * FROM ProximityModal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfProximityId = _cursor.getColumnIndexOrThrow("proximityId");
      final int _cursorIndexOfProximityName = _cursor.getColumnIndexOrThrow("proximityName");
      final int _cursorIndexOfProximityDistance = _cursor.getColumnIndexOrThrow("proximityDistance");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final List<Proximity> _result = new ArrayList<Proximity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Proximity _item;
        _item = new Proximity();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpProximityId;
        _tmpProximityId = _cursor.getInt(_cursorIndexOfProximityId);
        _item.setProximityId(_tmpProximityId);
        final String _tmpProximityName;
        _tmpProximityName = _cursor.getString(_cursorIndexOfProximityName);
        _item.setProximityName(_tmpProximityName);
        final String _tmpProximityDistance;
        _tmpProximityDistance = _cursor.getString(_cursorIndexOfProximityDistance);
        _item.setProximityDistance(_tmpProximityDistance);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final int _tmpCreatedBy;
        _tmpCreatedBy = _cursor.getInt(_cursorIndexOfCreatedBy);
        _item.setCreatedBy(_tmpCreatedBy);
        final String _tmpModifiedOn;
        _tmpModifiedOn = _cursor.getString(_cursorIndexOfModifiedOn);
        _item.setModifiedOn(_tmpModifiedOn);
        final int _tmpModifiedBy;
        _tmpModifiedBy = _cursor.getInt(_cursorIndexOfModifiedBy);
        _item.setModifiedBy(_tmpModifiedBy);
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
    final String _sql = "SELECT COUNT(*) from ProximityModal";
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
