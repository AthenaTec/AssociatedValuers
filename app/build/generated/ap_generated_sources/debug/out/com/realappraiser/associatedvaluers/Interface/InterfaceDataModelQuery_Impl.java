package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.communicator.DataModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceDataModelQuery_Impl implements InterfaceDataModelQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDataModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfDataModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOfflineDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePendingDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePendingDataModelToOPen;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOnlineCaseStatusonline;

  public InterfaceDataModelQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataModel = new EntityInsertionAdapter<DataModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `DataModel`(`dummyID`,`CaseId`,`_id`,`IsExternal`,`OTP`,`Email`,`LoginId`,`EmployeeId`,`FirstName`,`RoleId`,`LastName`,`Mobile`,`AgencyId`,`BranchId`,`AgencyName`,`CityName`,`AgencyCode`,`RoleDescription`,`empId`,`startDate`,`endDate`,`initQueryUrl`,`ApplicantName`,`ApplicantContactNo`,`PropertyAddress`,`ContactPersonName`,`ContactPersonNumber`,`BankName`,`BankId`,`PropertyType`,`TypeID`,`AssignedAt`,`CreatedOn`,`ReportChecker`,`Status`,`ReportDispatcher`,`FieldStaff`,`AssignedTo`,`ReportMaker`,`ReportFinalizer`,`PropertyId`,`ReportFile`,`ReportId`,`ReportTemplateId`,`Signature1`,`PropertyCategoryId`,`count`,`Signature2`,`EmployeeName`,`Role`,`StatusId`,`TypeDescription`,`Name`,`TypeOfPropertyId`,`Id`,`DocumentName`,`VisibleToFieldStaff`,`Title`,`Document`,`BankBranchName`,`AgencyBranchId`,`opencase`,`offlinecase`,`showoffline`,`ReportName`,`pendingcase`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataModel value) {
        stmt.bindLong(1, value.dummyID);
        if (value.getCaseId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCaseId());
        }
        if (value._id == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value._id);
        }
        if (value.IsExternal == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.IsExternal);
        }
        if (value.OTP == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.OTP);
        }
        if (value.Email == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.Email);
        }
        if (value.LoginId == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.LoginId);
        }
        if (value.EmployeeId == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.EmployeeId);
        }
        if (value.FirstName == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.FirstName);
        }
        if (value.RoleId == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.RoleId);
        }
        if (value.LastName == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.LastName);
        }
        if (value.Mobile == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.Mobile);
        }
        if (value.AgencyId == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.AgencyId);
        }
        if (value.BranchId == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.BranchId);
        }
        if (value.AgencyName == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.AgencyName);
        }
        if (value.CityName == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.CityName);
        }
        if (value.AgencyCode == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.AgencyCode);
        }
        if (value.RoleDescription == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.RoleDescription);
        }
        if (value.getEmpId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getEmpId());
        }
        if (value.getStartDate() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStartDate());
        }
        if (value.getEndDate() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getEndDate());
        }
        if (value.getInitQueryUrl() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getInitQueryUrl());
        }
        if (value.getApplicantName() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getApplicantName());
        }
        if (value.getApplicantContactNo() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getApplicantContactNo());
        }
        if (value.getPropertyAddress() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPropertyAddress());
        }
        if (value.getContactPersonName() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getContactPersonName());
        }
        if (value.getContactPersonNumber() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getContactPersonNumber());
        }
        if (value.getBankName() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getBankName());
        }
        if (value.getBankId() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getBankId());
        }
        if (value.getPropertyType() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getPropertyType());
        }
        if (value.getTypeID() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getTypeID());
        }
        if (value.getAssignedAt() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getAssignedAt());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getCreatedOn());
        }
        if (value.getReportChecker() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getReportChecker());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStatus());
        }
        if (value.getReportDispatcher() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getReportDispatcher());
        }
        if (value.getFieldStaff() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getFieldStaff());
        }
        if (value.getAssignedTo() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getAssignedTo());
        }
        if (value.getReportMaker() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getReportMaker());
        }
        if (value.getReportFinalizer() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getReportFinalizer());
        }
        if (value.getPropertyId() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getPropertyId());
        }
        if (value.getReportFile() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getReportFile());
        }
        if (value.getReportId() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getReportId());
        }
        if (value.getReportTemplateId() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getReportTemplateId());
        }
        if (value.getSignature1() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getSignature1());
        }
        if (value.getPropertyCategoryId() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getPropertyCategoryId());
        }
        if (value.getCount() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getCount());
        }
        if (value.getSignature2() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getSignature2());
        }
        if (value.getEmployeeName() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getEmployeeName());
        }
        if (value.getRole() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getRole());
        }
        if (value.getStatusId() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getStatusId());
        }
        if (value.getTypeDescription() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getTypeDescription());
        }
        if (value.getName() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getName());
        }
        if (value.getTypeOfPropertyId() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getTypeOfPropertyId());
        }
        if (value.getId() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getId());
        }
        if (value.getDocumentName() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getDocumentName());
        }
        if (value.getVisibleToFieldStaff() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getVisibleToFieldStaff());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getTitle());
        }
        if (value.getDocument() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getDocument());
        }
        if (value.getBankBranchName() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getBankBranchName());
        }
        if (value.getAgencyBranchId() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getAgencyBranchId());
        }
        final int _tmp;
        _tmp = value.opencase ? 1 : 0;
        stmt.bindLong(62, _tmp);
        final int _tmp_1;
        _tmp_1 = value.offlinecase ? 1 : 0;
        stmt.bindLong(63, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.showoffline ? 1 : 0;
        stmt.bindLong(64, _tmp_2);
        if (value.getReportName() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getReportName());
        }
        final int _tmp_3;
        _tmp_3 = value.pendingcase ? 1 : 0;
        stmt.bindLong(66, _tmp_3);
      }
    };
    this.__deletionAdapterOfDataModel = new EntityDeletionOrUpdateAdapter<DataModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `DataModel` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataModel value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__updateAdapterOfDataModel = new EntityDeletionOrUpdateAdapter<DataModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `DataModel` SET `dummyID` = ?,`CaseId` = ?,`_id` = ?,`IsExternal` = ?,`OTP` = ?,`Email` = ?,`LoginId` = ?,`EmployeeId` = ?,`FirstName` = ?,`RoleId` = ?,`LastName` = ?,`Mobile` = ?,`AgencyId` = ?,`BranchId` = ?,`AgencyName` = ?,`CityName` = ?,`AgencyCode` = ?,`RoleDescription` = ?,`empId` = ?,`startDate` = ?,`endDate` = ?,`initQueryUrl` = ?,`ApplicantName` = ?,`ApplicantContactNo` = ?,`PropertyAddress` = ?,`ContactPersonName` = ?,`ContactPersonNumber` = ?,`BankName` = ?,`BankId` = ?,`PropertyType` = ?,`TypeID` = ?,`AssignedAt` = ?,`CreatedOn` = ?,`ReportChecker` = ?,`Status` = ?,`ReportDispatcher` = ?,`FieldStaff` = ?,`AssignedTo` = ?,`ReportMaker` = ?,`ReportFinalizer` = ?,`PropertyId` = ?,`ReportFile` = ?,`ReportId` = ?,`ReportTemplateId` = ?,`Signature1` = ?,`PropertyCategoryId` = ?,`count` = ?,`Signature2` = ?,`EmployeeName` = ?,`Role` = ?,`StatusId` = ?,`TypeDescription` = ?,`Name` = ?,`TypeOfPropertyId` = ?,`Id` = ?,`DocumentName` = ?,`VisibleToFieldStaff` = ?,`Title` = ?,`Document` = ?,`BankBranchName` = ?,`AgencyBranchId` = ?,`opencase` = ?,`offlinecase` = ?,`showoffline` = ?,`ReportName` = ?,`pendingcase` = ? WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataModel value) {
        stmt.bindLong(1, value.dummyID);
        if (value.getCaseId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCaseId());
        }
        if (value._id == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value._id);
        }
        if (value.IsExternal == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.IsExternal);
        }
        if (value.OTP == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.OTP);
        }
        if (value.Email == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.Email);
        }
        if (value.LoginId == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.LoginId);
        }
        if (value.EmployeeId == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.EmployeeId);
        }
        if (value.FirstName == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.FirstName);
        }
        if (value.RoleId == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.RoleId);
        }
        if (value.LastName == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.LastName);
        }
        if (value.Mobile == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.Mobile);
        }
        if (value.AgencyId == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.AgencyId);
        }
        if (value.BranchId == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.BranchId);
        }
        if (value.AgencyName == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.AgencyName);
        }
        if (value.CityName == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.CityName);
        }
        if (value.AgencyCode == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.AgencyCode);
        }
        if (value.RoleDescription == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.RoleDescription);
        }
        if (value.getEmpId() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getEmpId());
        }
        if (value.getStartDate() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getStartDate());
        }
        if (value.getEndDate() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getEndDate());
        }
        if (value.getInitQueryUrl() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getInitQueryUrl());
        }
        if (value.getApplicantName() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getApplicantName());
        }
        if (value.getApplicantContactNo() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getApplicantContactNo());
        }
        if (value.getPropertyAddress() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPropertyAddress());
        }
        if (value.getContactPersonName() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getContactPersonName());
        }
        if (value.getContactPersonNumber() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getContactPersonNumber());
        }
        if (value.getBankName() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getBankName());
        }
        if (value.getBankId() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getBankId());
        }
        if (value.getPropertyType() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getPropertyType());
        }
        if (value.getTypeID() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getTypeID());
        }
        if (value.getAssignedAt() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getAssignedAt());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getCreatedOn());
        }
        if (value.getReportChecker() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getReportChecker());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getStatus());
        }
        if (value.getReportDispatcher() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getReportDispatcher());
        }
        if (value.getFieldStaff() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getFieldStaff());
        }
        if (value.getAssignedTo() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getAssignedTo());
        }
        if (value.getReportMaker() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getReportMaker());
        }
        if (value.getReportFinalizer() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getReportFinalizer());
        }
        if (value.getPropertyId() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getPropertyId());
        }
        if (value.getReportFile() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getReportFile());
        }
        if (value.getReportId() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getReportId());
        }
        if (value.getReportTemplateId() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getReportTemplateId());
        }
        if (value.getSignature1() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getSignature1());
        }
        if (value.getPropertyCategoryId() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getPropertyCategoryId());
        }
        if (value.getCount() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getCount());
        }
        if (value.getSignature2() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getSignature2());
        }
        if (value.getEmployeeName() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getEmployeeName());
        }
        if (value.getRole() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getRole());
        }
        if (value.getStatusId() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getStatusId());
        }
        if (value.getTypeDescription() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getTypeDescription());
        }
        if (value.getName() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getName());
        }
        if (value.getTypeOfPropertyId() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getTypeOfPropertyId());
        }
        if (value.getId() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getId());
        }
        if (value.getDocumentName() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getDocumentName());
        }
        if (value.getVisibleToFieldStaff() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getVisibleToFieldStaff());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getTitle());
        }
        if (value.getDocument() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getDocument());
        }
        if (value.getBankBranchName() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getBankBranchName());
        }
        if (value.getAgencyBranchId() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getAgencyBranchId());
        }
        final int _tmp;
        _tmp = value.opencase ? 1 : 0;
        stmt.bindLong(62, _tmp);
        final int _tmp_1;
        _tmp_1 = value.offlinecase ? 1 : 0;
        stmt.bindLong(63, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.showoffline ? 1 : 0;
        stmt.bindLong(64, _tmp_2);
        if (value.getReportName() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getReportName());
        }
        final int _tmp_3;
        _tmp_3 = value.pendingcase ? 1 : 0;
        stmt.bindLong(66, _tmp_3);
        stmt.bindLong(67, value.dummyID);
      }
    };
    this.__preparedStmtOfUpdateOfflineDataModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update dataModel set offlinecase=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePendingDataModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update dataModel set pendingcase=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePendingDataModelToOPen = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update dataModel set opencase=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM datamodel";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOnlineCaseStatusonline = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update datamodel set StatusId=? where caseid in(?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(DataModel dataModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDataModel.insert(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(DataModel dataModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfDataModel.handle(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(DataModel dataModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfDataModel.handle(dataModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long updateOfflineDataModel(String caseidIn, boolean isoffline) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOfflineDataModel.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = isoffline ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateOfflineDataModel.release(_stmt);
    }
  }

  @Override
  public long updatePendingDataModel(String caseidIn, boolean isPending) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePendingDataModel.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = isPending ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePendingDataModel.release(_stmt);
    }
  }

  @Override
  public long updatePendingDataModelToOPen(String caseidIn, boolean isPending) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePendingDataModelToOPen.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = isPending ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePendingDataModelToOPen.release(_stmt);
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
  public long updateOnlineCaseStatusonline(String updatecasestatus, String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOnlineCaseStatusonline.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (updatecasestatus == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, updatecasestatus);
      }
      _argIndex = 2;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateOnlineCaseStatusonline.release(_stmt);
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
  public List<DataModel> getDataModels() {
    final String _sql = "SELECT * FROM datamodel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIsExternal = _cursor.getColumnIndexOrThrow("IsExternal");
      final int _cursorIndexOfOTP = _cursor.getColumnIndexOrThrow("OTP");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("Email");
      final int _cursorIndexOfLoginId = _cursor.getColumnIndexOrThrow("LoginId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("EmployeeId");
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("FirstName");
      final int _cursorIndexOfRoleId = _cursor.getColumnIndexOrThrow("RoleId");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("LastName");
      final int _cursorIndexOfMobile = _cursor.getColumnIndexOrThrow("Mobile");
      final int _cursorIndexOfAgencyId = _cursor.getColumnIndexOrThrow("AgencyId");
      final int _cursorIndexOfBranchId = _cursor.getColumnIndexOrThrow("BranchId");
      final int _cursorIndexOfAgencyName = _cursor.getColumnIndexOrThrow("AgencyName");
      final int _cursorIndexOfCityName = _cursor.getColumnIndexOrThrow("CityName");
      final int _cursorIndexOfAgencyCode = _cursor.getColumnIndexOrThrow("AgencyCode");
      final int _cursorIndexOfRoleDescription = _cursor.getColumnIndexOrThrow("RoleDescription");
      final int _cursorIndexOfEmpId = _cursor.getColumnIndexOrThrow("empId");
      final int _cursorIndexOfStartDate = _cursor.getColumnIndexOrThrow("startDate");
      final int _cursorIndexOfEndDate = _cursor.getColumnIndexOrThrow("endDate");
      final int _cursorIndexOfInitQueryUrl = _cursor.getColumnIndexOrThrow("initQueryUrl");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBankId = _cursor.getColumnIndexOrThrow("BankId");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfTypeID = _cursor.getColumnIndexOrThrow("TypeID");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCount = _cursor.getColumnIndexOrThrow("count");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfEmployeeName = _cursor.getColumnIndexOrThrow("EmployeeName");
      final int _cursorIndexOfRole = _cursor.getColumnIndexOrThrow("Role");
      final int _cursorIndexOfStatusId = _cursor.getColumnIndexOrThrow("StatusId");
      final int _cursorIndexOfTypeDescription = _cursor.getColumnIndexOrThrow("TypeDescription");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfBankBranchName = _cursor.getColumnIndexOrThrow("BankBranchName");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfOpencase = _cursor.getColumnIndexOrThrow("opencase");
      final int _cursorIndexOfOfflinecase = _cursor.getColumnIndexOrThrow("offlinecase");
      final int _cursorIndexOfShowoffline = _cursor.getColumnIndexOrThrow("showoffline");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final int _cursorIndexOfPendingcase = _cursor.getColumnIndexOrThrow("pendingcase");
      final List<DataModel> _result = new ArrayList<DataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataModel _item;
        _item = new DataModel();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        _item._id = _cursor.getString(_cursorIndexOfId);
        _item.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _item.OTP = _cursor.getString(_cursorIndexOfOTP);
        _item.Email = _cursor.getString(_cursorIndexOfEmail);
        _item.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _item.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _item.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _item.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _item.LastName = _cursor.getString(_cursorIndexOfLastName);
        _item.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _item.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _item.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _item.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _item.CityName = _cursor.getString(_cursorIndexOfCityName);
        _item.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _item.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _item.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _item.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _item.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _item.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _item.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _item.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _item.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _item.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _item.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _item.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _item.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _item.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfOpencase);
        _item.opencase = _tmp != 0;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _item.offlinecase = _tmp_1 != 0;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfShowoffline);
        _item.showoffline = _tmp_2 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfPendingcase);
        _item.pendingcase = _tmp_3 != 0;
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DataModel> getDataModal_opencase(boolean is_open) {
    final String _sql = "SELECT * FROM datamodel where opencase = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = is_open ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIsExternal = _cursor.getColumnIndexOrThrow("IsExternal");
      final int _cursorIndexOfOTP = _cursor.getColumnIndexOrThrow("OTP");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("Email");
      final int _cursorIndexOfLoginId = _cursor.getColumnIndexOrThrow("LoginId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("EmployeeId");
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("FirstName");
      final int _cursorIndexOfRoleId = _cursor.getColumnIndexOrThrow("RoleId");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("LastName");
      final int _cursorIndexOfMobile = _cursor.getColumnIndexOrThrow("Mobile");
      final int _cursorIndexOfAgencyId = _cursor.getColumnIndexOrThrow("AgencyId");
      final int _cursorIndexOfBranchId = _cursor.getColumnIndexOrThrow("BranchId");
      final int _cursorIndexOfAgencyName = _cursor.getColumnIndexOrThrow("AgencyName");
      final int _cursorIndexOfCityName = _cursor.getColumnIndexOrThrow("CityName");
      final int _cursorIndexOfAgencyCode = _cursor.getColumnIndexOrThrow("AgencyCode");
      final int _cursorIndexOfRoleDescription = _cursor.getColumnIndexOrThrow("RoleDescription");
      final int _cursorIndexOfEmpId = _cursor.getColumnIndexOrThrow("empId");
      final int _cursorIndexOfStartDate = _cursor.getColumnIndexOrThrow("startDate");
      final int _cursorIndexOfEndDate = _cursor.getColumnIndexOrThrow("endDate");
      final int _cursorIndexOfInitQueryUrl = _cursor.getColumnIndexOrThrow("initQueryUrl");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBankId = _cursor.getColumnIndexOrThrow("BankId");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfTypeID = _cursor.getColumnIndexOrThrow("TypeID");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCount = _cursor.getColumnIndexOrThrow("count");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfEmployeeName = _cursor.getColumnIndexOrThrow("EmployeeName");
      final int _cursorIndexOfRole = _cursor.getColumnIndexOrThrow("Role");
      final int _cursorIndexOfStatusId = _cursor.getColumnIndexOrThrow("StatusId");
      final int _cursorIndexOfTypeDescription = _cursor.getColumnIndexOrThrow("TypeDescription");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfBankBranchName = _cursor.getColumnIndexOrThrow("BankBranchName");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfOpencase = _cursor.getColumnIndexOrThrow("opencase");
      final int _cursorIndexOfOfflinecase = _cursor.getColumnIndexOrThrow("offlinecase");
      final int _cursorIndexOfShowoffline = _cursor.getColumnIndexOrThrow("showoffline");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final int _cursorIndexOfPendingcase = _cursor.getColumnIndexOrThrow("pendingcase");
      final List<DataModel> _result = new ArrayList<DataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataModel _item;
        _item = new DataModel();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        _item._id = _cursor.getString(_cursorIndexOfId);
        _item.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _item.OTP = _cursor.getString(_cursorIndexOfOTP);
        _item.Email = _cursor.getString(_cursorIndexOfEmail);
        _item.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _item.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _item.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _item.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _item.LastName = _cursor.getString(_cursorIndexOfLastName);
        _item.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _item.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _item.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _item.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _item.CityName = _cursor.getString(_cursorIndexOfCityName);
        _item.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _item.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _item.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _item.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _item.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _item.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _item.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _item.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _item.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _item.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _item.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _item.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _item.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _item.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOpencase);
        _item.opencase = _tmp_1 != 0;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _item.offlinecase = _tmp_2 != 0;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfShowoffline);
        _item.showoffline = _tmp_3 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfPendingcase);
        _item.pendingcase = _tmp_4 != 0;
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DataModel> getDataModal_offlinecase(boolean is_offline, boolean is_open) {
    final String _sql = "SELECT * FROM datamodel where offlinecase = (?) AND opencase = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final int _tmp;
    _tmp = is_offline ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    final int _tmp_1;
    _tmp_1 = is_open ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp_1);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIsExternal = _cursor.getColumnIndexOrThrow("IsExternal");
      final int _cursorIndexOfOTP = _cursor.getColumnIndexOrThrow("OTP");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("Email");
      final int _cursorIndexOfLoginId = _cursor.getColumnIndexOrThrow("LoginId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("EmployeeId");
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("FirstName");
      final int _cursorIndexOfRoleId = _cursor.getColumnIndexOrThrow("RoleId");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("LastName");
      final int _cursorIndexOfMobile = _cursor.getColumnIndexOrThrow("Mobile");
      final int _cursorIndexOfAgencyId = _cursor.getColumnIndexOrThrow("AgencyId");
      final int _cursorIndexOfBranchId = _cursor.getColumnIndexOrThrow("BranchId");
      final int _cursorIndexOfAgencyName = _cursor.getColumnIndexOrThrow("AgencyName");
      final int _cursorIndexOfCityName = _cursor.getColumnIndexOrThrow("CityName");
      final int _cursorIndexOfAgencyCode = _cursor.getColumnIndexOrThrow("AgencyCode");
      final int _cursorIndexOfRoleDescription = _cursor.getColumnIndexOrThrow("RoleDescription");
      final int _cursorIndexOfEmpId = _cursor.getColumnIndexOrThrow("empId");
      final int _cursorIndexOfStartDate = _cursor.getColumnIndexOrThrow("startDate");
      final int _cursorIndexOfEndDate = _cursor.getColumnIndexOrThrow("endDate");
      final int _cursorIndexOfInitQueryUrl = _cursor.getColumnIndexOrThrow("initQueryUrl");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBankId = _cursor.getColumnIndexOrThrow("BankId");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfTypeID = _cursor.getColumnIndexOrThrow("TypeID");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCount = _cursor.getColumnIndexOrThrow("count");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfEmployeeName = _cursor.getColumnIndexOrThrow("EmployeeName");
      final int _cursorIndexOfRole = _cursor.getColumnIndexOrThrow("Role");
      final int _cursorIndexOfStatusId = _cursor.getColumnIndexOrThrow("StatusId");
      final int _cursorIndexOfTypeDescription = _cursor.getColumnIndexOrThrow("TypeDescription");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfBankBranchName = _cursor.getColumnIndexOrThrow("BankBranchName");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfOpencase = _cursor.getColumnIndexOrThrow("opencase");
      final int _cursorIndexOfOfflinecase = _cursor.getColumnIndexOrThrow("offlinecase");
      final int _cursorIndexOfShowoffline = _cursor.getColumnIndexOrThrow("showoffline");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final int _cursorIndexOfPendingcase = _cursor.getColumnIndexOrThrow("pendingcase");
      final List<DataModel> _result = new ArrayList<DataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataModel _item;
        _item = new DataModel();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        _item._id = _cursor.getString(_cursorIndexOfId);
        _item.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _item.OTP = _cursor.getString(_cursorIndexOfOTP);
        _item.Email = _cursor.getString(_cursorIndexOfEmail);
        _item.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _item.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _item.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _item.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _item.LastName = _cursor.getString(_cursorIndexOfLastName);
        _item.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _item.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _item.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _item.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _item.CityName = _cursor.getString(_cursorIndexOfCityName);
        _item.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _item.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _item.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _item.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _item.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _item.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _item.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _item.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _item.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _item.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _item.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _item.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _item.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _item.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOpencase);
        _item.opencase = _tmp_2 != 0;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _item.offlinecase = _tmp_3 != 0;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfShowoffline);
        _item.showoffline = _tmp_4 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfPendingcase);
        _item.pendingcase = _tmp_5 != 0;
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DataModel> getDataModal_pendingcase(boolean isPending, boolean is_offline) {
    final String _sql = "SELECT * FROM datamodel where pendingcase = (?) AND offlinecase = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isPending ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    final int _tmp_1;
    _tmp_1 = is_offline ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp_1);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIsExternal = _cursor.getColumnIndexOrThrow("IsExternal");
      final int _cursorIndexOfOTP = _cursor.getColumnIndexOrThrow("OTP");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("Email");
      final int _cursorIndexOfLoginId = _cursor.getColumnIndexOrThrow("LoginId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("EmployeeId");
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("FirstName");
      final int _cursorIndexOfRoleId = _cursor.getColumnIndexOrThrow("RoleId");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("LastName");
      final int _cursorIndexOfMobile = _cursor.getColumnIndexOrThrow("Mobile");
      final int _cursorIndexOfAgencyId = _cursor.getColumnIndexOrThrow("AgencyId");
      final int _cursorIndexOfBranchId = _cursor.getColumnIndexOrThrow("BranchId");
      final int _cursorIndexOfAgencyName = _cursor.getColumnIndexOrThrow("AgencyName");
      final int _cursorIndexOfCityName = _cursor.getColumnIndexOrThrow("CityName");
      final int _cursorIndexOfAgencyCode = _cursor.getColumnIndexOrThrow("AgencyCode");
      final int _cursorIndexOfRoleDescription = _cursor.getColumnIndexOrThrow("RoleDescription");
      final int _cursorIndexOfEmpId = _cursor.getColumnIndexOrThrow("empId");
      final int _cursorIndexOfStartDate = _cursor.getColumnIndexOrThrow("startDate");
      final int _cursorIndexOfEndDate = _cursor.getColumnIndexOrThrow("endDate");
      final int _cursorIndexOfInitQueryUrl = _cursor.getColumnIndexOrThrow("initQueryUrl");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBankId = _cursor.getColumnIndexOrThrow("BankId");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfTypeID = _cursor.getColumnIndexOrThrow("TypeID");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCount = _cursor.getColumnIndexOrThrow("count");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfEmployeeName = _cursor.getColumnIndexOrThrow("EmployeeName");
      final int _cursorIndexOfRole = _cursor.getColumnIndexOrThrow("Role");
      final int _cursorIndexOfStatusId = _cursor.getColumnIndexOrThrow("StatusId");
      final int _cursorIndexOfTypeDescription = _cursor.getColumnIndexOrThrow("TypeDescription");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfBankBranchName = _cursor.getColumnIndexOrThrow("BankBranchName");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfOpencase = _cursor.getColumnIndexOrThrow("opencase");
      final int _cursorIndexOfOfflinecase = _cursor.getColumnIndexOrThrow("offlinecase");
      final int _cursorIndexOfShowoffline = _cursor.getColumnIndexOrThrow("showoffline");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final int _cursorIndexOfPendingcase = _cursor.getColumnIndexOrThrow("pendingcase");
      final List<DataModel> _result = new ArrayList<DataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataModel _item;
        _item = new DataModel();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        _item._id = _cursor.getString(_cursorIndexOfId);
        _item.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _item.OTP = _cursor.getString(_cursorIndexOfOTP);
        _item.Email = _cursor.getString(_cursorIndexOfEmail);
        _item.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _item.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _item.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _item.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _item.LastName = _cursor.getString(_cursorIndexOfLastName);
        _item.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _item.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _item.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _item.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _item.CityName = _cursor.getString(_cursorIndexOfCityName);
        _item.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _item.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _item.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _item.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _item.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _item.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _item.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _item.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _item.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _item.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _item.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _item.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _item.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _item.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOpencase);
        _item.opencase = _tmp_2 != 0;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _item.offlinecase = _tmp_3 != 0;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfShowoffline);
        _item.showoffline = _tmp_4 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfPendingcase);
        _item.pendingcase = _tmp_5 != 0;
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
    final String _sql = "SELECT COUNT(*) from datamodel";
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

  @Override
  public List<DataModel> getCase_caseID(String CaseId) {
    final String _sql = "SELECT * FROM datamodel where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (CaseId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, CaseId);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfIsExternal = _cursor.getColumnIndexOrThrow("IsExternal");
      final int _cursorIndexOfOTP = _cursor.getColumnIndexOrThrow("OTP");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("Email");
      final int _cursorIndexOfLoginId = _cursor.getColumnIndexOrThrow("LoginId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("EmployeeId");
      final int _cursorIndexOfFirstName = _cursor.getColumnIndexOrThrow("FirstName");
      final int _cursorIndexOfRoleId = _cursor.getColumnIndexOrThrow("RoleId");
      final int _cursorIndexOfLastName = _cursor.getColumnIndexOrThrow("LastName");
      final int _cursorIndexOfMobile = _cursor.getColumnIndexOrThrow("Mobile");
      final int _cursorIndexOfAgencyId = _cursor.getColumnIndexOrThrow("AgencyId");
      final int _cursorIndexOfBranchId = _cursor.getColumnIndexOrThrow("BranchId");
      final int _cursorIndexOfAgencyName = _cursor.getColumnIndexOrThrow("AgencyName");
      final int _cursorIndexOfCityName = _cursor.getColumnIndexOrThrow("CityName");
      final int _cursorIndexOfAgencyCode = _cursor.getColumnIndexOrThrow("AgencyCode");
      final int _cursorIndexOfRoleDescription = _cursor.getColumnIndexOrThrow("RoleDescription");
      final int _cursorIndexOfEmpId = _cursor.getColumnIndexOrThrow("empId");
      final int _cursorIndexOfStartDate = _cursor.getColumnIndexOrThrow("startDate");
      final int _cursorIndexOfEndDate = _cursor.getColumnIndexOrThrow("endDate");
      final int _cursorIndexOfInitQueryUrl = _cursor.getColumnIndexOrThrow("initQueryUrl");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBankId = _cursor.getColumnIndexOrThrow("BankId");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfTypeID = _cursor.getColumnIndexOrThrow("TypeID");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfPropertyCategoryId = _cursor.getColumnIndexOrThrow("PropertyCategoryId");
      final int _cursorIndexOfCount = _cursor.getColumnIndexOrThrow("count");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfEmployeeName = _cursor.getColumnIndexOrThrow("EmployeeName");
      final int _cursorIndexOfRole = _cursor.getColumnIndexOrThrow("Role");
      final int _cursorIndexOfStatusId = _cursor.getColumnIndexOrThrow("StatusId");
      final int _cursorIndexOfTypeDescription = _cursor.getColumnIndexOrThrow("TypeDescription");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("Name");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("TypeOfPropertyId");
      final int _cursorIndexOfId_1 = _cursor.getColumnIndexOrThrow("Id");
      final int _cursorIndexOfDocumentName = _cursor.getColumnIndexOrThrow("DocumentName");
      final int _cursorIndexOfVisibleToFieldStaff = _cursor.getColumnIndexOrThrow("VisibleToFieldStaff");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("Title");
      final int _cursorIndexOfDocument = _cursor.getColumnIndexOrThrow("Document");
      final int _cursorIndexOfBankBranchName = _cursor.getColumnIndexOrThrow("BankBranchName");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfOpencase = _cursor.getColumnIndexOrThrow("opencase");
      final int _cursorIndexOfOfflinecase = _cursor.getColumnIndexOrThrow("offlinecase");
      final int _cursorIndexOfShowoffline = _cursor.getColumnIndexOrThrow("showoffline");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final int _cursorIndexOfPendingcase = _cursor.getColumnIndexOrThrow("pendingcase");
      final List<DataModel> _result = new ArrayList<DataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DataModel _item;
        _item = new DataModel();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        _item._id = _cursor.getString(_cursorIndexOfId);
        _item.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _item.OTP = _cursor.getString(_cursorIndexOfOTP);
        _item.Email = _cursor.getString(_cursorIndexOfEmail);
        _item.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _item.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _item.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _item.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _item.LastName = _cursor.getString(_cursorIndexOfLastName);
        _item.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _item.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _item.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _item.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _item.CityName = _cursor.getString(_cursorIndexOfCityName);
        _item.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _item.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _item.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _item.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _item.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _item.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _item.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _item.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _item.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _item.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _item.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _item.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _item.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _item.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _item.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _item.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _item.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _item.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _item.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfOpencase);
        _item.opencase = _tmp != 0;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _item.offlinecase = _tmp_1 != 0;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfShowoffline);
        _item.showoffline = _tmp_2 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfPendingcase);
        _item.pendingcase = _tmp_3 != 0;
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
