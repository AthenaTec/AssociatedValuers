package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.IndPropertyFloor;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceIndPropertyFloorsQuery_Impl implements InterfaceIndPropertyFloorsQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfIndPropertyFloor;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfIndPropertyFloor;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public InterfaceIndPropertyFloorsQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIndPropertyFloor = new EntityInsertionAdapter<IndPropertyFloor>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `IndPropertyFloorModal`(`dummyID`,`caseId`,`floorNo`,`floorName`,`constructionStageId`,`percentageCompletion`,`presentConditionId`,`propertyAge`,`residualLife`,`propertyFloorUsageId`,`documentFloorArea`,`documentFloorAreaUnit`,`measuredFloorArea`,`measuredFloorAreaUnit`,`flatHallNo`,`flatKitchenNo`,`flatBedroomNo`,`flatDinningNo`,`flatBathNo`,`flatWcNo`,`flatAttBathWcNo`,`flatBalconyNo`,`shopNo`,`officeNo`,`intFloorId`,`intKitchenType`,`intKitchenShape`,`intWindowId`,`intDoorId`,`intWcId`,`intBathId`,`intPaintId`,`intPop`,`intRoofId`,`passageTypeId`,`typeOfStructureId`,`floorHeight`,`yearsOfCurrentTenancy`,`rentalIncome`,`percentageDepreciation`,`createdOn`,`createdBy`,`modifiedOn`,`modifiedBy`,`presentCondition`,`PropertyFloorUsageId_str`,`FlatFbNo`,`FlatDbNo`,`FlatTerraceNo`,`FlatPassageNo`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyFloor value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getFloorNo());
        if (value.getFloorName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFloorName());
        }
        stmt.bindLong(5, value.getConstructionStageId());
        if (value.getPercentageCompletion() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getPercentageCompletion());
        }
        if (value.getPresentConditionId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPresentConditionId());
        }
        if (value.getPropertyAge() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getPropertyAge());
        }
        if (value.getResidualLife() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getResidualLife());
        }
        if (value.getPropertyFloorUsageId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPropertyFloorUsageId());
        }
        if (value.getDocumentFloorArea() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDocumentFloorArea());
        }
        if (value.getDocumentFloorAreaUnit() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getDocumentFloorAreaUnit());
        }
        if (value.getMeasuredFloorArea() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getMeasuredFloorArea());
        }
        if (value.getMeasuredFloorAreaUnit() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getMeasuredFloorAreaUnit());
        }
        stmt.bindLong(15, value.getFlatHallNo());
        stmt.bindLong(16, value.getFlatKitchenNo());
        stmt.bindLong(17, value.getFlatBedroomNo());
        stmt.bindLong(18, value.getFlatDinningNo());
        stmt.bindLong(19, value.getFlatBathNo());
        stmt.bindLong(20, value.getFlatWcNo());
        stmt.bindLong(21, value.getFlatAttBathWcNo());
        stmt.bindLong(22, value.getFlatBalconyNo());
        stmt.bindLong(23, value.getShopNo());
        stmt.bindLong(24, value.getOfficeNo());
        if (value.getIntFloorId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getIntFloorId());
        }
        if (value.getIntKitchenType() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getIntKitchenType());
        }
        if (value.getIntKitchenShape() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getIntKitchenShape());
        }
        if (value.getIntWindowId() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getIntWindowId());
        }
        if (value.getIntDoorId() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getIntDoorId());
        }
        if (value.getIntWcId() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getIntWcId());
        }
        if (value.getIntBathId() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getIntBathId());
        }
        if (value.getIntPaintId() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getIntPaintId());
        }
        final Integer _tmp;
        _tmp = value.getIntPop() == null ? null : (value.getIntPop() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindLong(33, _tmp);
        }
        if (value.getIntRoofId() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getIntRoofId());
        }
        if (value.getPassageTypeId() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getPassageTypeId());
        }
        stmt.bindLong(36, value.getTypeOfStructureId());
        if (value.getFloorHeight() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getFloorHeight());
        }
        if (value.getYearsOfCurrentTenancy() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getYearsOfCurrentTenancy());
        }
        if (value.getRentalIncome() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getRentalIncome());
        }
        if (value.getPercentageDepreciation() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getPercentageDepreciation());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getCreatedOn());
        }
        stmt.bindLong(42, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getModifiedOn());
        }
        stmt.bindLong(44, value.getModifiedBy());
        if (value.getPresentCondition() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getPresentCondition());
        }
        if (value.getPropertyFloorUsageId_str() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getPropertyFloorUsageId_str());
        }
        stmt.bindLong(47, value.getFlatFbNo());
        stmt.bindLong(48, value.getFlatDbNo());
        stmt.bindLong(49, value.getFlatTerraceNo());
        stmt.bindLong(50, value.getFlatPassageNo());
      }
    };
    this.__deletionAdapterOfIndPropertyFloor = new EntityDeletionOrUpdateAdapter<IndPropertyFloor>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `IndPropertyFloorModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyFloor value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyFloorModal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyFloorModal where CaseId = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(IndPropertyFloor indPropertyFloor) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIndPropertyFloor.insert(indPropertyFloor);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(IndPropertyFloor indPropertyFloor) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfIndPropertyFloor.handle(indPropertyFloor);
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
  public List<IndPropertyFloor> getIndPropertyFloor() {
    final String _sql = "SELECT * FROM IndPropertyFloorModal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfFloorNo = _cursor.getColumnIndexOrThrow("floorNo");
      final int _cursorIndexOfFloorName = _cursor.getColumnIndexOrThrow("floorName");
      final int _cursorIndexOfConstructionStageId = _cursor.getColumnIndexOrThrow("constructionStageId");
      final int _cursorIndexOfPercentageCompletion = _cursor.getColumnIndexOrThrow("percentageCompletion");
      final int _cursorIndexOfPresentConditionId = _cursor.getColumnIndexOrThrow("presentConditionId");
      final int _cursorIndexOfPropertyAge = _cursor.getColumnIndexOrThrow("propertyAge");
      final int _cursorIndexOfResidualLife = _cursor.getColumnIndexOrThrow("residualLife");
      final int _cursorIndexOfPropertyFloorUsageId = _cursor.getColumnIndexOrThrow("propertyFloorUsageId");
      final int _cursorIndexOfDocumentFloorArea = _cursor.getColumnIndexOrThrow("documentFloorArea");
      final int _cursorIndexOfDocumentFloorAreaUnit = _cursor.getColumnIndexOrThrow("documentFloorAreaUnit");
      final int _cursorIndexOfMeasuredFloorArea = _cursor.getColumnIndexOrThrow("measuredFloorArea");
      final int _cursorIndexOfMeasuredFloorAreaUnit = _cursor.getColumnIndexOrThrow("measuredFloorAreaUnit");
      final int _cursorIndexOfFlatHallNo = _cursor.getColumnIndexOrThrow("flatHallNo");
      final int _cursorIndexOfFlatKitchenNo = _cursor.getColumnIndexOrThrow("flatKitchenNo");
      final int _cursorIndexOfFlatBedroomNo = _cursor.getColumnIndexOrThrow("flatBedroomNo");
      final int _cursorIndexOfFlatDinningNo = _cursor.getColumnIndexOrThrow("flatDinningNo");
      final int _cursorIndexOfFlatBathNo = _cursor.getColumnIndexOrThrow("flatBathNo");
      final int _cursorIndexOfFlatWcNo = _cursor.getColumnIndexOrThrow("flatWcNo");
      final int _cursorIndexOfFlatAttBathWcNo = _cursor.getColumnIndexOrThrow("flatAttBathWcNo");
      final int _cursorIndexOfFlatBalconyNo = _cursor.getColumnIndexOrThrow("flatBalconyNo");
      final int _cursorIndexOfShopNo = _cursor.getColumnIndexOrThrow("shopNo");
      final int _cursorIndexOfOfficeNo = _cursor.getColumnIndexOrThrow("officeNo");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfIntRoofId = _cursor.getColumnIndexOrThrow("intRoofId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfFloorHeight = _cursor.getColumnIndexOrThrow("floorHeight");
      final int _cursorIndexOfYearsOfCurrentTenancy = _cursor.getColumnIndexOrThrow("yearsOfCurrentTenancy");
      final int _cursorIndexOfRentalIncome = _cursor.getColumnIndexOrThrow("rentalIncome");
      final int _cursorIndexOfPercentageDepreciation = _cursor.getColumnIndexOrThrow("percentageDepreciation");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfPresentCondition = _cursor.getColumnIndexOrThrow("presentCondition");
      final int _cursorIndexOfPropertyFloorUsageIdStr = _cursor.getColumnIndexOrThrow("PropertyFloorUsageId_str");
      final int _cursorIndexOfFlatFbNo = _cursor.getColumnIndexOrThrow("FlatFbNo");
      final int _cursorIndexOfFlatDbNo = _cursor.getColumnIndexOrThrow("FlatDbNo");
      final int _cursorIndexOfFlatTerraceNo = _cursor.getColumnIndexOrThrow("FlatTerraceNo");
      final int _cursorIndexOfFlatPassageNo = _cursor.getColumnIndexOrThrow("FlatPassageNo");
      final List<IndPropertyFloor> _result = new ArrayList<IndPropertyFloor>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyFloor _item;
        _item = new IndPropertyFloor();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpFloorNo;
        _tmpFloorNo = _cursor.getInt(_cursorIndexOfFloorNo);
        _item.setFloorNo(_tmpFloorNo);
        final String _tmpFloorName;
        _tmpFloorName = _cursor.getString(_cursorIndexOfFloorName);
        _item.setFloorName(_tmpFloorName);
        final int _tmpConstructionStageId;
        _tmpConstructionStageId = _cursor.getInt(_cursorIndexOfConstructionStageId);
        _item.setConstructionStageId(_tmpConstructionStageId);
        final Integer _tmpPercentageCompletion;
        if (_cursor.isNull(_cursorIndexOfPercentageCompletion)) {
          _tmpPercentageCompletion = null;
        } else {
          _tmpPercentageCompletion = _cursor.getInt(_cursorIndexOfPercentageCompletion);
        }
        _item.setPercentageCompletion(_tmpPercentageCompletion);
        final String _tmpPresentConditionId;
        _tmpPresentConditionId = _cursor.getString(_cursorIndexOfPresentConditionId);
        _item.setPresentConditionId(_tmpPresentConditionId);
        final Integer _tmpPropertyAge;
        if (_cursor.isNull(_cursorIndexOfPropertyAge)) {
          _tmpPropertyAge = null;
        } else {
          _tmpPropertyAge = _cursor.getInt(_cursorIndexOfPropertyAge);
        }
        _item.setPropertyAge(_tmpPropertyAge);
        final Integer _tmpResidualLife;
        if (_cursor.isNull(_cursorIndexOfResidualLife)) {
          _tmpResidualLife = null;
        } else {
          _tmpResidualLife = _cursor.getInt(_cursorIndexOfResidualLife);
        }
        _item.setResidualLife(_tmpResidualLife);
        final String _tmpPropertyFloorUsageId;
        _tmpPropertyFloorUsageId = _cursor.getString(_cursorIndexOfPropertyFloorUsageId);
        _item.setPropertyFloorUsageId(_tmpPropertyFloorUsageId);
        final String _tmpDocumentFloorArea;
        _tmpDocumentFloorArea = _cursor.getString(_cursorIndexOfDocumentFloorArea);
        _item.setDocumentFloorArea(_tmpDocumentFloorArea);
        final String _tmpDocumentFloorAreaUnit;
        _tmpDocumentFloorAreaUnit = _cursor.getString(_cursorIndexOfDocumentFloorAreaUnit);
        _item.setDocumentFloorAreaUnit(_tmpDocumentFloorAreaUnit);
        final String _tmpMeasuredFloorArea;
        _tmpMeasuredFloorArea = _cursor.getString(_cursorIndexOfMeasuredFloorArea);
        _item.setMeasuredFloorArea(_tmpMeasuredFloorArea);
        final String _tmpMeasuredFloorAreaUnit;
        _tmpMeasuredFloorAreaUnit = _cursor.getString(_cursorIndexOfMeasuredFloorAreaUnit);
        _item.setMeasuredFloorAreaUnit(_tmpMeasuredFloorAreaUnit);
        final int _tmpFlatHallNo;
        _tmpFlatHallNo = _cursor.getInt(_cursorIndexOfFlatHallNo);
        _item.setFlatHallNo(_tmpFlatHallNo);
        final int _tmpFlatKitchenNo;
        _tmpFlatKitchenNo = _cursor.getInt(_cursorIndexOfFlatKitchenNo);
        _item.setFlatKitchenNo(_tmpFlatKitchenNo);
        final int _tmpFlatBedroomNo;
        _tmpFlatBedroomNo = _cursor.getInt(_cursorIndexOfFlatBedroomNo);
        _item.setFlatBedroomNo(_tmpFlatBedroomNo);
        final int _tmpFlatDinningNo;
        _tmpFlatDinningNo = _cursor.getInt(_cursorIndexOfFlatDinningNo);
        _item.setFlatDinningNo(_tmpFlatDinningNo);
        final int _tmpFlatBathNo;
        _tmpFlatBathNo = _cursor.getInt(_cursorIndexOfFlatBathNo);
        _item.setFlatBathNo(_tmpFlatBathNo);
        final int _tmpFlatWcNo;
        _tmpFlatWcNo = _cursor.getInt(_cursorIndexOfFlatWcNo);
        _item.setFlatWcNo(_tmpFlatWcNo);
        final int _tmpFlatAttBathWcNo;
        _tmpFlatAttBathWcNo = _cursor.getInt(_cursorIndexOfFlatAttBathWcNo);
        _item.setFlatAttBathWcNo(_tmpFlatAttBathWcNo);
        final int _tmpFlatBalconyNo;
        _tmpFlatBalconyNo = _cursor.getInt(_cursorIndexOfFlatBalconyNo);
        _item.setFlatBalconyNo(_tmpFlatBalconyNo);
        final int _tmpShopNo;
        _tmpShopNo = _cursor.getInt(_cursorIndexOfShopNo);
        _item.setShopNo(_tmpShopNo);
        final int _tmpOfficeNo;
        _tmpOfficeNo = _cursor.getInt(_cursorIndexOfOfficeNo);
        _item.setOfficeNo(_tmpOfficeNo);
        final String _tmpIntFloorId;
        _tmpIntFloorId = _cursor.getString(_cursorIndexOfIntFloorId);
        _item.setIntFloorId(_tmpIntFloorId);
        final String _tmpIntKitchenType;
        _tmpIntKitchenType = _cursor.getString(_cursorIndexOfIntKitchenType);
        _item.setIntKitchenType(_tmpIntKitchenType);
        final String _tmpIntKitchenShape;
        _tmpIntKitchenShape = _cursor.getString(_cursorIndexOfIntKitchenShape);
        _item.setIntKitchenShape(_tmpIntKitchenShape);
        final String _tmpIntWindowId;
        _tmpIntWindowId = _cursor.getString(_cursorIndexOfIntWindowId);
        _item.setIntWindowId(_tmpIntWindowId);
        final String _tmpIntDoorId;
        _tmpIntDoorId = _cursor.getString(_cursorIndexOfIntDoorId);
        _item.setIntDoorId(_tmpIntDoorId);
        final String _tmpIntWcId;
        _tmpIntWcId = _cursor.getString(_cursorIndexOfIntWcId);
        _item.setIntWcId(_tmpIntWcId);
        final String _tmpIntBathId;
        _tmpIntBathId = _cursor.getString(_cursorIndexOfIntBathId);
        _item.setIntBathId(_tmpIntBathId);
        final String _tmpIntPaintId;
        _tmpIntPaintId = _cursor.getString(_cursorIndexOfIntPaintId);
        _item.setIntPaintId(_tmpIntPaintId);
        final Boolean _tmpIntPop;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIntPop)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIntPop);
        }
        _tmpIntPop = _tmp == null ? null : _tmp != 0;
        _item.setIntPop(_tmpIntPop);
        final String _tmpIntRoofId;
        _tmpIntRoofId = _cursor.getString(_cursorIndexOfIntRoofId);
        _item.setIntRoofId(_tmpIntRoofId);
        final String _tmpPassageTypeId;
        _tmpPassageTypeId = _cursor.getString(_cursorIndexOfPassageTypeId);
        _item.setPassageTypeId(_tmpPassageTypeId);
        final int _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getInt(_cursorIndexOfTypeOfStructureId);
        _item.setTypeOfStructureId(_tmpTypeOfStructureId);
        final String _tmpFloorHeight;
        _tmpFloorHeight = _cursor.getString(_cursorIndexOfFloorHeight);
        _item.setFloorHeight(_tmpFloorHeight);
        final String _tmpYearsOfCurrentTenancy;
        _tmpYearsOfCurrentTenancy = _cursor.getString(_cursorIndexOfYearsOfCurrentTenancy);
        _item.setYearsOfCurrentTenancy(_tmpYearsOfCurrentTenancy);
        final String _tmpRentalIncome;
        _tmpRentalIncome = _cursor.getString(_cursorIndexOfRentalIncome);
        _item.setRentalIncome(_tmpRentalIncome);
        final String _tmpPercentageDepreciation;
        _tmpPercentageDepreciation = _cursor.getString(_cursorIndexOfPercentageDepreciation);
        _item.setPercentageDepreciation(_tmpPercentageDepreciation);
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
        final String _tmpPresentCondition;
        _tmpPresentCondition = _cursor.getString(_cursorIndexOfPresentCondition);
        _item.setPresentCondition(_tmpPresentCondition);
        final String _tmpPropertyFloorUsageId_str;
        _tmpPropertyFloorUsageId_str = _cursor.getString(_cursorIndexOfPropertyFloorUsageIdStr);
        _item.setPropertyFloorUsageId_str(_tmpPropertyFloorUsageId_str);
        final int _tmpFlatFbNo;
        _tmpFlatFbNo = _cursor.getInt(_cursorIndexOfFlatFbNo);
        _item.setFlatFbNo(_tmpFlatFbNo);
        final int _tmpFlatDbNo;
        _tmpFlatDbNo = _cursor.getInt(_cursorIndexOfFlatDbNo);
        _item.setFlatDbNo(_tmpFlatDbNo);
        final int _tmpFlatTerraceNo;
        _tmpFlatTerraceNo = _cursor.getInt(_cursorIndexOfFlatTerraceNo);
        _item.setFlatTerraceNo(_tmpFlatTerraceNo);
        final int _tmpFlatPassageNo;
        _tmpFlatPassageNo = _cursor.getInt(_cursorIndexOfFlatPassageNo);
        _item.setFlatPassageNo(_tmpFlatPassageNo);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<IndPropertyFloor> getIndPropertyFloor_caseID(int caseid_) {
    final String _sql = "SELECT * FROM IndPropertyFloorModal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfFloorNo = _cursor.getColumnIndexOrThrow("floorNo");
      final int _cursorIndexOfFloorName = _cursor.getColumnIndexOrThrow("floorName");
      final int _cursorIndexOfConstructionStageId = _cursor.getColumnIndexOrThrow("constructionStageId");
      final int _cursorIndexOfPercentageCompletion = _cursor.getColumnIndexOrThrow("percentageCompletion");
      final int _cursorIndexOfPresentConditionId = _cursor.getColumnIndexOrThrow("presentConditionId");
      final int _cursorIndexOfPropertyAge = _cursor.getColumnIndexOrThrow("propertyAge");
      final int _cursorIndexOfResidualLife = _cursor.getColumnIndexOrThrow("residualLife");
      final int _cursorIndexOfPropertyFloorUsageId = _cursor.getColumnIndexOrThrow("propertyFloorUsageId");
      final int _cursorIndexOfDocumentFloorArea = _cursor.getColumnIndexOrThrow("documentFloorArea");
      final int _cursorIndexOfDocumentFloorAreaUnit = _cursor.getColumnIndexOrThrow("documentFloorAreaUnit");
      final int _cursorIndexOfMeasuredFloorArea = _cursor.getColumnIndexOrThrow("measuredFloorArea");
      final int _cursorIndexOfMeasuredFloorAreaUnit = _cursor.getColumnIndexOrThrow("measuredFloorAreaUnit");
      final int _cursorIndexOfFlatHallNo = _cursor.getColumnIndexOrThrow("flatHallNo");
      final int _cursorIndexOfFlatKitchenNo = _cursor.getColumnIndexOrThrow("flatKitchenNo");
      final int _cursorIndexOfFlatBedroomNo = _cursor.getColumnIndexOrThrow("flatBedroomNo");
      final int _cursorIndexOfFlatDinningNo = _cursor.getColumnIndexOrThrow("flatDinningNo");
      final int _cursorIndexOfFlatBathNo = _cursor.getColumnIndexOrThrow("flatBathNo");
      final int _cursorIndexOfFlatWcNo = _cursor.getColumnIndexOrThrow("flatWcNo");
      final int _cursorIndexOfFlatAttBathWcNo = _cursor.getColumnIndexOrThrow("flatAttBathWcNo");
      final int _cursorIndexOfFlatBalconyNo = _cursor.getColumnIndexOrThrow("flatBalconyNo");
      final int _cursorIndexOfShopNo = _cursor.getColumnIndexOrThrow("shopNo");
      final int _cursorIndexOfOfficeNo = _cursor.getColumnIndexOrThrow("officeNo");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfIntRoofId = _cursor.getColumnIndexOrThrow("intRoofId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfFloorHeight = _cursor.getColumnIndexOrThrow("floorHeight");
      final int _cursorIndexOfYearsOfCurrentTenancy = _cursor.getColumnIndexOrThrow("yearsOfCurrentTenancy");
      final int _cursorIndexOfRentalIncome = _cursor.getColumnIndexOrThrow("rentalIncome");
      final int _cursorIndexOfPercentageDepreciation = _cursor.getColumnIndexOrThrow("percentageDepreciation");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfPresentCondition = _cursor.getColumnIndexOrThrow("presentCondition");
      final int _cursorIndexOfPropertyFloorUsageIdStr = _cursor.getColumnIndexOrThrow("PropertyFloorUsageId_str");
      final int _cursorIndexOfFlatFbNo = _cursor.getColumnIndexOrThrow("FlatFbNo");
      final int _cursorIndexOfFlatDbNo = _cursor.getColumnIndexOrThrow("FlatDbNo");
      final int _cursorIndexOfFlatTerraceNo = _cursor.getColumnIndexOrThrow("FlatTerraceNo");
      final int _cursorIndexOfFlatPassageNo = _cursor.getColumnIndexOrThrow("FlatPassageNo");
      final List<IndPropertyFloor> _result = new ArrayList<IndPropertyFloor>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyFloor _item;
        _item = new IndPropertyFloor();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpFloorNo;
        _tmpFloorNo = _cursor.getInt(_cursorIndexOfFloorNo);
        _item.setFloorNo(_tmpFloorNo);
        final String _tmpFloorName;
        _tmpFloorName = _cursor.getString(_cursorIndexOfFloorName);
        _item.setFloorName(_tmpFloorName);
        final int _tmpConstructionStageId;
        _tmpConstructionStageId = _cursor.getInt(_cursorIndexOfConstructionStageId);
        _item.setConstructionStageId(_tmpConstructionStageId);
        final Integer _tmpPercentageCompletion;
        if (_cursor.isNull(_cursorIndexOfPercentageCompletion)) {
          _tmpPercentageCompletion = null;
        } else {
          _tmpPercentageCompletion = _cursor.getInt(_cursorIndexOfPercentageCompletion);
        }
        _item.setPercentageCompletion(_tmpPercentageCompletion);
        final String _tmpPresentConditionId;
        _tmpPresentConditionId = _cursor.getString(_cursorIndexOfPresentConditionId);
        _item.setPresentConditionId(_tmpPresentConditionId);
        final Integer _tmpPropertyAge;
        if (_cursor.isNull(_cursorIndexOfPropertyAge)) {
          _tmpPropertyAge = null;
        } else {
          _tmpPropertyAge = _cursor.getInt(_cursorIndexOfPropertyAge);
        }
        _item.setPropertyAge(_tmpPropertyAge);
        final Integer _tmpResidualLife;
        if (_cursor.isNull(_cursorIndexOfResidualLife)) {
          _tmpResidualLife = null;
        } else {
          _tmpResidualLife = _cursor.getInt(_cursorIndexOfResidualLife);
        }
        _item.setResidualLife(_tmpResidualLife);
        final String _tmpPropertyFloorUsageId;
        _tmpPropertyFloorUsageId = _cursor.getString(_cursorIndexOfPropertyFloorUsageId);
        _item.setPropertyFloorUsageId(_tmpPropertyFloorUsageId);
        final String _tmpDocumentFloorArea;
        _tmpDocumentFloorArea = _cursor.getString(_cursorIndexOfDocumentFloorArea);
        _item.setDocumentFloorArea(_tmpDocumentFloorArea);
        final String _tmpDocumentFloorAreaUnit;
        _tmpDocumentFloorAreaUnit = _cursor.getString(_cursorIndexOfDocumentFloorAreaUnit);
        _item.setDocumentFloorAreaUnit(_tmpDocumentFloorAreaUnit);
        final String _tmpMeasuredFloorArea;
        _tmpMeasuredFloorArea = _cursor.getString(_cursorIndexOfMeasuredFloorArea);
        _item.setMeasuredFloorArea(_tmpMeasuredFloorArea);
        final String _tmpMeasuredFloorAreaUnit;
        _tmpMeasuredFloorAreaUnit = _cursor.getString(_cursorIndexOfMeasuredFloorAreaUnit);
        _item.setMeasuredFloorAreaUnit(_tmpMeasuredFloorAreaUnit);
        final int _tmpFlatHallNo;
        _tmpFlatHallNo = _cursor.getInt(_cursorIndexOfFlatHallNo);
        _item.setFlatHallNo(_tmpFlatHallNo);
        final int _tmpFlatKitchenNo;
        _tmpFlatKitchenNo = _cursor.getInt(_cursorIndexOfFlatKitchenNo);
        _item.setFlatKitchenNo(_tmpFlatKitchenNo);
        final int _tmpFlatBedroomNo;
        _tmpFlatBedroomNo = _cursor.getInt(_cursorIndexOfFlatBedroomNo);
        _item.setFlatBedroomNo(_tmpFlatBedroomNo);
        final int _tmpFlatDinningNo;
        _tmpFlatDinningNo = _cursor.getInt(_cursorIndexOfFlatDinningNo);
        _item.setFlatDinningNo(_tmpFlatDinningNo);
        final int _tmpFlatBathNo;
        _tmpFlatBathNo = _cursor.getInt(_cursorIndexOfFlatBathNo);
        _item.setFlatBathNo(_tmpFlatBathNo);
        final int _tmpFlatWcNo;
        _tmpFlatWcNo = _cursor.getInt(_cursorIndexOfFlatWcNo);
        _item.setFlatWcNo(_tmpFlatWcNo);
        final int _tmpFlatAttBathWcNo;
        _tmpFlatAttBathWcNo = _cursor.getInt(_cursorIndexOfFlatAttBathWcNo);
        _item.setFlatAttBathWcNo(_tmpFlatAttBathWcNo);
        final int _tmpFlatBalconyNo;
        _tmpFlatBalconyNo = _cursor.getInt(_cursorIndexOfFlatBalconyNo);
        _item.setFlatBalconyNo(_tmpFlatBalconyNo);
        final int _tmpShopNo;
        _tmpShopNo = _cursor.getInt(_cursorIndexOfShopNo);
        _item.setShopNo(_tmpShopNo);
        final int _tmpOfficeNo;
        _tmpOfficeNo = _cursor.getInt(_cursorIndexOfOfficeNo);
        _item.setOfficeNo(_tmpOfficeNo);
        final String _tmpIntFloorId;
        _tmpIntFloorId = _cursor.getString(_cursorIndexOfIntFloorId);
        _item.setIntFloorId(_tmpIntFloorId);
        final String _tmpIntKitchenType;
        _tmpIntKitchenType = _cursor.getString(_cursorIndexOfIntKitchenType);
        _item.setIntKitchenType(_tmpIntKitchenType);
        final String _tmpIntKitchenShape;
        _tmpIntKitchenShape = _cursor.getString(_cursorIndexOfIntKitchenShape);
        _item.setIntKitchenShape(_tmpIntKitchenShape);
        final String _tmpIntWindowId;
        _tmpIntWindowId = _cursor.getString(_cursorIndexOfIntWindowId);
        _item.setIntWindowId(_tmpIntWindowId);
        final String _tmpIntDoorId;
        _tmpIntDoorId = _cursor.getString(_cursorIndexOfIntDoorId);
        _item.setIntDoorId(_tmpIntDoorId);
        final String _tmpIntWcId;
        _tmpIntWcId = _cursor.getString(_cursorIndexOfIntWcId);
        _item.setIntWcId(_tmpIntWcId);
        final String _tmpIntBathId;
        _tmpIntBathId = _cursor.getString(_cursorIndexOfIntBathId);
        _item.setIntBathId(_tmpIntBathId);
        final String _tmpIntPaintId;
        _tmpIntPaintId = _cursor.getString(_cursorIndexOfIntPaintId);
        _item.setIntPaintId(_tmpIntPaintId);
        final Boolean _tmpIntPop;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIntPop)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIntPop);
        }
        _tmpIntPop = _tmp == null ? null : _tmp != 0;
        _item.setIntPop(_tmpIntPop);
        final String _tmpIntRoofId;
        _tmpIntRoofId = _cursor.getString(_cursorIndexOfIntRoofId);
        _item.setIntRoofId(_tmpIntRoofId);
        final String _tmpPassageTypeId;
        _tmpPassageTypeId = _cursor.getString(_cursorIndexOfPassageTypeId);
        _item.setPassageTypeId(_tmpPassageTypeId);
        final int _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getInt(_cursorIndexOfTypeOfStructureId);
        _item.setTypeOfStructureId(_tmpTypeOfStructureId);
        final String _tmpFloorHeight;
        _tmpFloorHeight = _cursor.getString(_cursorIndexOfFloorHeight);
        _item.setFloorHeight(_tmpFloorHeight);
        final String _tmpYearsOfCurrentTenancy;
        _tmpYearsOfCurrentTenancy = _cursor.getString(_cursorIndexOfYearsOfCurrentTenancy);
        _item.setYearsOfCurrentTenancy(_tmpYearsOfCurrentTenancy);
        final String _tmpRentalIncome;
        _tmpRentalIncome = _cursor.getString(_cursorIndexOfRentalIncome);
        _item.setRentalIncome(_tmpRentalIncome);
        final String _tmpPercentageDepreciation;
        _tmpPercentageDepreciation = _cursor.getString(_cursorIndexOfPercentageDepreciation);
        _item.setPercentageDepreciation(_tmpPercentageDepreciation);
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
        final String _tmpPresentCondition;
        _tmpPresentCondition = _cursor.getString(_cursorIndexOfPresentCondition);
        _item.setPresentCondition(_tmpPresentCondition);
        final String _tmpPropertyFloorUsageId_str;
        _tmpPropertyFloorUsageId_str = _cursor.getString(_cursorIndexOfPropertyFloorUsageIdStr);
        _item.setPropertyFloorUsageId_str(_tmpPropertyFloorUsageId_str);
        final int _tmpFlatFbNo;
        _tmpFlatFbNo = _cursor.getInt(_cursorIndexOfFlatFbNo);
        _item.setFlatFbNo(_tmpFlatFbNo);
        final int _tmpFlatDbNo;
        _tmpFlatDbNo = _cursor.getInt(_cursorIndexOfFlatDbNo);
        _item.setFlatDbNo(_tmpFlatDbNo);
        final int _tmpFlatTerraceNo;
        _tmpFlatTerraceNo = _cursor.getInt(_cursorIndexOfFlatTerraceNo);
        _item.setFlatTerraceNo(_tmpFlatTerraceNo);
        final int _tmpFlatPassageNo;
        _tmpFlatPassageNo = _cursor.getInt(_cursorIndexOfFlatPassageNo);
        _item.setFlatPassageNo(_tmpFlatPassageNo);
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
    final String _sql = "SELECT COUNT(*) from IndPropertyFloorModal";
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
