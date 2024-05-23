package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.IndPropertyValuation;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceIndPropertyValuationQuery_Impl implements InterfaceIndPropertyValuationQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfIndPropertyValuation;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfIndPropertyValuation;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  public InterfaceIndPropertyValuationQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIndPropertyValuation = new EntityInsertionAdapter<IndPropertyValuation>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `IndPropertyValuationModal`(`dummyID`,`caseId`,`guidelineRate`,`guidelineRateUnit`,`guidelineValue`,`documentLandRate`,`documentLandValue`,`measuredLandRate`,`measuredLandValue`,`documentedLandValueSel`,`measuredLandValueSel`,`documentedConstrValueSel`,`measuredConstrValueSel`,`totalConstructionValue`,`totalPropertyValue`,`buildingDepreciationValue`,`proposedValuation`,`proposedValuationComments`,`totalValueAtCompletion`,`insuranceValue`,`realizationPercentage`,`distressPercentage`,`realizationValue`,`distressValue`,`createdOn`,`createdBy`,`modifiedOn`,`modifiedBy`,`completionPercentage`,`totalPropertyValueDepreciation`,`distressValueDepreciation`,`carpetAreaPercentage`,`carpetAreaTypeId`,`realizationValueDepreciation`,`realizationLandValue`,`constructionDLCRate`,`constructionDLCRateUnit`,`constructionDLCValue`,`carpetArea`,`buildUpArea`,`superBuildUpArea`,`carpetAreaUnit`,`selectedConstructionArea`,`bAULoadingPercentage`,`constructionRate`,`insuredConstructionRate`,`terraceArea`,`terraceRate`,`terraceValue`,`SaleableLoadingPercentage`,`BalconyArea`,`BalconyRate`,`BalconyValue`,`RealizationPercentageAsOnDate`,`DistressPercentageAsOnDate`,`RealizationValueAsOnDate`,`DistressValueAsOnDate`,`AdditionalDescription`,`AdditionalDescriptionValue`,`SelectedCarpetAreaTypeId`,`GovernmentArea`,`InsuranceArea`,`OtlaArea`,`OtlaRate`,`OtlaValue`,`MezzanineArea`,`MezzanineRate`,`MezzanineValue`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyValuation value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        if (value.getGuidelineRate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGuidelineRate());
        }
        if (value.getGuidelineRateUnit() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGuidelineRateUnit());
        }
        if (value.getGuidelineValue() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGuidelineValue());
        }
        if (value.getDocumentLandRate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDocumentLandRate());
        }
        if (value.getDocumentLandValue() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDocumentLandValue());
        }
        if (value.getMeasuredLandRate() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMeasuredLandRate());
        }
        if (value.getMeasuredLandValue() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMeasuredLandValue());
        }
        final Integer _tmp;
        _tmp = value.getDocumentedLandValueSel() == null ? null : (value.getDocumentedLandValueSel() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.getMeasuredLandValueSel() == null ? null : (value.getMeasuredLandValueSel() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp_1);
        }
        final Integer _tmp_2;
        _tmp_2 = value.getDocumentedConstrValueSel() == null ? null : (value.getDocumentedConstrValueSel() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_2);
        }
        final Integer _tmp_3;
        _tmp_3 = value.getMeasuredConstrValueSel() == null ? null : (value.getMeasuredConstrValueSel() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp_3);
        }
        if (value.getTotalConstructionValue() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getTotalConstructionValue());
        }
        if (value.getTotalPropertyValue() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getTotalPropertyValue());
        }
        if (value.getBuildingDepreciationValue() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getBuildingDepreciationValue());
        }
        if (value.getProposedValuation() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getProposedValuation());
        }
        if (value.getProposedValuationComments() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getProposedValuationComments());
        }
        if (value.getTotalValueAtCompletion() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getTotalValueAtCompletion());
        }
        if (value.getInsuranceValue() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getInsuranceValue());
        }
        if (value.getRealizationPercentage() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getRealizationPercentage());
        }
        if (value.getDistressPercentage() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getDistressPercentage());
        }
        if (value.getRealizationValue() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getRealizationValue());
        }
        if (value.getDistressValue() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getDistressValue());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getCreatedOn());
        }
        stmt.bindLong(26, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getModifiedOn());
        }
        stmt.bindLong(28, value.getModifiedBy());
        if (value.getCompletionPercentage() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getCompletionPercentage());
        }
        if (value.getTotalPropertyValueDepreciation() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getTotalPropertyValueDepreciation());
        }
        if (value.getDistressValueDepreciation() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getDistressValueDepreciation());
        }
        if (value.getCarpetAreaPercentage() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getCarpetAreaPercentage());
        }
        if (value.getCarpetAreaTypeId() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getCarpetAreaTypeId());
        }
        if (value.getRealizationValueDepreciation() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getRealizationValueDepreciation());
        }
        if (value.getRealizationLandValue() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getRealizationLandValue());
        }
        if (value.getConstructionDLCRate() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getConstructionDLCRate());
        }
        if (value.getConstructionDLCRateUnit() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getConstructionDLCRateUnit());
        }
        if (value.getConstructionDLCValue() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getConstructionDLCValue());
        }
        if (value.getCarpetArea() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getCarpetArea());
        }
        if (value.getBuildUpArea() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getBuildUpArea());
        }
        if (value.getSuperBuildUpArea() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getSuperBuildUpArea());
        }
        if (value.getCarpetAreaUnit() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getCarpetAreaUnit());
        }
        if (value.getSelectedConstructionArea() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getSelectedConstructionArea());
        }
        if (value.getBAULoadingPercentage() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getBAULoadingPercentage());
        }
        if (value.getConstructionRate() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getConstructionRate());
        }
        if (value.getInsuredConstructionRate() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getInsuredConstructionRate());
        }
        if (value.getTerraceArea() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getTerraceArea());
        }
        if (value.getTerraceRate() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getTerraceRate());
        }
        if (value.getTerraceValue() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getTerraceValue());
        }
        if (value.getSaleableLoadingPercentage() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getSaleableLoadingPercentage());
        }
        if (value.getBalconyArea() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getBalconyArea());
        }
        if (value.getBalconyRate() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getBalconyRate());
        }
        if (value.getBalconyValue() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getBalconyValue());
        }
        if (value.getRealizationPercentageAsOnDate() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getRealizationPercentageAsOnDate());
        }
        if (value.getDistressPercentageAsOnDate() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getDistressPercentageAsOnDate());
        }
        if (value.getRealizationValueAsOnDate() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getRealizationValueAsOnDate());
        }
        if (value.getDistressValueAsOnDate() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getDistressValueAsOnDate());
        }
        if (value.getAdditionalDescription() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getAdditionalDescription());
        }
        if (value.getAdditionalDescriptionValue() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getAdditionalDescriptionValue());
        }
        if (value.getSelectedCarpetAreaTypeId() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getSelectedCarpetAreaTypeId());
        }
        if (value.getGovernmentArea() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getGovernmentArea());
        }
        if (value.getInsuranceArea() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getInsuranceArea());
        }
        if (value.getOtlaArea() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindString(63, value.getOtlaArea());
        }
        if (value.getOtlaRate() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindString(64, value.getOtlaRate());
        }
        if (value.getOtlaValue() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getOtlaValue());
        }
        if (value.getMezzanineArea() == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.getMezzanineArea());
        }
        if (value.getMezzanineRate() == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, value.getMezzanineRate());
        }
        if (value.getMezzanineValue() == null) {
          stmt.bindNull(68);
        } else {
          stmt.bindString(68, value.getMezzanineValue());
        }
      }
    };
    this.__deletionAdapterOfIndPropertyValuation = new EntityDeletionOrUpdateAdapter<IndPropertyValuation>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `IndPropertyValuationModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IndPropertyValuation value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyValuationModal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM IndPropertyValuationModal where CaseId = (?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(IndPropertyValuation indPropertyValuation) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIndPropertyValuation.insert(indPropertyValuation);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(IndPropertyValuation indPropertyValuation) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfIndPropertyValuation.handle(indPropertyValuation);
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
  public List<IndPropertyValuation> getIndPropertyValuation() {
    final String _sql = "SELECT * FROM IndPropertyValuationModal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfGuidelineRate = _cursor.getColumnIndexOrThrow("guidelineRate");
      final int _cursorIndexOfGuidelineRateUnit = _cursor.getColumnIndexOrThrow("guidelineRateUnit");
      final int _cursorIndexOfGuidelineValue = _cursor.getColumnIndexOrThrow("guidelineValue");
      final int _cursorIndexOfDocumentLandRate = _cursor.getColumnIndexOrThrow("documentLandRate");
      final int _cursorIndexOfDocumentLandValue = _cursor.getColumnIndexOrThrow("documentLandValue");
      final int _cursorIndexOfMeasuredLandRate = _cursor.getColumnIndexOrThrow("measuredLandRate");
      final int _cursorIndexOfMeasuredLandValue = _cursor.getColumnIndexOrThrow("measuredLandValue");
      final int _cursorIndexOfDocumentedLandValueSel = _cursor.getColumnIndexOrThrow("documentedLandValueSel");
      final int _cursorIndexOfMeasuredLandValueSel = _cursor.getColumnIndexOrThrow("measuredLandValueSel");
      final int _cursorIndexOfDocumentedConstrValueSel = _cursor.getColumnIndexOrThrow("documentedConstrValueSel");
      final int _cursorIndexOfMeasuredConstrValueSel = _cursor.getColumnIndexOrThrow("measuredConstrValueSel");
      final int _cursorIndexOfTotalConstructionValue = _cursor.getColumnIndexOrThrow("totalConstructionValue");
      final int _cursorIndexOfTotalPropertyValue = _cursor.getColumnIndexOrThrow("totalPropertyValue");
      final int _cursorIndexOfBuildingDepreciationValue = _cursor.getColumnIndexOrThrow("buildingDepreciationValue");
      final int _cursorIndexOfProposedValuation = _cursor.getColumnIndexOrThrow("proposedValuation");
      final int _cursorIndexOfProposedValuationComments = _cursor.getColumnIndexOrThrow("proposedValuationComments");
      final int _cursorIndexOfTotalValueAtCompletion = _cursor.getColumnIndexOrThrow("totalValueAtCompletion");
      final int _cursorIndexOfInsuranceValue = _cursor.getColumnIndexOrThrow("insuranceValue");
      final int _cursorIndexOfRealizationPercentage = _cursor.getColumnIndexOrThrow("realizationPercentage");
      final int _cursorIndexOfDistressPercentage = _cursor.getColumnIndexOrThrow("distressPercentage");
      final int _cursorIndexOfRealizationValue = _cursor.getColumnIndexOrThrow("realizationValue");
      final int _cursorIndexOfDistressValue = _cursor.getColumnIndexOrThrow("distressValue");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfCompletionPercentage = _cursor.getColumnIndexOrThrow("completionPercentage");
      final int _cursorIndexOfTotalPropertyValueDepreciation = _cursor.getColumnIndexOrThrow("totalPropertyValueDepreciation");
      final int _cursorIndexOfDistressValueDepreciation = _cursor.getColumnIndexOrThrow("distressValueDepreciation");
      final int _cursorIndexOfCarpetAreaPercentage = _cursor.getColumnIndexOrThrow("carpetAreaPercentage");
      final int _cursorIndexOfCarpetAreaTypeId = _cursor.getColumnIndexOrThrow("carpetAreaTypeId");
      final int _cursorIndexOfRealizationValueDepreciation = _cursor.getColumnIndexOrThrow("realizationValueDepreciation");
      final int _cursorIndexOfRealizationLandValue = _cursor.getColumnIndexOrThrow("realizationLandValue");
      final int _cursorIndexOfConstructionDLCRate = _cursor.getColumnIndexOrThrow("constructionDLCRate");
      final int _cursorIndexOfConstructionDLCRateUnit = _cursor.getColumnIndexOrThrow("constructionDLCRateUnit");
      final int _cursorIndexOfConstructionDLCValue = _cursor.getColumnIndexOrThrow("constructionDLCValue");
      final int _cursorIndexOfCarpetArea = _cursor.getColumnIndexOrThrow("carpetArea");
      final int _cursorIndexOfBuildUpArea = _cursor.getColumnIndexOrThrow("buildUpArea");
      final int _cursorIndexOfSuperBuildUpArea = _cursor.getColumnIndexOrThrow("superBuildUpArea");
      final int _cursorIndexOfCarpetAreaUnit = _cursor.getColumnIndexOrThrow("carpetAreaUnit");
      final int _cursorIndexOfSelectedConstructionArea = _cursor.getColumnIndexOrThrow("selectedConstructionArea");
      final int _cursorIndexOfBAULoadingPercentage = _cursor.getColumnIndexOrThrow("bAULoadingPercentage");
      final int _cursorIndexOfConstructionRate = _cursor.getColumnIndexOrThrow("constructionRate");
      final int _cursorIndexOfInsuredConstructionRate = _cursor.getColumnIndexOrThrow("insuredConstructionRate");
      final int _cursorIndexOfTerraceArea = _cursor.getColumnIndexOrThrow("terraceArea");
      final int _cursorIndexOfTerraceRate = _cursor.getColumnIndexOrThrow("terraceRate");
      final int _cursorIndexOfTerraceValue = _cursor.getColumnIndexOrThrow("terraceValue");
      final int _cursorIndexOfSaleableLoadingPercentage = _cursor.getColumnIndexOrThrow("SaleableLoadingPercentage");
      final int _cursorIndexOfBalconyArea = _cursor.getColumnIndexOrThrow("BalconyArea");
      final int _cursorIndexOfBalconyRate = _cursor.getColumnIndexOrThrow("BalconyRate");
      final int _cursorIndexOfBalconyValue = _cursor.getColumnIndexOrThrow("BalconyValue");
      final int _cursorIndexOfRealizationPercentageAsOnDate = _cursor.getColumnIndexOrThrow("RealizationPercentageAsOnDate");
      final int _cursorIndexOfDistressPercentageAsOnDate = _cursor.getColumnIndexOrThrow("DistressPercentageAsOnDate");
      final int _cursorIndexOfRealizationValueAsOnDate = _cursor.getColumnIndexOrThrow("RealizationValueAsOnDate");
      final int _cursorIndexOfDistressValueAsOnDate = _cursor.getColumnIndexOrThrow("DistressValueAsOnDate");
      final int _cursorIndexOfAdditionalDescription = _cursor.getColumnIndexOrThrow("AdditionalDescription");
      final int _cursorIndexOfAdditionalDescriptionValue = _cursor.getColumnIndexOrThrow("AdditionalDescriptionValue");
      final int _cursorIndexOfSelectedCarpetAreaTypeId = _cursor.getColumnIndexOrThrow("SelectedCarpetAreaTypeId");
      final int _cursorIndexOfGovernmentArea = _cursor.getColumnIndexOrThrow("GovernmentArea");
      final int _cursorIndexOfInsuranceArea = _cursor.getColumnIndexOrThrow("InsuranceArea");
      final int _cursorIndexOfOtlaArea = _cursor.getColumnIndexOrThrow("OtlaArea");
      final int _cursorIndexOfOtlaRate = _cursor.getColumnIndexOrThrow("OtlaRate");
      final int _cursorIndexOfOtlaValue = _cursor.getColumnIndexOrThrow("OtlaValue");
      final int _cursorIndexOfMezzanineArea = _cursor.getColumnIndexOrThrow("MezzanineArea");
      final int _cursorIndexOfMezzanineRate = _cursor.getColumnIndexOrThrow("MezzanineRate");
      final int _cursorIndexOfMezzanineValue = _cursor.getColumnIndexOrThrow("MezzanineValue");
      final List<IndPropertyValuation> _result = new ArrayList<IndPropertyValuation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyValuation _item;
        _item = new IndPropertyValuation();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final String _tmpGuidelineRate;
        _tmpGuidelineRate = _cursor.getString(_cursorIndexOfGuidelineRate);
        _item.setGuidelineRate(_tmpGuidelineRate);
        final String _tmpGuidelineRateUnit;
        _tmpGuidelineRateUnit = _cursor.getString(_cursorIndexOfGuidelineRateUnit);
        _item.setGuidelineRateUnit(_tmpGuidelineRateUnit);
        final String _tmpGuidelineValue;
        _tmpGuidelineValue = _cursor.getString(_cursorIndexOfGuidelineValue);
        _item.setGuidelineValue(_tmpGuidelineValue);
        final String _tmpDocumentLandRate;
        _tmpDocumentLandRate = _cursor.getString(_cursorIndexOfDocumentLandRate);
        _item.setDocumentLandRate(_tmpDocumentLandRate);
        final String _tmpDocumentLandValue;
        _tmpDocumentLandValue = _cursor.getString(_cursorIndexOfDocumentLandValue);
        _item.setDocumentLandValue(_tmpDocumentLandValue);
        final String _tmpMeasuredLandRate;
        _tmpMeasuredLandRate = _cursor.getString(_cursorIndexOfMeasuredLandRate);
        _item.setMeasuredLandRate(_tmpMeasuredLandRate);
        final String _tmpMeasuredLandValue;
        _tmpMeasuredLandValue = _cursor.getString(_cursorIndexOfMeasuredLandValue);
        _item.setMeasuredLandValue(_tmpMeasuredLandValue);
        final Boolean _tmpDocumentedLandValueSel;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfDocumentedLandValueSel)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfDocumentedLandValueSel);
        }
        _tmpDocumentedLandValueSel = _tmp == null ? null : _tmp != 0;
        _item.setDocumentedLandValueSel(_tmpDocumentedLandValueSel);
        final Boolean _tmpMeasuredLandValueSel;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfMeasuredLandValueSel)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfMeasuredLandValueSel);
        }
        _tmpMeasuredLandValueSel = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setMeasuredLandValueSel(_tmpMeasuredLandValueSel);
        final Boolean _tmpDocumentedConstrValueSel;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfDocumentedConstrValueSel)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfDocumentedConstrValueSel);
        }
        _tmpDocumentedConstrValueSel = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setDocumentedConstrValueSel(_tmpDocumentedConstrValueSel);
        final Boolean _tmpMeasuredConstrValueSel;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfMeasuredConstrValueSel)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfMeasuredConstrValueSel);
        }
        _tmpMeasuredConstrValueSel = _tmp_3 == null ? null : _tmp_3 != 0;
        _item.setMeasuredConstrValueSel(_tmpMeasuredConstrValueSel);
        final String _tmpTotalConstructionValue;
        _tmpTotalConstructionValue = _cursor.getString(_cursorIndexOfTotalConstructionValue);
        _item.setTotalConstructionValue(_tmpTotalConstructionValue);
        final String _tmpTotalPropertyValue;
        _tmpTotalPropertyValue = _cursor.getString(_cursorIndexOfTotalPropertyValue);
        _item.setTotalPropertyValue(_tmpTotalPropertyValue);
        final String _tmpBuildingDepreciationValue;
        _tmpBuildingDepreciationValue = _cursor.getString(_cursorIndexOfBuildingDepreciationValue);
        _item.setBuildingDepreciationValue(_tmpBuildingDepreciationValue);
        final String _tmpProposedValuation;
        _tmpProposedValuation = _cursor.getString(_cursorIndexOfProposedValuation);
        _item.setProposedValuation(_tmpProposedValuation);
        final String _tmpProposedValuationComments;
        _tmpProposedValuationComments = _cursor.getString(_cursorIndexOfProposedValuationComments);
        _item.setProposedValuationComments(_tmpProposedValuationComments);
        final String _tmpTotalValueAtCompletion;
        _tmpTotalValueAtCompletion = _cursor.getString(_cursorIndexOfTotalValueAtCompletion);
        _item.setTotalValueAtCompletion(_tmpTotalValueAtCompletion);
        final String _tmpInsuranceValue;
        _tmpInsuranceValue = _cursor.getString(_cursorIndexOfInsuranceValue);
        _item.setInsuranceValue(_tmpInsuranceValue);
        final String _tmpRealizationPercentage;
        _tmpRealizationPercentage = _cursor.getString(_cursorIndexOfRealizationPercentage);
        _item.setRealizationPercentage(_tmpRealizationPercentage);
        final String _tmpDistressPercentage;
        _tmpDistressPercentage = _cursor.getString(_cursorIndexOfDistressPercentage);
        _item.setDistressPercentage(_tmpDistressPercentage);
        final String _tmpRealizationValue;
        _tmpRealizationValue = _cursor.getString(_cursorIndexOfRealizationValue);
        _item.setRealizationValue(_tmpRealizationValue);
        final String _tmpDistressValue;
        _tmpDistressValue = _cursor.getString(_cursorIndexOfDistressValue);
        _item.setDistressValue(_tmpDistressValue);
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
        final String _tmpCompletionPercentage;
        _tmpCompletionPercentage = _cursor.getString(_cursorIndexOfCompletionPercentage);
        _item.setCompletionPercentage(_tmpCompletionPercentage);
        final String _tmpTotalPropertyValueDepreciation;
        _tmpTotalPropertyValueDepreciation = _cursor.getString(_cursorIndexOfTotalPropertyValueDepreciation);
        _item.setTotalPropertyValueDepreciation(_tmpTotalPropertyValueDepreciation);
        final String _tmpDistressValueDepreciation;
        _tmpDistressValueDepreciation = _cursor.getString(_cursorIndexOfDistressValueDepreciation);
        _item.setDistressValueDepreciation(_tmpDistressValueDepreciation);
        final String _tmpCarpetAreaPercentage;
        _tmpCarpetAreaPercentage = _cursor.getString(_cursorIndexOfCarpetAreaPercentage);
        _item.setCarpetAreaPercentage(_tmpCarpetAreaPercentage);
        final String _tmpCarpetAreaTypeId;
        _tmpCarpetAreaTypeId = _cursor.getString(_cursorIndexOfCarpetAreaTypeId);
        _item.setCarpetAreaTypeId(_tmpCarpetAreaTypeId);
        final String _tmpRealizationValueDepreciation;
        _tmpRealizationValueDepreciation = _cursor.getString(_cursorIndexOfRealizationValueDepreciation);
        _item.setRealizationValueDepreciation(_tmpRealizationValueDepreciation);
        final String _tmpRealizationLandValue;
        _tmpRealizationLandValue = _cursor.getString(_cursorIndexOfRealizationLandValue);
        _item.setRealizationLandValue(_tmpRealizationLandValue);
        final String _tmpConstructionDLCRate;
        _tmpConstructionDLCRate = _cursor.getString(_cursorIndexOfConstructionDLCRate);
        _item.setConstructionDLCRate(_tmpConstructionDLCRate);
        final String _tmpConstructionDLCRateUnit;
        _tmpConstructionDLCRateUnit = _cursor.getString(_cursorIndexOfConstructionDLCRateUnit);
        _item.setConstructionDLCRateUnit(_tmpConstructionDLCRateUnit);
        final String _tmpConstructionDLCValue;
        _tmpConstructionDLCValue = _cursor.getString(_cursorIndexOfConstructionDLCValue);
        _item.setConstructionDLCValue(_tmpConstructionDLCValue);
        final String _tmpCarpetArea;
        _tmpCarpetArea = _cursor.getString(_cursorIndexOfCarpetArea);
        _item.setCarpetArea(_tmpCarpetArea);
        final String _tmpBuildUpArea;
        _tmpBuildUpArea = _cursor.getString(_cursorIndexOfBuildUpArea);
        _item.setBuildUpArea(_tmpBuildUpArea);
        final String _tmpSuperBuildUpArea;
        _tmpSuperBuildUpArea = _cursor.getString(_cursorIndexOfSuperBuildUpArea);
        _item.setSuperBuildUpArea(_tmpSuperBuildUpArea);
        final String _tmpCarpetAreaUnit;
        _tmpCarpetAreaUnit = _cursor.getString(_cursorIndexOfCarpetAreaUnit);
        _item.setCarpetAreaUnit(_tmpCarpetAreaUnit);
        final String _tmpSelectedConstructionArea;
        _tmpSelectedConstructionArea = _cursor.getString(_cursorIndexOfSelectedConstructionArea);
        _item.setSelectedConstructionArea(_tmpSelectedConstructionArea);
        final String _tmpBAULoadingPercentage;
        _tmpBAULoadingPercentage = _cursor.getString(_cursorIndexOfBAULoadingPercentage);
        _item.setBAULoadingPercentage(_tmpBAULoadingPercentage);
        final String _tmpConstructionRate;
        _tmpConstructionRate = _cursor.getString(_cursorIndexOfConstructionRate);
        _item.setConstructionRate(_tmpConstructionRate);
        final String _tmpInsuredConstructionRate;
        _tmpInsuredConstructionRate = _cursor.getString(_cursorIndexOfInsuredConstructionRate);
        _item.setInsuredConstructionRate(_tmpInsuredConstructionRate);
        final String _tmpTerraceArea;
        _tmpTerraceArea = _cursor.getString(_cursorIndexOfTerraceArea);
        _item.setTerraceArea(_tmpTerraceArea);
        final String _tmpTerraceRate;
        _tmpTerraceRate = _cursor.getString(_cursorIndexOfTerraceRate);
        _item.setTerraceRate(_tmpTerraceRate);
        final String _tmpTerraceValue;
        _tmpTerraceValue = _cursor.getString(_cursorIndexOfTerraceValue);
        _item.setTerraceValue(_tmpTerraceValue);
        final String _tmpSaleableLoadingPercentage;
        _tmpSaleableLoadingPercentage = _cursor.getString(_cursorIndexOfSaleableLoadingPercentage);
        _item.setSaleableLoadingPercentage(_tmpSaleableLoadingPercentage);
        final String _tmpBalconyArea;
        _tmpBalconyArea = _cursor.getString(_cursorIndexOfBalconyArea);
        _item.setBalconyArea(_tmpBalconyArea);
        final String _tmpBalconyRate;
        _tmpBalconyRate = _cursor.getString(_cursorIndexOfBalconyRate);
        _item.setBalconyRate(_tmpBalconyRate);
        final String _tmpBalconyValue;
        _tmpBalconyValue = _cursor.getString(_cursorIndexOfBalconyValue);
        _item.setBalconyValue(_tmpBalconyValue);
        final String _tmpRealizationPercentageAsOnDate;
        _tmpRealizationPercentageAsOnDate = _cursor.getString(_cursorIndexOfRealizationPercentageAsOnDate);
        _item.setRealizationPercentageAsOnDate(_tmpRealizationPercentageAsOnDate);
        final String _tmpDistressPercentageAsOnDate;
        _tmpDistressPercentageAsOnDate = _cursor.getString(_cursorIndexOfDistressPercentageAsOnDate);
        _item.setDistressPercentageAsOnDate(_tmpDistressPercentageAsOnDate);
        final String _tmpRealizationValueAsOnDate;
        _tmpRealizationValueAsOnDate = _cursor.getString(_cursorIndexOfRealizationValueAsOnDate);
        _item.setRealizationValueAsOnDate(_tmpRealizationValueAsOnDate);
        final String _tmpDistressValueAsOnDate;
        _tmpDistressValueAsOnDate = _cursor.getString(_cursorIndexOfDistressValueAsOnDate);
        _item.setDistressValueAsOnDate(_tmpDistressValueAsOnDate);
        final String _tmpAdditionalDescription;
        _tmpAdditionalDescription = _cursor.getString(_cursorIndexOfAdditionalDescription);
        _item.setAdditionalDescription(_tmpAdditionalDescription);
        final String _tmpAdditionalDescriptionValue;
        _tmpAdditionalDescriptionValue = _cursor.getString(_cursorIndexOfAdditionalDescriptionValue);
        _item.setAdditionalDescriptionValue(_tmpAdditionalDescriptionValue);
        final String _tmpSelectedCarpetAreaTypeId;
        _tmpSelectedCarpetAreaTypeId = _cursor.getString(_cursorIndexOfSelectedCarpetAreaTypeId);
        _item.setSelectedCarpetAreaTypeId(_tmpSelectedCarpetAreaTypeId);
        final String _tmpGovernmentArea;
        _tmpGovernmentArea = _cursor.getString(_cursorIndexOfGovernmentArea);
        _item.setGovernmentArea(_tmpGovernmentArea);
        final String _tmpInsuranceArea;
        _tmpInsuranceArea = _cursor.getString(_cursorIndexOfInsuranceArea);
        _item.setInsuranceArea(_tmpInsuranceArea);
        final String _tmpOtlaArea;
        _tmpOtlaArea = _cursor.getString(_cursorIndexOfOtlaArea);
        _item.setOtlaArea(_tmpOtlaArea);
        final String _tmpOtlaRate;
        _tmpOtlaRate = _cursor.getString(_cursorIndexOfOtlaRate);
        _item.setOtlaRate(_tmpOtlaRate);
        final String _tmpOtlaValue;
        _tmpOtlaValue = _cursor.getString(_cursorIndexOfOtlaValue);
        _item.setOtlaValue(_tmpOtlaValue);
        final String _tmpMezzanineArea;
        _tmpMezzanineArea = _cursor.getString(_cursorIndexOfMezzanineArea);
        _item.setMezzanineArea(_tmpMezzanineArea);
        final String _tmpMezzanineRate;
        _tmpMezzanineRate = _cursor.getString(_cursorIndexOfMezzanineRate);
        _item.setMezzanineRate(_tmpMezzanineRate);
        final String _tmpMezzanineValue;
        _tmpMezzanineValue = _cursor.getString(_cursorIndexOfMezzanineValue);
        _item.setMezzanineValue(_tmpMezzanineValue);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<IndPropertyValuation> getIndPropertyValuation_caseID(int caseid_) {
    final String _sql = "SELECT * FROM IndPropertyValuationModal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("caseId");
      final int _cursorIndexOfGuidelineRate = _cursor.getColumnIndexOrThrow("guidelineRate");
      final int _cursorIndexOfGuidelineRateUnit = _cursor.getColumnIndexOrThrow("guidelineRateUnit");
      final int _cursorIndexOfGuidelineValue = _cursor.getColumnIndexOrThrow("guidelineValue");
      final int _cursorIndexOfDocumentLandRate = _cursor.getColumnIndexOrThrow("documentLandRate");
      final int _cursorIndexOfDocumentLandValue = _cursor.getColumnIndexOrThrow("documentLandValue");
      final int _cursorIndexOfMeasuredLandRate = _cursor.getColumnIndexOrThrow("measuredLandRate");
      final int _cursorIndexOfMeasuredLandValue = _cursor.getColumnIndexOrThrow("measuredLandValue");
      final int _cursorIndexOfDocumentedLandValueSel = _cursor.getColumnIndexOrThrow("documentedLandValueSel");
      final int _cursorIndexOfMeasuredLandValueSel = _cursor.getColumnIndexOrThrow("measuredLandValueSel");
      final int _cursorIndexOfDocumentedConstrValueSel = _cursor.getColumnIndexOrThrow("documentedConstrValueSel");
      final int _cursorIndexOfMeasuredConstrValueSel = _cursor.getColumnIndexOrThrow("measuredConstrValueSel");
      final int _cursorIndexOfTotalConstructionValue = _cursor.getColumnIndexOrThrow("totalConstructionValue");
      final int _cursorIndexOfTotalPropertyValue = _cursor.getColumnIndexOrThrow("totalPropertyValue");
      final int _cursorIndexOfBuildingDepreciationValue = _cursor.getColumnIndexOrThrow("buildingDepreciationValue");
      final int _cursorIndexOfProposedValuation = _cursor.getColumnIndexOrThrow("proposedValuation");
      final int _cursorIndexOfProposedValuationComments = _cursor.getColumnIndexOrThrow("proposedValuationComments");
      final int _cursorIndexOfTotalValueAtCompletion = _cursor.getColumnIndexOrThrow("totalValueAtCompletion");
      final int _cursorIndexOfInsuranceValue = _cursor.getColumnIndexOrThrow("insuranceValue");
      final int _cursorIndexOfRealizationPercentage = _cursor.getColumnIndexOrThrow("realizationPercentage");
      final int _cursorIndexOfDistressPercentage = _cursor.getColumnIndexOrThrow("distressPercentage");
      final int _cursorIndexOfRealizationValue = _cursor.getColumnIndexOrThrow("realizationValue");
      final int _cursorIndexOfDistressValue = _cursor.getColumnIndexOrThrow("distressValue");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfCompletionPercentage = _cursor.getColumnIndexOrThrow("completionPercentage");
      final int _cursorIndexOfTotalPropertyValueDepreciation = _cursor.getColumnIndexOrThrow("totalPropertyValueDepreciation");
      final int _cursorIndexOfDistressValueDepreciation = _cursor.getColumnIndexOrThrow("distressValueDepreciation");
      final int _cursorIndexOfCarpetAreaPercentage = _cursor.getColumnIndexOrThrow("carpetAreaPercentage");
      final int _cursorIndexOfCarpetAreaTypeId = _cursor.getColumnIndexOrThrow("carpetAreaTypeId");
      final int _cursorIndexOfRealizationValueDepreciation = _cursor.getColumnIndexOrThrow("realizationValueDepreciation");
      final int _cursorIndexOfRealizationLandValue = _cursor.getColumnIndexOrThrow("realizationLandValue");
      final int _cursorIndexOfConstructionDLCRate = _cursor.getColumnIndexOrThrow("constructionDLCRate");
      final int _cursorIndexOfConstructionDLCRateUnit = _cursor.getColumnIndexOrThrow("constructionDLCRateUnit");
      final int _cursorIndexOfConstructionDLCValue = _cursor.getColumnIndexOrThrow("constructionDLCValue");
      final int _cursorIndexOfCarpetArea = _cursor.getColumnIndexOrThrow("carpetArea");
      final int _cursorIndexOfBuildUpArea = _cursor.getColumnIndexOrThrow("buildUpArea");
      final int _cursorIndexOfSuperBuildUpArea = _cursor.getColumnIndexOrThrow("superBuildUpArea");
      final int _cursorIndexOfCarpetAreaUnit = _cursor.getColumnIndexOrThrow("carpetAreaUnit");
      final int _cursorIndexOfSelectedConstructionArea = _cursor.getColumnIndexOrThrow("selectedConstructionArea");
      final int _cursorIndexOfBAULoadingPercentage = _cursor.getColumnIndexOrThrow("bAULoadingPercentage");
      final int _cursorIndexOfConstructionRate = _cursor.getColumnIndexOrThrow("constructionRate");
      final int _cursorIndexOfInsuredConstructionRate = _cursor.getColumnIndexOrThrow("insuredConstructionRate");
      final int _cursorIndexOfTerraceArea = _cursor.getColumnIndexOrThrow("terraceArea");
      final int _cursorIndexOfTerraceRate = _cursor.getColumnIndexOrThrow("terraceRate");
      final int _cursorIndexOfTerraceValue = _cursor.getColumnIndexOrThrow("terraceValue");
      final int _cursorIndexOfSaleableLoadingPercentage = _cursor.getColumnIndexOrThrow("SaleableLoadingPercentage");
      final int _cursorIndexOfBalconyArea = _cursor.getColumnIndexOrThrow("BalconyArea");
      final int _cursorIndexOfBalconyRate = _cursor.getColumnIndexOrThrow("BalconyRate");
      final int _cursorIndexOfBalconyValue = _cursor.getColumnIndexOrThrow("BalconyValue");
      final int _cursorIndexOfRealizationPercentageAsOnDate = _cursor.getColumnIndexOrThrow("RealizationPercentageAsOnDate");
      final int _cursorIndexOfDistressPercentageAsOnDate = _cursor.getColumnIndexOrThrow("DistressPercentageAsOnDate");
      final int _cursorIndexOfRealizationValueAsOnDate = _cursor.getColumnIndexOrThrow("RealizationValueAsOnDate");
      final int _cursorIndexOfDistressValueAsOnDate = _cursor.getColumnIndexOrThrow("DistressValueAsOnDate");
      final int _cursorIndexOfAdditionalDescription = _cursor.getColumnIndexOrThrow("AdditionalDescription");
      final int _cursorIndexOfAdditionalDescriptionValue = _cursor.getColumnIndexOrThrow("AdditionalDescriptionValue");
      final int _cursorIndexOfSelectedCarpetAreaTypeId = _cursor.getColumnIndexOrThrow("SelectedCarpetAreaTypeId");
      final int _cursorIndexOfGovernmentArea = _cursor.getColumnIndexOrThrow("GovernmentArea");
      final int _cursorIndexOfInsuranceArea = _cursor.getColumnIndexOrThrow("InsuranceArea");
      final int _cursorIndexOfOtlaArea = _cursor.getColumnIndexOrThrow("OtlaArea");
      final int _cursorIndexOfOtlaRate = _cursor.getColumnIndexOrThrow("OtlaRate");
      final int _cursorIndexOfOtlaValue = _cursor.getColumnIndexOrThrow("OtlaValue");
      final int _cursorIndexOfMezzanineArea = _cursor.getColumnIndexOrThrow("MezzanineArea");
      final int _cursorIndexOfMezzanineRate = _cursor.getColumnIndexOrThrow("MezzanineRate");
      final int _cursorIndexOfMezzanineValue = _cursor.getColumnIndexOrThrow("MezzanineValue");
      final List<IndPropertyValuation> _result = new ArrayList<IndPropertyValuation>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final IndPropertyValuation _item;
        _item = new IndPropertyValuation();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final String _tmpGuidelineRate;
        _tmpGuidelineRate = _cursor.getString(_cursorIndexOfGuidelineRate);
        _item.setGuidelineRate(_tmpGuidelineRate);
        final String _tmpGuidelineRateUnit;
        _tmpGuidelineRateUnit = _cursor.getString(_cursorIndexOfGuidelineRateUnit);
        _item.setGuidelineRateUnit(_tmpGuidelineRateUnit);
        final String _tmpGuidelineValue;
        _tmpGuidelineValue = _cursor.getString(_cursorIndexOfGuidelineValue);
        _item.setGuidelineValue(_tmpGuidelineValue);
        final String _tmpDocumentLandRate;
        _tmpDocumentLandRate = _cursor.getString(_cursorIndexOfDocumentLandRate);
        _item.setDocumentLandRate(_tmpDocumentLandRate);
        final String _tmpDocumentLandValue;
        _tmpDocumentLandValue = _cursor.getString(_cursorIndexOfDocumentLandValue);
        _item.setDocumentLandValue(_tmpDocumentLandValue);
        final String _tmpMeasuredLandRate;
        _tmpMeasuredLandRate = _cursor.getString(_cursorIndexOfMeasuredLandRate);
        _item.setMeasuredLandRate(_tmpMeasuredLandRate);
        final String _tmpMeasuredLandValue;
        _tmpMeasuredLandValue = _cursor.getString(_cursorIndexOfMeasuredLandValue);
        _item.setMeasuredLandValue(_tmpMeasuredLandValue);
        final Boolean _tmpDocumentedLandValueSel;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfDocumentedLandValueSel)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfDocumentedLandValueSel);
        }
        _tmpDocumentedLandValueSel = _tmp == null ? null : _tmp != 0;
        _item.setDocumentedLandValueSel(_tmpDocumentedLandValueSel);
        final Boolean _tmpMeasuredLandValueSel;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfMeasuredLandValueSel)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfMeasuredLandValueSel);
        }
        _tmpMeasuredLandValueSel = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setMeasuredLandValueSel(_tmpMeasuredLandValueSel);
        final Boolean _tmpDocumentedConstrValueSel;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfDocumentedConstrValueSel)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfDocumentedConstrValueSel);
        }
        _tmpDocumentedConstrValueSel = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setDocumentedConstrValueSel(_tmpDocumentedConstrValueSel);
        final Boolean _tmpMeasuredConstrValueSel;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfMeasuredConstrValueSel)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfMeasuredConstrValueSel);
        }
        _tmpMeasuredConstrValueSel = _tmp_3 == null ? null : _tmp_3 != 0;
        _item.setMeasuredConstrValueSel(_tmpMeasuredConstrValueSel);
        final String _tmpTotalConstructionValue;
        _tmpTotalConstructionValue = _cursor.getString(_cursorIndexOfTotalConstructionValue);
        _item.setTotalConstructionValue(_tmpTotalConstructionValue);
        final String _tmpTotalPropertyValue;
        _tmpTotalPropertyValue = _cursor.getString(_cursorIndexOfTotalPropertyValue);
        _item.setTotalPropertyValue(_tmpTotalPropertyValue);
        final String _tmpBuildingDepreciationValue;
        _tmpBuildingDepreciationValue = _cursor.getString(_cursorIndexOfBuildingDepreciationValue);
        _item.setBuildingDepreciationValue(_tmpBuildingDepreciationValue);
        final String _tmpProposedValuation;
        _tmpProposedValuation = _cursor.getString(_cursorIndexOfProposedValuation);
        _item.setProposedValuation(_tmpProposedValuation);
        final String _tmpProposedValuationComments;
        _tmpProposedValuationComments = _cursor.getString(_cursorIndexOfProposedValuationComments);
        _item.setProposedValuationComments(_tmpProposedValuationComments);
        final String _tmpTotalValueAtCompletion;
        _tmpTotalValueAtCompletion = _cursor.getString(_cursorIndexOfTotalValueAtCompletion);
        _item.setTotalValueAtCompletion(_tmpTotalValueAtCompletion);
        final String _tmpInsuranceValue;
        _tmpInsuranceValue = _cursor.getString(_cursorIndexOfInsuranceValue);
        _item.setInsuranceValue(_tmpInsuranceValue);
        final String _tmpRealizationPercentage;
        _tmpRealizationPercentage = _cursor.getString(_cursorIndexOfRealizationPercentage);
        _item.setRealizationPercentage(_tmpRealizationPercentage);
        final String _tmpDistressPercentage;
        _tmpDistressPercentage = _cursor.getString(_cursorIndexOfDistressPercentage);
        _item.setDistressPercentage(_tmpDistressPercentage);
        final String _tmpRealizationValue;
        _tmpRealizationValue = _cursor.getString(_cursorIndexOfRealizationValue);
        _item.setRealizationValue(_tmpRealizationValue);
        final String _tmpDistressValue;
        _tmpDistressValue = _cursor.getString(_cursorIndexOfDistressValue);
        _item.setDistressValue(_tmpDistressValue);
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
        final String _tmpCompletionPercentage;
        _tmpCompletionPercentage = _cursor.getString(_cursorIndexOfCompletionPercentage);
        _item.setCompletionPercentage(_tmpCompletionPercentage);
        final String _tmpTotalPropertyValueDepreciation;
        _tmpTotalPropertyValueDepreciation = _cursor.getString(_cursorIndexOfTotalPropertyValueDepreciation);
        _item.setTotalPropertyValueDepreciation(_tmpTotalPropertyValueDepreciation);
        final String _tmpDistressValueDepreciation;
        _tmpDistressValueDepreciation = _cursor.getString(_cursorIndexOfDistressValueDepreciation);
        _item.setDistressValueDepreciation(_tmpDistressValueDepreciation);
        final String _tmpCarpetAreaPercentage;
        _tmpCarpetAreaPercentage = _cursor.getString(_cursorIndexOfCarpetAreaPercentage);
        _item.setCarpetAreaPercentage(_tmpCarpetAreaPercentage);
        final String _tmpCarpetAreaTypeId;
        _tmpCarpetAreaTypeId = _cursor.getString(_cursorIndexOfCarpetAreaTypeId);
        _item.setCarpetAreaTypeId(_tmpCarpetAreaTypeId);
        final String _tmpRealizationValueDepreciation;
        _tmpRealizationValueDepreciation = _cursor.getString(_cursorIndexOfRealizationValueDepreciation);
        _item.setRealizationValueDepreciation(_tmpRealizationValueDepreciation);
        final String _tmpRealizationLandValue;
        _tmpRealizationLandValue = _cursor.getString(_cursorIndexOfRealizationLandValue);
        _item.setRealizationLandValue(_tmpRealizationLandValue);
        final String _tmpConstructionDLCRate;
        _tmpConstructionDLCRate = _cursor.getString(_cursorIndexOfConstructionDLCRate);
        _item.setConstructionDLCRate(_tmpConstructionDLCRate);
        final String _tmpConstructionDLCRateUnit;
        _tmpConstructionDLCRateUnit = _cursor.getString(_cursorIndexOfConstructionDLCRateUnit);
        _item.setConstructionDLCRateUnit(_tmpConstructionDLCRateUnit);
        final String _tmpConstructionDLCValue;
        _tmpConstructionDLCValue = _cursor.getString(_cursorIndexOfConstructionDLCValue);
        _item.setConstructionDLCValue(_tmpConstructionDLCValue);
        final String _tmpCarpetArea;
        _tmpCarpetArea = _cursor.getString(_cursorIndexOfCarpetArea);
        _item.setCarpetArea(_tmpCarpetArea);
        final String _tmpBuildUpArea;
        _tmpBuildUpArea = _cursor.getString(_cursorIndexOfBuildUpArea);
        _item.setBuildUpArea(_tmpBuildUpArea);
        final String _tmpSuperBuildUpArea;
        _tmpSuperBuildUpArea = _cursor.getString(_cursorIndexOfSuperBuildUpArea);
        _item.setSuperBuildUpArea(_tmpSuperBuildUpArea);
        final String _tmpCarpetAreaUnit;
        _tmpCarpetAreaUnit = _cursor.getString(_cursorIndexOfCarpetAreaUnit);
        _item.setCarpetAreaUnit(_tmpCarpetAreaUnit);
        final String _tmpSelectedConstructionArea;
        _tmpSelectedConstructionArea = _cursor.getString(_cursorIndexOfSelectedConstructionArea);
        _item.setSelectedConstructionArea(_tmpSelectedConstructionArea);
        final String _tmpBAULoadingPercentage;
        _tmpBAULoadingPercentage = _cursor.getString(_cursorIndexOfBAULoadingPercentage);
        _item.setBAULoadingPercentage(_tmpBAULoadingPercentage);
        final String _tmpConstructionRate;
        _tmpConstructionRate = _cursor.getString(_cursorIndexOfConstructionRate);
        _item.setConstructionRate(_tmpConstructionRate);
        final String _tmpInsuredConstructionRate;
        _tmpInsuredConstructionRate = _cursor.getString(_cursorIndexOfInsuredConstructionRate);
        _item.setInsuredConstructionRate(_tmpInsuredConstructionRate);
        final String _tmpTerraceArea;
        _tmpTerraceArea = _cursor.getString(_cursorIndexOfTerraceArea);
        _item.setTerraceArea(_tmpTerraceArea);
        final String _tmpTerraceRate;
        _tmpTerraceRate = _cursor.getString(_cursorIndexOfTerraceRate);
        _item.setTerraceRate(_tmpTerraceRate);
        final String _tmpTerraceValue;
        _tmpTerraceValue = _cursor.getString(_cursorIndexOfTerraceValue);
        _item.setTerraceValue(_tmpTerraceValue);
        final String _tmpSaleableLoadingPercentage;
        _tmpSaleableLoadingPercentage = _cursor.getString(_cursorIndexOfSaleableLoadingPercentage);
        _item.setSaleableLoadingPercentage(_tmpSaleableLoadingPercentage);
        final String _tmpBalconyArea;
        _tmpBalconyArea = _cursor.getString(_cursorIndexOfBalconyArea);
        _item.setBalconyArea(_tmpBalconyArea);
        final String _tmpBalconyRate;
        _tmpBalconyRate = _cursor.getString(_cursorIndexOfBalconyRate);
        _item.setBalconyRate(_tmpBalconyRate);
        final String _tmpBalconyValue;
        _tmpBalconyValue = _cursor.getString(_cursorIndexOfBalconyValue);
        _item.setBalconyValue(_tmpBalconyValue);
        final String _tmpRealizationPercentageAsOnDate;
        _tmpRealizationPercentageAsOnDate = _cursor.getString(_cursorIndexOfRealizationPercentageAsOnDate);
        _item.setRealizationPercentageAsOnDate(_tmpRealizationPercentageAsOnDate);
        final String _tmpDistressPercentageAsOnDate;
        _tmpDistressPercentageAsOnDate = _cursor.getString(_cursorIndexOfDistressPercentageAsOnDate);
        _item.setDistressPercentageAsOnDate(_tmpDistressPercentageAsOnDate);
        final String _tmpRealizationValueAsOnDate;
        _tmpRealizationValueAsOnDate = _cursor.getString(_cursorIndexOfRealizationValueAsOnDate);
        _item.setRealizationValueAsOnDate(_tmpRealizationValueAsOnDate);
        final String _tmpDistressValueAsOnDate;
        _tmpDistressValueAsOnDate = _cursor.getString(_cursorIndexOfDistressValueAsOnDate);
        _item.setDistressValueAsOnDate(_tmpDistressValueAsOnDate);
        final String _tmpAdditionalDescription;
        _tmpAdditionalDescription = _cursor.getString(_cursorIndexOfAdditionalDescription);
        _item.setAdditionalDescription(_tmpAdditionalDescription);
        final String _tmpAdditionalDescriptionValue;
        _tmpAdditionalDescriptionValue = _cursor.getString(_cursorIndexOfAdditionalDescriptionValue);
        _item.setAdditionalDescriptionValue(_tmpAdditionalDescriptionValue);
        final String _tmpSelectedCarpetAreaTypeId;
        _tmpSelectedCarpetAreaTypeId = _cursor.getString(_cursorIndexOfSelectedCarpetAreaTypeId);
        _item.setSelectedCarpetAreaTypeId(_tmpSelectedCarpetAreaTypeId);
        final String _tmpGovernmentArea;
        _tmpGovernmentArea = _cursor.getString(_cursorIndexOfGovernmentArea);
        _item.setGovernmentArea(_tmpGovernmentArea);
        final String _tmpInsuranceArea;
        _tmpInsuranceArea = _cursor.getString(_cursorIndexOfInsuranceArea);
        _item.setInsuranceArea(_tmpInsuranceArea);
        final String _tmpOtlaArea;
        _tmpOtlaArea = _cursor.getString(_cursorIndexOfOtlaArea);
        _item.setOtlaArea(_tmpOtlaArea);
        final String _tmpOtlaRate;
        _tmpOtlaRate = _cursor.getString(_cursorIndexOfOtlaRate);
        _item.setOtlaRate(_tmpOtlaRate);
        final String _tmpOtlaValue;
        _tmpOtlaValue = _cursor.getString(_cursorIndexOfOtlaValue);
        _item.setOtlaValue(_tmpOtlaValue);
        final String _tmpMezzanineArea;
        _tmpMezzanineArea = _cursor.getString(_cursorIndexOfMezzanineArea);
        _item.setMezzanineArea(_tmpMezzanineArea);
        final String _tmpMezzanineRate;
        _tmpMezzanineRate = _cursor.getString(_cursorIndexOfMezzanineRate);
        _item.setMezzanineRate(_tmpMezzanineRate);
        final String _tmpMezzanineValue;
        _tmpMezzanineValue = _cursor.getString(_cursorIndexOfMezzanineValue);
        _item.setMezzanineValue(_tmpMezzanineValue);
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
    final String _sql = "SELECT COUNT(*) from IndPropertyValuationModal";
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
