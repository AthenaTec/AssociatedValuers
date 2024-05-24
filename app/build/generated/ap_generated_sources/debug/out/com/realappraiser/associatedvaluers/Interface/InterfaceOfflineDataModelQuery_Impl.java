package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.OfflineDataModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceOfflineDataModelQuery_Impl implements InterfaceOfflineDataModelQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOfflineDataModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOfflineDataModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfOfflineDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOfflineDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdatecurrent_offlineDataModel;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOfflineCaseStatus;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOfflineRejectCaseStatus;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePropertytype;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOfflineDatabyCaseid;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTable;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePropertytype_is_property_changed;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePropertytypefor;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOfflineCaseStatusonline;

  private final SharedSQLiteStatement __preparedStmtOfUpdate_sync_edit_DataModel;

  public InterfaceOfflineDataModelQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOfflineDataModel = new EntityInsertionAdapter<OfflineDataModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `OfflineDataModel`(`dummyID`,`CaseId`,`_id`,`IsExternal`,`OTP`,`Email`,`LoginId`,`EmployeeId`,`FirstName`,`RoleId`,`LastName`,`Mobile`,`AgencyId`,`BranchId`,`AgencyName`,`CityName`,`AgencyCode`,`RoleDescription`,`empId`,`startDate`,`endDate`,`initQueryUrl`,`ApplicantName`,`ApplicantContactNo`,`PropertyAddress`,`ContactPersonName`,`ContactPersonNumber`,`BankName`,`BankId`,`PropertyType`,`TypeID`,`AssignedAt`,`CreatedOn`,`ReportChecker`,`Status`,`ReportDispatcher`,`FieldStaff`,`AssignedTo`,`ReportMaker`,`ReportFinalizer`,`PropertyId`,`ReportFile`,`ReportId`,`ReportTemplateId`,`Signature1`,`PropertyCategoryId`,`count`,`Signature2`,`EmployeeName`,`Role`,`StatusId`,`TypeDescription`,`Name`,`TypeOfPropertyId`,`Id`,`DocumentName`,`VisibleToFieldStaff`,`Title`,`Document`,`BankBranchName`,`AgencyBranchId`,`opencase`,`offlinecase`,`showoffline`,`current_offline`,`updatecasestatus`,`rejectmessage`,`is_property_changed`,`typeof_PropertyCategoryId_selected`,`sync_edit`,`ReportName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineDataModel value) {
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
        final int _tmp_3;
        _tmp_3 = value.current_offline ? 1 : 0;
        stmt.bindLong(65, _tmp_3);
        if (value.updatecasestatus == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.updatecasestatus);
        }
        if (value.rejectmessage == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, value.rejectmessage);
        }
        final int _tmp_4;
        _tmp_4 = value.is_property_changed ? 1 : 0;
        stmt.bindLong(68, _tmp_4);
        if (value.getTypeof_PropertyCategoryId_selected() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindString(69, value.getTypeof_PropertyCategoryId_selected());
        }
        final int _tmp_5;
        _tmp_5 = value.sync_edit ? 1 : 0;
        stmt.bindLong(70, _tmp_5);
        if (value.getReportName() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindString(71, value.getReportName());
        }
      }
    };
    this.__deletionAdapterOfOfflineDataModel = new EntityDeletionOrUpdateAdapter<OfflineDataModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `OfflineDataModel` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineDataModel value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__updateAdapterOfOfflineDataModel = new EntityDeletionOrUpdateAdapter<OfflineDataModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `OfflineDataModel` SET `dummyID` = ?,`CaseId` = ?,`_id` = ?,`IsExternal` = ?,`OTP` = ?,`Email` = ?,`LoginId` = ?,`EmployeeId` = ?,`FirstName` = ?,`RoleId` = ?,`LastName` = ?,`Mobile` = ?,`AgencyId` = ?,`BranchId` = ?,`AgencyName` = ?,`CityName` = ?,`AgencyCode` = ?,`RoleDescription` = ?,`empId` = ?,`startDate` = ?,`endDate` = ?,`initQueryUrl` = ?,`ApplicantName` = ?,`ApplicantContactNo` = ?,`PropertyAddress` = ?,`ContactPersonName` = ?,`ContactPersonNumber` = ?,`BankName` = ?,`BankId` = ?,`PropertyType` = ?,`TypeID` = ?,`AssignedAt` = ?,`CreatedOn` = ?,`ReportChecker` = ?,`Status` = ?,`ReportDispatcher` = ?,`FieldStaff` = ?,`AssignedTo` = ?,`ReportMaker` = ?,`ReportFinalizer` = ?,`PropertyId` = ?,`ReportFile` = ?,`ReportId` = ?,`ReportTemplateId` = ?,`Signature1` = ?,`PropertyCategoryId` = ?,`count` = ?,`Signature2` = ?,`EmployeeName` = ?,`Role` = ?,`StatusId` = ?,`TypeDescription` = ?,`Name` = ?,`TypeOfPropertyId` = ?,`Id` = ?,`DocumentName` = ?,`VisibleToFieldStaff` = ?,`Title` = ?,`Document` = ?,`BankBranchName` = ?,`AgencyBranchId` = ?,`opencase` = ?,`offlinecase` = ?,`showoffline` = ?,`current_offline` = ?,`updatecasestatus` = ?,`rejectmessage` = ?,`is_property_changed` = ?,`typeof_PropertyCategoryId_selected` = ?,`sync_edit` = ?,`ReportName` = ? WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineDataModel value) {
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
        final int _tmp_3;
        _tmp_3 = value.current_offline ? 1 : 0;
        stmt.bindLong(65, _tmp_3);
        if (value.updatecasestatus == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.updatecasestatus);
        }
        if (value.rejectmessage == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, value.rejectmessage);
        }
        final int _tmp_4;
        _tmp_4 = value.is_property_changed ? 1 : 0;
        stmt.bindLong(68, _tmp_4);
        if (value.getTypeof_PropertyCategoryId_selected() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindString(69, value.getTypeof_PropertyCategoryId_selected());
        }
        final int _tmp_5;
        _tmp_5 = value.sync_edit ? 1 : 0;
        stmt.bindLong(70, _tmp_5);
        if (value.getReportName() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindString(71, value.getReportName());
        }
        stmt.bindLong(72, value.dummyID);
      }
    };
    this.__preparedStmtOfUpdateOfflineDataModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set offlinecase=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatecurrent_offlineDataModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set current_offline=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOfflineCaseStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set updatecasestatus=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOfflineRejectCaseStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set updatecasestatus=?, rejectmessage=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePropertytype = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set PropertyType=?, PropertyCategoryId=? where caseid in(?) AND offlinecase in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOfflineDatabyCaseid = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from offlinedatamodel WHERE caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM offlinedatamodel";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePropertytype_is_property_changed = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set PropertyType=?, PropertyCategoryId=?,typeof_PropertyCategoryId_selected=? ,is_property_changed=? where caseid in(?) AND offlinecase in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePropertytypefor = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set PropertyType=?, PropertyCategoryId=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOfflineCaseStatusonline = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set updatecasestatus=?, StatusId=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdate_sync_edit_DataModel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update offlinedatamodel set sync_edit=? where caseid in(?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(OfflineDataModel offlinedatamodel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOfflineDataModel.insert(offlinedatamodel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(OfflineDataModel offlinedatamodel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfOfflineDataModel.handle(offlinedatamodel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateData(OfflineDataModel offlinedatamodel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfOfflineDataModel.handle(offlinedatamodel);
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
  public long updatecurrent_offlineDataModel(String caseidIn, boolean current_offline) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatecurrent_offlineDataModel.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = current_offline ? 1 : 0;
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
      __preparedStmtOfUpdatecurrent_offlineDataModel.release(_stmt);
    }
  }

  @Override
  public long updateOfflineCaseStatus(String updatecasestatus, String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOfflineCaseStatus.acquire();
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
      __preparedStmtOfUpdateOfflineCaseStatus.release(_stmt);
    }
  }

  @Override
  public long updateOfflineRejectCaseStatus(String updatecasestatus, String rejectmessage,
      String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOfflineRejectCaseStatus.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (updatecasestatus == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, updatecasestatus);
      }
      _argIndex = 2;
      if (rejectmessage == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, rejectmessage);
      }
      _argIndex = 3;
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
      __preparedStmtOfUpdateOfflineRejectCaseStatus.release(_stmt);
    }
  }

  @Override
  public long updatePropertytype(String isPropertyType, String isPropertyCategoryId,
      String caseidIn, boolean is_offlinecase) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePropertytype.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (isPropertyType == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyType);
      }
      _argIndex = 2;
      if (isPropertyCategoryId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyCategoryId);
      }
      _argIndex = 3;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      _argIndex = 4;
      final int _tmp;
      _tmp = is_offlinecase ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePropertytype.release(_stmt);
    }
  }

  @Override
  public int DeleteOfflineDatabyCaseid(String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOfflineDatabyCaseid.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteOfflineDatabyCaseid.release(_stmt);
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
  public long updatePropertytype_is_property_changed(String isPropertyType,
      String isPropertyCategoryId, String typeof_PropertyCategoryId_selected,
      boolean is_property_check, String caseidIn, boolean is_offlinecase) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePropertytype_is_property_changed.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (isPropertyType == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyType);
      }
      _argIndex = 2;
      if (isPropertyCategoryId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyCategoryId);
      }
      _argIndex = 3;
      if (typeof_PropertyCategoryId_selected == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, typeof_PropertyCategoryId_selected);
      }
      _argIndex = 4;
      final int _tmp;
      _tmp = is_property_check ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 5;
      if (caseidIn == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, caseidIn);
      }
      _argIndex = 6;
      final int _tmp_1;
      _tmp_1 = is_offlinecase ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp_1);
      final long _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdatePropertytype_is_property_changed.release(_stmt);
    }
  }

  @Override
  public long updatePropertytypefor(String isPropertyType, String isPropertyCategoryId,
      String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePropertytypefor.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (isPropertyType == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyType);
      }
      _argIndex = 2;
      if (isPropertyCategoryId == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, isPropertyCategoryId);
      }
      _argIndex = 3;
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
      __preparedStmtOfUpdatePropertytypefor.release(_stmt);
    }
  }

  @Override
  public long updateOfflineCaseStatusonline(String updatecasestatus, String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOfflineCaseStatusonline.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (updatecasestatus == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, updatecasestatus);
      }
      _argIndex = 2;
      if (updatecasestatus == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, updatecasestatus);
      }
      _argIndex = 3;
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
      __preparedStmtOfUpdateOfflineCaseStatusonline.release(_stmt);
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
  public long update_sync_edit_DataModel(String caseidIn, boolean is_sync) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate_sync_edit_DataModel.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = is_sync ? 1 : 0;
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
      __preparedStmtOfUpdate_sync_edit_DataModel.release(_stmt);
    }
  }

  @Override
  public List<OfflineDataModel> getDataModels() {
    final String _sql = "SELECT * FROM offlinedatamodel";
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final List<OfflineDataModel> _result = new ArrayList<OfflineDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineDataModel _item;
        _item = new OfflineDataModel();
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
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _item.current_offline = _tmp_3 != 0;
        _item.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _item.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _item.is_property_changed = _tmp_4 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _item.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _item.sync_edit = _tmp_5 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OfflineDataModel> getDataModal_offlinecase(boolean is_offline) {
    final String _sql = "SELECT * FROM offlinedatamodel where offlinecase = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = is_offline ? 1 : 0;
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final List<OfflineDataModel> _result = new ArrayList<OfflineDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineDataModel _item;
        _item = new OfflineDataModel();
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
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _item.current_offline = _tmp_4 != 0;
        _item.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _item.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _item.is_property_changed = _tmp_5 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _item.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _item.sync_edit = _tmp_6 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OfflineDataModel> getDataModal_current_offline(boolean is_offline) {
    final String _sql = "SELECT * FROM offlinedatamodel where current_offline = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = is_offline ? 1 : 0;
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final List<OfflineDataModel> _result = new ArrayList<OfflineDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineDataModel _item;
        _item = new OfflineDataModel();
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
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _item.current_offline = _tmp_4 != 0;
        _item.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _item.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _item.is_property_changed = _tmp_5 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _item.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _item.sync_edit = _tmp_6 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OfflineDataModel> getDataModal_showOffline(boolean is_open) {
    final String _sql = "SELECT * FROM offlinedatamodel where showoffline = (?)";
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final List<OfflineDataModel> _result = new ArrayList<OfflineDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineDataModel _item;
        _item = new OfflineDataModel();
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
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _item.current_offline = _tmp_4 != 0;
        _item.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _item.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _item.is_property_changed = _tmp_5 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _item.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _item.sync_edit = _tmp_6 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
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
    final String _sql = "SELECT COUNT(*) from offlinedatamodel";
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
  public String getUpdateCaseIdOffline(String caseidIn) {
    final String _sql = "SELECT updatecasestatus FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getUpdatePropertyTypeOffline(String caseidIn) {
    final String _sql = "SELECT PropertyType FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getUpdatePropertyCategoryIdOffline(String caseidIn) {
    final String _sql = "SELECT PropertyCategoryId FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getRejectMessagefromOffline(String caseidIn, String updatecasestatus) {
    final String _sql = "SELECT rejectmessage FROM offlinedatamodel where caseid = (?) AND updatecasestatus=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    _argIndex = 2;
    if (updatecasestatus == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, updatecasestatus);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public OfflineDataModel get_case_is(String caseidIn) {
    final String _sql = "SELECT * FROM offlinedatamodel where caseid = (?)";
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final OfflineDataModel _result;
      if(_cursor.moveToFirst()) {
        _result = new OfflineDataModel();
        _result.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final String _tmpCaseId;
        _tmpCaseId = _cursor.getString(_cursorIndexOfCaseId);
        _result.setCaseId(_tmpCaseId);
        _result._id = _cursor.getString(_cursorIndexOfId);
        _result.IsExternal = _cursor.getString(_cursorIndexOfIsExternal);
        _result.OTP = _cursor.getString(_cursorIndexOfOTP);
        _result.Email = _cursor.getString(_cursorIndexOfEmail);
        _result.LoginId = _cursor.getString(_cursorIndexOfLoginId);
        _result.EmployeeId = _cursor.getString(_cursorIndexOfEmployeeId);
        _result.FirstName = _cursor.getString(_cursorIndexOfFirstName);
        _result.RoleId = _cursor.getString(_cursorIndexOfRoleId);
        _result.LastName = _cursor.getString(_cursorIndexOfLastName);
        _result.Mobile = _cursor.getString(_cursorIndexOfMobile);
        _result.AgencyId = _cursor.getString(_cursorIndexOfAgencyId);
        _result.BranchId = _cursor.getString(_cursorIndexOfBranchId);
        _result.AgencyName = _cursor.getString(_cursorIndexOfAgencyName);
        _result.CityName = _cursor.getString(_cursorIndexOfCityName);
        _result.AgencyCode = _cursor.getString(_cursorIndexOfAgencyCode);
        _result.RoleDescription = _cursor.getString(_cursorIndexOfRoleDescription);
        final String _tmpEmpId;
        _tmpEmpId = _cursor.getString(_cursorIndexOfEmpId);
        _result.setEmpId(_tmpEmpId);
        final String _tmpStartDate;
        _tmpStartDate = _cursor.getString(_cursorIndexOfStartDate);
        _result.setStartDate(_tmpStartDate);
        final String _tmpEndDate;
        _tmpEndDate = _cursor.getString(_cursorIndexOfEndDate);
        _result.setEndDate(_tmpEndDate);
        final String _tmpInitQueryUrl;
        _tmpInitQueryUrl = _cursor.getString(_cursorIndexOfInitQueryUrl);
        _result.setInitQueryUrl(_tmpInitQueryUrl);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _result.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _result.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _result.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _result.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _result.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _result.setBankName(_tmpBankName);
        final String _tmpBankId;
        _tmpBankId = _cursor.getString(_cursorIndexOfBankId);
        _result.setBankId(_tmpBankId);
        final String _tmpPropertyType;
        _tmpPropertyType = _cursor.getString(_cursorIndexOfPropertyType);
        _result.setPropertyType(_tmpPropertyType);
        final String _tmpTypeID;
        _tmpTypeID = _cursor.getString(_cursorIndexOfTypeID);
        _result.setTypeID(_tmpTypeID);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _result.setAssignedAt(_tmpAssignedAt);
        final String _tmpCreatedOn;
        _tmpCreatedOn = _cursor.getString(_cursorIndexOfCreatedOn);
        _result.setCreatedOn(_tmpCreatedOn);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _result.setReportChecker(_tmpReportChecker);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        _result.setStatus(_tmpStatus);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _result.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getString(_cursorIndexOfFieldStaff);
        _result.setFieldStaff(_tmpFieldStaff);
        final String _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getString(_cursorIndexOfAssignedTo);
        _result.setAssignedTo(_tmpAssignedTo);
        final String _tmpReportMaker;
        _tmpReportMaker = _cursor.getString(_cursorIndexOfReportMaker);
        _result.setReportMaker(_tmpReportMaker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _result.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpPropertyId;
        _tmpPropertyId = _cursor.getString(_cursorIndexOfPropertyId);
        _result.setPropertyId(_tmpPropertyId);
        final String _tmpReportFile;
        _tmpReportFile = _cursor.getString(_cursorIndexOfReportFile);
        _result.setReportFile(_tmpReportFile);
        final String _tmpReportId;
        _tmpReportId = _cursor.getString(_cursorIndexOfReportId);
        _result.setReportId(_tmpReportId);
        final String _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getString(_cursorIndexOfReportTemplateId);
        _result.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _result.setSignature1(_tmpSignature1);
        final String _tmpPropertyCategoryId;
        _tmpPropertyCategoryId = _cursor.getString(_cursorIndexOfPropertyCategoryId);
        _result.setPropertyCategoryId(_tmpPropertyCategoryId);
        final String _tmpCount;
        _tmpCount = _cursor.getString(_cursorIndexOfCount);
        _result.setCount(_tmpCount);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _result.setSignature2(_tmpSignature2);
        final String _tmpEmployeeName;
        _tmpEmployeeName = _cursor.getString(_cursorIndexOfEmployeeName);
        _result.setEmployeeName(_tmpEmployeeName);
        final String _tmpRole;
        _tmpRole = _cursor.getString(_cursorIndexOfRole);
        _result.setRole(_tmpRole);
        final String _tmpStatusId;
        _tmpStatusId = _cursor.getString(_cursorIndexOfStatusId);
        _result.setStatusId(_tmpStatusId);
        final String _tmpTypeDescription;
        _tmpTypeDescription = _cursor.getString(_cursorIndexOfTypeDescription);
        _result.setTypeDescription(_tmpTypeDescription);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getString(_cursorIndexOfTypeOfPropertyId);
        _result.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId_1);
        _result.setId(_tmpId);
        final String _tmpDocumentName;
        _tmpDocumentName = _cursor.getString(_cursorIndexOfDocumentName);
        _result.setDocumentName(_tmpDocumentName);
        final String _tmpVisibleToFieldStaff;
        _tmpVisibleToFieldStaff = _cursor.getString(_cursorIndexOfVisibleToFieldStaff);
        _result.setVisibleToFieldStaff(_tmpVisibleToFieldStaff);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _result.setTitle(_tmpTitle);
        final String _tmpDocument;
        _tmpDocument = _cursor.getString(_cursorIndexOfDocument);
        _result.setDocument(_tmpDocument);
        final String _tmpBankBranchName;
        _tmpBankBranchName = _cursor.getString(_cursorIndexOfBankBranchName);
        _result.setBankBranchName(_tmpBankBranchName);
        final String _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getString(_cursorIndexOfAgencyBranchId);
        _result.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfOpencase);
        _result.opencase = _tmp != 0;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfOfflinecase);
        _result.offlinecase = _tmp_1 != 0;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfShowoffline);
        _result.showoffline = _tmp_2 != 0;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _result.current_offline = _tmp_3 != 0;
        _result.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _result.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _result.is_property_changed = _tmp_4 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _result.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _result.sync_edit = _tmp_5 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _result.setReportName(_tmpReportName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OfflineDataModel> get_case_list(String caseidIn) {
    final String _sql = "SELECT * FROM offlinedatamodel where caseid = (?)";
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
      final int _cursorIndexOfCurrentOffline = _cursor.getColumnIndexOrThrow("current_offline");
      final int _cursorIndexOfUpdatecasestatus = _cursor.getColumnIndexOrThrow("updatecasestatus");
      final int _cursorIndexOfRejectmessage = _cursor.getColumnIndexOrThrow("rejectmessage");
      final int _cursorIndexOfIsPropertyChanged = _cursor.getColumnIndexOrThrow("is_property_changed");
      final int _cursorIndexOfTypeofPropertyCategoryIdSelected = _cursor.getColumnIndexOrThrow("typeof_PropertyCategoryId_selected");
      final int _cursorIndexOfSyncEdit = _cursor.getColumnIndexOrThrow("sync_edit");
      final int _cursorIndexOfReportName = _cursor.getColumnIndexOrThrow("ReportName");
      final List<OfflineDataModel> _result = new ArrayList<OfflineDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineDataModel _item;
        _item = new OfflineDataModel();
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
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfCurrentOffline);
        _item.current_offline = _tmp_3 != 0;
        _item.updatecasestatus = _cursor.getString(_cursorIndexOfUpdatecasestatus);
        _item.rejectmessage = _cursor.getString(_cursorIndexOfRejectmessage);
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfIsPropertyChanged);
        _item.is_property_changed = _tmp_4 != 0;
        final String _tmpTypeof_PropertyCategoryId_selected;
        _tmpTypeof_PropertyCategoryId_selected = _cursor.getString(_cursorIndexOfTypeofPropertyCategoryIdSelected);
        _item.setTypeof_PropertyCategoryId_selected(_tmpTypeof_PropertyCategoryId_selected);
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfSyncEdit);
        _item.sync_edit = _tmp_5 != 0;
        final String _tmpReportName;
        _tmpReportName = _cursor.getString(_cursorIndexOfReportName);
        _item.setReportName(_tmpReportName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String get_PropertyCategoryId(String caseidIn) {
    final String _sql = "SELECT PropertyCategoryId FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public boolean getDataModal_is_property_changed(String caseidIn) {
    final String _sql = "SELECT is_property_changed FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final boolean _result;
      if(_cursor.moveToFirst()) {
        final int _tmp;
        _tmp = _cursor.getInt(0);
        _result = _tmp != 0;
      } else {
        _result = false;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String get_PropertyId(String caseidIn) {
    final String _sql = "SELECT PropertyId FROM offlinedatamodel where caseid = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (caseidIn == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, caseidIn);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
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
