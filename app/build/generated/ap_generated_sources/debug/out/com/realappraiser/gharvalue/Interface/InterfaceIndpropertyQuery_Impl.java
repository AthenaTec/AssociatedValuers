package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.IndProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceIndpropertyQuery_Impl implements InterfaceIndpropertyQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfIndProperty;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfIndProperty;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public InterfaceIndpropertyQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIndProperty = new EntityInsertionAdapter<IndProperty>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `IndPropertyModal`(`dummyID`,`caseId`,`noOfFloors`,`approvedNoOfFloors`,`floorDetails`,`propertyActualUsageId`,`totalApartmentFloors`,`totalFlatsPerFloor`,`flatSituatedInFloor`,`documentLandArea`,`isCompounded`,`documentLandAreaUnit`,`measuredLandArea`,`measuredLandAreaUnit`,`avgPercentageCompletion`,`documentFloorAreaTotal`,`measuredFloorAreaTotal`,`typeOfStructureId`,`floorHeight`,`yearsOfCurrentTenancy`,`rentalIncome`,`basement`,`noOfLiftInBuilding`,`exteriorPaintId`,`carParkingId`,`waterAvailabilityId`,`amenities`,`wingName`,`intFloorId`,`intWindowId`,`intDoorId`,`intWcId`,`intPaintId`,`intRoofId`,`createdOn`,`createdBy`,`modifiedOn`,`modifiedBy`,`floorKindId`,`wingNo`,`intPop`,`gardenExist`,`seperateCompoundId`,`passageTypeId`,`marketabilityId`,`fittingQualityId`,`maintenanceOfBuildingId`,`typeOfBuildingId`,`qualityConstructionId`,`intBathId`,`amenityQualityId`,`intKitchenType`,`intKitchenShape`,`pavingAroundBuildingId`,`LandAreaDescription`,`NumberOfBuildings`,`TypeOfCompound`,`NameOfTenant`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndProperty value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getNoOfFloors());
        stmt.bindLong(4, value.getApprovedNoOfFloors());
        if (value.getFloorDetails() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFloorDetails());
        }
        if (value.getPropertyActualUsageId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPropertyActualUsageId());
        }
        if (value.getTotalApartmentFloors() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTotalApartmentFloors());
        }
        if (value.getTotalFlatsPerFloor() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTotalFlatsPerFloor());
        }
        if (value.getFlatSituatedInFloor() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFlatSituatedInFloor());
        }
        if (value.getDocumentLandArea() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDocumentLandArea());
        }
        final Integer _tmp;
        _tmp = value.getIsCompounded() == null ? null : (value.getIsCompounded() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        stmt.bindLong(12, value.getDocumentLandAreaUnit());
        if (value.getMeasuredLandArea() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getMeasuredLandArea());
        }
        stmt.bindLong(14, value.getMeasuredLandAreaUnit());
        if (value.getAvgPercentageCompletion() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getAvgPercentageCompletion());
        }
        if (value.getDocumentFloorAreaTotal() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getDocumentFloorAreaTotal());
        }
        if (value.getMeasuredFloorAreaTotal() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getMeasuredFloorAreaTotal());
        }
        if (value.getTypeOfStructureId() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getTypeOfStructureId());
        }
        if (value.getFloorHeight() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getFloorHeight());
        }
        if (value.getYearsOfCurrentTenancy() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getYearsOfCurrentTenancy());
        }
        if (value.getRentalIncome() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getRentalIncome());
        }
        if (value.getBasement() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getBasement());
        }
        if (value.getNoOfLiftInBuilding() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getNoOfLiftInBuilding());
        }
        if (value.getExteriorPaintId() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getExteriorPaintId());
        }
        if (value.getCarParkingId() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getCarParkingId());
        }
        if (value.getWaterAvailabilityId() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getWaterAvailabilityId());
        }
        if (value.getAmenities() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getAmenities());
        }
        if (value.getWingName() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getWingName());
        }
        if (value.getIntFloorId() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getIntFloorId());
        }
        if (value.getIntWindowId() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getIntWindowId());
        }
        if (value.getIntDoorId() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getIntDoorId());
        }
        if (value.getIntWcId() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getIntWcId());
        }
        if (value.getIntPaintId() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getIntPaintId());
        }
        if (value.getIntRoofId() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getIntRoofId());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getCreatedOn());
        }
        stmt.bindLong(36, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getModifiedOn());
        }
        stmt.bindLong(38, value.getModifiedBy());
        stmt.bindLong(39, value.getFloorKindId());
        if (value.getWingNo() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindLong(40, value.getWingNo());
        }
        final Integer _tmp_1;
        _tmp_1 = value.getIntPop() == null ? null : (value.getIntPop() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindLong(41, _tmp_1);
        }
        final Integer _tmp_2;
        _tmp_2 = value.getGardenExist() == null ? null : (value.getGardenExist() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindLong(42, _tmp_2);
        }
        if (value.getSeperateCompoundId() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindLong(43, value.getSeperateCompoundId());
        }
        if (value.getPassageTypeId() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindLong(44, value.getPassageTypeId());
        }
        if (value.getMarketabilityId() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindLong(45, value.getMarketabilityId());
        }
        if (value.getFittingQualityId() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindLong(46, value.getFittingQualityId());
        }
        if (value.getMaintenanceOfBuildingId() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindLong(47, value.getMaintenanceOfBuildingId());
        }
        if (value.getTypeOfBuildingId() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindLong(48, value.getTypeOfBuildingId());
        }
        if (value.getQualityConstructionId() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindLong(49, value.getQualityConstructionId());
        }
        if (value.getIntBathId() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindLong(50, value.getIntBathId());
        }
        if (value.getAmenityQualityId() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindLong(51, value.getAmenityQualityId());
        }
        if (value.getIntKitchenType() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindLong(52, value.getIntKitchenType());
        }
        if (value.getIntKitchenShape() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindLong(53, value.getIntKitchenShape());
        }
        if (value.getPavingAroundBuildingId() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getPavingAroundBuildingId());
        }
        if (value.getLandAreaDescription() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getLandAreaDescription());
        }
        if (value.getNumberOfBuildings() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getNumberOfBuildings());
        }
        if (value.getTypeOfCompound() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindLong(57, value.getTypeOfCompound());
        }
        if (value.getNameOfTenant() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getNameOfTenant());
        }
      }
    };
    this.__deletionAdapterOfIndProperty = new EntityDeletionOrUpdateAdapter<IndProperty>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `IndPropertyModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndProperty value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM indpropertymodal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM indpropertymodal where CaseId = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(IndProperty indProperty) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIndProperty.insert(indProperty);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(IndProperty indProperty) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfIndProperty.handle(indProperty);
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
  public List<IndProperty> getIndProperty() {
    final String _sql = "SELECT * FROM indpropertymodal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfNoOfFloors = _cursor.getColumnIndexOrThrow("noOfFloors");
      final int _cursorIndexOfApprovedNoOfFloors = _cursor.getColumnIndexOrThrow("approvedNoOfFloors");
      final int _cursorIndexOfFloorDetails = _cursor.getColumnIndexOrThrow("floorDetails");
      final int _cursorIndexOfPropertyActualUsageId = _cursor.getColumnIndexOrThrow("propertyActualUsageId");
      final int _cursorIndexOfTotalApartmentFloors = _cursor.getColumnIndexOrThrow("totalApartmentFloors");
      final int _cursorIndexOfTotalFlatsPerFloor = _cursor.getColumnIndexOrThrow("totalFlatsPerFloor");
      final int _cursorIndexOfFlatSituatedInFloor = _cursor.getColumnIndexOrThrow("flatSituatedInFloor");
      final int _cursorIndexOfDocumentLandArea = _cursor.getColumnIndexOrThrow("documentLandArea");
      final int _cursorIndexOfIsCompounded = _cursor.getColumnIndexOrThrow("isCompounded");
      final int _cursorIndexOfDocumentLandAreaUnit = _cursor.getColumnIndexOrThrow("documentLandAreaUnit");
      final int _cursorIndexOfMeasuredLandArea = _cursor.getColumnIndexOrThrow("measuredLandArea");
      final int _cursorIndexOfMeasuredLandAreaUnit = _cursor.getColumnIndexOrThrow("measuredLandAreaUnit");
      final int _cursorIndexOfAvgPercentageCompletion = _cursor.getColumnIndexOrThrow("avgPercentageCompletion");
      final int _cursorIndexOfDocumentFloorAreaTotal = _cursor.getColumnIndexOrThrow("documentFloorAreaTotal");
      final int _cursorIndexOfMeasuredFloorAreaTotal = _cursor.getColumnIndexOrThrow("measuredFloorAreaTotal");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfFloorHeight = _cursor.getColumnIndexOrThrow("floorHeight");
      final int _cursorIndexOfYearsOfCurrentTenancy = _cursor.getColumnIndexOrThrow("yearsOfCurrentTenancy");
      final int _cursorIndexOfRentalIncome = _cursor.getColumnIndexOrThrow("rentalIncome");
      final int _cursorIndexOfBasement = _cursor.getColumnIndexOrThrow("basement");
      final int _cursorIndexOfNoOfLiftInBuilding = _cursor.getColumnIndexOrThrow("noOfLiftInBuilding");
      final int _cursorIndexOfExteriorPaintId = _cursor.getColumnIndexOrThrow("exteriorPaintId");
      final int _cursorIndexOfCarParkingId = _cursor.getColumnIndexOrThrow("carParkingId");
      final int _cursorIndexOfWaterAvailabilityId = _cursor.getColumnIndexOrThrow("waterAvailabilityId");
      final int _cursorIndexOfAmenities = _cursor.getColumnIndexOrThrow("amenities");
      final int _cursorIndexOfWingName = _cursor.getColumnIndexOrThrow("wingName");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntRoofId = _cursor.getColumnIndexOrThrow("intRoofId");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfFloorKindId = _cursor.getColumnIndexOrThrow("floorKindId");
      final int _cursorIndexOfWingNo = _cursor.getColumnIndexOrThrow("wingNo");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfGardenExist = _cursor.getColumnIndexOrThrow("gardenExist");
      final int _cursorIndexOfSeperateCompoundId = _cursor.getColumnIndexOrThrow("seperateCompoundId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfMarketabilityId = _cursor.getColumnIndexOrThrow("marketabilityId");
      final int _cursorIndexOfFittingQualityId = _cursor.getColumnIndexOrThrow("fittingQualityId");
      final int _cursorIndexOfMaintenanceOfBuildingId = _cursor.getColumnIndexOrThrow("maintenanceOfBuildingId");
      final int _cursorIndexOfTypeOfBuildingId = _cursor.getColumnIndexOrThrow("typeOfBuildingId");
      final int _cursorIndexOfQualityConstructionId = _cursor.getColumnIndexOrThrow("qualityConstructionId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfAmenityQualityId = _cursor.getColumnIndexOrThrow("amenityQualityId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfPavingAroundBuildingId = _cursor.getColumnIndexOrThrow("pavingAroundBuildingId");
      final int _cursorIndexOfLandAreaDescription = _cursor.getColumnIndexOrThrow("LandAreaDescription");
      final int _cursorIndexOfNumberOfBuildings = _cursor.getColumnIndexOrThrow("NumberOfBuildings");
      final int _cursorIndexOfTypeOfCompound = _cursor.getColumnIndexOrThrow("TypeOfCompound");
      final int _cursorIndexOfNameOfTenant = _cursor.getColumnIndexOrThrow("NameOfTenant");
      final List<IndProperty> _result = new ArrayList<IndProperty>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndProperty _item;
        _item = new IndProperty();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpNoOfFloors;
        _tmpNoOfFloors = _cursor.getInt(_cursorIndexOfNoOfFloors);
        _item.setNoOfFloors(_tmpNoOfFloors);
        final int _tmpApprovedNoOfFloors;
        _tmpApprovedNoOfFloors = _cursor.getInt(_cursorIndexOfApprovedNoOfFloors);
        _item.setApprovedNoOfFloors(_tmpApprovedNoOfFloors);
        final String _tmpFloorDetails;
        _tmpFloorDetails = _cursor.getString(_cursorIndexOfFloorDetails);
        _item.setFloorDetails(_tmpFloorDetails);
        final String _tmpPropertyActualUsageId;
        _tmpPropertyActualUsageId = _cursor.getString(_cursorIndexOfPropertyActualUsageId);
        _item.setPropertyActualUsageId(_tmpPropertyActualUsageId);
        final String _tmpTotalApartmentFloors;
        _tmpTotalApartmentFloors = _cursor.getString(_cursorIndexOfTotalApartmentFloors);
        _item.setTotalApartmentFloors(_tmpTotalApartmentFloors);
        final String _tmpTotalFlatsPerFloor;
        _tmpTotalFlatsPerFloor = _cursor.getString(_cursorIndexOfTotalFlatsPerFloor);
        _item.setTotalFlatsPerFloor(_tmpTotalFlatsPerFloor);
        final String _tmpFlatSituatedInFloor;
        _tmpFlatSituatedInFloor = _cursor.getString(_cursorIndexOfFlatSituatedInFloor);
        _item.setFlatSituatedInFloor(_tmpFlatSituatedInFloor);
        final String _tmpDocumentLandArea;
        _tmpDocumentLandArea = _cursor.getString(_cursorIndexOfDocumentLandArea);
        _item.setDocumentLandArea(_tmpDocumentLandArea);
        final Boolean _tmpIsCompounded;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsCompounded)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsCompounded);
        }
        _tmpIsCompounded = _tmp == null ? null : _tmp != 0;
        _item.setIsCompounded(_tmpIsCompounded);
        final int _tmpDocumentLandAreaUnit;
        _tmpDocumentLandAreaUnit = _cursor.getInt(_cursorIndexOfDocumentLandAreaUnit);
        _item.setDocumentLandAreaUnit(_tmpDocumentLandAreaUnit);
        final String _tmpMeasuredLandArea;
        _tmpMeasuredLandArea = _cursor.getString(_cursorIndexOfMeasuredLandArea);
        _item.setMeasuredLandArea(_tmpMeasuredLandArea);
        final int _tmpMeasuredLandAreaUnit;
        _tmpMeasuredLandAreaUnit = _cursor.getInt(_cursorIndexOfMeasuredLandAreaUnit);
        _item.setMeasuredLandAreaUnit(_tmpMeasuredLandAreaUnit);
        final String _tmpAvgPercentageCompletion;
        _tmpAvgPercentageCompletion = _cursor.getString(_cursorIndexOfAvgPercentageCompletion);
        _item.setAvgPercentageCompletion(_tmpAvgPercentageCompletion);
        final String _tmpDocumentFloorAreaTotal;
        _tmpDocumentFloorAreaTotal = _cursor.getString(_cursorIndexOfDocumentFloorAreaTotal);
        _item.setDocumentFloorAreaTotal(_tmpDocumentFloorAreaTotal);
        final String _tmpMeasuredFloorAreaTotal;
        _tmpMeasuredFloorAreaTotal = _cursor.getString(_cursorIndexOfMeasuredFloorAreaTotal);
        _item.setMeasuredFloorAreaTotal(_tmpMeasuredFloorAreaTotal);
        final String _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getString(_cursorIndexOfTypeOfStructureId);
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
        final String _tmpBasement;
        _tmpBasement = _cursor.getString(_cursorIndexOfBasement);
        _item.setBasement(_tmpBasement);
        final String _tmpNoOfLiftInBuilding;
        _tmpNoOfLiftInBuilding = _cursor.getString(_cursorIndexOfNoOfLiftInBuilding);
        _item.setNoOfLiftInBuilding(_tmpNoOfLiftInBuilding);
        final String _tmpExteriorPaintId;
        _tmpExteriorPaintId = _cursor.getString(_cursorIndexOfExteriorPaintId);
        _item.setExteriorPaintId(_tmpExteriorPaintId);
        final String _tmpCarParkingId;
        _tmpCarParkingId = _cursor.getString(_cursorIndexOfCarParkingId);
        _item.setCarParkingId(_tmpCarParkingId);
        final String _tmpWaterAvailabilityId;
        _tmpWaterAvailabilityId = _cursor.getString(_cursorIndexOfWaterAvailabilityId);
        _item.setWaterAvailabilityId(_tmpWaterAvailabilityId);
        final String _tmpAmenities;
        _tmpAmenities = _cursor.getString(_cursorIndexOfAmenities);
        _item.setAmenities(_tmpAmenities);
        final String _tmpWingName;
        _tmpWingName = _cursor.getString(_cursorIndexOfWingName);
        _item.setWingName(_tmpWingName);
        final String _tmpIntFloorId;
        _tmpIntFloorId = _cursor.getString(_cursorIndexOfIntFloorId);
        _item.setIntFloorId(_tmpIntFloorId);
        final String _tmpIntWindowId;
        _tmpIntWindowId = _cursor.getString(_cursorIndexOfIntWindowId);
        _item.setIntWindowId(_tmpIntWindowId);
        final String _tmpIntDoorId;
        _tmpIntDoorId = _cursor.getString(_cursorIndexOfIntDoorId);
        _item.setIntDoorId(_tmpIntDoorId);
        final String _tmpIntWcId;
        _tmpIntWcId = _cursor.getString(_cursorIndexOfIntWcId);
        _item.setIntWcId(_tmpIntWcId);
        final String _tmpIntPaintId;
        _tmpIntPaintId = _cursor.getString(_cursorIndexOfIntPaintId);
        _item.setIntPaintId(_tmpIntPaintId);
        final String _tmpIntRoofId;
        _tmpIntRoofId = _cursor.getString(_cursorIndexOfIntRoofId);
        _item.setIntRoofId(_tmpIntRoofId);
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
        final int _tmpFloorKindId;
        _tmpFloorKindId = _cursor.getInt(_cursorIndexOfFloorKindId);
        _item.setFloorKindId(_tmpFloorKindId);
        final Integer _tmpWingNo;
        if (_cursor.isNull(_cursorIndexOfWingNo)) {
          _tmpWingNo = null;
        } else {
          _tmpWingNo = _cursor.getInt(_cursorIndexOfWingNo);
        }
        _item.setWingNo(_tmpWingNo);
        final Boolean _tmpIntPop;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIntPop)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIntPop);
        }
        _tmpIntPop = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setIntPop(_tmpIntPop);
        final Boolean _tmpGardenExist;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfGardenExist)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfGardenExist);
        }
        _tmpGardenExist = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setGardenExist(_tmpGardenExist);
        final Integer _tmpSeperateCompoundId;
        if (_cursor.isNull(_cursorIndexOfSeperateCompoundId)) {
          _tmpSeperateCompoundId = null;
        } else {
          _tmpSeperateCompoundId = _cursor.getInt(_cursorIndexOfSeperateCompoundId);
        }
        _item.setSeperateCompoundId(_tmpSeperateCompoundId);
        final Integer _tmpPassageTypeId;
        if (_cursor.isNull(_cursorIndexOfPassageTypeId)) {
          _tmpPassageTypeId = null;
        } else {
          _tmpPassageTypeId = _cursor.getInt(_cursorIndexOfPassageTypeId);
        }
        _item.setPassageTypeId(_tmpPassageTypeId);
        final Integer _tmpMarketabilityId;
        if (_cursor.isNull(_cursorIndexOfMarketabilityId)) {
          _tmpMarketabilityId = null;
        } else {
          _tmpMarketabilityId = _cursor.getInt(_cursorIndexOfMarketabilityId);
        }
        _item.setMarketabilityId(_tmpMarketabilityId);
        final Integer _tmpFittingQualityId;
        if (_cursor.isNull(_cursorIndexOfFittingQualityId)) {
          _tmpFittingQualityId = null;
        } else {
          _tmpFittingQualityId = _cursor.getInt(_cursorIndexOfFittingQualityId);
        }
        _item.setFittingQualityId(_tmpFittingQualityId);
        final Integer _tmpMaintenanceOfBuildingId;
        if (_cursor.isNull(_cursorIndexOfMaintenanceOfBuildingId)) {
          _tmpMaintenanceOfBuildingId = null;
        } else {
          _tmpMaintenanceOfBuildingId = _cursor.getInt(_cursorIndexOfMaintenanceOfBuildingId);
        }
        _item.setMaintenanceOfBuildingId(_tmpMaintenanceOfBuildingId);
        final Integer _tmpTypeOfBuildingId;
        if (_cursor.isNull(_cursorIndexOfTypeOfBuildingId)) {
          _tmpTypeOfBuildingId = null;
        } else {
          _tmpTypeOfBuildingId = _cursor.getInt(_cursorIndexOfTypeOfBuildingId);
        }
        _item.setTypeOfBuildingId(_tmpTypeOfBuildingId);
        final Integer _tmpQualityConstructionId;
        if (_cursor.isNull(_cursorIndexOfQualityConstructionId)) {
          _tmpQualityConstructionId = null;
        } else {
          _tmpQualityConstructionId = _cursor.getInt(_cursorIndexOfQualityConstructionId);
        }
        _item.setQualityConstructionId(_tmpQualityConstructionId);
        final Integer _tmpIntBathId;
        if (_cursor.isNull(_cursorIndexOfIntBathId)) {
          _tmpIntBathId = null;
        } else {
          _tmpIntBathId = _cursor.getInt(_cursorIndexOfIntBathId);
        }
        _item.setIntBathId(_tmpIntBathId);
        final Integer _tmpAmenityQualityId;
        if (_cursor.isNull(_cursorIndexOfAmenityQualityId)) {
          _tmpAmenityQualityId = null;
        } else {
          _tmpAmenityQualityId = _cursor.getInt(_cursorIndexOfAmenityQualityId);
        }
        _item.setAmenityQualityId(_tmpAmenityQualityId);
        final Integer _tmpIntKitchenType;
        if (_cursor.isNull(_cursorIndexOfIntKitchenType)) {
          _tmpIntKitchenType = null;
        } else {
          _tmpIntKitchenType = _cursor.getInt(_cursorIndexOfIntKitchenType);
        }
        _item.setIntKitchenType(_tmpIntKitchenType);
        final Integer _tmpIntKitchenShape;
        if (_cursor.isNull(_cursorIndexOfIntKitchenShape)) {
          _tmpIntKitchenShape = null;
        } else {
          _tmpIntKitchenShape = _cursor.getInt(_cursorIndexOfIntKitchenShape);
        }
        _item.setIntKitchenShape(_tmpIntKitchenShape);
        final String _tmpPavingAroundBuildingId;
        _tmpPavingAroundBuildingId = _cursor.getString(_cursorIndexOfPavingAroundBuildingId);
        _item.setPavingAroundBuildingId(_tmpPavingAroundBuildingId);
        final String _tmpLandAreaDescription;
        _tmpLandAreaDescription = _cursor.getString(_cursorIndexOfLandAreaDescription);
        _item.setLandAreaDescription(_tmpLandAreaDescription);
        final String _tmpNumberOfBuildings;
        _tmpNumberOfBuildings = _cursor.getString(_cursorIndexOfNumberOfBuildings);
        _item.setNumberOfBuildings(_tmpNumberOfBuildings);
        final Integer _tmpTypeOfCompound;
        if (_cursor.isNull(_cursorIndexOfTypeOfCompound)) {
          _tmpTypeOfCompound = null;
        } else {
          _tmpTypeOfCompound = _cursor.getInt(_cursorIndexOfTypeOfCompound);
        }
        _item.setTypeOfCompound(_tmpTypeOfCompound);
        final String _tmpNameOfTenant;
        _tmpNameOfTenant = _cursor.getString(_cursorIndexOfNameOfTenant);
        _item.setNameOfTenant(_tmpNameOfTenant);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<IndProperty> getIndProperty_caseID(int caseid_) {
    final String _sql = "SELECT * FROM indpropertymodal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfNoOfFloors = _cursor.getColumnIndexOrThrow("noOfFloors");
      final int _cursorIndexOfApprovedNoOfFloors = _cursor.getColumnIndexOrThrow("approvedNoOfFloors");
      final int _cursorIndexOfFloorDetails = _cursor.getColumnIndexOrThrow("floorDetails");
      final int _cursorIndexOfPropertyActualUsageId = _cursor.getColumnIndexOrThrow("propertyActualUsageId");
      final int _cursorIndexOfTotalApartmentFloors = _cursor.getColumnIndexOrThrow("totalApartmentFloors");
      final int _cursorIndexOfTotalFlatsPerFloor = _cursor.getColumnIndexOrThrow("totalFlatsPerFloor");
      final int _cursorIndexOfFlatSituatedInFloor = _cursor.getColumnIndexOrThrow("flatSituatedInFloor");
      final int _cursorIndexOfDocumentLandArea = _cursor.getColumnIndexOrThrow("documentLandArea");
      final int _cursorIndexOfIsCompounded = _cursor.getColumnIndexOrThrow("isCompounded");
      final int _cursorIndexOfDocumentLandAreaUnit = _cursor.getColumnIndexOrThrow("documentLandAreaUnit");
      final int _cursorIndexOfMeasuredLandArea = _cursor.getColumnIndexOrThrow("measuredLandArea");
      final int _cursorIndexOfMeasuredLandAreaUnit = _cursor.getColumnIndexOrThrow("measuredLandAreaUnit");
      final int _cursorIndexOfAvgPercentageCompletion = _cursor.getColumnIndexOrThrow("avgPercentageCompletion");
      final int _cursorIndexOfDocumentFloorAreaTotal = _cursor.getColumnIndexOrThrow("documentFloorAreaTotal");
      final int _cursorIndexOfMeasuredFloorAreaTotal = _cursor.getColumnIndexOrThrow("measuredFloorAreaTotal");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfFloorHeight = _cursor.getColumnIndexOrThrow("floorHeight");
      final int _cursorIndexOfYearsOfCurrentTenancy = _cursor.getColumnIndexOrThrow("yearsOfCurrentTenancy");
      final int _cursorIndexOfRentalIncome = _cursor.getColumnIndexOrThrow("rentalIncome");
      final int _cursorIndexOfBasement = _cursor.getColumnIndexOrThrow("basement");
      final int _cursorIndexOfNoOfLiftInBuilding = _cursor.getColumnIndexOrThrow("noOfLiftInBuilding");
      final int _cursorIndexOfExteriorPaintId = _cursor.getColumnIndexOrThrow("exteriorPaintId");
      final int _cursorIndexOfCarParkingId = _cursor.getColumnIndexOrThrow("carParkingId");
      final int _cursorIndexOfWaterAvailabilityId = _cursor.getColumnIndexOrThrow("waterAvailabilityId");
      final int _cursorIndexOfAmenities = _cursor.getColumnIndexOrThrow("amenities");
      final int _cursorIndexOfWingName = _cursor.getColumnIndexOrThrow("wingName");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntRoofId = _cursor.getColumnIndexOrThrow("intRoofId");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfFloorKindId = _cursor.getColumnIndexOrThrow("floorKindId");
      final int _cursorIndexOfWingNo = _cursor.getColumnIndexOrThrow("wingNo");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfGardenExist = _cursor.getColumnIndexOrThrow("gardenExist");
      final int _cursorIndexOfSeperateCompoundId = _cursor.getColumnIndexOrThrow("seperateCompoundId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfMarketabilityId = _cursor.getColumnIndexOrThrow("marketabilityId");
      final int _cursorIndexOfFittingQualityId = _cursor.getColumnIndexOrThrow("fittingQualityId");
      final int _cursorIndexOfMaintenanceOfBuildingId = _cursor.getColumnIndexOrThrow("maintenanceOfBuildingId");
      final int _cursorIndexOfTypeOfBuildingId = _cursor.getColumnIndexOrThrow("typeOfBuildingId");
      final int _cursorIndexOfQualityConstructionId = _cursor.getColumnIndexOrThrow("qualityConstructionId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfAmenityQualityId = _cursor.getColumnIndexOrThrow("amenityQualityId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfPavingAroundBuildingId = _cursor.getColumnIndexOrThrow("pavingAroundBuildingId");
      final int _cursorIndexOfLandAreaDescription = _cursor.getColumnIndexOrThrow("LandAreaDescription");
      final int _cursorIndexOfNumberOfBuildings = _cursor.getColumnIndexOrThrow("NumberOfBuildings");
      final int _cursorIndexOfTypeOfCompound = _cursor.getColumnIndexOrThrow("TypeOfCompound");
      final int _cursorIndexOfNameOfTenant = _cursor.getColumnIndexOrThrow("NameOfTenant");
      final List<IndProperty> _result = new ArrayList<IndProperty>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndProperty _item;
        _item = new IndProperty();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpNoOfFloors;
        _tmpNoOfFloors = _cursor.getInt(_cursorIndexOfNoOfFloors);
        _item.setNoOfFloors(_tmpNoOfFloors);
        final int _tmpApprovedNoOfFloors;
        _tmpApprovedNoOfFloors = _cursor.getInt(_cursorIndexOfApprovedNoOfFloors);
        _item.setApprovedNoOfFloors(_tmpApprovedNoOfFloors);
        final String _tmpFloorDetails;
        _tmpFloorDetails = _cursor.getString(_cursorIndexOfFloorDetails);
        _item.setFloorDetails(_tmpFloorDetails);
        final String _tmpPropertyActualUsageId;
        _tmpPropertyActualUsageId = _cursor.getString(_cursorIndexOfPropertyActualUsageId);
        _item.setPropertyActualUsageId(_tmpPropertyActualUsageId);
        final String _tmpTotalApartmentFloors;
        _tmpTotalApartmentFloors = _cursor.getString(_cursorIndexOfTotalApartmentFloors);
        _item.setTotalApartmentFloors(_tmpTotalApartmentFloors);
        final String _tmpTotalFlatsPerFloor;
        _tmpTotalFlatsPerFloor = _cursor.getString(_cursorIndexOfTotalFlatsPerFloor);
        _item.setTotalFlatsPerFloor(_tmpTotalFlatsPerFloor);
        final String _tmpFlatSituatedInFloor;
        _tmpFlatSituatedInFloor = _cursor.getString(_cursorIndexOfFlatSituatedInFloor);
        _item.setFlatSituatedInFloor(_tmpFlatSituatedInFloor);
        final String _tmpDocumentLandArea;
        _tmpDocumentLandArea = _cursor.getString(_cursorIndexOfDocumentLandArea);
        _item.setDocumentLandArea(_tmpDocumentLandArea);
        final Boolean _tmpIsCompounded;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsCompounded)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsCompounded);
        }
        _tmpIsCompounded = _tmp == null ? null : _tmp != 0;
        _item.setIsCompounded(_tmpIsCompounded);
        final int _tmpDocumentLandAreaUnit;
        _tmpDocumentLandAreaUnit = _cursor.getInt(_cursorIndexOfDocumentLandAreaUnit);
        _item.setDocumentLandAreaUnit(_tmpDocumentLandAreaUnit);
        final String _tmpMeasuredLandArea;
        _tmpMeasuredLandArea = _cursor.getString(_cursorIndexOfMeasuredLandArea);
        _item.setMeasuredLandArea(_tmpMeasuredLandArea);
        final int _tmpMeasuredLandAreaUnit;
        _tmpMeasuredLandAreaUnit = _cursor.getInt(_cursorIndexOfMeasuredLandAreaUnit);
        _item.setMeasuredLandAreaUnit(_tmpMeasuredLandAreaUnit);
        final String _tmpAvgPercentageCompletion;
        _tmpAvgPercentageCompletion = _cursor.getString(_cursorIndexOfAvgPercentageCompletion);
        _item.setAvgPercentageCompletion(_tmpAvgPercentageCompletion);
        final String _tmpDocumentFloorAreaTotal;
        _tmpDocumentFloorAreaTotal = _cursor.getString(_cursorIndexOfDocumentFloorAreaTotal);
        _item.setDocumentFloorAreaTotal(_tmpDocumentFloorAreaTotal);
        final String _tmpMeasuredFloorAreaTotal;
        _tmpMeasuredFloorAreaTotal = _cursor.getString(_cursorIndexOfMeasuredFloorAreaTotal);
        _item.setMeasuredFloorAreaTotal(_tmpMeasuredFloorAreaTotal);
        final String _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getString(_cursorIndexOfTypeOfStructureId);
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
        final String _tmpBasement;
        _tmpBasement = _cursor.getString(_cursorIndexOfBasement);
        _item.setBasement(_tmpBasement);
        final String _tmpNoOfLiftInBuilding;
        _tmpNoOfLiftInBuilding = _cursor.getString(_cursorIndexOfNoOfLiftInBuilding);
        _item.setNoOfLiftInBuilding(_tmpNoOfLiftInBuilding);
        final String _tmpExteriorPaintId;
        _tmpExteriorPaintId = _cursor.getString(_cursorIndexOfExteriorPaintId);
        _item.setExteriorPaintId(_tmpExteriorPaintId);
        final String _tmpCarParkingId;
        _tmpCarParkingId = _cursor.getString(_cursorIndexOfCarParkingId);
        _item.setCarParkingId(_tmpCarParkingId);
        final String _tmpWaterAvailabilityId;
        _tmpWaterAvailabilityId = _cursor.getString(_cursorIndexOfWaterAvailabilityId);
        _item.setWaterAvailabilityId(_tmpWaterAvailabilityId);
        final String _tmpAmenities;
        _tmpAmenities = _cursor.getString(_cursorIndexOfAmenities);
        _item.setAmenities(_tmpAmenities);
        final String _tmpWingName;
        _tmpWingName = _cursor.getString(_cursorIndexOfWingName);
        _item.setWingName(_tmpWingName);
        final String _tmpIntFloorId;
        _tmpIntFloorId = _cursor.getString(_cursorIndexOfIntFloorId);
        _item.setIntFloorId(_tmpIntFloorId);
        final String _tmpIntWindowId;
        _tmpIntWindowId = _cursor.getString(_cursorIndexOfIntWindowId);
        _item.setIntWindowId(_tmpIntWindowId);
        final String _tmpIntDoorId;
        _tmpIntDoorId = _cursor.getString(_cursorIndexOfIntDoorId);
        _item.setIntDoorId(_tmpIntDoorId);
        final String _tmpIntWcId;
        _tmpIntWcId = _cursor.getString(_cursorIndexOfIntWcId);
        _item.setIntWcId(_tmpIntWcId);
        final String _tmpIntPaintId;
        _tmpIntPaintId = _cursor.getString(_cursorIndexOfIntPaintId);
        _item.setIntPaintId(_tmpIntPaintId);
        final String _tmpIntRoofId;
        _tmpIntRoofId = _cursor.getString(_cursorIndexOfIntRoofId);
        _item.setIntRoofId(_tmpIntRoofId);
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
        final int _tmpFloorKindId;
        _tmpFloorKindId = _cursor.getInt(_cursorIndexOfFloorKindId);
        _item.setFloorKindId(_tmpFloorKindId);
        final Integer _tmpWingNo;
        if (_cursor.isNull(_cursorIndexOfWingNo)) {
          _tmpWingNo = null;
        } else {
          _tmpWingNo = _cursor.getInt(_cursorIndexOfWingNo);
        }
        _item.setWingNo(_tmpWingNo);
        final Boolean _tmpIntPop;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIntPop)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIntPop);
        }
        _tmpIntPop = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setIntPop(_tmpIntPop);
        final Boolean _tmpGardenExist;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfGardenExist)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfGardenExist);
        }
        _tmpGardenExist = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setGardenExist(_tmpGardenExist);
        final Integer _tmpSeperateCompoundId;
        if (_cursor.isNull(_cursorIndexOfSeperateCompoundId)) {
          _tmpSeperateCompoundId = null;
        } else {
          _tmpSeperateCompoundId = _cursor.getInt(_cursorIndexOfSeperateCompoundId);
        }
        _item.setSeperateCompoundId(_tmpSeperateCompoundId);
        final Integer _tmpPassageTypeId;
        if (_cursor.isNull(_cursorIndexOfPassageTypeId)) {
          _tmpPassageTypeId = null;
        } else {
          _tmpPassageTypeId = _cursor.getInt(_cursorIndexOfPassageTypeId);
        }
        _item.setPassageTypeId(_tmpPassageTypeId);
        final Integer _tmpMarketabilityId;
        if (_cursor.isNull(_cursorIndexOfMarketabilityId)) {
          _tmpMarketabilityId = null;
        } else {
          _tmpMarketabilityId = _cursor.getInt(_cursorIndexOfMarketabilityId);
        }
        _item.setMarketabilityId(_tmpMarketabilityId);
        final Integer _tmpFittingQualityId;
        if (_cursor.isNull(_cursorIndexOfFittingQualityId)) {
          _tmpFittingQualityId = null;
        } else {
          _tmpFittingQualityId = _cursor.getInt(_cursorIndexOfFittingQualityId);
        }
        _item.setFittingQualityId(_tmpFittingQualityId);
        final Integer _tmpMaintenanceOfBuildingId;
        if (_cursor.isNull(_cursorIndexOfMaintenanceOfBuildingId)) {
          _tmpMaintenanceOfBuildingId = null;
        } else {
          _tmpMaintenanceOfBuildingId = _cursor.getInt(_cursorIndexOfMaintenanceOfBuildingId);
        }
        _item.setMaintenanceOfBuildingId(_tmpMaintenanceOfBuildingId);
        final Integer _tmpTypeOfBuildingId;
        if (_cursor.isNull(_cursorIndexOfTypeOfBuildingId)) {
          _tmpTypeOfBuildingId = null;
        } else {
          _tmpTypeOfBuildingId = _cursor.getInt(_cursorIndexOfTypeOfBuildingId);
        }
        _item.setTypeOfBuildingId(_tmpTypeOfBuildingId);
        final Integer _tmpQualityConstructionId;
        if (_cursor.isNull(_cursorIndexOfQualityConstructionId)) {
          _tmpQualityConstructionId = null;
        } else {
          _tmpQualityConstructionId = _cursor.getInt(_cursorIndexOfQualityConstructionId);
        }
        _item.setQualityConstructionId(_tmpQualityConstructionId);
        final Integer _tmpIntBathId;
        if (_cursor.isNull(_cursorIndexOfIntBathId)) {
          _tmpIntBathId = null;
        } else {
          _tmpIntBathId = _cursor.getInt(_cursorIndexOfIntBathId);
        }
        _item.setIntBathId(_tmpIntBathId);
        final Integer _tmpAmenityQualityId;
        if (_cursor.isNull(_cursorIndexOfAmenityQualityId)) {
          _tmpAmenityQualityId = null;
        } else {
          _tmpAmenityQualityId = _cursor.getInt(_cursorIndexOfAmenityQualityId);
        }
        _item.setAmenityQualityId(_tmpAmenityQualityId);
        final Integer _tmpIntKitchenType;
        if (_cursor.isNull(_cursorIndexOfIntKitchenType)) {
          _tmpIntKitchenType = null;
        } else {
          _tmpIntKitchenType = _cursor.getInt(_cursorIndexOfIntKitchenType);
        }
        _item.setIntKitchenType(_tmpIntKitchenType);
        final Integer _tmpIntKitchenShape;
        if (_cursor.isNull(_cursorIndexOfIntKitchenShape)) {
          _tmpIntKitchenShape = null;
        } else {
          _tmpIntKitchenShape = _cursor.getInt(_cursorIndexOfIntKitchenShape);
        }
        _item.setIntKitchenShape(_tmpIntKitchenShape);
        final String _tmpPavingAroundBuildingId;
        _tmpPavingAroundBuildingId = _cursor.getString(_cursorIndexOfPavingAroundBuildingId);
        _item.setPavingAroundBuildingId(_tmpPavingAroundBuildingId);
        final String _tmpLandAreaDescription;
        _tmpLandAreaDescription = _cursor.getString(_cursorIndexOfLandAreaDescription);
        _item.setLandAreaDescription(_tmpLandAreaDescription);
        final String _tmpNumberOfBuildings;
        _tmpNumberOfBuildings = _cursor.getString(_cursorIndexOfNumberOfBuildings);
        _item.setNumberOfBuildings(_tmpNumberOfBuildings);
        final Integer _tmpTypeOfCompound;
        if (_cursor.isNull(_cursorIndexOfTypeOfCompound)) {
          _tmpTypeOfCompound = null;
        } else {
          _tmpTypeOfCompound = _cursor.getInt(_cursorIndexOfTypeOfCompound);
        }
        _item.setTypeOfCompound(_tmpTypeOfCompound);
        final String _tmpNameOfTenant;
        _tmpNameOfTenant = _cursor.getString(_cursorIndexOfNameOfTenant);
        _item.setNameOfTenant(_tmpNameOfTenant);
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
    final String _sql = "SELECT COUNT(*) from indpropertymodal";
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
