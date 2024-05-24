package com.realappraiser.associatedvaluers.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.associatedvaluers.model.Case;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfaceCaseQuery_Impl implements InterfaceCaseQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCase;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCase;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCaseStatus;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCase_PropertyType;

  public InterfaceCaseQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCase = new EntityInsertionAdapter<Case>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CaseModal`(`dummyID`,`CaseId`,`AgencyBranchId`,`BankBranchId`,`PropertyId`,`CustomerId`,`FeesId`,`WorkflowId`,`ReportId`,`ReportTemplateId`,`AgencyBranch`,`ApplicantName`,`ApplicantContactNo`,`ContactPersonName`,`ContactPersonNumber`,`BankContactPersonName`,`BankContactPersonNumber`,`BankContactPersonEmail`,`LoanType`,`BankReferenceNO`,`ApplicantEmailId`,`ApplicantAddress`,`ReportType`,`ReportFile`,`BankName`,`BranchName`,`PropertyAddress`,`Pincode`,`PropertyType`,`ProfessionalFees`,`PropertyCity`,`PropertyLocality`,`VillageName`,`District`,`Taluka`,`Purpose`,`TaxType`,`Status`,`AssignedTo`,`AssignedBy`,`AssignedAt`,`AmountReceived`,`FieldStaff`,`ReportMaker`,`ReportChecker`,`ReportFinalizer`,`ReportDispatcher`,`Telecaller`,`CaseSourced`,`SourcedBy`,`GharvalueCity`,`GharvalueLocality`,`GharvaluePropertyName`,`CustomerFeedbackReceived`,`BankFeedbackReceived`,`AppointmentDateTime`,`SubmittedTo`,`CreatedOn`,`CreatedBy`,`ModifiedOn`,`ModifiedBy`,`Signature1`,`Signature2`,`AcceptanceTime`,`InspectionTime`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Case value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getAgencyBranchId());
        stmt.bindLong(4, value.getBankBranchId());
        stmt.bindLong(5, value.getPropertyId());
        stmt.bindLong(6, value.getCustomerId());
        stmt.bindLong(7, value.getFeesId());
        if (value.getWorkflowId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getWorkflowId());
        }
        stmt.bindLong(9, value.getReportId());
        stmt.bindLong(10, value.getReportTemplateId());
        if (value.getAgencyBranch() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getAgencyBranch());
        }
        if (value.getApplicantName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getApplicantName());
        }
        if (value.getApplicantContactNo() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getApplicantContactNo());
        }
        if (value.getContactPersonName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getContactPersonName());
        }
        if (value.getContactPersonNumber() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getContactPersonNumber());
        }
        if (value.getBankContactPersonName() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getBankContactPersonName());
        }
        if (value.getBankContactPersonNumber() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getBankContactPersonNumber());
        }
        if (value.getBankContactPersonEmail() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getBankContactPersonEmail());
        }
        if (value.getLoanType() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getLoanType());
        }
        if (value.getBankReferenceNO() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getBankReferenceNO());
        }
        if (value.getApplicantEmailId() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getApplicantEmailId());
        }
        if (value.getApplicantAddress() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getApplicantAddress());
        }
        stmt.bindLong(23, value.getReportType());
        stmt.bindLong(24, value.getReportFile());
        if (value.getBankName() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getBankName());
        }
        if (value.getBranchName() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getBranchName());
        }
        if (value.getPropertyAddress() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getPropertyAddress());
        }
        stmt.bindLong(28, value.getPincode());
        stmt.bindLong(29, value.getPropertyType());
        if (value.getProfessionalFees() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getProfessionalFees());
        }
        stmt.bindLong(31, value.getPropertyCity());
        if (value.getPropertyLocality() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getPropertyLocality());
        }
        if (value.getVillageName() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getVillageName());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getDistrict());
        }
        if (value.getTaluka() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getTaluka());
        }
        if (value.getPurpose() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getPurpose());
        }
        if (value.getTaxType() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getTaxType());
        }
        stmt.bindLong(38, value.getStatus());
        stmt.bindLong(39, value.getAssignedTo());
        stmt.bindLong(40, value.getAssignedBy());
        if (value.getAssignedAt() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getAssignedAt());
        }
        stmt.bindLong(42, value.getAmountReceived());
        stmt.bindLong(43, value.getFieldStaff());
        stmt.bindLong(44, value.getReportMaker());
        if (value.getReportChecker() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getReportChecker());
        }
        if (value.getReportFinalizer() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getReportFinalizer());
        }
        if (value.getReportDispatcher() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getReportDispatcher());
        }
        if (value.getTelecaller() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getTelecaller());
        }
        if (value.getCaseSourced() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getCaseSourced());
        }
        if (value.getSourcedBy() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getSourcedBy());
        }
        if (value.getGharvalueCity() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getGharvalueCity());
        }
        if (value.getGharvalueLocality() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getGharvalueLocality());
        }
        if (value.getGharvaluePropertyName() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getGharvaluePropertyName());
        }
        if (value.getCustomerFeedbackReceived() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getCustomerFeedbackReceived());
        }
        if (value.getBankFeedbackReceived() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getBankFeedbackReceived());
        }
        if (value.getAppointmentDateTime() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getAppointmentDateTime());
        }
        if (value.getSubmittedTo() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getSubmittedTo());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getCreatedOn());
        }
        stmt.bindLong(59, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getModifiedOn());
        }
        stmt.bindLong(61, value.getModifiedBy());
        if (value.getSignature1() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getSignature1());
        }
        if (value.getSignature2() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindString(63, value.getSignature2());
        }
        stmt.bindDouble(64, value.getAcceptanceTime());
        if (value.getInspectionTime() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getInspectionTime());
        }
      }
    };
    this.__deletionAdapterOfCase = new EntityDeletionOrUpdateAdapter<Case>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CaseModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Case value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casemodal where CaseId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM casemodal";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCaseStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update casemodal set status=? where caseid in(?)";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCase_PropertyType = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update casemodal set PropertyType=? where caseid in(?)";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(Case inscase) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCase.insert(inscase);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Case delacase) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfCase.handle(delacase);
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
  public long updateCaseStatus(String updatecasestatus, String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCaseStatus.acquire();
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
      __preparedStmtOfUpdateCaseStatus.release(_stmt);
    }
  }

  @Override
  public long updateCase_PropertyType(int PropertyType, String caseidIn) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCase_PropertyType.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, PropertyType);
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
      __preparedStmtOfUpdateCase_PropertyType.release(_stmt);
    }
  }

  @Override
  public List<Case> getCase() {
    final String _sql = "SELECT * FROM casemodal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfBankBranchId = _cursor.getColumnIndexOrThrow("BankBranchId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfCustomerId = _cursor.getColumnIndexOrThrow("CustomerId");
      final int _cursorIndexOfFeesId = _cursor.getColumnIndexOrThrow("FeesId");
      final int _cursorIndexOfWorkflowId = _cursor.getColumnIndexOrThrow("WorkflowId");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfAgencyBranch = _cursor.getColumnIndexOrThrow("AgencyBranch");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankContactPersonName = _cursor.getColumnIndexOrThrow("BankContactPersonName");
      final int _cursorIndexOfBankContactPersonNumber = _cursor.getColumnIndexOrThrow("BankContactPersonNumber");
      final int _cursorIndexOfBankContactPersonEmail = _cursor.getColumnIndexOrThrow("BankContactPersonEmail");
      final int _cursorIndexOfLoanType = _cursor.getColumnIndexOrThrow("LoanType");
      final int _cursorIndexOfBankReferenceNO = _cursor.getColumnIndexOrThrow("BankReferenceNO");
      final int _cursorIndexOfApplicantEmailId = _cursor.getColumnIndexOrThrow("ApplicantEmailId");
      final int _cursorIndexOfApplicantAddress = _cursor.getColumnIndexOrThrow("ApplicantAddress");
      final int _cursorIndexOfReportType = _cursor.getColumnIndexOrThrow("ReportType");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBranchName = _cursor.getColumnIndexOrThrow("BranchName");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfPincode = _cursor.getColumnIndexOrThrow("Pincode");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfProfessionalFees = _cursor.getColumnIndexOrThrow("ProfessionalFees");
      final int _cursorIndexOfPropertyCity = _cursor.getColumnIndexOrThrow("PropertyCity");
      final int _cursorIndexOfPropertyLocality = _cursor.getColumnIndexOrThrow("PropertyLocality");
      final int _cursorIndexOfVillageName = _cursor.getColumnIndexOrThrow("VillageName");
      final int _cursorIndexOfDistrict = _cursor.getColumnIndexOrThrow("District");
      final int _cursorIndexOfTaluka = _cursor.getColumnIndexOrThrow("Taluka");
      final int _cursorIndexOfPurpose = _cursor.getColumnIndexOrThrow("Purpose");
      final int _cursorIndexOfTaxType = _cursor.getColumnIndexOrThrow("TaxType");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfAssignedBy = _cursor.getColumnIndexOrThrow("AssignedBy");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfAmountReceived = _cursor.getColumnIndexOrThrow("AmountReceived");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfTelecaller = _cursor.getColumnIndexOrThrow("Telecaller");
      final int _cursorIndexOfCaseSourced = _cursor.getColumnIndexOrThrow("CaseSourced");
      final int _cursorIndexOfSourcedBy = _cursor.getColumnIndexOrThrow("SourcedBy");
      final int _cursorIndexOfGharvalueCity = _cursor.getColumnIndexOrThrow("GharvalueCity");
      final int _cursorIndexOfGharvalueLocality = _cursor.getColumnIndexOrThrow("GharvalueLocality");
      final int _cursorIndexOfGharvaluePropertyName = _cursor.getColumnIndexOrThrow("GharvaluePropertyName");
      final int _cursorIndexOfCustomerFeedbackReceived = _cursor.getColumnIndexOrThrow("CustomerFeedbackReceived");
      final int _cursorIndexOfBankFeedbackReceived = _cursor.getColumnIndexOrThrow("BankFeedbackReceived");
      final int _cursorIndexOfAppointmentDateTime = _cursor.getColumnIndexOrThrow("AppointmentDateTime");
      final int _cursorIndexOfSubmittedTo = _cursor.getColumnIndexOrThrow("SubmittedTo");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("CreatedBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("ModifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("ModifiedBy");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfAcceptanceTime = _cursor.getColumnIndexOrThrow("AcceptanceTime");
      final int _cursorIndexOfInspectionTime = _cursor.getColumnIndexOrThrow("InspectionTime");
      final List<Case> _result = new ArrayList<Case>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Case _item;
        _item = new Case();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getInt(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmpBankBranchId;
        _tmpBankBranchId = _cursor.getInt(_cursorIndexOfBankBranchId);
        _item.setBankBranchId(_tmpBankBranchId);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final int _tmpCustomerId;
        _tmpCustomerId = _cursor.getInt(_cursorIndexOfCustomerId);
        _item.setCustomerId(_tmpCustomerId);
        final int _tmpFeesId;
        _tmpFeesId = _cursor.getInt(_cursorIndexOfFeesId);
        _item.setFeesId(_tmpFeesId);
        final String _tmpWorkflowId;
        _tmpWorkflowId = _cursor.getString(_cursorIndexOfWorkflowId);
        _item.setWorkflowId(_tmpWorkflowId);
        final int _tmpReportId;
        _tmpReportId = _cursor.getInt(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final int _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getInt(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpAgencyBranch;
        _tmpAgencyBranch = _cursor.getString(_cursorIndexOfAgencyBranch);
        _item.setAgencyBranch(_tmpAgencyBranch);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankContactPersonName;
        _tmpBankContactPersonName = _cursor.getString(_cursorIndexOfBankContactPersonName);
        _item.setBankContactPersonName(_tmpBankContactPersonName);
        final String _tmpBankContactPersonNumber;
        _tmpBankContactPersonNumber = _cursor.getString(_cursorIndexOfBankContactPersonNumber);
        _item.setBankContactPersonNumber(_tmpBankContactPersonNumber);
        final String _tmpBankContactPersonEmail;
        _tmpBankContactPersonEmail = _cursor.getString(_cursorIndexOfBankContactPersonEmail);
        _item.setBankContactPersonEmail(_tmpBankContactPersonEmail);
        final String _tmpLoanType;
        _tmpLoanType = _cursor.getString(_cursorIndexOfLoanType);
        _item.setLoanType(_tmpLoanType);
        final String _tmpBankReferenceNO;
        _tmpBankReferenceNO = _cursor.getString(_cursorIndexOfBankReferenceNO);
        _item.setBankReferenceNO(_tmpBankReferenceNO);
        final String _tmpApplicantEmailId;
        _tmpApplicantEmailId = _cursor.getString(_cursorIndexOfApplicantEmailId);
        _item.setApplicantEmailId(_tmpApplicantEmailId);
        final String _tmpApplicantAddress;
        _tmpApplicantAddress = _cursor.getString(_cursorIndexOfApplicantAddress);
        _item.setApplicantAddress(_tmpApplicantAddress);
        final int _tmpReportType;
        _tmpReportType = _cursor.getInt(_cursorIndexOfReportType);
        _item.setReportType(_tmpReportType);
        final int _tmpReportFile;
        _tmpReportFile = _cursor.getInt(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBranchName;
        _tmpBranchName = _cursor.getString(_cursorIndexOfBranchName);
        _item.setBranchName(_tmpBranchName);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final int _tmpPincode;
        _tmpPincode = _cursor.getInt(_cursorIndexOfPincode);
        _item.setPincode(_tmpPincode);
        final int _tmpPropertyType;
        _tmpPropertyType = _cursor.getInt(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpProfessionalFees;
        _tmpProfessionalFees = _cursor.getString(_cursorIndexOfProfessionalFees);
        _item.setProfessionalFees(_tmpProfessionalFees);
        final int _tmpPropertyCity;
        _tmpPropertyCity = _cursor.getInt(_cursorIndexOfPropertyCity);
        _item.setPropertyCity(_tmpPropertyCity);
        final String _tmpPropertyLocality;
        _tmpPropertyLocality = _cursor.getString(_cursorIndexOfPropertyLocality);
        _item.setPropertyLocality(_tmpPropertyLocality);
        final String _tmpVillageName;
        _tmpVillageName = _cursor.getString(_cursorIndexOfVillageName);
        _item.setVillageName(_tmpVillageName);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        _item.setDistrict(_tmpDistrict);
        final String _tmpTaluka;
        _tmpTaluka = _cursor.getString(_cursorIndexOfTaluka);
        _item.setTaluka(_tmpTaluka);
        final String _tmpPurpose;
        _tmpPurpose = _cursor.getString(_cursorIndexOfPurpose);
        _item.setPurpose(_tmpPurpose);
        final String _tmpTaxType;
        _tmpTaxType = _cursor.getString(_cursorIndexOfTaxType);
        _item.setTaxType(_tmpTaxType);
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final int _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getInt(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final int _tmpAssignedBy;
        _tmpAssignedBy = _cursor.getInt(_cursorIndexOfAssignedBy);
        _item.setAssignedBy(_tmpAssignedBy);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final int _tmpAmountReceived;
        _tmpAmountReceived = _cursor.getInt(_cursorIndexOfAmountReceived);
        _item.setAmountReceived(_tmpAmountReceived);
        final int _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getInt(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final int _tmpReportMaker;
        _tmpReportMaker = _cursor.getInt(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpTelecaller;
        _tmpTelecaller = _cursor.getString(_cursorIndexOfTelecaller);
        _item.setTelecaller(_tmpTelecaller);
        final String _tmpCaseSourced;
        _tmpCaseSourced = _cursor.getString(_cursorIndexOfCaseSourced);
        _item.setCaseSourced(_tmpCaseSourced);
        final String _tmpSourcedBy;
        _tmpSourcedBy = _cursor.getString(_cursorIndexOfSourcedBy);
        _item.setSourcedBy(_tmpSourcedBy);
        final String _tmpGharvalueCity;
        _tmpGharvalueCity = _cursor.getString(_cursorIndexOfGharvalueCity);
        _item.setGharvalueCity(_tmpGharvalueCity);
        final String _tmpGharvalueLocality;
        _tmpGharvalueLocality = _cursor.getString(_cursorIndexOfGharvalueLocality);
        _item.setGharvalueLocality(_tmpGharvalueLocality);
        final String _tmpGharvaluePropertyName;
        _tmpGharvaluePropertyName = _cursor.getString(_cursorIndexOfGharvaluePropertyName);
        _item.setGharvaluePropertyName(_tmpGharvaluePropertyName);
        final String _tmpCustomerFeedbackReceived;
        _tmpCustomerFeedbackReceived = _cursor.getString(_cursorIndexOfCustomerFeedbackReceived);
        _item.setCustomerFeedbackReceived(_tmpCustomerFeedbackReceived);
        final String _tmpBankFeedbackReceived;
        _tmpBankFeedbackReceived = _cursor.getString(_cursorIndexOfBankFeedbackReceived);
        _item.setBankFeedbackReceived(_tmpBankFeedbackReceived);
        final String _tmpAppointmentDateTime;
        _tmpAppointmentDateTime = _cursor.getString(_cursorIndexOfAppointmentDateTime);
        _item.setAppointmentDateTime(_tmpAppointmentDateTime);
        final String _tmpSubmittedTo;
        _tmpSubmittedTo = _cursor.getString(_cursorIndexOfSubmittedTo);
        _item.setSubmittedTo(_tmpSubmittedTo);
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
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final float _tmpAcceptanceTime;
        _tmpAcceptanceTime = _cursor.getFloat(_cursorIndexOfAcceptanceTime);
        _item.setAcceptanceTime(_tmpAcceptanceTime);
        final String _tmpInspectionTime;
        _tmpInspectionTime = _cursor.getString(_cursorIndexOfInspectionTime);
        _item.setInspectionTime(_tmpInspectionTime);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Case> getCase_caseID(int caseid_) {
    final String _sql = "SELECT * FROM casemodal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfAgencyBranchId = _cursor.getColumnIndexOrThrow("AgencyBranchId");
      final int _cursorIndexOfBankBranchId = _cursor.getColumnIndexOrThrow("BankBranchId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("PropertyId");
      final int _cursorIndexOfCustomerId = _cursor.getColumnIndexOrThrow("CustomerId");
      final int _cursorIndexOfFeesId = _cursor.getColumnIndexOrThrow("FeesId");
      final int _cursorIndexOfWorkflowId = _cursor.getColumnIndexOrThrow("WorkflowId");
      final int _cursorIndexOfReportId = _cursor.getColumnIndexOrThrow("ReportId");
      final int _cursorIndexOfReportTemplateId = _cursor.getColumnIndexOrThrow("ReportTemplateId");
      final int _cursorIndexOfAgencyBranch = _cursor.getColumnIndexOrThrow("AgencyBranch");
      final int _cursorIndexOfApplicantName = _cursor.getColumnIndexOrThrow("ApplicantName");
      final int _cursorIndexOfApplicantContactNo = _cursor.getColumnIndexOrThrow("ApplicantContactNo");
      final int _cursorIndexOfContactPersonName = _cursor.getColumnIndexOrThrow("ContactPersonName");
      final int _cursorIndexOfContactPersonNumber = _cursor.getColumnIndexOrThrow("ContactPersonNumber");
      final int _cursorIndexOfBankContactPersonName = _cursor.getColumnIndexOrThrow("BankContactPersonName");
      final int _cursorIndexOfBankContactPersonNumber = _cursor.getColumnIndexOrThrow("BankContactPersonNumber");
      final int _cursorIndexOfBankContactPersonEmail = _cursor.getColumnIndexOrThrow("BankContactPersonEmail");
      final int _cursorIndexOfLoanType = _cursor.getColumnIndexOrThrow("LoanType");
      final int _cursorIndexOfBankReferenceNO = _cursor.getColumnIndexOrThrow("BankReferenceNO");
      final int _cursorIndexOfApplicantEmailId = _cursor.getColumnIndexOrThrow("ApplicantEmailId");
      final int _cursorIndexOfApplicantAddress = _cursor.getColumnIndexOrThrow("ApplicantAddress");
      final int _cursorIndexOfReportType = _cursor.getColumnIndexOrThrow("ReportType");
      final int _cursorIndexOfReportFile = _cursor.getColumnIndexOrThrow("ReportFile");
      final int _cursorIndexOfBankName = _cursor.getColumnIndexOrThrow("BankName");
      final int _cursorIndexOfBranchName = _cursor.getColumnIndexOrThrow("BranchName");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("PropertyAddress");
      final int _cursorIndexOfPincode = _cursor.getColumnIndexOrThrow("Pincode");
      final int _cursorIndexOfPropertyType = _cursor.getColumnIndexOrThrow("PropertyType");
      final int _cursorIndexOfProfessionalFees = _cursor.getColumnIndexOrThrow("ProfessionalFees");
      final int _cursorIndexOfPropertyCity = _cursor.getColumnIndexOrThrow("PropertyCity");
      final int _cursorIndexOfPropertyLocality = _cursor.getColumnIndexOrThrow("PropertyLocality");
      final int _cursorIndexOfVillageName = _cursor.getColumnIndexOrThrow("VillageName");
      final int _cursorIndexOfDistrict = _cursor.getColumnIndexOrThrow("District");
      final int _cursorIndexOfTaluka = _cursor.getColumnIndexOrThrow("Taluka");
      final int _cursorIndexOfPurpose = _cursor.getColumnIndexOrThrow("Purpose");
      final int _cursorIndexOfTaxType = _cursor.getColumnIndexOrThrow("TaxType");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("Status");
      final int _cursorIndexOfAssignedTo = _cursor.getColumnIndexOrThrow("AssignedTo");
      final int _cursorIndexOfAssignedBy = _cursor.getColumnIndexOrThrow("AssignedBy");
      final int _cursorIndexOfAssignedAt = _cursor.getColumnIndexOrThrow("AssignedAt");
      final int _cursorIndexOfAmountReceived = _cursor.getColumnIndexOrThrow("AmountReceived");
      final int _cursorIndexOfFieldStaff = _cursor.getColumnIndexOrThrow("FieldStaff");
      final int _cursorIndexOfReportMaker = _cursor.getColumnIndexOrThrow("ReportMaker");
      final int _cursorIndexOfReportChecker = _cursor.getColumnIndexOrThrow("ReportChecker");
      final int _cursorIndexOfReportFinalizer = _cursor.getColumnIndexOrThrow("ReportFinalizer");
      final int _cursorIndexOfReportDispatcher = _cursor.getColumnIndexOrThrow("ReportDispatcher");
      final int _cursorIndexOfTelecaller = _cursor.getColumnIndexOrThrow("Telecaller");
      final int _cursorIndexOfCaseSourced = _cursor.getColumnIndexOrThrow("CaseSourced");
      final int _cursorIndexOfSourcedBy = _cursor.getColumnIndexOrThrow("SourcedBy");
      final int _cursorIndexOfGharvalueCity = _cursor.getColumnIndexOrThrow("GharvalueCity");
      final int _cursorIndexOfGharvalueLocality = _cursor.getColumnIndexOrThrow("GharvalueLocality");
      final int _cursorIndexOfGharvaluePropertyName = _cursor.getColumnIndexOrThrow("GharvaluePropertyName");
      final int _cursorIndexOfCustomerFeedbackReceived = _cursor.getColumnIndexOrThrow("CustomerFeedbackReceived");
      final int _cursorIndexOfBankFeedbackReceived = _cursor.getColumnIndexOrThrow("BankFeedbackReceived");
      final int _cursorIndexOfAppointmentDateTime = _cursor.getColumnIndexOrThrow("AppointmentDateTime");
      final int _cursorIndexOfSubmittedTo = _cursor.getColumnIndexOrThrow("SubmittedTo");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("CreatedOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("CreatedBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("ModifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("ModifiedBy");
      final int _cursorIndexOfSignature1 = _cursor.getColumnIndexOrThrow("Signature1");
      final int _cursorIndexOfSignature2 = _cursor.getColumnIndexOrThrow("Signature2");
      final int _cursorIndexOfAcceptanceTime = _cursor.getColumnIndexOrThrow("AcceptanceTime");
      final int _cursorIndexOfInspectionTime = _cursor.getColumnIndexOrThrow("InspectionTime");
      final List<Case> _result = new ArrayList<Case>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Case _item;
        _item = new Case();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpAgencyBranchId;
        _tmpAgencyBranchId = _cursor.getInt(_cursorIndexOfAgencyBranchId);
        _item.setAgencyBranchId(_tmpAgencyBranchId);
        final int _tmpBankBranchId;
        _tmpBankBranchId = _cursor.getInt(_cursorIndexOfBankBranchId);
        _item.setBankBranchId(_tmpBankBranchId);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final int _tmpCustomerId;
        _tmpCustomerId = _cursor.getInt(_cursorIndexOfCustomerId);
        _item.setCustomerId(_tmpCustomerId);
        final int _tmpFeesId;
        _tmpFeesId = _cursor.getInt(_cursorIndexOfFeesId);
        _item.setFeesId(_tmpFeesId);
        final String _tmpWorkflowId;
        _tmpWorkflowId = _cursor.getString(_cursorIndexOfWorkflowId);
        _item.setWorkflowId(_tmpWorkflowId);
        final int _tmpReportId;
        _tmpReportId = _cursor.getInt(_cursorIndexOfReportId);
        _item.setReportId(_tmpReportId);
        final int _tmpReportTemplateId;
        _tmpReportTemplateId = _cursor.getInt(_cursorIndexOfReportTemplateId);
        _item.setReportTemplateId(_tmpReportTemplateId);
        final String _tmpAgencyBranch;
        _tmpAgencyBranch = _cursor.getString(_cursorIndexOfAgencyBranch);
        _item.setAgencyBranch(_tmpAgencyBranch);
        final String _tmpApplicantName;
        _tmpApplicantName = _cursor.getString(_cursorIndexOfApplicantName);
        _item.setApplicantName(_tmpApplicantName);
        final String _tmpApplicantContactNo;
        _tmpApplicantContactNo = _cursor.getString(_cursorIndexOfApplicantContactNo);
        _item.setApplicantContactNo(_tmpApplicantContactNo);
        final String _tmpContactPersonName;
        _tmpContactPersonName = _cursor.getString(_cursorIndexOfContactPersonName);
        _item.setContactPersonName(_tmpContactPersonName);
        final String _tmpContactPersonNumber;
        _tmpContactPersonNumber = _cursor.getString(_cursorIndexOfContactPersonNumber);
        _item.setContactPersonNumber(_tmpContactPersonNumber);
        final String _tmpBankContactPersonName;
        _tmpBankContactPersonName = _cursor.getString(_cursorIndexOfBankContactPersonName);
        _item.setBankContactPersonName(_tmpBankContactPersonName);
        final String _tmpBankContactPersonNumber;
        _tmpBankContactPersonNumber = _cursor.getString(_cursorIndexOfBankContactPersonNumber);
        _item.setBankContactPersonNumber(_tmpBankContactPersonNumber);
        final String _tmpBankContactPersonEmail;
        _tmpBankContactPersonEmail = _cursor.getString(_cursorIndexOfBankContactPersonEmail);
        _item.setBankContactPersonEmail(_tmpBankContactPersonEmail);
        final String _tmpLoanType;
        _tmpLoanType = _cursor.getString(_cursorIndexOfLoanType);
        _item.setLoanType(_tmpLoanType);
        final String _tmpBankReferenceNO;
        _tmpBankReferenceNO = _cursor.getString(_cursorIndexOfBankReferenceNO);
        _item.setBankReferenceNO(_tmpBankReferenceNO);
        final String _tmpApplicantEmailId;
        _tmpApplicantEmailId = _cursor.getString(_cursorIndexOfApplicantEmailId);
        _item.setApplicantEmailId(_tmpApplicantEmailId);
        final String _tmpApplicantAddress;
        _tmpApplicantAddress = _cursor.getString(_cursorIndexOfApplicantAddress);
        _item.setApplicantAddress(_tmpApplicantAddress);
        final int _tmpReportType;
        _tmpReportType = _cursor.getInt(_cursorIndexOfReportType);
        _item.setReportType(_tmpReportType);
        final int _tmpReportFile;
        _tmpReportFile = _cursor.getInt(_cursorIndexOfReportFile);
        _item.setReportFile(_tmpReportFile);
        final String _tmpBankName;
        _tmpBankName = _cursor.getString(_cursorIndexOfBankName);
        _item.setBankName(_tmpBankName);
        final String _tmpBranchName;
        _tmpBranchName = _cursor.getString(_cursorIndexOfBranchName);
        _item.setBranchName(_tmpBranchName);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final int _tmpPincode;
        _tmpPincode = _cursor.getInt(_cursorIndexOfPincode);
        _item.setPincode(_tmpPincode);
        final int _tmpPropertyType;
        _tmpPropertyType = _cursor.getInt(_cursorIndexOfPropertyType);
        _item.setPropertyType(_tmpPropertyType);
        final String _tmpProfessionalFees;
        _tmpProfessionalFees = _cursor.getString(_cursorIndexOfProfessionalFees);
        _item.setProfessionalFees(_tmpProfessionalFees);
        final int _tmpPropertyCity;
        _tmpPropertyCity = _cursor.getInt(_cursorIndexOfPropertyCity);
        _item.setPropertyCity(_tmpPropertyCity);
        final String _tmpPropertyLocality;
        _tmpPropertyLocality = _cursor.getString(_cursorIndexOfPropertyLocality);
        _item.setPropertyLocality(_tmpPropertyLocality);
        final String _tmpVillageName;
        _tmpVillageName = _cursor.getString(_cursorIndexOfVillageName);
        _item.setVillageName(_tmpVillageName);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        _item.setDistrict(_tmpDistrict);
        final String _tmpTaluka;
        _tmpTaluka = _cursor.getString(_cursorIndexOfTaluka);
        _item.setTaluka(_tmpTaluka);
        final String _tmpPurpose;
        _tmpPurpose = _cursor.getString(_cursorIndexOfPurpose);
        _item.setPurpose(_tmpPurpose);
        final String _tmpTaxType;
        _tmpTaxType = _cursor.getString(_cursorIndexOfTaxType);
        _item.setTaxType(_tmpTaxType);
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        _item.setStatus(_tmpStatus);
        final int _tmpAssignedTo;
        _tmpAssignedTo = _cursor.getInt(_cursorIndexOfAssignedTo);
        _item.setAssignedTo(_tmpAssignedTo);
        final int _tmpAssignedBy;
        _tmpAssignedBy = _cursor.getInt(_cursorIndexOfAssignedBy);
        _item.setAssignedBy(_tmpAssignedBy);
        final String _tmpAssignedAt;
        _tmpAssignedAt = _cursor.getString(_cursorIndexOfAssignedAt);
        _item.setAssignedAt(_tmpAssignedAt);
        final int _tmpAmountReceived;
        _tmpAmountReceived = _cursor.getInt(_cursorIndexOfAmountReceived);
        _item.setAmountReceived(_tmpAmountReceived);
        final int _tmpFieldStaff;
        _tmpFieldStaff = _cursor.getInt(_cursorIndexOfFieldStaff);
        _item.setFieldStaff(_tmpFieldStaff);
        final int _tmpReportMaker;
        _tmpReportMaker = _cursor.getInt(_cursorIndexOfReportMaker);
        _item.setReportMaker(_tmpReportMaker);
        final String _tmpReportChecker;
        _tmpReportChecker = _cursor.getString(_cursorIndexOfReportChecker);
        _item.setReportChecker(_tmpReportChecker);
        final String _tmpReportFinalizer;
        _tmpReportFinalizer = _cursor.getString(_cursorIndexOfReportFinalizer);
        _item.setReportFinalizer(_tmpReportFinalizer);
        final String _tmpReportDispatcher;
        _tmpReportDispatcher = _cursor.getString(_cursorIndexOfReportDispatcher);
        _item.setReportDispatcher(_tmpReportDispatcher);
        final String _tmpTelecaller;
        _tmpTelecaller = _cursor.getString(_cursorIndexOfTelecaller);
        _item.setTelecaller(_tmpTelecaller);
        final String _tmpCaseSourced;
        _tmpCaseSourced = _cursor.getString(_cursorIndexOfCaseSourced);
        _item.setCaseSourced(_tmpCaseSourced);
        final String _tmpSourcedBy;
        _tmpSourcedBy = _cursor.getString(_cursorIndexOfSourcedBy);
        _item.setSourcedBy(_tmpSourcedBy);
        final String _tmpGharvalueCity;
        _tmpGharvalueCity = _cursor.getString(_cursorIndexOfGharvalueCity);
        _item.setGharvalueCity(_tmpGharvalueCity);
        final String _tmpGharvalueLocality;
        _tmpGharvalueLocality = _cursor.getString(_cursorIndexOfGharvalueLocality);
        _item.setGharvalueLocality(_tmpGharvalueLocality);
        final String _tmpGharvaluePropertyName;
        _tmpGharvaluePropertyName = _cursor.getString(_cursorIndexOfGharvaluePropertyName);
        _item.setGharvaluePropertyName(_tmpGharvaluePropertyName);
        final String _tmpCustomerFeedbackReceived;
        _tmpCustomerFeedbackReceived = _cursor.getString(_cursorIndexOfCustomerFeedbackReceived);
        _item.setCustomerFeedbackReceived(_tmpCustomerFeedbackReceived);
        final String _tmpBankFeedbackReceived;
        _tmpBankFeedbackReceived = _cursor.getString(_cursorIndexOfBankFeedbackReceived);
        _item.setBankFeedbackReceived(_tmpBankFeedbackReceived);
        final String _tmpAppointmentDateTime;
        _tmpAppointmentDateTime = _cursor.getString(_cursorIndexOfAppointmentDateTime);
        _item.setAppointmentDateTime(_tmpAppointmentDateTime);
        final String _tmpSubmittedTo;
        _tmpSubmittedTo = _cursor.getString(_cursorIndexOfSubmittedTo);
        _item.setSubmittedTo(_tmpSubmittedTo);
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
        final String _tmpSignature1;
        _tmpSignature1 = _cursor.getString(_cursorIndexOfSignature1);
        _item.setSignature1(_tmpSignature1);
        final String _tmpSignature2;
        _tmpSignature2 = _cursor.getString(_cursorIndexOfSignature2);
        _item.setSignature2(_tmpSignature2);
        final float _tmpAcceptanceTime;
        _tmpAcceptanceTime = _cursor.getFloat(_cursorIndexOfAcceptanceTime);
        _item.setAcceptanceTime(_tmpAcceptanceTime);
        final String _tmpInspectionTime;
        _tmpInspectionTime = _cursor.getString(_cursorIndexOfInspectionTime);
        _item.setInspectionTime(_tmpInspectionTime);
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
    final String _sql = "SELECT COUNT(*) from casemodal";
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
