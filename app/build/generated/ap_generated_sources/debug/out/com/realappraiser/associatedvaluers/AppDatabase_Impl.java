package com.realappraiser.associatedvaluers;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.realappraiser.associatedvaluers.Interface.CaseDetailDAO;
import com.realappraiser.associatedvaluers.Interface.CaseDetailDAO_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceCaseQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceCaseQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceDataModelQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceDataModelQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceDocumentListQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceDocumentListQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoMeasurmentQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoMeasurmentQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsValuationQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsValuationQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyValuationQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyValuationQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndpropertyQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndpropertyQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceLatLongQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceLatLongQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineCaseQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineCaseQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineDataModelQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineDataModelQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfacePropertyQuery;
import com.realappraiser.associatedvaluers.Interface.InterfacePropertyQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.InterfaceProximityQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceProximityQuery_Impl;
import com.realappraiser.associatedvaluers.Interface.PropertyUpdateCategory;
import com.realappraiser.associatedvaluers.Interface.PropertyUpdateCategory_Impl;
import com.realappraiser.associatedvaluers.Interface.TypeofPropertyQuery;
import com.realappraiser.associatedvaluers.Interface.TypeofPropertyQuery_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile InterfaceDataModelQuery _interfaceDataModelQuery;

  private volatile InterfaceOfflineDataModelQuery _interfaceOfflineDataModelQuery;

  private volatile InterfaceCaseQuery _interfaceCaseQuery;

  private volatile InterfacePropertyQuery _interfacePropertyQuery;

  private volatile InterfaceIndpropertyQuery _interfaceIndpropertyQuery;

  private volatile InterfaceIndPropertyValuationQuery _interfaceIndPropertyValuationQuery;

  private volatile InterfaceIndPropertyFloorsQuery _interfaceIndPropertyFloorsQuery;

  private volatile InterfaceIndPropertyFloorsValuationQuery _interfaceIndPropertyFloorsValuationQuery;

  private volatile InterfaceProximityQuery _interfaceProximityQuery;

  private volatile InterfaceGetPhotoQuery _interfaceGetPhotoQuery;

  private volatile InterfaceOfflineCaseQuery _interfaceOfflineCaseQuery;

  private volatile InterfaceDocumentListQuery _interfaceDocumentListQuery;

  private volatile InterfaceLatLongQuery _interfaceLatLongQuery;

  private volatile TypeofPropertyQuery _typeofPropertyQuery;

  private volatile CaseDetailDAO _caseDetailDAO;

  private volatile PropertyUpdateCategory _propertyUpdateCategory;

  private volatile InterfaceGetPhotoMeasurmentQuery _interfaceGetPhotoMeasurmentQuery;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DataModel` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CaseId` TEXT, `_id` TEXT, `IsExternal` TEXT, `OTP` TEXT, `Email` TEXT, `LoginId` TEXT, `EmployeeId` TEXT, `FirstName` TEXT, `RoleId` TEXT, `LastName` TEXT, `Mobile` TEXT, `AgencyId` TEXT, `BranchId` TEXT, `AgencyName` TEXT, `CityName` TEXT, `AgencyCode` TEXT, `RoleDescription` TEXT, `empId` TEXT, `startDate` TEXT, `endDate` TEXT, `initQueryUrl` TEXT, `ApplicantName` TEXT, `ApplicantContactNo` TEXT, `PropertyAddress` TEXT, `ContactPersonName` TEXT, `ContactPersonNumber` TEXT, `BankName` TEXT, `BankId` TEXT, `PropertyType` TEXT, `TypeID` TEXT, `AssignedAt` TEXT, `CreatedOn` TEXT, `ReportChecker` TEXT, `Status` TEXT, `ReportDispatcher` TEXT, `FieldStaff` TEXT, `AssignedTo` TEXT, `ReportMaker` TEXT, `ReportFinalizer` TEXT, `PropertyId` TEXT, `ReportFile` TEXT, `ReportId` TEXT, `ReportTemplateId` TEXT, `Signature1` TEXT, `PropertyCategoryId` TEXT, `count` TEXT, `Signature2` TEXT, `EmployeeName` TEXT, `Role` TEXT, `StatusId` TEXT, `TypeDescription` TEXT, `Name` TEXT, `TypeOfPropertyId` TEXT, `Id` TEXT, `DocumentName` TEXT, `VisibleToFieldStaff` TEXT, `Title` TEXT, `Document` TEXT, `BankBranchName` TEXT, `AgencyBranchId` TEXT, `opencase` INTEGER NOT NULL, `offlinecase` INTEGER NOT NULL, `showoffline` INTEGER NOT NULL, `ReportName` TEXT, `pendingcase` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OfflineDataModel` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CaseId` TEXT, `_id` TEXT, `IsExternal` TEXT, `OTP` TEXT, `Email` TEXT, `LoginId` TEXT, `EmployeeId` TEXT, `FirstName` TEXT, `RoleId` TEXT, `LastName` TEXT, `Mobile` TEXT, `AgencyId` TEXT, `BranchId` TEXT, `AgencyName` TEXT, `CityName` TEXT, `AgencyCode` TEXT, `RoleDescription` TEXT, `empId` TEXT, `startDate` TEXT, `endDate` TEXT, `initQueryUrl` TEXT, `ApplicantName` TEXT, `ApplicantContactNo` TEXT, `PropertyAddress` TEXT, `ContactPersonName` TEXT, `ContactPersonNumber` TEXT, `BankName` TEXT, `BankId` TEXT, `PropertyType` TEXT, `TypeID` TEXT, `AssignedAt` TEXT, `CreatedOn` TEXT, `ReportChecker` TEXT, `Status` TEXT, `ReportDispatcher` TEXT, `FieldStaff` TEXT, `AssignedTo` TEXT, `ReportMaker` TEXT, `ReportFinalizer` TEXT, `PropertyId` TEXT, `ReportFile` TEXT, `ReportId` TEXT, `ReportTemplateId` TEXT, `Signature1` TEXT, `PropertyCategoryId` TEXT, `count` TEXT, `Signature2` TEXT, `EmployeeName` TEXT, `Role` TEXT, `StatusId` TEXT, `TypeDescription` TEXT, `Name` TEXT, `TypeOfPropertyId` TEXT, `Id` TEXT, `DocumentName` TEXT, `VisibleToFieldStaff` TEXT, `Title` TEXT, `Document` TEXT, `BankBranchName` TEXT, `AgencyBranchId` TEXT, `opencase` INTEGER NOT NULL, `offlinecase` INTEGER NOT NULL, `showoffline` INTEGER NOT NULL, `current_offline` INTEGER NOT NULL, `updatecasestatus` TEXT, `rejectmessage` TEXT, `is_property_changed` INTEGER NOT NULL, `typeof_PropertyCategoryId_selected` TEXT, `sync_edit` INTEGER NOT NULL, `ReportName` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TypeOfProperty` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `TypeOfPropertyId` INTEGER NOT NULL, `Name` TEXT, `isActive` TEXT, `PropertyCategoryId` TEXT, `CreatedOn` TEXT, `CreatedBy` TEXT, `ModifiedOn` TEXT, `ModifiedBy` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PropertyUpdateRoomDB` (`property_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseid` TEXT, `property_type` TEXT, `property_category_id` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CaseModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CaseId` INTEGER NOT NULL, `AgencyBranchId` INTEGER NOT NULL, `BankBranchId` INTEGER NOT NULL, `PropertyId` INTEGER NOT NULL, `CustomerId` INTEGER NOT NULL, `FeesId` INTEGER NOT NULL, `WorkflowId` TEXT, `ReportId` INTEGER NOT NULL, `ReportTemplateId` INTEGER NOT NULL, `AgencyBranch` TEXT, `ApplicantName` TEXT, `ApplicantContactNo` TEXT, `ContactPersonName` TEXT, `ContactPersonNumber` TEXT, `BankContactPersonName` TEXT, `BankContactPersonNumber` TEXT, `BankContactPersonEmail` TEXT, `LoanType` TEXT, `BankReferenceNO` TEXT, `ApplicantEmailId` TEXT, `ApplicantAddress` TEXT, `ReportType` INTEGER NOT NULL, `ReportFile` INTEGER NOT NULL, `BankName` TEXT, `BranchName` TEXT, `PropertyAddress` TEXT, `Pincode` INTEGER NOT NULL, `PropertyType` INTEGER NOT NULL, `ProfessionalFees` TEXT, `PropertyCity` INTEGER NOT NULL, `PropertyLocality` TEXT, `VillageName` TEXT, `District` TEXT, `Taluka` TEXT, `Purpose` TEXT, `TaxType` TEXT, `Status` INTEGER NOT NULL, `AssignedTo` INTEGER NOT NULL, `AssignedBy` INTEGER NOT NULL, `AssignedAt` TEXT, `AmountReceived` INTEGER NOT NULL, `FieldStaff` INTEGER NOT NULL, `ReportMaker` INTEGER NOT NULL, `ReportChecker` TEXT, `ReportFinalizer` TEXT, `ReportDispatcher` TEXT, `Telecaller` TEXT, `CaseSourced` TEXT, `SourcedBy` TEXT, `GharvalueCity` TEXT, `GharvalueLocality` TEXT, `GharvaluePropertyName` TEXT, `CustomerFeedbackReceived` TEXT, `BankFeedbackReceived` TEXT, `AppointmentDateTime` TEXT, `SubmittedTo` TEXT, `CreatedOn` TEXT, `CreatedBy` INTEGER NOT NULL, `ModifiedOn` TEXT, `ModifiedBy` INTEGER NOT NULL, `Signature1` TEXT, `Signature2` TEXT, `AcceptanceTime` REAL NOT NULL, `InspectionTime` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PropertyModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CaseId` INTEGER NOT NULL, `propertyId` INTEGER NOT NULL, `employeeId` INTEGER NOT NULL, `applicantAddress` TEXT, `landmark` TEXT, `purpose` TEXT, `nameOfPurchaser` TEXT, `propertyAddress` TEXT, `municipalWard` TEXT, `isWithinMunicipalArea` INTEGER, `isPropertyInDemolitionList` INTEGER, `villageName` TEXT, `colonyName` TEXT, `unitNo` TEXT, `plotNo` TEXT, `surveyNo` TEXT, `ctsNo` TEXT, `areaOfPlot` TEXT, `variable` TEXT, `surveyInPresenceOf` TEXT, `nearestStation` TEXT, `distance` TEXT, `presentlyOccupiedId` TEXT, `presentlyOccupied` TEXT, `nameOfSeller` TEXT, `boundryNorth` TEXT, `boundrySouth` TEXT, `boundryEast` TEXT, `boundryWest` TEXT, `docBoundryNorth` TEXT, `docBoundrySouth` TEXT, `docBoundryEast` TEXT, `docBoundryWest` TEXT, `matchBoundaryNorth` TEXT, `matchBoundarySouth` TEXT, `matchBoundaryEast` TEXT, `matchBoundaryWest` TEXT, `northMeasure` TEXT, `southMeasure` TEXT, `eastMeasure` TEXT, `westMeasure` TEXT, `docNorthMeasure` TEXT, `docSouthMeasure` TEXT, `docEastMeasure` TEXT, `docWestMeasure` TEXT, `boundaryMeasureUnit` TEXT, `docSetBackLeft` TEXT, `docSetBackRight` TEXT, `docSetBackFront` TEXT, `docSetBackRear` TEXT, `setBackLeft` TEXT, `setBackRight` TEXT, `setBackFront` TEXT, `setBackRear` TEXT, `typeOfPropertyId` INTEGER NOT NULL, `flatHallNo` TEXT, `flatKitchenNo` TEXT, `flatBedroomNo` TEXT, `flatDinningNo` TEXT, `flatBathNo` TEXT, `flatWcNo` TEXT, `flatAttBathWcNo` TEXT, `flatPassageNo` TEXT, `flatBalconyNo` TEXT, `flatFbNo` TEXT, `flatDbNo` TEXT, `flatTerraceNo` TEXT, `intFloorId` TEXT, `intKitchenType` TEXT, `intKitchenShape` TEXT, `intWindowId` TEXT, `intDoorId` TEXT, `intWcId` TEXT, `intBathId` TEXT, `intPaintId` TEXT, `intPop` TEXT, `typeOfStructureId` TEXT, `noOfFloors` TEXT, `podiums` TEXT, `basement` TEXT, `noOfLiftInBuilding` TEXT, `noOfFlatPerFloor` TEXT, `constructionId` TEXT, `underconstructionLoading` TEXT, `plinthComp` TEXT, `rccComp` TEXT, `brickWorkComp` TEXT, `plasteringIntComp` TEXT, `plasteringExtComp` TEXT, `flooringComp` TEXT, `electricComp` TEXT, `plumbingComp` TEXT, `woodworkComp` TEXT, `paintingComp` TEXT, `presentConditionId` TEXT, `qualityConstructionId` TEXT, `ageOfProperty` TEXT, `residualLife` TEXT, `typeOfBuildingId` TEXT, `maintenanceOfBuildingId` TEXT, `exteriorPaintId` TEXT, `gardenExist` TEXT, `seperateCompoundId` TEXT, `pavingAroundBuildingId` TEXT, `carParkingId` TEXT, `waterAvailabilityId` TEXT, `amenityQualityId` TEXT, `fittingQualityId` TEXT, `amenities` TEXT, `wingNo` TEXT, `wingName` TEXT, `documentSeenId` TEXT, `nameOfSociety` TEXT, `societyRegnNo` TEXT, `propertyTaxReceiptNo` TEXT, `propertyTaxAmount` TEXT, `propertyTaxYear` TEXT, `shareCertificateNo` TEXT, `shareCertificateNoOfShares` TEXT, `shareCertificateFaceValue` TEXT, `shareCertificateDistinctiveNo` TEXT, `planApprovedById` TEXT, `commencementNo` TEXT, `commencementDate` TEXT, `occupancyNo` TEXT, `occupancyDate` TEXT, `premisesDetails` TEXT, `stampDutyDate` TEXT, `agreementDate` TEXT, `agreementAmount` TEXT, `registrationNo` TEXT, `registrationDate` TEXT, `registrationValue` TEXT, `remarks` TEXT, `otherRemarks` TEXT, `specialRemarks` TEXT, `otherDocuments` TEXT, `registrationReceiptNo` TEXT, `registrarsValue` TEXT, `hallDim` TEXT, `kitchenDim` TEXT, `bedroomDim` TEXT, `dinningDim` TEXT, `passageDim` TEXT, `wcDim` TEXT, `bathDim` TEXT, `wbDim` TEXT, `fbDim` TEXT, `dbDim` TEXT, `balconyDim` TEXT, `terraceDim` TEXT, `latLongDetails` TEXT, `brokerDetails` TEXT, `totalMeasurement` TEXT, `gharvalueInterior` TEXT, `describeInteriors` TEXT, `gharvalueAmenities` TEXT, `describeAmenities` TEXT, `gharvalueLocation` TEXT, `describeLocation` TEXT, `plotDemarcatedAtSite` INTEGER, `propertyIdentificationChannelId` TEXT, `passageTypeId` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedOn` TEXT, `modifiedBy` INTEGER NOT NULL, `marketabilityId` TEXT, `propertyAddressAtSite` TEXT, `sameAsDocumentAddress` INTEGER, `sameAsDocumentBoundary` INTEGER, `sameAsDocumentDimension` INTEGER, `sameAsDocumentSetBack` INTEGER, `approachRoadConditionId` INTEGER, `localityCategoryId` INTEGER, `classId` INTEGER, `tenureId` INTEGER, `typeOfLandId` INTEGER, `typeLocalityId` INTEGER, `NameofVendor` TEXT, `NameofVendorId` INTEGER, `NameOfOccupant` TEXT, `RelationWithOwner` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `IndPropertyModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `noOfFloors` INTEGER NOT NULL, `approvedNoOfFloors` INTEGER NOT NULL, `floorDetails` TEXT, `propertyActualUsageId` TEXT, `totalApartmentFloors` TEXT, `totalFlatsPerFloor` TEXT, `flatSituatedInFloor` TEXT, `documentLandArea` TEXT, `isCompounded` INTEGER, `documentLandAreaUnit` INTEGER NOT NULL, `measuredLandArea` TEXT, `measuredLandAreaUnit` INTEGER NOT NULL, `avgPercentageCompletion` TEXT, `documentFloorAreaTotal` TEXT, `measuredFloorAreaTotal` TEXT, `typeOfStructureId` TEXT, `floorHeight` TEXT, `yearsOfCurrentTenancy` TEXT, `rentalIncome` TEXT, `basement` TEXT, `noOfLiftInBuilding` TEXT, `exteriorPaintId` TEXT, `carParkingId` TEXT, `waterAvailabilityId` TEXT, `amenities` TEXT, `wingName` TEXT, `intFloorId` TEXT, `intWindowId` TEXT, `intDoorId` TEXT, `intWcId` TEXT, `intPaintId` TEXT, `intRoofId` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedOn` TEXT, `modifiedBy` INTEGER NOT NULL, `floorKindId` INTEGER NOT NULL, `wingNo` INTEGER, `intPop` INTEGER, `gardenExist` INTEGER, `seperateCompoundId` INTEGER, `passageTypeId` INTEGER, `marketabilityId` INTEGER, `fittingQualityId` INTEGER, `maintenanceOfBuildingId` INTEGER, `typeOfBuildingId` INTEGER, `qualityConstructionId` INTEGER, `intBathId` INTEGER, `amenityQualityId` INTEGER, `intKitchenType` INTEGER, `intKitchenShape` INTEGER, `pavingAroundBuildingId` TEXT, `LandAreaDescription` TEXT, `NumberOfBuildings` TEXT, `TypeOfCompound` INTEGER, `NameOfTenant` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `IndPropertyValuationModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `guidelineRate` TEXT, `guidelineRateUnit` TEXT, `guidelineValue` TEXT, `documentLandRate` TEXT, `documentLandValue` TEXT, `measuredLandRate` TEXT, `measuredLandValue` TEXT, `documentedLandValueSel` INTEGER, `measuredLandValueSel` INTEGER, `documentedConstrValueSel` INTEGER, `measuredConstrValueSel` INTEGER, `totalConstructionValue` TEXT, `totalPropertyValue` TEXT, `buildingDepreciationValue` TEXT, `proposedValuation` TEXT, `proposedValuationComments` TEXT, `totalValueAtCompletion` TEXT, `insuranceValue` TEXT, `realizationPercentage` TEXT, `distressPercentage` TEXT, `realizationValue` TEXT, `distressValue` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedOn` TEXT, `modifiedBy` INTEGER NOT NULL, `completionPercentage` TEXT, `totalPropertyValueDepreciation` TEXT, `distressValueDepreciation` TEXT, `carpetAreaPercentage` TEXT, `carpetAreaTypeId` TEXT, `realizationValueDepreciation` TEXT, `realizationLandValue` TEXT, `constructionDLCRate` TEXT, `constructionDLCRateUnit` TEXT, `constructionDLCValue` TEXT, `carpetArea` TEXT, `buildUpArea` TEXT, `superBuildUpArea` TEXT, `carpetAreaUnit` TEXT, `selectedConstructionArea` TEXT, `bAULoadingPercentage` TEXT, `constructionRate` TEXT, `insuredConstructionRate` TEXT, `terraceArea` TEXT, `terraceRate` TEXT, `terraceValue` TEXT, `SaleableLoadingPercentage` TEXT, `BalconyArea` TEXT, `BalconyRate` TEXT, `BalconyValue` TEXT, `RealizationPercentageAsOnDate` TEXT, `DistressPercentageAsOnDate` TEXT, `RealizationValueAsOnDate` TEXT, `DistressValueAsOnDate` TEXT, `AdditionalDescription` TEXT, `AdditionalDescriptionValue` TEXT, `SelectedCarpetAreaTypeId` TEXT, `GovernmentArea` TEXT, `InsuranceArea` TEXT, `OtlaArea` TEXT, `OtlaRate` TEXT, `OtlaValue` TEXT, `MezzanineArea` TEXT, `MezzanineRate` TEXT, `MezzanineValue` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `IndPropertyFloorModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `floorNo` INTEGER NOT NULL, `floorName` TEXT, `constructionStageId` INTEGER NOT NULL, `percentageCompletion` INTEGER, `presentConditionId` TEXT, `propertyAge` INTEGER, `residualLife` INTEGER, `propertyFloorUsageId` TEXT, `documentFloorArea` TEXT, `documentFloorAreaUnit` TEXT, `measuredFloorArea` TEXT, `measuredFloorAreaUnit` TEXT, `flatHallNo` INTEGER NOT NULL, `flatKitchenNo` INTEGER NOT NULL, `flatBedroomNo` INTEGER NOT NULL, `flatDinningNo` INTEGER NOT NULL, `flatBathNo` INTEGER NOT NULL, `flatWcNo` INTEGER NOT NULL, `flatAttBathWcNo` INTEGER NOT NULL, `flatBalconyNo` INTEGER NOT NULL, `shopNo` INTEGER NOT NULL, `officeNo` INTEGER NOT NULL, `intFloorId` TEXT, `intKitchenType` TEXT, `intKitchenShape` TEXT, `intWindowId` TEXT, `intDoorId` TEXT, `intWcId` TEXT, `intBathId` TEXT, `intPaintId` TEXT, `intPop` INTEGER, `intRoofId` TEXT, `passageTypeId` TEXT, `typeOfStructureId` INTEGER NOT NULL, `floorHeight` TEXT, `yearsOfCurrentTenancy` TEXT, `rentalIncome` TEXT, `percentageDepreciation` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedOn` TEXT, `modifiedBy` INTEGER NOT NULL, `presentCondition` TEXT, `PropertyFloorUsageId_str` TEXT, `FlatFbNo` INTEGER NOT NULL, `FlatDbNo` INTEGER NOT NULL, `FlatTerraceNo` INTEGER NOT NULL, `FlatPassageNo` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `IndPropertyFloorsValuationModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `floorNo` INTEGER NOT NULL, `documentConstrRate` TEXT, `documentConstrValue` TEXT, `measuredConstrRate` TEXT, `measuredConstrValue` TEXT, `floorDepreciationValue` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedBy` INTEGER NOT NULL, `floorCarpetArea` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ProximityModal` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `caseId` INTEGER NOT NULL, `proximityId` INTEGER NOT NULL, `proximityName` TEXT, `proximityDistance` TEXT, `createdOn` TEXT, `createdBy` INTEGER NOT NULL, `modifiedOn` TEXT, `modifiedBy` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `GetPhotoModel` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Id` INTEGER NOT NULL, `Logo` TEXT, `Title` TEXT, `newimage` INTEGER NOT NULL, `defaultimage` INTEGER NOT NULL, `PropertyId` INTEGER NOT NULL, `Filename` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CaseDetail` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT, `caseid` TEXT, `caseObj` TEXT, `propertyObj` TEXT, `indpropertyObj` TEXT, `indpropertyvaluationObj` TEXT, `indpropertyfloorsObj` TEXT, `indpropertyfloorsvaluationObj` TEXT, `proximityObj` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OflineCase` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `PropertyId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Document_list` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Id` TEXT, `DocumentName` TEXT, `VisibleToFieldStaff` TEXT, `Title` TEXT, `Document` TEXT, `CaseId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LatLongDetails` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `caseId` INTEGER NOT NULL, `latLongDetails` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `GetPhoto_measurmentModel` (`dummyID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Id` INTEGER NOT NULL, `Logo` TEXT, `Title` TEXT, `newimage` INTEGER NOT NULL, `defaultimage` INTEGER NOT NULL, `PropertyId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d2c88c1baa05a96048d48cc50cc10d76\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `DataModel`");
        _db.execSQL("DROP TABLE IF EXISTS `OfflineDataModel`");
        _db.execSQL("DROP TABLE IF EXISTS `TypeOfProperty`");
        _db.execSQL("DROP TABLE IF EXISTS `PropertyUpdateRoomDB`");
        _db.execSQL("DROP TABLE IF EXISTS `CaseModal`");
        _db.execSQL("DROP TABLE IF EXISTS `PropertyModal`");
        _db.execSQL("DROP TABLE IF EXISTS `IndPropertyModal`");
        _db.execSQL("DROP TABLE IF EXISTS `IndPropertyValuationModal`");
        _db.execSQL("DROP TABLE IF EXISTS `IndPropertyFloorModal`");
        _db.execSQL("DROP TABLE IF EXISTS `IndPropertyFloorsValuationModal`");
        _db.execSQL("DROP TABLE IF EXISTS `ProximityModal`");
        _db.execSQL("DROP TABLE IF EXISTS `GetPhotoModel`");
        _db.execSQL("DROP TABLE IF EXISTS `CaseDetail`");
        _db.execSQL("DROP TABLE IF EXISTS `OflineCase`");
        _db.execSQL("DROP TABLE IF EXISTS `Document_list`");
        _db.execSQL("DROP TABLE IF EXISTS `LatLongDetails`");
        _db.execSQL("DROP TABLE IF EXISTS `GetPhoto_measurmentModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDataModel = new HashMap<String, TableInfo.Column>(66);
        _columnsDataModel.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsDataModel.put("CaseId", new TableInfo.Column("CaseId", "TEXT", false, 0));
        _columnsDataModel.put("_id", new TableInfo.Column("_id", "TEXT", false, 0));
        _columnsDataModel.put("IsExternal", new TableInfo.Column("IsExternal", "TEXT", false, 0));
        _columnsDataModel.put("OTP", new TableInfo.Column("OTP", "TEXT", false, 0));
        _columnsDataModel.put("Email", new TableInfo.Column("Email", "TEXT", false, 0));
        _columnsDataModel.put("LoginId", new TableInfo.Column("LoginId", "TEXT", false, 0));
        _columnsDataModel.put("EmployeeId", new TableInfo.Column("EmployeeId", "TEXT", false, 0));
        _columnsDataModel.put("FirstName", new TableInfo.Column("FirstName", "TEXT", false, 0));
        _columnsDataModel.put("RoleId", new TableInfo.Column("RoleId", "TEXT", false, 0));
        _columnsDataModel.put("LastName", new TableInfo.Column("LastName", "TEXT", false, 0));
        _columnsDataModel.put("Mobile", new TableInfo.Column("Mobile", "TEXT", false, 0));
        _columnsDataModel.put("AgencyId", new TableInfo.Column("AgencyId", "TEXT", false, 0));
        _columnsDataModel.put("BranchId", new TableInfo.Column("BranchId", "TEXT", false, 0));
        _columnsDataModel.put("AgencyName", new TableInfo.Column("AgencyName", "TEXT", false, 0));
        _columnsDataModel.put("CityName", new TableInfo.Column("CityName", "TEXT", false, 0));
        _columnsDataModel.put("AgencyCode", new TableInfo.Column("AgencyCode", "TEXT", false, 0));
        _columnsDataModel.put("RoleDescription", new TableInfo.Column("RoleDescription", "TEXT", false, 0));
        _columnsDataModel.put("empId", new TableInfo.Column("empId", "TEXT", false, 0));
        _columnsDataModel.put("startDate", new TableInfo.Column("startDate", "TEXT", false, 0));
        _columnsDataModel.put("endDate", new TableInfo.Column("endDate", "TEXT", false, 0));
        _columnsDataModel.put("initQueryUrl", new TableInfo.Column("initQueryUrl", "TEXT", false, 0));
        _columnsDataModel.put("ApplicantName", new TableInfo.Column("ApplicantName", "TEXT", false, 0));
        _columnsDataModel.put("ApplicantContactNo", new TableInfo.Column("ApplicantContactNo", "TEXT", false, 0));
        _columnsDataModel.put("PropertyAddress", new TableInfo.Column("PropertyAddress", "TEXT", false, 0));
        _columnsDataModel.put("ContactPersonName", new TableInfo.Column("ContactPersonName", "TEXT", false, 0));
        _columnsDataModel.put("ContactPersonNumber", new TableInfo.Column("ContactPersonNumber", "TEXT", false, 0));
        _columnsDataModel.put("BankName", new TableInfo.Column("BankName", "TEXT", false, 0));
        _columnsDataModel.put("BankId", new TableInfo.Column("BankId", "TEXT", false, 0));
        _columnsDataModel.put("PropertyType", new TableInfo.Column("PropertyType", "TEXT", false, 0));
        _columnsDataModel.put("TypeID", new TableInfo.Column("TypeID", "TEXT", false, 0));
        _columnsDataModel.put("AssignedAt", new TableInfo.Column("AssignedAt", "TEXT", false, 0));
        _columnsDataModel.put("CreatedOn", new TableInfo.Column("CreatedOn", "TEXT", false, 0));
        _columnsDataModel.put("ReportChecker", new TableInfo.Column("ReportChecker", "TEXT", false, 0));
        _columnsDataModel.put("Status", new TableInfo.Column("Status", "TEXT", false, 0));
        _columnsDataModel.put("ReportDispatcher", new TableInfo.Column("ReportDispatcher", "TEXT", false, 0));
        _columnsDataModel.put("FieldStaff", new TableInfo.Column("FieldStaff", "TEXT", false, 0));
        _columnsDataModel.put("AssignedTo", new TableInfo.Column("AssignedTo", "TEXT", false, 0));
        _columnsDataModel.put("ReportMaker", new TableInfo.Column("ReportMaker", "TEXT", false, 0));
        _columnsDataModel.put("ReportFinalizer", new TableInfo.Column("ReportFinalizer", "TEXT", false, 0));
        _columnsDataModel.put("PropertyId", new TableInfo.Column("PropertyId", "TEXT", false, 0));
        _columnsDataModel.put("ReportFile", new TableInfo.Column("ReportFile", "TEXT", false, 0));
        _columnsDataModel.put("ReportId", new TableInfo.Column("ReportId", "TEXT", false, 0));
        _columnsDataModel.put("ReportTemplateId", new TableInfo.Column("ReportTemplateId", "TEXT", false, 0));
        _columnsDataModel.put("Signature1", new TableInfo.Column("Signature1", "TEXT", false, 0));
        _columnsDataModel.put("PropertyCategoryId", new TableInfo.Column("PropertyCategoryId", "TEXT", false, 0));
        _columnsDataModel.put("count", new TableInfo.Column("count", "TEXT", false, 0));
        _columnsDataModel.put("Signature2", new TableInfo.Column("Signature2", "TEXT", false, 0));
        _columnsDataModel.put("EmployeeName", new TableInfo.Column("EmployeeName", "TEXT", false, 0));
        _columnsDataModel.put("Role", new TableInfo.Column("Role", "TEXT", false, 0));
        _columnsDataModel.put("StatusId", new TableInfo.Column("StatusId", "TEXT", false, 0));
        _columnsDataModel.put("TypeDescription", new TableInfo.Column("TypeDescription", "TEXT", false, 0));
        _columnsDataModel.put("Name", new TableInfo.Column("Name", "TEXT", false, 0));
        _columnsDataModel.put("TypeOfPropertyId", new TableInfo.Column("TypeOfPropertyId", "TEXT", false, 0));
        _columnsDataModel.put("Id", new TableInfo.Column("Id", "TEXT", false, 0));
        _columnsDataModel.put("DocumentName", new TableInfo.Column("DocumentName", "TEXT", false, 0));
        _columnsDataModel.put("VisibleToFieldStaff", new TableInfo.Column("VisibleToFieldStaff", "TEXT", false, 0));
        _columnsDataModel.put("Title", new TableInfo.Column("Title", "TEXT", false, 0));
        _columnsDataModel.put("Document", new TableInfo.Column("Document", "TEXT", false, 0));
        _columnsDataModel.put("BankBranchName", new TableInfo.Column("BankBranchName", "TEXT", false, 0));
        _columnsDataModel.put("AgencyBranchId", new TableInfo.Column("AgencyBranchId", "TEXT", false, 0));
        _columnsDataModel.put("opencase", new TableInfo.Column("opencase", "INTEGER", true, 0));
        _columnsDataModel.put("offlinecase", new TableInfo.Column("offlinecase", "INTEGER", true, 0));
        _columnsDataModel.put("showoffline", new TableInfo.Column("showoffline", "INTEGER", true, 0));
        _columnsDataModel.put("ReportName", new TableInfo.Column("ReportName", "TEXT", false, 0));
        _columnsDataModel.put("pendingcase", new TableInfo.Column("pendingcase", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDataModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDataModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDataModel = new TableInfo("DataModel", _columnsDataModel, _foreignKeysDataModel, _indicesDataModel);
        final TableInfo _existingDataModel = TableInfo.read(_db, "DataModel");
        if (! _infoDataModel.equals(_existingDataModel)) {
          throw new IllegalStateException("Migration didn't properly handle DataModel(com.realappraiser.associatedvaluers.communicator.DataModel).\n"
                  + " Expected:\n" + _infoDataModel + "\n"
                  + " Found:\n" + _existingDataModel);
        }
        final HashMap<String, TableInfo.Column> _columnsOfflineDataModel = new HashMap<String, TableInfo.Column>(71);
        _columnsOfflineDataModel.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsOfflineDataModel.put("CaseId", new TableInfo.Column("CaseId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("_id", new TableInfo.Column("_id", "TEXT", false, 0));
        _columnsOfflineDataModel.put("IsExternal", new TableInfo.Column("IsExternal", "TEXT", false, 0));
        _columnsOfflineDataModel.put("OTP", new TableInfo.Column("OTP", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Email", new TableInfo.Column("Email", "TEXT", false, 0));
        _columnsOfflineDataModel.put("LoginId", new TableInfo.Column("LoginId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("EmployeeId", new TableInfo.Column("EmployeeId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("FirstName", new TableInfo.Column("FirstName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("RoleId", new TableInfo.Column("RoleId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("LastName", new TableInfo.Column("LastName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Mobile", new TableInfo.Column("Mobile", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AgencyId", new TableInfo.Column("AgencyId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("BranchId", new TableInfo.Column("BranchId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AgencyName", new TableInfo.Column("AgencyName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("CityName", new TableInfo.Column("CityName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AgencyCode", new TableInfo.Column("AgencyCode", "TEXT", false, 0));
        _columnsOfflineDataModel.put("RoleDescription", new TableInfo.Column("RoleDescription", "TEXT", false, 0));
        _columnsOfflineDataModel.put("empId", new TableInfo.Column("empId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("startDate", new TableInfo.Column("startDate", "TEXT", false, 0));
        _columnsOfflineDataModel.put("endDate", new TableInfo.Column("endDate", "TEXT", false, 0));
        _columnsOfflineDataModel.put("initQueryUrl", new TableInfo.Column("initQueryUrl", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ApplicantName", new TableInfo.Column("ApplicantName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ApplicantContactNo", new TableInfo.Column("ApplicantContactNo", "TEXT", false, 0));
        _columnsOfflineDataModel.put("PropertyAddress", new TableInfo.Column("PropertyAddress", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ContactPersonName", new TableInfo.Column("ContactPersonName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ContactPersonNumber", new TableInfo.Column("ContactPersonNumber", "TEXT", false, 0));
        _columnsOfflineDataModel.put("BankName", new TableInfo.Column("BankName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("BankId", new TableInfo.Column("BankId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("PropertyType", new TableInfo.Column("PropertyType", "TEXT", false, 0));
        _columnsOfflineDataModel.put("TypeID", new TableInfo.Column("TypeID", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AssignedAt", new TableInfo.Column("AssignedAt", "TEXT", false, 0));
        _columnsOfflineDataModel.put("CreatedOn", new TableInfo.Column("CreatedOn", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportChecker", new TableInfo.Column("ReportChecker", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Status", new TableInfo.Column("Status", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportDispatcher", new TableInfo.Column("ReportDispatcher", "TEXT", false, 0));
        _columnsOfflineDataModel.put("FieldStaff", new TableInfo.Column("FieldStaff", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AssignedTo", new TableInfo.Column("AssignedTo", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportMaker", new TableInfo.Column("ReportMaker", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportFinalizer", new TableInfo.Column("ReportFinalizer", "TEXT", false, 0));
        _columnsOfflineDataModel.put("PropertyId", new TableInfo.Column("PropertyId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportFile", new TableInfo.Column("ReportFile", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportId", new TableInfo.Column("ReportId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("ReportTemplateId", new TableInfo.Column("ReportTemplateId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Signature1", new TableInfo.Column("Signature1", "TEXT", false, 0));
        _columnsOfflineDataModel.put("PropertyCategoryId", new TableInfo.Column("PropertyCategoryId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("count", new TableInfo.Column("count", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Signature2", new TableInfo.Column("Signature2", "TEXT", false, 0));
        _columnsOfflineDataModel.put("EmployeeName", new TableInfo.Column("EmployeeName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Role", new TableInfo.Column("Role", "TEXT", false, 0));
        _columnsOfflineDataModel.put("StatusId", new TableInfo.Column("StatusId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("TypeDescription", new TableInfo.Column("TypeDescription", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Name", new TableInfo.Column("Name", "TEXT", false, 0));
        _columnsOfflineDataModel.put("TypeOfPropertyId", new TableInfo.Column("TypeOfPropertyId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Id", new TableInfo.Column("Id", "TEXT", false, 0));
        _columnsOfflineDataModel.put("DocumentName", new TableInfo.Column("DocumentName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("VisibleToFieldStaff", new TableInfo.Column("VisibleToFieldStaff", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Title", new TableInfo.Column("Title", "TEXT", false, 0));
        _columnsOfflineDataModel.put("Document", new TableInfo.Column("Document", "TEXT", false, 0));
        _columnsOfflineDataModel.put("BankBranchName", new TableInfo.Column("BankBranchName", "TEXT", false, 0));
        _columnsOfflineDataModel.put("AgencyBranchId", new TableInfo.Column("AgencyBranchId", "TEXT", false, 0));
        _columnsOfflineDataModel.put("opencase", new TableInfo.Column("opencase", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("offlinecase", new TableInfo.Column("offlinecase", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("showoffline", new TableInfo.Column("showoffline", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("current_offline", new TableInfo.Column("current_offline", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("updatecasestatus", new TableInfo.Column("updatecasestatus", "TEXT", false, 0));
        _columnsOfflineDataModel.put("rejectmessage", new TableInfo.Column("rejectmessage", "TEXT", false, 0));
        _columnsOfflineDataModel.put("is_property_changed", new TableInfo.Column("is_property_changed", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("typeof_PropertyCategoryId_selected", new TableInfo.Column("typeof_PropertyCategoryId_selected", "TEXT", false, 0));
        _columnsOfflineDataModel.put("sync_edit", new TableInfo.Column("sync_edit", "INTEGER", true, 0));
        _columnsOfflineDataModel.put("ReportName", new TableInfo.Column("ReportName", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOfflineDataModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOfflineDataModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOfflineDataModel = new TableInfo("OfflineDataModel", _columnsOfflineDataModel, _foreignKeysOfflineDataModel, _indicesOfflineDataModel);
        final TableInfo _existingOfflineDataModel = TableInfo.read(_db, "OfflineDataModel");
        if (! _infoOfflineDataModel.equals(_existingOfflineDataModel)) {
          throw new IllegalStateException("Migration didn't properly handle OfflineDataModel(com.realappraiser.associatedvaluers.model.OfflineDataModel).\n"
                  + " Expected:\n" + _infoOfflineDataModel + "\n"
                  + " Found:\n" + _existingOfflineDataModel);
        }
        final HashMap<String, TableInfo.Column> _columnsTypeOfProperty = new HashMap<String, TableInfo.Column>(9);
        _columnsTypeOfProperty.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsTypeOfProperty.put("TypeOfPropertyId", new TableInfo.Column("TypeOfPropertyId", "INTEGER", true, 0));
        _columnsTypeOfProperty.put("Name", new TableInfo.Column("Name", "TEXT", false, 0));
        _columnsTypeOfProperty.put("isActive", new TableInfo.Column("isActive", "TEXT", false, 0));
        _columnsTypeOfProperty.put("PropertyCategoryId", new TableInfo.Column("PropertyCategoryId", "TEXT", false, 0));
        _columnsTypeOfProperty.put("CreatedOn", new TableInfo.Column("CreatedOn", "TEXT", false, 0));
        _columnsTypeOfProperty.put("CreatedBy", new TableInfo.Column("CreatedBy", "TEXT", false, 0));
        _columnsTypeOfProperty.put("ModifiedOn", new TableInfo.Column("ModifiedOn", "TEXT", false, 0));
        _columnsTypeOfProperty.put("ModifiedBy", new TableInfo.Column("ModifiedBy", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTypeOfProperty = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTypeOfProperty = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTypeOfProperty = new TableInfo("TypeOfProperty", _columnsTypeOfProperty, _foreignKeysTypeOfProperty, _indicesTypeOfProperty);
        final TableInfo _existingTypeOfProperty = TableInfo.read(_db, "TypeOfProperty");
        if (! _infoTypeOfProperty.equals(_existingTypeOfProperty)) {
          throw new IllegalStateException("Migration didn't properly handle TypeOfProperty(com.realappraiser.associatedvaluers.model.TypeOfProperty).\n"
                  + " Expected:\n" + _infoTypeOfProperty + "\n"
                  + " Found:\n" + _existingTypeOfProperty);
        }
        final HashMap<String, TableInfo.Column> _columnsPropertyUpdateRoomDB = new HashMap<String, TableInfo.Column>(4);
        _columnsPropertyUpdateRoomDB.put("property_id", new TableInfo.Column("property_id", "INTEGER", true, 1));
        _columnsPropertyUpdateRoomDB.put("caseid", new TableInfo.Column("caseid", "TEXT", false, 0));
        _columnsPropertyUpdateRoomDB.put("property_type", new TableInfo.Column("property_type", "TEXT", false, 0));
        _columnsPropertyUpdateRoomDB.put("property_category_id", new TableInfo.Column("property_category_id", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPropertyUpdateRoomDB = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPropertyUpdateRoomDB = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPropertyUpdateRoomDB = new TableInfo("PropertyUpdateRoomDB", _columnsPropertyUpdateRoomDB, _foreignKeysPropertyUpdateRoomDB, _indicesPropertyUpdateRoomDB);
        final TableInfo _existingPropertyUpdateRoomDB = TableInfo.read(_db, "PropertyUpdateRoomDB");
        if (! _infoPropertyUpdateRoomDB.equals(_existingPropertyUpdateRoomDB)) {
          throw new IllegalStateException("Migration didn't properly handle PropertyUpdateRoomDB(com.realappraiser.associatedvaluers.model.PropertyUpdateRoomDB).\n"
                  + " Expected:\n" + _infoPropertyUpdateRoomDB + "\n"
                  + " Found:\n" + _existingPropertyUpdateRoomDB);
        }
        final HashMap<String, TableInfo.Column> _columnsCaseModal = new HashMap<String, TableInfo.Column>(65);
        _columnsCaseModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsCaseModal.put("CaseId", new TableInfo.Column("CaseId", "INTEGER", true, 0));
        _columnsCaseModal.put("AgencyBranchId", new TableInfo.Column("AgencyBranchId", "INTEGER", true, 0));
        _columnsCaseModal.put("BankBranchId", new TableInfo.Column("BankBranchId", "INTEGER", true, 0));
        _columnsCaseModal.put("PropertyId", new TableInfo.Column("PropertyId", "INTEGER", true, 0));
        _columnsCaseModal.put("CustomerId", new TableInfo.Column("CustomerId", "INTEGER", true, 0));
        _columnsCaseModal.put("FeesId", new TableInfo.Column("FeesId", "INTEGER", true, 0));
        _columnsCaseModal.put("WorkflowId", new TableInfo.Column("WorkflowId", "TEXT", false, 0));
        _columnsCaseModal.put("ReportId", new TableInfo.Column("ReportId", "INTEGER", true, 0));
        _columnsCaseModal.put("ReportTemplateId", new TableInfo.Column("ReportTemplateId", "INTEGER", true, 0));
        _columnsCaseModal.put("AgencyBranch", new TableInfo.Column("AgencyBranch", "TEXT", false, 0));
        _columnsCaseModal.put("ApplicantName", new TableInfo.Column("ApplicantName", "TEXT", false, 0));
        _columnsCaseModal.put("ApplicantContactNo", new TableInfo.Column("ApplicantContactNo", "TEXT", false, 0));
        _columnsCaseModal.put("ContactPersonName", new TableInfo.Column("ContactPersonName", "TEXT", false, 0));
        _columnsCaseModal.put("ContactPersonNumber", new TableInfo.Column("ContactPersonNumber", "TEXT", false, 0));
        _columnsCaseModal.put("BankContactPersonName", new TableInfo.Column("BankContactPersonName", "TEXT", false, 0));
        _columnsCaseModal.put("BankContactPersonNumber", new TableInfo.Column("BankContactPersonNumber", "TEXT", false, 0));
        _columnsCaseModal.put("BankContactPersonEmail", new TableInfo.Column("BankContactPersonEmail", "TEXT", false, 0));
        _columnsCaseModal.put("LoanType", new TableInfo.Column("LoanType", "TEXT", false, 0));
        _columnsCaseModal.put("BankReferenceNO", new TableInfo.Column("BankReferenceNO", "TEXT", false, 0));
        _columnsCaseModal.put("ApplicantEmailId", new TableInfo.Column("ApplicantEmailId", "TEXT", false, 0));
        _columnsCaseModal.put("ApplicantAddress", new TableInfo.Column("ApplicantAddress", "TEXT", false, 0));
        _columnsCaseModal.put("ReportType", new TableInfo.Column("ReportType", "INTEGER", true, 0));
        _columnsCaseModal.put("ReportFile", new TableInfo.Column("ReportFile", "INTEGER", true, 0));
        _columnsCaseModal.put("BankName", new TableInfo.Column("BankName", "TEXT", false, 0));
        _columnsCaseModal.put("BranchName", new TableInfo.Column("BranchName", "TEXT", false, 0));
        _columnsCaseModal.put("PropertyAddress", new TableInfo.Column("PropertyAddress", "TEXT", false, 0));
        _columnsCaseModal.put("Pincode", new TableInfo.Column("Pincode", "INTEGER", true, 0));
        _columnsCaseModal.put("PropertyType", new TableInfo.Column("PropertyType", "INTEGER", true, 0));
        _columnsCaseModal.put("ProfessionalFees", new TableInfo.Column("ProfessionalFees", "TEXT", false, 0));
        _columnsCaseModal.put("PropertyCity", new TableInfo.Column("PropertyCity", "INTEGER", true, 0));
        _columnsCaseModal.put("PropertyLocality", new TableInfo.Column("PropertyLocality", "TEXT", false, 0));
        _columnsCaseModal.put("VillageName", new TableInfo.Column("VillageName", "TEXT", false, 0));
        _columnsCaseModal.put("District", new TableInfo.Column("District", "TEXT", false, 0));
        _columnsCaseModal.put("Taluka", new TableInfo.Column("Taluka", "TEXT", false, 0));
        _columnsCaseModal.put("Purpose", new TableInfo.Column("Purpose", "TEXT", false, 0));
        _columnsCaseModal.put("TaxType", new TableInfo.Column("TaxType", "TEXT", false, 0));
        _columnsCaseModal.put("Status", new TableInfo.Column("Status", "INTEGER", true, 0));
        _columnsCaseModal.put("AssignedTo", new TableInfo.Column("AssignedTo", "INTEGER", true, 0));
        _columnsCaseModal.put("AssignedBy", new TableInfo.Column("AssignedBy", "INTEGER", true, 0));
        _columnsCaseModal.put("AssignedAt", new TableInfo.Column("AssignedAt", "TEXT", false, 0));
        _columnsCaseModal.put("AmountReceived", new TableInfo.Column("AmountReceived", "INTEGER", true, 0));
        _columnsCaseModal.put("FieldStaff", new TableInfo.Column("FieldStaff", "INTEGER", true, 0));
        _columnsCaseModal.put("ReportMaker", new TableInfo.Column("ReportMaker", "INTEGER", true, 0));
        _columnsCaseModal.put("ReportChecker", new TableInfo.Column("ReportChecker", "TEXT", false, 0));
        _columnsCaseModal.put("ReportFinalizer", new TableInfo.Column("ReportFinalizer", "TEXT", false, 0));
        _columnsCaseModal.put("ReportDispatcher", new TableInfo.Column("ReportDispatcher", "TEXT", false, 0));
        _columnsCaseModal.put("Telecaller", new TableInfo.Column("Telecaller", "TEXT", false, 0));
        _columnsCaseModal.put("CaseSourced", new TableInfo.Column("CaseSourced", "TEXT", false, 0));
        _columnsCaseModal.put("SourcedBy", new TableInfo.Column("SourcedBy", "TEXT", false, 0));
        _columnsCaseModal.put("GharvalueCity", new TableInfo.Column("GharvalueCity", "TEXT", false, 0));
        _columnsCaseModal.put("GharvalueLocality", new TableInfo.Column("GharvalueLocality", "TEXT", false, 0));
        _columnsCaseModal.put("GharvaluePropertyName", new TableInfo.Column("GharvaluePropertyName", "TEXT", false, 0));
        _columnsCaseModal.put("CustomerFeedbackReceived", new TableInfo.Column("CustomerFeedbackReceived", "TEXT", false, 0));
        _columnsCaseModal.put("BankFeedbackReceived", new TableInfo.Column("BankFeedbackReceived", "TEXT", false, 0));
        _columnsCaseModal.put("AppointmentDateTime", new TableInfo.Column("AppointmentDateTime", "TEXT", false, 0));
        _columnsCaseModal.put("SubmittedTo", new TableInfo.Column("SubmittedTo", "TEXT", false, 0));
        _columnsCaseModal.put("CreatedOn", new TableInfo.Column("CreatedOn", "TEXT", false, 0));
        _columnsCaseModal.put("CreatedBy", new TableInfo.Column("CreatedBy", "INTEGER", true, 0));
        _columnsCaseModal.put("ModifiedOn", new TableInfo.Column("ModifiedOn", "TEXT", false, 0));
        _columnsCaseModal.put("ModifiedBy", new TableInfo.Column("ModifiedBy", "INTEGER", true, 0));
        _columnsCaseModal.put("Signature1", new TableInfo.Column("Signature1", "TEXT", false, 0));
        _columnsCaseModal.put("Signature2", new TableInfo.Column("Signature2", "TEXT", false, 0));
        _columnsCaseModal.put("AcceptanceTime", new TableInfo.Column("AcceptanceTime", "REAL", true, 0));
        _columnsCaseModal.put("InspectionTime", new TableInfo.Column("InspectionTime", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCaseModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCaseModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCaseModal = new TableInfo("CaseModal", _columnsCaseModal, _foreignKeysCaseModal, _indicesCaseModal);
        final TableInfo _existingCaseModal = TableInfo.read(_db, "CaseModal");
        if (! _infoCaseModal.equals(_existingCaseModal)) {
          throw new IllegalStateException("Migration didn't properly handle CaseModal(com.realappraiser.associatedvaluers.model.Case).\n"
                  + " Expected:\n" + _infoCaseModal + "\n"
                  + " Found:\n" + _existingCaseModal);
        }
        final HashMap<String, TableInfo.Column> _columnsPropertyModal = new HashMap<String, TableInfo.Column>(184);
        _columnsPropertyModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsPropertyModal.put("CaseId", new TableInfo.Column("CaseId", "INTEGER", true, 0));
        _columnsPropertyModal.put("propertyId", new TableInfo.Column("propertyId", "INTEGER", true, 0));
        _columnsPropertyModal.put("employeeId", new TableInfo.Column("employeeId", "INTEGER", true, 0));
        _columnsPropertyModal.put("applicantAddress", new TableInfo.Column("applicantAddress", "TEXT", false, 0));
        _columnsPropertyModal.put("landmark", new TableInfo.Column("landmark", "TEXT", false, 0));
        _columnsPropertyModal.put("purpose", new TableInfo.Column("purpose", "TEXT", false, 0));
        _columnsPropertyModal.put("nameOfPurchaser", new TableInfo.Column("nameOfPurchaser", "TEXT", false, 0));
        _columnsPropertyModal.put("propertyAddress", new TableInfo.Column("propertyAddress", "TEXT", false, 0));
        _columnsPropertyModal.put("municipalWard", new TableInfo.Column("municipalWard", "TEXT", false, 0));
        _columnsPropertyModal.put("isWithinMunicipalArea", new TableInfo.Column("isWithinMunicipalArea", "INTEGER", false, 0));
        _columnsPropertyModal.put("isPropertyInDemolitionList", new TableInfo.Column("isPropertyInDemolitionList", "INTEGER", false, 0));
        _columnsPropertyModal.put("villageName", new TableInfo.Column("villageName", "TEXT", false, 0));
        _columnsPropertyModal.put("colonyName", new TableInfo.Column("colonyName", "TEXT", false, 0));
        _columnsPropertyModal.put("unitNo", new TableInfo.Column("unitNo", "TEXT", false, 0));
        _columnsPropertyModal.put("plotNo", new TableInfo.Column("plotNo", "TEXT", false, 0));
        _columnsPropertyModal.put("surveyNo", new TableInfo.Column("surveyNo", "TEXT", false, 0));
        _columnsPropertyModal.put("ctsNo", new TableInfo.Column("ctsNo", "TEXT", false, 0));
        _columnsPropertyModal.put("areaOfPlot", new TableInfo.Column("areaOfPlot", "TEXT", false, 0));
        _columnsPropertyModal.put("variable", new TableInfo.Column("variable", "TEXT", false, 0));
        _columnsPropertyModal.put("surveyInPresenceOf", new TableInfo.Column("surveyInPresenceOf", "TEXT", false, 0));
        _columnsPropertyModal.put("nearestStation", new TableInfo.Column("nearestStation", "TEXT", false, 0));
        _columnsPropertyModal.put("distance", new TableInfo.Column("distance", "TEXT", false, 0));
        _columnsPropertyModal.put("presentlyOccupiedId", new TableInfo.Column("presentlyOccupiedId", "TEXT", false, 0));
        _columnsPropertyModal.put("presentlyOccupied", new TableInfo.Column("presentlyOccupied", "TEXT", false, 0));
        _columnsPropertyModal.put("nameOfSeller", new TableInfo.Column("nameOfSeller", "TEXT", false, 0));
        _columnsPropertyModal.put("boundryNorth", new TableInfo.Column("boundryNorth", "TEXT", false, 0));
        _columnsPropertyModal.put("boundrySouth", new TableInfo.Column("boundrySouth", "TEXT", false, 0));
        _columnsPropertyModal.put("boundryEast", new TableInfo.Column("boundryEast", "TEXT", false, 0));
        _columnsPropertyModal.put("boundryWest", new TableInfo.Column("boundryWest", "TEXT", false, 0));
        _columnsPropertyModal.put("docBoundryNorth", new TableInfo.Column("docBoundryNorth", "TEXT", false, 0));
        _columnsPropertyModal.put("docBoundrySouth", new TableInfo.Column("docBoundrySouth", "TEXT", false, 0));
        _columnsPropertyModal.put("docBoundryEast", new TableInfo.Column("docBoundryEast", "TEXT", false, 0));
        _columnsPropertyModal.put("docBoundryWest", new TableInfo.Column("docBoundryWest", "TEXT", false, 0));
        _columnsPropertyModal.put("matchBoundaryNorth", new TableInfo.Column("matchBoundaryNorth", "TEXT", false, 0));
        _columnsPropertyModal.put("matchBoundarySouth", new TableInfo.Column("matchBoundarySouth", "TEXT", false, 0));
        _columnsPropertyModal.put("matchBoundaryEast", new TableInfo.Column("matchBoundaryEast", "TEXT", false, 0));
        _columnsPropertyModal.put("matchBoundaryWest", new TableInfo.Column("matchBoundaryWest", "TEXT", false, 0));
        _columnsPropertyModal.put("northMeasure", new TableInfo.Column("northMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("southMeasure", new TableInfo.Column("southMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("eastMeasure", new TableInfo.Column("eastMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("westMeasure", new TableInfo.Column("westMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("docNorthMeasure", new TableInfo.Column("docNorthMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("docSouthMeasure", new TableInfo.Column("docSouthMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("docEastMeasure", new TableInfo.Column("docEastMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("docWestMeasure", new TableInfo.Column("docWestMeasure", "TEXT", false, 0));
        _columnsPropertyModal.put("boundaryMeasureUnit", new TableInfo.Column("boundaryMeasureUnit", "TEXT", false, 0));
        _columnsPropertyModal.put("docSetBackLeft", new TableInfo.Column("docSetBackLeft", "TEXT", false, 0));
        _columnsPropertyModal.put("docSetBackRight", new TableInfo.Column("docSetBackRight", "TEXT", false, 0));
        _columnsPropertyModal.put("docSetBackFront", new TableInfo.Column("docSetBackFront", "TEXT", false, 0));
        _columnsPropertyModal.put("docSetBackRear", new TableInfo.Column("docSetBackRear", "TEXT", false, 0));
        _columnsPropertyModal.put("setBackLeft", new TableInfo.Column("setBackLeft", "TEXT", false, 0));
        _columnsPropertyModal.put("setBackRight", new TableInfo.Column("setBackRight", "TEXT", false, 0));
        _columnsPropertyModal.put("setBackFront", new TableInfo.Column("setBackFront", "TEXT", false, 0));
        _columnsPropertyModal.put("setBackRear", new TableInfo.Column("setBackRear", "TEXT", false, 0));
        _columnsPropertyModal.put("typeOfPropertyId", new TableInfo.Column("typeOfPropertyId", "INTEGER", true, 0));
        _columnsPropertyModal.put("flatHallNo", new TableInfo.Column("flatHallNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatKitchenNo", new TableInfo.Column("flatKitchenNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatBedroomNo", new TableInfo.Column("flatBedroomNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatDinningNo", new TableInfo.Column("flatDinningNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatBathNo", new TableInfo.Column("flatBathNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatWcNo", new TableInfo.Column("flatWcNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatAttBathWcNo", new TableInfo.Column("flatAttBathWcNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatPassageNo", new TableInfo.Column("flatPassageNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatBalconyNo", new TableInfo.Column("flatBalconyNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatFbNo", new TableInfo.Column("flatFbNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatDbNo", new TableInfo.Column("flatDbNo", "TEXT", false, 0));
        _columnsPropertyModal.put("flatTerraceNo", new TableInfo.Column("flatTerraceNo", "TEXT", false, 0));
        _columnsPropertyModal.put("intFloorId", new TableInfo.Column("intFloorId", "TEXT", false, 0));
        _columnsPropertyModal.put("intKitchenType", new TableInfo.Column("intKitchenType", "TEXT", false, 0));
        _columnsPropertyModal.put("intKitchenShape", new TableInfo.Column("intKitchenShape", "TEXT", false, 0));
        _columnsPropertyModal.put("intWindowId", new TableInfo.Column("intWindowId", "TEXT", false, 0));
        _columnsPropertyModal.put("intDoorId", new TableInfo.Column("intDoorId", "TEXT", false, 0));
        _columnsPropertyModal.put("intWcId", new TableInfo.Column("intWcId", "TEXT", false, 0));
        _columnsPropertyModal.put("intBathId", new TableInfo.Column("intBathId", "TEXT", false, 0));
        _columnsPropertyModal.put("intPaintId", new TableInfo.Column("intPaintId", "TEXT", false, 0));
        _columnsPropertyModal.put("intPop", new TableInfo.Column("intPop", "TEXT", false, 0));
        _columnsPropertyModal.put("typeOfStructureId", new TableInfo.Column("typeOfStructureId", "TEXT", false, 0));
        _columnsPropertyModal.put("noOfFloors", new TableInfo.Column("noOfFloors", "TEXT", false, 0));
        _columnsPropertyModal.put("podiums", new TableInfo.Column("podiums", "TEXT", false, 0));
        _columnsPropertyModal.put("basement", new TableInfo.Column("basement", "TEXT", false, 0));
        _columnsPropertyModal.put("noOfLiftInBuilding", new TableInfo.Column("noOfLiftInBuilding", "TEXT", false, 0));
        _columnsPropertyModal.put("noOfFlatPerFloor", new TableInfo.Column("noOfFlatPerFloor", "TEXT", false, 0));
        _columnsPropertyModal.put("constructionId", new TableInfo.Column("constructionId", "TEXT", false, 0));
        _columnsPropertyModal.put("underconstructionLoading", new TableInfo.Column("underconstructionLoading", "TEXT", false, 0));
        _columnsPropertyModal.put("plinthComp", new TableInfo.Column("plinthComp", "TEXT", false, 0));
        _columnsPropertyModal.put("rccComp", new TableInfo.Column("rccComp", "TEXT", false, 0));
        _columnsPropertyModal.put("brickWorkComp", new TableInfo.Column("brickWorkComp", "TEXT", false, 0));
        _columnsPropertyModal.put("plasteringIntComp", new TableInfo.Column("plasteringIntComp", "TEXT", false, 0));
        _columnsPropertyModal.put("plasteringExtComp", new TableInfo.Column("plasteringExtComp", "TEXT", false, 0));
        _columnsPropertyModal.put("flooringComp", new TableInfo.Column("flooringComp", "TEXT", false, 0));
        _columnsPropertyModal.put("electricComp", new TableInfo.Column("electricComp", "TEXT", false, 0));
        _columnsPropertyModal.put("plumbingComp", new TableInfo.Column("plumbingComp", "TEXT", false, 0));
        _columnsPropertyModal.put("woodworkComp", new TableInfo.Column("woodworkComp", "TEXT", false, 0));
        _columnsPropertyModal.put("paintingComp", new TableInfo.Column("paintingComp", "TEXT", false, 0));
        _columnsPropertyModal.put("presentConditionId", new TableInfo.Column("presentConditionId", "TEXT", false, 0));
        _columnsPropertyModal.put("qualityConstructionId", new TableInfo.Column("qualityConstructionId", "TEXT", false, 0));
        _columnsPropertyModal.put("ageOfProperty", new TableInfo.Column("ageOfProperty", "TEXT", false, 0));
        _columnsPropertyModal.put("residualLife", new TableInfo.Column("residualLife", "TEXT", false, 0));
        _columnsPropertyModal.put("typeOfBuildingId", new TableInfo.Column("typeOfBuildingId", "TEXT", false, 0));
        _columnsPropertyModal.put("maintenanceOfBuildingId", new TableInfo.Column("maintenanceOfBuildingId", "TEXT", false, 0));
        _columnsPropertyModal.put("exteriorPaintId", new TableInfo.Column("exteriorPaintId", "TEXT", false, 0));
        _columnsPropertyModal.put("gardenExist", new TableInfo.Column("gardenExist", "TEXT", false, 0));
        _columnsPropertyModal.put("seperateCompoundId", new TableInfo.Column("seperateCompoundId", "TEXT", false, 0));
        _columnsPropertyModal.put("pavingAroundBuildingId", new TableInfo.Column("pavingAroundBuildingId", "TEXT", false, 0));
        _columnsPropertyModal.put("carParkingId", new TableInfo.Column("carParkingId", "TEXT", false, 0));
        _columnsPropertyModal.put("waterAvailabilityId", new TableInfo.Column("waterAvailabilityId", "TEXT", false, 0));
        _columnsPropertyModal.put("amenityQualityId", new TableInfo.Column("amenityQualityId", "TEXT", false, 0));
        _columnsPropertyModal.put("fittingQualityId", new TableInfo.Column("fittingQualityId", "TEXT", false, 0));
        _columnsPropertyModal.put("amenities", new TableInfo.Column("amenities", "TEXT", false, 0));
        _columnsPropertyModal.put("wingNo", new TableInfo.Column("wingNo", "TEXT", false, 0));
        _columnsPropertyModal.put("wingName", new TableInfo.Column("wingName", "TEXT", false, 0));
        _columnsPropertyModal.put("documentSeenId", new TableInfo.Column("documentSeenId", "TEXT", false, 0));
        _columnsPropertyModal.put("nameOfSociety", new TableInfo.Column("nameOfSociety", "TEXT", false, 0));
        _columnsPropertyModal.put("societyRegnNo", new TableInfo.Column("societyRegnNo", "TEXT", false, 0));
        _columnsPropertyModal.put("propertyTaxReceiptNo", new TableInfo.Column("propertyTaxReceiptNo", "TEXT", false, 0));
        _columnsPropertyModal.put("propertyTaxAmount", new TableInfo.Column("propertyTaxAmount", "TEXT", false, 0));
        _columnsPropertyModal.put("propertyTaxYear", new TableInfo.Column("propertyTaxYear", "TEXT", false, 0));
        _columnsPropertyModal.put("shareCertificateNo", new TableInfo.Column("shareCertificateNo", "TEXT", false, 0));
        _columnsPropertyModal.put("shareCertificateNoOfShares", new TableInfo.Column("shareCertificateNoOfShares", "TEXT", false, 0));
        _columnsPropertyModal.put("shareCertificateFaceValue", new TableInfo.Column("shareCertificateFaceValue", "TEXT", false, 0));
        _columnsPropertyModal.put("shareCertificateDistinctiveNo", new TableInfo.Column("shareCertificateDistinctiveNo", "TEXT", false, 0));
        _columnsPropertyModal.put("planApprovedById", new TableInfo.Column("planApprovedById", "TEXT", false, 0));
        _columnsPropertyModal.put("commencementNo", new TableInfo.Column("commencementNo", "TEXT", false, 0));
        _columnsPropertyModal.put("commencementDate", new TableInfo.Column("commencementDate", "TEXT", false, 0));
        _columnsPropertyModal.put("occupancyNo", new TableInfo.Column("occupancyNo", "TEXT", false, 0));
        _columnsPropertyModal.put("occupancyDate", new TableInfo.Column("occupancyDate", "TEXT", false, 0));
        _columnsPropertyModal.put("premisesDetails", new TableInfo.Column("premisesDetails", "TEXT", false, 0));
        _columnsPropertyModal.put("stampDutyDate", new TableInfo.Column("stampDutyDate", "TEXT", false, 0));
        _columnsPropertyModal.put("agreementDate", new TableInfo.Column("agreementDate", "TEXT", false, 0));
        _columnsPropertyModal.put("agreementAmount", new TableInfo.Column("agreementAmount", "TEXT", false, 0));
        _columnsPropertyModal.put("registrationNo", new TableInfo.Column("registrationNo", "TEXT", false, 0));
        _columnsPropertyModal.put("registrationDate", new TableInfo.Column("registrationDate", "TEXT", false, 0));
        _columnsPropertyModal.put("registrationValue", new TableInfo.Column("registrationValue", "TEXT", false, 0));
        _columnsPropertyModal.put("remarks", new TableInfo.Column("remarks", "TEXT", false, 0));
        _columnsPropertyModal.put("otherRemarks", new TableInfo.Column("otherRemarks", "TEXT", false, 0));
        _columnsPropertyModal.put("specialRemarks", new TableInfo.Column("specialRemarks", "TEXT", false, 0));
        _columnsPropertyModal.put("otherDocuments", new TableInfo.Column("otherDocuments", "TEXT", false, 0));
        _columnsPropertyModal.put("registrationReceiptNo", new TableInfo.Column("registrationReceiptNo", "TEXT", false, 0));
        _columnsPropertyModal.put("registrarsValue", new TableInfo.Column("registrarsValue", "TEXT", false, 0));
        _columnsPropertyModal.put("hallDim", new TableInfo.Column("hallDim", "TEXT", false, 0));
        _columnsPropertyModal.put("kitchenDim", new TableInfo.Column("kitchenDim", "TEXT", false, 0));
        _columnsPropertyModal.put("bedroomDim", new TableInfo.Column("bedroomDim", "TEXT", false, 0));
        _columnsPropertyModal.put("dinningDim", new TableInfo.Column("dinningDim", "TEXT", false, 0));
        _columnsPropertyModal.put("passageDim", new TableInfo.Column("passageDim", "TEXT", false, 0));
        _columnsPropertyModal.put("wcDim", new TableInfo.Column("wcDim", "TEXT", false, 0));
        _columnsPropertyModal.put("bathDim", new TableInfo.Column("bathDim", "TEXT", false, 0));
        _columnsPropertyModal.put("wbDim", new TableInfo.Column("wbDim", "TEXT", false, 0));
        _columnsPropertyModal.put("fbDim", new TableInfo.Column("fbDim", "TEXT", false, 0));
        _columnsPropertyModal.put("dbDim", new TableInfo.Column("dbDim", "TEXT", false, 0));
        _columnsPropertyModal.put("balconyDim", new TableInfo.Column("balconyDim", "TEXT", false, 0));
        _columnsPropertyModal.put("terraceDim", new TableInfo.Column("terraceDim", "TEXT", false, 0));
        _columnsPropertyModal.put("latLongDetails", new TableInfo.Column("latLongDetails", "TEXT", false, 0));
        _columnsPropertyModal.put("brokerDetails", new TableInfo.Column("brokerDetails", "TEXT", false, 0));
        _columnsPropertyModal.put("totalMeasurement", new TableInfo.Column("totalMeasurement", "TEXT", false, 0));
        _columnsPropertyModal.put("gharvalueInterior", new TableInfo.Column("gharvalueInterior", "TEXT", false, 0));
        _columnsPropertyModal.put("describeInteriors", new TableInfo.Column("describeInteriors", "TEXT", false, 0));
        _columnsPropertyModal.put("gharvalueAmenities", new TableInfo.Column("gharvalueAmenities", "TEXT", false, 0));
        _columnsPropertyModal.put("describeAmenities", new TableInfo.Column("describeAmenities", "TEXT", false, 0));
        _columnsPropertyModal.put("gharvalueLocation", new TableInfo.Column("gharvalueLocation", "TEXT", false, 0));
        _columnsPropertyModal.put("describeLocation", new TableInfo.Column("describeLocation", "TEXT", false, 0));
        _columnsPropertyModal.put("plotDemarcatedAtSite", new TableInfo.Column("plotDemarcatedAtSite", "INTEGER", false, 0));
        _columnsPropertyModal.put("propertyIdentificationChannelId", new TableInfo.Column("propertyIdentificationChannelId", "TEXT", false, 0));
        _columnsPropertyModal.put("passageTypeId", new TableInfo.Column("passageTypeId", "TEXT", false, 0));
        _columnsPropertyModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsPropertyModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsPropertyModal.put("modifiedOn", new TableInfo.Column("modifiedOn", "TEXT", false, 0));
        _columnsPropertyModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        _columnsPropertyModal.put("marketabilityId", new TableInfo.Column("marketabilityId", "TEXT", false, 0));
        _columnsPropertyModal.put("propertyAddressAtSite", new TableInfo.Column("propertyAddressAtSite", "TEXT", false, 0));
        _columnsPropertyModal.put("sameAsDocumentAddress", new TableInfo.Column("sameAsDocumentAddress", "INTEGER", false, 0));
        _columnsPropertyModal.put("sameAsDocumentBoundary", new TableInfo.Column("sameAsDocumentBoundary", "INTEGER", false, 0));
        _columnsPropertyModal.put("sameAsDocumentDimension", new TableInfo.Column("sameAsDocumentDimension", "INTEGER", false, 0));
        _columnsPropertyModal.put("sameAsDocumentSetBack", new TableInfo.Column("sameAsDocumentSetBack", "INTEGER", false, 0));
        _columnsPropertyModal.put("approachRoadConditionId", new TableInfo.Column("approachRoadConditionId", "INTEGER", false, 0));
        _columnsPropertyModal.put("localityCategoryId", new TableInfo.Column("localityCategoryId", "INTEGER", false, 0));
        _columnsPropertyModal.put("classId", new TableInfo.Column("classId", "INTEGER", false, 0));
        _columnsPropertyModal.put("tenureId", new TableInfo.Column("tenureId", "INTEGER", false, 0));
        _columnsPropertyModal.put("typeOfLandId", new TableInfo.Column("typeOfLandId", "INTEGER", false, 0));
        _columnsPropertyModal.put("typeLocalityId", new TableInfo.Column("typeLocalityId", "INTEGER", false, 0));
        _columnsPropertyModal.put("NameofVendor", new TableInfo.Column("NameofVendor", "TEXT", false, 0));
        _columnsPropertyModal.put("NameofVendorId", new TableInfo.Column("NameofVendorId", "INTEGER", false, 0));
        _columnsPropertyModal.put("NameOfOccupant", new TableInfo.Column("NameOfOccupant", "TEXT", false, 0));
        _columnsPropertyModal.put("RelationWithOwner", new TableInfo.Column("RelationWithOwner", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPropertyModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPropertyModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPropertyModal = new TableInfo("PropertyModal", _columnsPropertyModal, _foreignKeysPropertyModal, _indicesPropertyModal);
        final TableInfo _existingPropertyModal = TableInfo.read(_db, "PropertyModal");
        if (! _infoPropertyModal.equals(_existingPropertyModal)) {
          throw new IllegalStateException("Migration didn't properly handle PropertyModal(com.realappraiser.associatedvaluers.model.Property).\n"
                  + " Expected:\n" + _infoPropertyModal + "\n"
                  + " Found:\n" + _existingPropertyModal);
        }
        final HashMap<String, TableInfo.Column> _columnsIndPropertyModal = new HashMap<String, TableInfo.Column>(58);
        _columnsIndPropertyModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsIndPropertyModal.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("noOfFloors", new TableInfo.Column("noOfFloors", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("approvedNoOfFloors", new TableInfo.Column("approvedNoOfFloors", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("floorDetails", new TableInfo.Column("floorDetails", "TEXT", false, 0));
        _columnsIndPropertyModal.put("propertyActualUsageId", new TableInfo.Column("propertyActualUsageId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("totalApartmentFloors", new TableInfo.Column("totalApartmentFloors", "TEXT", false, 0));
        _columnsIndPropertyModal.put("totalFlatsPerFloor", new TableInfo.Column("totalFlatsPerFloor", "TEXT", false, 0));
        _columnsIndPropertyModal.put("flatSituatedInFloor", new TableInfo.Column("flatSituatedInFloor", "TEXT", false, 0));
        _columnsIndPropertyModal.put("documentLandArea", new TableInfo.Column("documentLandArea", "TEXT", false, 0));
        _columnsIndPropertyModal.put("isCompounded", new TableInfo.Column("isCompounded", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("documentLandAreaUnit", new TableInfo.Column("documentLandAreaUnit", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("measuredLandArea", new TableInfo.Column("measuredLandArea", "TEXT", false, 0));
        _columnsIndPropertyModal.put("measuredLandAreaUnit", new TableInfo.Column("measuredLandAreaUnit", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("avgPercentageCompletion", new TableInfo.Column("avgPercentageCompletion", "TEXT", false, 0));
        _columnsIndPropertyModal.put("documentFloorAreaTotal", new TableInfo.Column("documentFloorAreaTotal", "TEXT", false, 0));
        _columnsIndPropertyModal.put("measuredFloorAreaTotal", new TableInfo.Column("measuredFloorAreaTotal", "TEXT", false, 0));
        _columnsIndPropertyModal.put("typeOfStructureId", new TableInfo.Column("typeOfStructureId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("floorHeight", new TableInfo.Column("floorHeight", "TEXT", false, 0));
        _columnsIndPropertyModal.put("yearsOfCurrentTenancy", new TableInfo.Column("yearsOfCurrentTenancy", "TEXT", false, 0));
        _columnsIndPropertyModal.put("rentalIncome", new TableInfo.Column("rentalIncome", "TEXT", false, 0));
        _columnsIndPropertyModal.put("basement", new TableInfo.Column("basement", "TEXT", false, 0));
        _columnsIndPropertyModal.put("noOfLiftInBuilding", new TableInfo.Column("noOfLiftInBuilding", "TEXT", false, 0));
        _columnsIndPropertyModal.put("exteriorPaintId", new TableInfo.Column("exteriorPaintId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("carParkingId", new TableInfo.Column("carParkingId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("waterAvailabilityId", new TableInfo.Column("waterAvailabilityId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("amenities", new TableInfo.Column("amenities", "TEXT", false, 0));
        _columnsIndPropertyModal.put("wingName", new TableInfo.Column("wingName", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intFloorId", new TableInfo.Column("intFloorId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intWindowId", new TableInfo.Column("intWindowId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intDoorId", new TableInfo.Column("intDoorId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intWcId", new TableInfo.Column("intWcId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intPaintId", new TableInfo.Column("intPaintId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("intRoofId", new TableInfo.Column("intRoofId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsIndPropertyModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("modifiedOn", new TableInfo.Column("modifiedOn", "TEXT", false, 0));
        _columnsIndPropertyModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("floorKindId", new TableInfo.Column("floorKindId", "INTEGER", true, 0));
        _columnsIndPropertyModal.put("wingNo", new TableInfo.Column("wingNo", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("intPop", new TableInfo.Column("intPop", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("gardenExist", new TableInfo.Column("gardenExist", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("seperateCompoundId", new TableInfo.Column("seperateCompoundId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("passageTypeId", new TableInfo.Column("passageTypeId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("marketabilityId", new TableInfo.Column("marketabilityId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("fittingQualityId", new TableInfo.Column("fittingQualityId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("maintenanceOfBuildingId", new TableInfo.Column("maintenanceOfBuildingId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("typeOfBuildingId", new TableInfo.Column("typeOfBuildingId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("qualityConstructionId", new TableInfo.Column("qualityConstructionId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("intBathId", new TableInfo.Column("intBathId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("amenityQualityId", new TableInfo.Column("amenityQualityId", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("intKitchenType", new TableInfo.Column("intKitchenType", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("intKitchenShape", new TableInfo.Column("intKitchenShape", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("pavingAroundBuildingId", new TableInfo.Column("pavingAroundBuildingId", "TEXT", false, 0));
        _columnsIndPropertyModal.put("LandAreaDescription", new TableInfo.Column("LandAreaDescription", "TEXT", false, 0));
        _columnsIndPropertyModal.put("NumberOfBuildings", new TableInfo.Column("NumberOfBuildings", "TEXT", false, 0));
        _columnsIndPropertyModal.put("TypeOfCompound", new TableInfo.Column("TypeOfCompound", "INTEGER", false, 0));
        _columnsIndPropertyModal.put("NameOfTenant", new TableInfo.Column("NameOfTenant", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndPropertyModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndPropertyModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndPropertyModal = new TableInfo("IndPropertyModal", _columnsIndPropertyModal, _foreignKeysIndPropertyModal, _indicesIndPropertyModal);
        final TableInfo _existingIndPropertyModal = TableInfo.read(_db, "IndPropertyModal");
        if (! _infoIndPropertyModal.equals(_existingIndPropertyModal)) {
          throw new IllegalStateException("Migration didn't properly handle IndPropertyModal(com.realappraiser.associatedvaluers.model.IndProperty).\n"
                  + " Expected:\n" + _infoIndPropertyModal + "\n"
                  + " Found:\n" + _existingIndPropertyModal);
        }
        final HashMap<String, TableInfo.Column> _columnsIndPropertyValuationModal = new HashMap<String, TableInfo.Column>(68);
        _columnsIndPropertyValuationModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsIndPropertyValuationModal.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsIndPropertyValuationModal.put("guidelineRate", new TableInfo.Column("guidelineRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("guidelineRateUnit", new TableInfo.Column("guidelineRateUnit", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("guidelineValue", new TableInfo.Column("guidelineValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("documentLandRate", new TableInfo.Column("documentLandRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("documentLandValue", new TableInfo.Column("documentLandValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("measuredLandRate", new TableInfo.Column("measuredLandRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("measuredLandValue", new TableInfo.Column("measuredLandValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("documentedLandValueSel", new TableInfo.Column("documentedLandValueSel", "INTEGER", false, 0));
        _columnsIndPropertyValuationModal.put("measuredLandValueSel", new TableInfo.Column("measuredLandValueSel", "INTEGER", false, 0));
        _columnsIndPropertyValuationModal.put("documentedConstrValueSel", new TableInfo.Column("documentedConstrValueSel", "INTEGER", false, 0));
        _columnsIndPropertyValuationModal.put("measuredConstrValueSel", new TableInfo.Column("measuredConstrValueSel", "INTEGER", false, 0));
        _columnsIndPropertyValuationModal.put("totalConstructionValue", new TableInfo.Column("totalConstructionValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("totalPropertyValue", new TableInfo.Column("totalPropertyValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("buildingDepreciationValue", new TableInfo.Column("buildingDepreciationValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("proposedValuation", new TableInfo.Column("proposedValuation", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("proposedValuationComments", new TableInfo.Column("proposedValuationComments", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("totalValueAtCompletion", new TableInfo.Column("totalValueAtCompletion", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("insuranceValue", new TableInfo.Column("insuranceValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("realizationPercentage", new TableInfo.Column("realizationPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("distressPercentage", new TableInfo.Column("distressPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("realizationValue", new TableInfo.Column("realizationValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("distressValue", new TableInfo.Column("distressValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsIndPropertyValuationModal.put("modifiedOn", new TableInfo.Column("modifiedOn", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        _columnsIndPropertyValuationModal.put("completionPercentage", new TableInfo.Column("completionPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("totalPropertyValueDepreciation", new TableInfo.Column("totalPropertyValueDepreciation", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("distressValueDepreciation", new TableInfo.Column("distressValueDepreciation", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("carpetAreaPercentage", new TableInfo.Column("carpetAreaPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("carpetAreaTypeId", new TableInfo.Column("carpetAreaTypeId", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("realizationValueDepreciation", new TableInfo.Column("realizationValueDepreciation", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("realizationLandValue", new TableInfo.Column("realizationLandValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("constructionDLCRate", new TableInfo.Column("constructionDLCRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("constructionDLCRateUnit", new TableInfo.Column("constructionDLCRateUnit", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("constructionDLCValue", new TableInfo.Column("constructionDLCValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("carpetArea", new TableInfo.Column("carpetArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("buildUpArea", new TableInfo.Column("buildUpArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("superBuildUpArea", new TableInfo.Column("superBuildUpArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("carpetAreaUnit", new TableInfo.Column("carpetAreaUnit", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("selectedConstructionArea", new TableInfo.Column("selectedConstructionArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("bAULoadingPercentage", new TableInfo.Column("bAULoadingPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("constructionRate", new TableInfo.Column("constructionRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("insuredConstructionRate", new TableInfo.Column("insuredConstructionRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("terraceArea", new TableInfo.Column("terraceArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("terraceRate", new TableInfo.Column("terraceRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("terraceValue", new TableInfo.Column("terraceValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("SaleableLoadingPercentage", new TableInfo.Column("SaleableLoadingPercentage", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("BalconyArea", new TableInfo.Column("BalconyArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("BalconyRate", new TableInfo.Column("BalconyRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("BalconyValue", new TableInfo.Column("BalconyValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("RealizationPercentageAsOnDate", new TableInfo.Column("RealizationPercentageAsOnDate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("DistressPercentageAsOnDate", new TableInfo.Column("DistressPercentageAsOnDate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("RealizationValueAsOnDate", new TableInfo.Column("RealizationValueAsOnDate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("DistressValueAsOnDate", new TableInfo.Column("DistressValueAsOnDate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("AdditionalDescription", new TableInfo.Column("AdditionalDescription", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("AdditionalDescriptionValue", new TableInfo.Column("AdditionalDescriptionValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("SelectedCarpetAreaTypeId", new TableInfo.Column("SelectedCarpetAreaTypeId", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("GovernmentArea", new TableInfo.Column("GovernmentArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("InsuranceArea", new TableInfo.Column("InsuranceArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("OtlaArea", new TableInfo.Column("OtlaArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("OtlaRate", new TableInfo.Column("OtlaRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("OtlaValue", new TableInfo.Column("OtlaValue", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("MezzanineArea", new TableInfo.Column("MezzanineArea", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("MezzanineRate", new TableInfo.Column("MezzanineRate", "TEXT", false, 0));
        _columnsIndPropertyValuationModal.put("MezzanineValue", new TableInfo.Column("MezzanineValue", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndPropertyValuationModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndPropertyValuationModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndPropertyValuationModal = new TableInfo("IndPropertyValuationModal", _columnsIndPropertyValuationModal, _foreignKeysIndPropertyValuationModal, _indicesIndPropertyValuationModal);
        final TableInfo _existingIndPropertyValuationModal = TableInfo.read(_db, "IndPropertyValuationModal");
        if (! _infoIndPropertyValuationModal.equals(_existingIndPropertyValuationModal)) {
          throw new IllegalStateException("Migration didn't properly handle IndPropertyValuationModal(com.realappraiser.associatedvaluers.model.IndPropertyValuation).\n"
                  + " Expected:\n" + _infoIndPropertyValuationModal + "\n"
                  + " Found:\n" + _existingIndPropertyValuationModal);
        }
        final HashMap<String, TableInfo.Column> _columnsIndPropertyFloorModal = new HashMap<String, TableInfo.Column>(50);
        _columnsIndPropertyFloorModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsIndPropertyFloorModal.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("floorNo", new TableInfo.Column("floorNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("floorName", new TableInfo.Column("floorName", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("constructionStageId", new TableInfo.Column("constructionStageId", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("percentageCompletion", new TableInfo.Column("percentageCompletion", "INTEGER", false, 0));
        _columnsIndPropertyFloorModal.put("presentConditionId", new TableInfo.Column("presentConditionId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("propertyAge", new TableInfo.Column("propertyAge", "INTEGER", false, 0));
        _columnsIndPropertyFloorModal.put("residualLife", new TableInfo.Column("residualLife", "INTEGER", false, 0));
        _columnsIndPropertyFloorModal.put("propertyFloorUsageId", new TableInfo.Column("propertyFloorUsageId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("documentFloorArea", new TableInfo.Column("documentFloorArea", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("documentFloorAreaUnit", new TableInfo.Column("documentFloorAreaUnit", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("measuredFloorArea", new TableInfo.Column("measuredFloorArea", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("measuredFloorAreaUnit", new TableInfo.Column("measuredFloorAreaUnit", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("flatHallNo", new TableInfo.Column("flatHallNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatKitchenNo", new TableInfo.Column("flatKitchenNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatBedroomNo", new TableInfo.Column("flatBedroomNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatDinningNo", new TableInfo.Column("flatDinningNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatBathNo", new TableInfo.Column("flatBathNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatWcNo", new TableInfo.Column("flatWcNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatAttBathWcNo", new TableInfo.Column("flatAttBathWcNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("flatBalconyNo", new TableInfo.Column("flatBalconyNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("shopNo", new TableInfo.Column("shopNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("officeNo", new TableInfo.Column("officeNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("intFloorId", new TableInfo.Column("intFloorId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intKitchenType", new TableInfo.Column("intKitchenType", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intKitchenShape", new TableInfo.Column("intKitchenShape", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intWindowId", new TableInfo.Column("intWindowId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intDoorId", new TableInfo.Column("intDoorId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intWcId", new TableInfo.Column("intWcId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intBathId", new TableInfo.Column("intBathId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intPaintId", new TableInfo.Column("intPaintId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("intPop", new TableInfo.Column("intPop", "INTEGER", false, 0));
        _columnsIndPropertyFloorModal.put("intRoofId", new TableInfo.Column("intRoofId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("passageTypeId", new TableInfo.Column("passageTypeId", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("typeOfStructureId", new TableInfo.Column("typeOfStructureId", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("floorHeight", new TableInfo.Column("floorHeight", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("yearsOfCurrentTenancy", new TableInfo.Column("yearsOfCurrentTenancy", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("rentalIncome", new TableInfo.Column("rentalIncome", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("percentageDepreciation", new TableInfo.Column("percentageDepreciation", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("modifiedOn", new TableInfo.Column("modifiedOn", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("presentCondition", new TableInfo.Column("presentCondition", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("PropertyFloorUsageId_str", new TableInfo.Column("PropertyFloorUsageId_str", "TEXT", false, 0));
        _columnsIndPropertyFloorModal.put("FlatFbNo", new TableInfo.Column("FlatFbNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("FlatDbNo", new TableInfo.Column("FlatDbNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("FlatTerraceNo", new TableInfo.Column("FlatTerraceNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorModal.put("FlatPassageNo", new TableInfo.Column("FlatPassageNo", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndPropertyFloorModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndPropertyFloorModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndPropertyFloorModal = new TableInfo("IndPropertyFloorModal", _columnsIndPropertyFloorModal, _foreignKeysIndPropertyFloorModal, _indicesIndPropertyFloorModal);
        final TableInfo _existingIndPropertyFloorModal = TableInfo.read(_db, "IndPropertyFloorModal");
        if (! _infoIndPropertyFloorModal.equals(_existingIndPropertyFloorModal)) {
          throw new IllegalStateException("Migration didn't properly handle IndPropertyFloorModal(com.realappraiser.associatedvaluers.model.IndPropertyFloor).\n"
                  + " Expected:\n" + _infoIndPropertyFloorModal + "\n"
                  + " Found:\n" + _existingIndPropertyFloorModal);
        }
        final HashMap<String, TableInfo.Column> _columnsIndPropertyFloorsValuationModal = new HashMap<String, TableInfo.Column>(12);
        _columnsIndPropertyFloorsValuationModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsIndPropertyFloorsValuationModal.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsIndPropertyFloorsValuationModal.put("floorNo", new TableInfo.Column("floorNo", "INTEGER", true, 0));
        _columnsIndPropertyFloorsValuationModal.put("documentConstrRate", new TableInfo.Column("documentConstrRate", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("documentConstrValue", new TableInfo.Column("documentConstrValue", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("measuredConstrRate", new TableInfo.Column("measuredConstrRate", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("measuredConstrValue", new TableInfo.Column("measuredConstrValue", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("floorDepreciationValue", new TableInfo.Column("floorDepreciationValue", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsIndPropertyFloorsValuationModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsIndPropertyFloorsValuationModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        _columnsIndPropertyFloorsValuationModal.put("floorCarpetArea", new TableInfo.Column("floorCarpetArea", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIndPropertyFloorsValuationModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIndPropertyFloorsValuationModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIndPropertyFloorsValuationModal = new TableInfo("IndPropertyFloorsValuationModal", _columnsIndPropertyFloorsValuationModal, _foreignKeysIndPropertyFloorsValuationModal, _indicesIndPropertyFloorsValuationModal);
        final TableInfo _existingIndPropertyFloorsValuationModal = TableInfo.read(_db, "IndPropertyFloorsValuationModal");
        if (! _infoIndPropertyFloorsValuationModal.equals(_existingIndPropertyFloorsValuationModal)) {
          throw new IllegalStateException("Migration didn't properly handle IndPropertyFloorsValuationModal(com.realappraiser.associatedvaluers.model.IndPropertyFloorsValuation).\n"
                  + " Expected:\n" + _infoIndPropertyFloorsValuationModal + "\n"
                  + " Found:\n" + _existingIndPropertyFloorsValuationModal);
        }
        final HashMap<String, TableInfo.Column> _columnsProximityModal = new HashMap<String, TableInfo.Column>(10);
        _columnsProximityModal.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsProximityModal.put("id", new TableInfo.Column("id", "INTEGER", true, 0));
        _columnsProximityModal.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsProximityModal.put("proximityId", new TableInfo.Column("proximityId", "INTEGER", true, 0));
        _columnsProximityModal.put("proximityName", new TableInfo.Column("proximityName", "TEXT", false, 0));
        _columnsProximityModal.put("proximityDistance", new TableInfo.Column("proximityDistance", "TEXT", false, 0));
        _columnsProximityModal.put("createdOn", new TableInfo.Column("createdOn", "TEXT", false, 0));
        _columnsProximityModal.put("createdBy", new TableInfo.Column("createdBy", "INTEGER", true, 0));
        _columnsProximityModal.put("modifiedOn", new TableInfo.Column("modifiedOn", "TEXT", false, 0));
        _columnsProximityModal.put("modifiedBy", new TableInfo.Column("modifiedBy", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProximityModal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProximityModal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProximityModal = new TableInfo("ProximityModal", _columnsProximityModal, _foreignKeysProximityModal, _indicesProximityModal);
        final TableInfo _existingProximityModal = TableInfo.read(_db, "ProximityModal");
        if (! _infoProximityModal.equals(_existingProximityModal)) {
          throw new IllegalStateException("Migration didn't properly handle ProximityModal(com.realappraiser.associatedvaluers.model.Proximity).\n"
                  + " Expected:\n" + _infoProximityModal + "\n"
                  + " Found:\n" + _existingProximityModal);
        }
        final HashMap<String, TableInfo.Column> _columnsGetPhotoModel = new HashMap<String, TableInfo.Column>(8);
        _columnsGetPhotoModel.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsGetPhotoModel.put("Id", new TableInfo.Column("Id", "INTEGER", true, 0));
        _columnsGetPhotoModel.put("Logo", new TableInfo.Column("Logo", "TEXT", false, 0));
        _columnsGetPhotoModel.put("Title", new TableInfo.Column("Title", "TEXT", false, 0));
        _columnsGetPhotoModel.put("newimage", new TableInfo.Column("newimage", "INTEGER", true, 0));
        _columnsGetPhotoModel.put("defaultimage", new TableInfo.Column("defaultimage", "INTEGER", true, 0));
        _columnsGetPhotoModel.put("PropertyId", new TableInfo.Column("PropertyId", "INTEGER", true, 0));
        _columnsGetPhotoModel.put("Filename", new TableInfo.Column("Filename", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGetPhotoModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGetPhotoModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGetPhotoModel = new TableInfo("GetPhotoModel", _columnsGetPhotoModel, _foreignKeysGetPhotoModel, _indicesGetPhotoModel);
        final TableInfo _existingGetPhotoModel = TableInfo.read(_db, "GetPhotoModel");
        if (! _infoGetPhotoModel.equals(_existingGetPhotoModel)) {
          throw new IllegalStateException("Migration didn't properly handle GetPhotoModel(com.realappraiser.associatedvaluers.model.GetPhoto).\n"
                  + " Expected:\n" + _infoGetPhotoModel + "\n"
                  + " Found:\n" + _existingGetPhotoModel);
        }
        final HashMap<String, TableInfo.Column> _columnsCaseDetail = new HashMap<String, TableInfo.Column>(11);
        _columnsCaseDetail.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsCaseDetail.put("id", new TableInfo.Column("id", "INTEGER", true, 0));
        _columnsCaseDetail.put("name", new TableInfo.Column("name", "TEXT", false, 0));
        _columnsCaseDetail.put("caseid", new TableInfo.Column("caseid", "TEXT", false, 0));
        _columnsCaseDetail.put("caseObj", new TableInfo.Column("caseObj", "TEXT", false, 0));
        _columnsCaseDetail.put("propertyObj", new TableInfo.Column("propertyObj", "TEXT", false, 0));
        _columnsCaseDetail.put("indpropertyObj", new TableInfo.Column("indpropertyObj", "TEXT", false, 0));
        _columnsCaseDetail.put("indpropertyvaluationObj", new TableInfo.Column("indpropertyvaluationObj", "TEXT", false, 0));
        _columnsCaseDetail.put("indpropertyfloorsObj", new TableInfo.Column("indpropertyfloorsObj", "TEXT", false, 0));
        _columnsCaseDetail.put("indpropertyfloorsvaluationObj", new TableInfo.Column("indpropertyfloorsvaluationObj", "TEXT", false, 0));
        _columnsCaseDetail.put("proximityObj", new TableInfo.Column("proximityObj", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCaseDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCaseDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCaseDetail = new TableInfo("CaseDetail", _columnsCaseDetail, _foreignKeysCaseDetail, _indicesCaseDetail);
        final TableInfo _existingCaseDetail = TableInfo.read(_db, "CaseDetail");
        if (! _infoCaseDetail.equals(_existingCaseDetail)) {
          throw new IllegalStateException("Migration didn't properly handle CaseDetail(com.realappraiser.associatedvaluers.model.CaseDetail).\n"
                  + " Expected:\n" + _infoCaseDetail + "\n"
                  + " Found:\n" + _existingCaseDetail);
        }
        final HashMap<String, TableInfo.Column> _columnsOflineCase = new HashMap<String, TableInfo.Column>(3);
        _columnsOflineCase.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsOflineCase.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsOflineCase.put("PropertyId", new TableInfo.Column("PropertyId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOflineCase = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOflineCase = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOflineCase = new TableInfo("OflineCase", _columnsOflineCase, _foreignKeysOflineCase, _indicesOflineCase);
        final TableInfo _existingOflineCase = TableInfo.read(_db, "OflineCase");
        if (! _infoOflineCase.equals(_existingOflineCase)) {
          throw new IllegalStateException("Migration didn't properly handle OflineCase(com.realappraiser.associatedvaluers.model.OflineCase).\n"
                  + " Expected:\n" + _infoOflineCase + "\n"
                  + " Found:\n" + _existingOflineCase);
        }
        final HashMap<String, TableInfo.Column> _columnsDocumentList = new HashMap<String, TableInfo.Column>(7);
        _columnsDocumentList.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsDocumentList.put("Id", new TableInfo.Column("Id", "TEXT", false, 0));
        _columnsDocumentList.put("DocumentName", new TableInfo.Column("DocumentName", "TEXT", false, 0));
        _columnsDocumentList.put("VisibleToFieldStaff", new TableInfo.Column("VisibleToFieldStaff", "TEXT", false, 0));
        _columnsDocumentList.put("Title", new TableInfo.Column("Title", "TEXT", false, 0));
        _columnsDocumentList.put("Document", new TableInfo.Column("Document", "TEXT", false, 0));
        _columnsDocumentList.put("CaseId", new TableInfo.Column("CaseId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDocumentList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDocumentList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDocumentList = new TableInfo("Document_list", _columnsDocumentList, _foreignKeysDocumentList, _indicesDocumentList);
        final TableInfo _existingDocumentList = TableInfo.read(_db, "Document_list");
        if (! _infoDocumentList.equals(_existingDocumentList)) {
          throw new IllegalStateException("Migration didn't properly handle Document_list(com.realappraiser.associatedvaluers.model.Document_list).\n"
                  + " Expected:\n" + _infoDocumentList + "\n"
                  + " Found:\n" + _existingDocumentList);
        }
        final HashMap<String, TableInfo.Column> _columnsLatLongDetails = new HashMap<String, TableInfo.Column>(3);
        _columnsLatLongDetails.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsLatLongDetails.put("caseId", new TableInfo.Column("caseId", "INTEGER", true, 0));
        _columnsLatLongDetails.put("latLongDetails", new TableInfo.Column("latLongDetails", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLatLongDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLatLongDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLatLongDetails = new TableInfo("LatLongDetails", _columnsLatLongDetails, _foreignKeysLatLongDetails, _indicesLatLongDetails);
        final TableInfo _existingLatLongDetails = TableInfo.read(_db, "LatLongDetails");
        if (! _infoLatLongDetails.equals(_existingLatLongDetails)) {
          throw new IllegalStateException("Migration didn't properly handle LatLongDetails(com.realappraiser.associatedvaluers.model.LatLongDetails).\n"
                  + " Expected:\n" + _infoLatLongDetails + "\n"
                  + " Found:\n" + _existingLatLongDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsGetPhotoMeasurmentModel = new HashMap<String, TableInfo.Column>(7);
        _columnsGetPhotoMeasurmentModel.put("dummyID", new TableInfo.Column("dummyID", "INTEGER", true, 1));
        _columnsGetPhotoMeasurmentModel.put("Id", new TableInfo.Column("Id", "INTEGER", true, 0));
        _columnsGetPhotoMeasurmentModel.put("Logo", new TableInfo.Column("Logo", "TEXT", false, 0));
        _columnsGetPhotoMeasurmentModel.put("Title", new TableInfo.Column("Title", "TEXT", false, 0));
        _columnsGetPhotoMeasurmentModel.put("newimage", new TableInfo.Column("newimage", "INTEGER", true, 0));
        _columnsGetPhotoMeasurmentModel.put("defaultimage", new TableInfo.Column("defaultimage", "INTEGER", true, 0));
        _columnsGetPhotoMeasurmentModel.put("PropertyId", new TableInfo.Column("PropertyId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGetPhotoMeasurmentModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGetPhotoMeasurmentModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGetPhotoMeasurmentModel = new TableInfo("GetPhoto_measurmentModel", _columnsGetPhotoMeasurmentModel, _foreignKeysGetPhotoMeasurmentModel, _indicesGetPhotoMeasurmentModel);
        final TableInfo _existingGetPhotoMeasurmentModel = TableInfo.read(_db, "GetPhoto_measurmentModel");
        if (! _infoGetPhotoMeasurmentModel.equals(_existingGetPhotoMeasurmentModel)) {
          throw new IllegalStateException("Migration didn't properly handle GetPhoto_measurmentModel(com.realappraiser.associatedvaluers.model.GetPhoto_measurment).\n"
                  + " Expected:\n" + _infoGetPhotoMeasurmentModel + "\n"
                  + " Found:\n" + _existingGetPhotoMeasurmentModel);
        }
      }
    }, "d2c88c1baa05a96048d48cc50cc10d76", "d458257d1f9ef03cac9ab1e8a15d0454");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "DataModel","OfflineDataModel","TypeOfProperty","PropertyUpdateRoomDB","CaseModal","PropertyModal","IndPropertyModal","IndPropertyValuationModal","IndPropertyFloorModal","IndPropertyFloorsValuationModal","ProximityModal","GetPhotoModel","CaseDetail","OflineCase","Document_list","LatLongDetails","GetPhoto_measurmentModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `DataModel`");
      _db.execSQL("DELETE FROM `OfflineDataModel`");
      _db.execSQL("DELETE FROM `TypeOfProperty`");
      _db.execSQL("DELETE FROM `PropertyUpdateRoomDB`");
      _db.execSQL("DELETE FROM `CaseModal`");
      _db.execSQL("DELETE FROM `PropertyModal`");
      _db.execSQL("DELETE FROM `IndPropertyModal`");
      _db.execSQL("DELETE FROM `IndPropertyValuationModal`");
      _db.execSQL("DELETE FROM `IndPropertyFloorModal`");
      _db.execSQL("DELETE FROM `IndPropertyFloorsValuationModal`");
      _db.execSQL("DELETE FROM `ProximityModal`");
      _db.execSQL("DELETE FROM `GetPhotoModel`");
      _db.execSQL("DELETE FROM `CaseDetail`");
      _db.execSQL("DELETE FROM `OflineCase`");
      _db.execSQL("DELETE FROM `Document_list`");
      _db.execSQL("DELETE FROM `LatLongDetails`");
      _db.execSQL("DELETE FROM `GetPhoto_measurmentModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public InterfaceDataModelQuery interfaceDataModelQuery() {
    if (_interfaceDataModelQuery != null) {
      return _interfaceDataModelQuery;
    } else {
      synchronized(this) {
        if(_interfaceDataModelQuery == null) {
          _interfaceDataModelQuery = new InterfaceDataModelQuery_Impl(this);
        }
        return _interfaceDataModelQuery;
      }
    }
  }

  @Override
  public InterfaceOfflineDataModelQuery interfaceOfflineDataModelQuery() {
    if (_interfaceOfflineDataModelQuery != null) {
      return _interfaceOfflineDataModelQuery;
    } else {
      synchronized(this) {
        if(_interfaceOfflineDataModelQuery == null) {
          _interfaceOfflineDataModelQuery = new InterfaceOfflineDataModelQuery_Impl(this);
        }
        return _interfaceOfflineDataModelQuery;
      }
    }
  }

  @Override
  public InterfaceCaseQuery interfaceCaseQuery() {
    if (_interfaceCaseQuery != null) {
      return _interfaceCaseQuery;
    } else {
      synchronized(this) {
        if(_interfaceCaseQuery == null) {
          _interfaceCaseQuery = new InterfaceCaseQuery_Impl(this);
        }
        return _interfaceCaseQuery;
      }
    }
  }

  @Override
  public InterfacePropertyQuery interfacePropertyQuery() {
    if (_interfacePropertyQuery != null) {
      return _interfacePropertyQuery;
    } else {
      synchronized(this) {
        if(_interfacePropertyQuery == null) {
          _interfacePropertyQuery = new InterfacePropertyQuery_Impl(this);
        }
        return _interfacePropertyQuery;
      }
    }
  }

  @Override
  public InterfaceIndpropertyQuery interfaceIndpropertyQuery() {
    if (_interfaceIndpropertyQuery != null) {
      return _interfaceIndpropertyQuery;
    } else {
      synchronized(this) {
        if(_interfaceIndpropertyQuery == null) {
          _interfaceIndpropertyQuery = new InterfaceIndpropertyQuery_Impl(this);
        }
        return _interfaceIndpropertyQuery;
      }
    }
  }

  @Override
  public InterfaceIndPropertyValuationQuery interfaceIndPropertyValuationQuery() {
    if (_interfaceIndPropertyValuationQuery != null) {
      return _interfaceIndPropertyValuationQuery;
    } else {
      synchronized(this) {
        if(_interfaceIndPropertyValuationQuery == null) {
          _interfaceIndPropertyValuationQuery = new InterfaceIndPropertyValuationQuery_Impl(this);
        }
        return _interfaceIndPropertyValuationQuery;
      }
    }
  }

  @Override
  public InterfaceIndPropertyFloorsQuery interfaceIndPropertyFloorsQuery() {
    if (_interfaceIndPropertyFloorsQuery != null) {
      return _interfaceIndPropertyFloorsQuery;
    } else {
      synchronized(this) {
        if(_interfaceIndPropertyFloorsQuery == null) {
          _interfaceIndPropertyFloorsQuery = new InterfaceIndPropertyFloorsQuery_Impl(this);
        }
        return _interfaceIndPropertyFloorsQuery;
      }
    }
  }

  @Override
  public InterfaceIndPropertyFloorsValuationQuery interfaceIndPropertyFloorsValuationQuery() {
    if (_interfaceIndPropertyFloorsValuationQuery != null) {
      return _interfaceIndPropertyFloorsValuationQuery;
    } else {
      synchronized(this) {
        if(_interfaceIndPropertyFloorsValuationQuery == null) {
          _interfaceIndPropertyFloorsValuationQuery = new InterfaceIndPropertyFloorsValuationQuery_Impl(this);
        }
        return _interfaceIndPropertyFloorsValuationQuery;
      }
    }
  }

  @Override
  public InterfaceProximityQuery interfaceProximityQuery() {
    if (_interfaceProximityQuery != null) {
      return _interfaceProximityQuery;
    } else {
      synchronized(this) {
        if(_interfaceProximityQuery == null) {
          _interfaceProximityQuery = new InterfaceProximityQuery_Impl(this);
        }
        return _interfaceProximityQuery;
      }
    }
  }

  @Override
  public InterfaceGetPhotoQuery interfaceGetPhotoQuery() {
    if (_interfaceGetPhotoQuery != null) {
      return _interfaceGetPhotoQuery;
    } else {
      synchronized(this) {
        if(_interfaceGetPhotoQuery == null) {
          _interfaceGetPhotoQuery = new InterfaceGetPhotoQuery_Impl(this);
        }
        return _interfaceGetPhotoQuery;
      }
    }
  }

  @Override
  public InterfaceOfflineCaseQuery interfaceOfflineCaseQuery() {
    if (_interfaceOfflineCaseQuery != null) {
      return _interfaceOfflineCaseQuery;
    } else {
      synchronized(this) {
        if(_interfaceOfflineCaseQuery == null) {
          _interfaceOfflineCaseQuery = new InterfaceOfflineCaseQuery_Impl(this);
        }
        return _interfaceOfflineCaseQuery;
      }
    }
  }

  @Override
  public InterfaceDocumentListQuery interfaceDocumentListQuery() {
    if (_interfaceDocumentListQuery != null) {
      return _interfaceDocumentListQuery;
    } else {
      synchronized(this) {
        if(_interfaceDocumentListQuery == null) {
          _interfaceDocumentListQuery = new InterfaceDocumentListQuery_Impl(this);
        }
        return _interfaceDocumentListQuery;
      }
    }
  }

  @Override
  public InterfaceLatLongQuery interfaceLatLongQuery() {
    if (_interfaceLatLongQuery != null) {
      return _interfaceLatLongQuery;
    } else {
      synchronized(this) {
        if(_interfaceLatLongQuery == null) {
          _interfaceLatLongQuery = new InterfaceLatLongQuery_Impl(this);
        }
        return _interfaceLatLongQuery;
      }
    }
  }

  @Override
  public TypeofPropertyQuery typeofPropertyQuery() {
    if (_typeofPropertyQuery != null) {
      return _typeofPropertyQuery;
    } else {
      synchronized(this) {
        if(_typeofPropertyQuery == null) {
          _typeofPropertyQuery = new TypeofPropertyQuery_Impl(this);
        }
        return _typeofPropertyQuery;
      }
    }
  }

  @Override
  public CaseDetailDAO daoAccess() {
    if (_caseDetailDAO != null) {
      return _caseDetailDAO;
    } else {
      synchronized(this) {
        if(_caseDetailDAO == null) {
          _caseDetailDAO = new CaseDetailDAO_Impl(this);
        }
        return _caseDetailDAO;
      }
    }
  }

  @Override
  public PropertyUpdateCategory propertyUpdateCategory() {
    if (_propertyUpdateCategory != null) {
      return _propertyUpdateCategory;
    } else {
      synchronized(this) {
        if(_propertyUpdateCategory == null) {
          _propertyUpdateCategory = new PropertyUpdateCategory_Impl(this);
        }
        return _propertyUpdateCategory;
      }
    }
  }

  @Override
  public InterfaceGetPhotoMeasurmentQuery interfaceGetPhotoMeasurmentQuery() {
    if (_interfaceGetPhotoMeasurmentQuery != null) {
      return _interfaceGetPhotoMeasurmentQuery;
    } else {
      synchronized(this) {
        if(_interfaceGetPhotoMeasurmentQuery == null) {
          _interfaceGetPhotoMeasurmentQuery = new InterfaceGetPhotoMeasurmentQuery_Impl(this);
        }
        return _interfaceGetPhotoMeasurmentQuery;
      }
    }
  }
}
