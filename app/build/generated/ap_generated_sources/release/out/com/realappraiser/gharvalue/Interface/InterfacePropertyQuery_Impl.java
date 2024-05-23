package com.realappraiser.gharvalue.Interface;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.realappraiser.gharvalue.model.Property;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class InterfacePropertyQuery_Impl implements InterfacePropertyQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfProperty;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfProperty;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRow_1;

  public InterfacePropertyQuery_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProperty = new EntityInsertionAdapter<Property>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PropertyModal`(`dummyID`,`CaseId`,`propertyId`,`employeeId`,`applicantAddress`,`landmark`,`purpose`,`nameOfPurchaser`,`propertyAddress`,`municipalWard`,`isWithinMunicipalArea`,`isPropertyInDemolitionList`,`villageName`,`colonyName`,`unitNo`,`plotNo`,`surveyNo`,`ctsNo`,`areaOfPlot`,`variable`,`surveyInPresenceOf`,`nearestStation`,`distance`,`presentlyOccupiedId`,`presentlyOccupied`,`nameOfSeller`,`boundryNorth`,`boundrySouth`,`boundryEast`,`boundryWest`,`docBoundryNorth`,`docBoundrySouth`,`docBoundryEast`,`docBoundryWest`,`matchBoundaryNorth`,`matchBoundarySouth`,`matchBoundaryEast`,`matchBoundaryWest`,`northMeasure`,`southMeasure`,`eastMeasure`,`westMeasure`,`docNorthMeasure`,`docSouthMeasure`,`docEastMeasure`,`docWestMeasure`,`boundaryMeasureUnit`,`docSetBackLeft`,`docSetBackRight`,`docSetBackFront`,`docSetBackRear`,`setBackLeft`,`setBackRight`,`setBackFront`,`setBackRear`,`typeOfPropertyId`,`flatHallNo`,`flatKitchenNo`,`flatBedroomNo`,`flatDinningNo`,`flatBathNo`,`flatWcNo`,`flatAttBathWcNo`,`flatPassageNo`,`flatBalconyNo`,`flatFbNo`,`flatDbNo`,`flatTerraceNo`,`intFloorId`,`intKitchenType`,`intKitchenShape`,`intWindowId`,`intDoorId`,`intWcId`,`intBathId`,`intPaintId`,`intPop`,`typeOfStructureId`,`noOfFloors`,`podiums`,`basement`,`noOfLiftInBuilding`,`noOfFlatPerFloor`,`constructionId`,`underconstructionLoading`,`plinthComp`,`rccComp`,`brickWorkComp`,`plasteringIntComp`,`plasteringExtComp`,`flooringComp`,`electricComp`,`plumbingComp`,`woodworkComp`,`paintingComp`,`presentConditionId`,`qualityConstructionId`,`ageOfProperty`,`residualLife`,`typeOfBuildingId`,`maintenanceOfBuildingId`,`exteriorPaintId`,`gardenExist`,`seperateCompoundId`,`pavingAroundBuildingId`,`carParkingId`,`waterAvailabilityId`,`amenityQualityId`,`fittingQualityId`,`amenities`,`wingNo`,`wingName`,`documentSeenId`,`nameOfSociety`,`societyRegnNo`,`propertyTaxReceiptNo`,`propertyTaxAmount`,`propertyTaxYear`,`shareCertificateNo`,`shareCertificateNoOfShares`,`shareCertificateFaceValue`,`shareCertificateDistinctiveNo`,`planApprovedById`,`commencementNo`,`commencementDate`,`occupancyNo`,`occupancyDate`,`premisesDetails`,`stampDutyDate`,`agreementDate`,`agreementAmount`,`registrationNo`,`registrationDate`,`registrationValue`,`remarks`,`otherRemarks`,`specialRemarks`,`otherDocuments`,`registrationReceiptNo`,`registrarsValue`,`hallDim`,`kitchenDim`,`bedroomDim`,`dinningDim`,`passageDim`,`wcDim`,`bathDim`,`wbDim`,`fbDim`,`dbDim`,`balconyDim`,`terraceDim`,`latLongDetails`,`brokerDetails`,`totalMeasurement`,`gharvalueInterior`,`describeInteriors`,`gharvalueAmenities`,`describeAmenities`,`gharvalueLocation`,`describeLocation`,`plotDemarcatedAtSite`,`propertyIdentificationChannelId`,`passageTypeId`,`createdOn`,`createdBy`,`modifiedOn`,`modifiedBy`,`marketabilityId`,`propertyAddressAtSite`,`sameAsDocumentAddress`,`sameAsDocumentBoundary`,`sameAsDocumentDimension`,`sameAsDocumentSetBack`,`approachRoadConditionId`,`localityCategoryId`,`classId`,`tenureId`,`typeOfLandId`,`typeLocalityId`,`NameofVendor`,`NameofVendorId`,`NameOfOccupant`,`RelationWithOwner`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Property value) {
        stmt.bindLong(1, value.dummyID);
        stmt.bindLong(2, value.getCaseId());
        stmt.bindLong(3, value.getPropertyId());
        stmt.bindLong(4, value.getEmployeeId());
        if (value.getApplicantAddress() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getApplicantAddress());
        }
        if (value.getLandmark() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLandmark());
        }
        if (value.getPurpose() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPurpose());
        }
        if (value.getNameOfPurchaser() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getNameOfPurchaser());
        }
        if (value.getPropertyAddress() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getPropertyAddress());
        }
        if (value.getMunicipalWard() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getMunicipalWard());
        }
        final Integer _tmp;
        _tmp = value.getIsWithinMunicipalArea() == null ? null : (value.getIsWithinMunicipalArea() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.getIsPropertyInDemolitionList() == null ? null : (value.getIsPropertyInDemolitionList() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_1);
        }
        if (value.getVillageName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getVillageName());
        }
        if (value.getColonyName() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getColonyName());
        }
        if (value.getUnitNo() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getUnitNo());
        }
        if (value.getPlotNo() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getPlotNo());
        }
        if (value.getSurveyNo() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getSurveyNo());
        }
        if (value.getCtsNo() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getCtsNo());
        }
        if (value.getAreaOfPlot() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getAreaOfPlot());
        }
        if (value.getVariable() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getVariable());
        }
        if (value.getSurveyInPresenceOf() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getSurveyInPresenceOf());
        }
        if (value.getNearestStation() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getNearestStation());
        }
        if (value.getDistance() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getDistance());
        }
        if (value.getPresentlyOccupiedId() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getPresentlyOccupiedId());
        }
        if (value.getPresentlyOccupied() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPresentlyOccupied());
        }
        if (value.getNameOfSeller() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getNameOfSeller());
        }
        if (value.getBoundryNorth() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getBoundryNorth());
        }
        if (value.getBoundrySouth() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getBoundrySouth());
        }
        if (value.getBoundryEast() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getBoundryEast());
        }
        if (value.getBoundryWest() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getBoundryWest());
        }
        if (value.getDocBoundryNorth() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getDocBoundryNorth());
        }
        if (value.getDocBoundrySouth() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getDocBoundrySouth());
        }
        if (value.getDocBoundryEast() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getDocBoundryEast());
        }
        if (value.getDocBoundryWest() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getDocBoundryWest());
        }
        if (value.getMatchBoundaryNorth() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getMatchBoundaryNorth());
        }
        if (value.getMatchBoundarySouth() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getMatchBoundarySouth());
        }
        if (value.getMatchBoundaryEast() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getMatchBoundaryEast());
        }
        if (value.getMatchBoundaryWest() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getMatchBoundaryWest());
        }
        if (value.getNorthMeasure() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getNorthMeasure());
        }
        if (value.getSouthMeasure() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getSouthMeasure());
        }
        if (value.getEastMeasure() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getEastMeasure());
        }
        if (value.getWestMeasure() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getWestMeasure());
        }
        if (value.getDocNorthMeasure() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getDocNorthMeasure());
        }
        if (value.getDocSouthMeasure() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getDocSouthMeasure());
        }
        if (value.getDocEastMeasure() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getDocEastMeasure());
        }
        if (value.getDocWestMeasure() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getDocWestMeasure());
        }
        if (value.getBoundaryMeasureUnit() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getBoundaryMeasureUnit());
        }
        if (value.getDocSetBackLeft() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getDocSetBackLeft());
        }
        if (value.getDocSetBackRight() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getDocSetBackRight());
        }
        if (value.getDocSetBackFront() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getDocSetBackFront());
        }
        if (value.getDocSetBackRear() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getDocSetBackRear());
        }
        if (value.getSetBackLeft() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getSetBackLeft());
        }
        if (value.getSetBackRight() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getSetBackRight());
        }
        if (value.getSetBackFront() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getSetBackFront());
        }
        if (value.getSetBackRear() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getSetBackRear());
        }
        stmt.bindLong(56, value.getTypeOfPropertyId());
        if (value.getFlatHallNo() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getFlatHallNo());
        }
        if (value.getFlatKitchenNo() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getFlatKitchenNo());
        }
        if (value.getFlatBedroomNo() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getFlatBedroomNo());
        }
        if (value.getFlatDinningNo() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getFlatDinningNo());
        }
        if (value.getFlatBathNo() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getFlatBathNo());
        }
        if (value.getFlatWcNo() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getFlatWcNo());
        }
        if (value.getFlatAttBathWcNo() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindString(63, value.getFlatAttBathWcNo());
        }
        if (value.getFlatPassageNo() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindString(64, value.getFlatPassageNo());
        }
        if (value.getFlatBalconyNo() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getFlatBalconyNo());
        }
        if (value.getFlatFbNo() == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.getFlatFbNo());
        }
        if (value.getFlatDbNo() == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, value.getFlatDbNo());
        }
        if (value.getFlatTerraceNo() == null) {
          stmt.bindNull(68);
        } else {
          stmt.bindString(68, value.getFlatTerraceNo());
        }
        if (value.getIntFloorId() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindString(69, value.getIntFloorId());
        }
        if (value.getIntKitchenType() == null) {
          stmt.bindNull(70);
        } else {
          stmt.bindString(70, value.getIntKitchenType());
        }
        if (value.getIntKitchenShape() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindString(71, value.getIntKitchenShape());
        }
        if (value.getIntWindowId() == null) {
          stmt.bindNull(72);
        } else {
          stmt.bindString(72, value.getIntWindowId());
        }
        if (value.getIntDoorId() == null) {
          stmt.bindNull(73);
        } else {
          stmt.bindString(73, value.getIntDoorId());
        }
        if (value.getIntWcId() == null) {
          stmt.bindNull(74);
        } else {
          stmt.bindString(74, value.getIntWcId());
        }
        if (value.getIntBathId() == null) {
          stmt.bindNull(75);
        } else {
          stmt.bindString(75, value.getIntBathId());
        }
        if (value.getIntPaintId() == null) {
          stmt.bindNull(76);
        } else {
          stmt.bindString(76, value.getIntPaintId());
        }
        if (value.getIntPop() == null) {
          stmt.bindNull(77);
        } else {
          stmt.bindString(77, value.getIntPop());
        }
        if (value.getTypeOfStructureId() == null) {
          stmt.bindNull(78);
        } else {
          stmt.bindString(78, value.getTypeOfStructureId());
        }
        if (value.getNoOfFloors() == null) {
          stmt.bindNull(79);
        } else {
          stmt.bindString(79, value.getNoOfFloors());
        }
        if (value.getPodiums() == null) {
          stmt.bindNull(80);
        } else {
          stmt.bindString(80, value.getPodiums());
        }
        if (value.getBasement() == null) {
          stmt.bindNull(81);
        } else {
          stmt.bindString(81, value.getBasement());
        }
        if (value.getNoOfLiftInBuilding() == null) {
          stmt.bindNull(82);
        } else {
          stmt.bindString(82, value.getNoOfLiftInBuilding());
        }
        if (value.getNoOfFlatPerFloor() == null) {
          stmt.bindNull(83);
        } else {
          stmt.bindString(83, value.getNoOfFlatPerFloor());
        }
        if (value.getConstructionId() == null) {
          stmt.bindNull(84);
        } else {
          stmt.bindString(84, value.getConstructionId());
        }
        if (value.getUnderconstructionLoading() == null) {
          stmt.bindNull(85);
        } else {
          stmt.bindString(85, value.getUnderconstructionLoading());
        }
        if (value.getPlinthComp() == null) {
          stmt.bindNull(86);
        } else {
          stmt.bindString(86, value.getPlinthComp());
        }
        if (value.getRccComp() == null) {
          stmt.bindNull(87);
        } else {
          stmt.bindString(87, value.getRccComp());
        }
        if (value.getBrickWorkComp() == null) {
          stmt.bindNull(88);
        } else {
          stmt.bindString(88, value.getBrickWorkComp());
        }
        if (value.getPlasteringIntComp() == null) {
          stmt.bindNull(89);
        } else {
          stmt.bindString(89, value.getPlasteringIntComp());
        }
        if (value.getPlasteringExtComp() == null) {
          stmt.bindNull(90);
        } else {
          stmt.bindString(90, value.getPlasteringExtComp());
        }
        if (value.getFlooringComp() == null) {
          stmt.bindNull(91);
        } else {
          stmt.bindString(91, value.getFlooringComp());
        }
        if (value.getElectricComp() == null) {
          stmt.bindNull(92);
        } else {
          stmt.bindString(92, value.getElectricComp());
        }
        if (value.getPlumbingComp() == null) {
          stmt.bindNull(93);
        } else {
          stmt.bindString(93, value.getPlumbingComp());
        }
        if (value.getWoodworkComp() == null) {
          stmt.bindNull(94);
        } else {
          stmt.bindString(94, value.getWoodworkComp());
        }
        if (value.getPaintingComp() == null) {
          stmt.bindNull(95);
        } else {
          stmt.bindString(95, value.getPaintingComp());
        }
        if (value.getPresentConditionId() == null) {
          stmt.bindNull(96);
        } else {
          stmt.bindString(96, value.getPresentConditionId());
        }
        if (value.getQualityConstructionId() == null) {
          stmt.bindNull(97);
        } else {
          stmt.bindString(97, value.getQualityConstructionId());
        }
        if (value.getAgeOfProperty() == null) {
          stmt.bindNull(98);
        } else {
          stmt.bindString(98, value.getAgeOfProperty());
        }
        if (value.getResidualLife() == null) {
          stmt.bindNull(99);
        } else {
          stmt.bindString(99, value.getResidualLife());
        }
        if (value.getTypeOfBuildingId() == null) {
          stmt.bindNull(100);
        } else {
          stmt.bindString(100, value.getTypeOfBuildingId());
        }
        if (value.getMaintenanceOfBuildingId() == null) {
          stmt.bindNull(101);
        } else {
          stmt.bindString(101, value.getMaintenanceOfBuildingId());
        }
        if (value.getExteriorPaintId() == null) {
          stmt.bindNull(102);
        } else {
          stmt.bindString(102, value.getExteriorPaintId());
        }
        if (value.getGardenExist() == null) {
          stmt.bindNull(103);
        } else {
          stmt.bindString(103, value.getGardenExist());
        }
        if (value.getSeperateCompoundId() == null) {
          stmt.bindNull(104);
        } else {
          stmt.bindString(104, value.getSeperateCompoundId());
        }
        if (value.getPavingAroundBuildingId() == null) {
          stmt.bindNull(105);
        } else {
          stmt.bindString(105, value.getPavingAroundBuildingId());
        }
        if (value.getCarParkingId() == null) {
          stmt.bindNull(106);
        } else {
          stmt.bindString(106, value.getCarParkingId());
        }
        if (value.getWaterAvailabilityId() == null) {
          stmt.bindNull(107);
        } else {
          stmt.bindString(107, value.getWaterAvailabilityId());
        }
        if (value.getAmenityQualityId() == null) {
          stmt.bindNull(108);
        } else {
          stmt.bindString(108, value.getAmenityQualityId());
        }
        if (value.getFittingQualityId() == null) {
          stmt.bindNull(109);
        } else {
          stmt.bindString(109, value.getFittingQualityId());
        }
        if (value.getAmenities() == null) {
          stmt.bindNull(110);
        } else {
          stmt.bindString(110, value.getAmenities());
        }
        if (value.getWingNo() == null) {
          stmt.bindNull(111);
        } else {
          stmt.bindString(111, value.getWingNo());
        }
        if (value.getWingName() == null) {
          stmt.bindNull(112);
        } else {
          stmt.bindString(112, value.getWingName());
        }
        if (value.getDocumentSeenId() == null) {
          stmt.bindNull(113);
        } else {
          stmt.bindString(113, value.getDocumentSeenId());
        }
        if (value.getNameOfSociety() == null) {
          stmt.bindNull(114);
        } else {
          stmt.bindString(114, value.getNameOfSociety());
        }
        if (value.getSocietyRegnNo() == null) {
          stmt.bindNull(115);
        } else {
          stmt.bindString(115, value.getSocietyRegnNo());
        }
        if (value.getPropertyTaxReceiptNo() == null) {
          stmt.bindNull(116);
        } else {
          stmt.bindString(116, value.getPropertyTaxReceiptNo());
        }
        if (value.getPropertyTaxAmount() == null) {
          stmt.bindNull(117);
        } else {
          stmt.bindString(117, value.getPropertyTaxAmount());
        }
        if (value.getPropertyTaxYear() == null) {
          stmt.bindNull(118);
        } else {
          stmt.bindString(118, value.getPropertyTaxYear());
        }
        if (value.getShareCertificateNo() == null) {
          stmt.bindNull(119);
        } else {
          stmt.bindString(119, value.getShareCertificateNo());
        }
        if (value.getShareCertificateNoOfShares() == null) {
          stmt.bindNull(120);
        } else {
          stmt.bindString(120, value.getShareCertificateNoOfShares());
        }
        if (value.getShareCertificateFaceValue() == null) {
          stmt.bindNull(121);
        } else {
          stmt.bindString(121, value.getShareCertificateFaceValue());
        }
        if (value.getShareCertificateDistinctiveNo() == null) {
          stmt.bindNull(122);
        } else {
          stmt.bindString(122, value.getShareCertificateDistinctiveNo());
        }
        if (value.getPlanApprovedById() == null) {
          stmt.bindNull(123);
        } else {
          stmt.bindString(123, value.getPlanApprovedById());
        }
        if (value.getCommencementNo() == null) {
          stmt.bindNull(124);
        } else {
          stmt.bindString(124, value.getCommencementNo());
        }
        if (value.getCommencementDate() == null) {
          stmt.bindNull(125);
        } else {
          stmt.bindString(125, value.getCommencementDate());
        }
        if (value.getOccupancyNo() == null) {
          stmt.bindNull(126);
        } else {
          stmt.bindString(126, value.getOccupancyNo());
        }
        if (value.getOccupancyDate() == null) {
          stmt.bindNull(127);
        } else {
          stmt.bindString(127, value.getOccupancyDate());
        }
        if (value.getPremisesDetails() == null) {
          stmt.bindNull(128);
        } else {
          stmt.bindString(128, value.getPremisesDetails());
        }
        if (value.getStampDutyDate() == null) {
          stmt.bindNull(129);
        } else {
          stmt.bindString(129, value.getStampDutyDate());
        }
        if (value.getAgreementDate() == null) {
          stmt.bindNull(130);
        } else {
          stmt.bindString(130, value.getAgreementDate());
        }
        if (value.getAgreementAmount() == null) {
          stmt.bindNull(131);
        } else {
          stmt.bindString(131, value.getAgreementAmount());
        }
        if (value.getRegistrationNo() == null) {
          stmt.bindNull(132);
        } else {
          stmt.bindString(132, value.getRegistrationNo());
        }
        if (value.getRegistrationDate() == null) {
          stmt.bindNull(133);
        } else {
          stmt.bindString(133, value.getRegistrationDate());
        }
        if (value.getRegistrationValue() == null) {
          stmt.bindNull(134);
        } else {
          stmt.bindString(134, value.getRegistrationValue());
        }
        if (value.getRemarks() == null) {
          stmt.bindNull(135);
        } else {
          stmt.bindString(135, value.getRemarks());
        }
        if (value.getOtherRemarks() == null) {
          stmt.bindNull(136);
        } else {
          stmt.bindString(136, value.getOtherRemarks());
        }
        if (value.getSpecialRemarks() == null) {
          stmt.bindNull(137);
        } else {
          stmt.bindString(137, value.getSpecialRemarks());
        }
        if (value.getOtherDocuments() == null) {
          stmt.bindNull(138);
        } else {
          stmt.bindString(138, value.getOtherDocuments());
        }
        if (value.getRegistrationReceiptNo() == null) {
          stmt.bindNull(139);
        } else {
          stmt.bindString(139, value.getRegistrationReceiptNo());
        }
        if (value.getRegistrarsValue() == null) {
          stmt.bindNull(140);
        } else {
          stmt.bindString(140, value.getRegistrarsValue());
        }
        if (value.getHallDim() == null) {
          stmt.bindNull(141);
        } else {
          stmt.bindString(141, value.getHallDim());
        }
        if (value.getKitchenDim() == null) {
          stmt.bindNull(142);
        } else {
          stmt.bindString(142, value.getKitchenDim());
        }
        if (value.getBedroomDim() == null) {
          stmt.bindNull(143);
        } else {
          stmt.bindString(143, value.getBedroomDim());
        }
        if (value.getDinningDim() == null) {
          stmt.bindNull(144);
        } else {
          stmt.bindString(144, value.getDinningDim());
        }
        if (value.getPassageDim() == null) {
          stmt.bindNull(145);
        } else {
          stmt.bindString(145, value.getPassageDim());
        }
        if (value.getWcDim() == null) {
          stmt.bindNull(146);
        } else {
          stmt.bindString(146, value.getWcDim());
        }
        if (value.getBathDim() == null) {
          stmt.bindNull(147);
        } else {
          stmt.bindString(147, value.getBathDim());
        }
        if (value.getWbDim() == null) {
          stmt.bindNull(148);
        } else {
          stmt.bindString(148, value.getWbDim());
        }
        if (value.getFbDim() == null) {
          stmt.bindNull(149);
        } else {
          stmt.bindString(149, value.getFbDim());
        }
        if (value.getDbDim() == null) {
          stmt.bindNull(150);
        } else {
          stmt.bindString(150, value.getDbDim());
        }
        if (value.getBalconyDim() == null) {
          stmt.bindNull(151);
        } else {
          stmt.bindString(151, value.getBalconyDim());
        }
        if (value.getTerraceDim() == null) {
          stmt.bindNull(152);
        } else {
          stmt.bindString(152, value.getTerraceDim());
        }
        if (value.getLatLongDetails() == null) {
          stmt.bindNull(153);
        } else {
          stmt.bindString(153, value.getLatLongDetails());
        }
        if (value.getBrokerDetails() == null) {
          stmt.bindNull(154);
        } else {
          stmt.bindString(154, value.getBrokerDetails());
        }
        if (value.getTotalMeasurement() == null) {
          stmt.bindNull(155);
        } else {
          stmt.bindString(155, value.getTotalMeasurement());
        }
        if (value.getGharvalueInterior() == null) {
          stmt.bindNull(156);
        } else {
          stmt.bindString(156, value.getGharvalueInterior());
        }
        if (value.getDescribeInteriors() == null) {
          stmt.bindNull(157);
        } else {
          stmt.bindString(157, value.getDescribeInteriors());
        }
        if (value.getGharvalueAmenities() == null) {
          stmt.bindNull(158);
        } else {
          stmt.bindString(158, value.getGharvalueAmenities());
        }
        if (value.getDescribeAmenities() == null) {
          stmt.bindNull(159);
        } else {
          stmt.bindString(159, value.getDescribeAmenities());
        }
        if (value.getGharvalueLocation() == null) {
          stmt.bindNull(160);
        } else {
          stmt.bindString(160, value.getGharvalueLocation());
        }
        if (value.getDescribeLocation() == null) {
          stmt.bindNull(161);
        } else {
          stmt.bindString(161, value.getDescribeLocation());
        }
        final Integer _tmp_2;
        _tmp_2 = value.getPlotDemarcatedAtSite() == null ? null : (value.getPlotDemarcatedAtSite() ? 1 : 0);
        if (_tmp_2 == null) {
          stmt.bindNull(162);
        } else {
          stmt.bindLong(162, _tmp_2);
        }
        if (value.getPropertyIdentificationChannelId() == null) {
          stmt.bindNull(163);
        } else {
          stmt.bindString(163, value.getPropertyIdentificationChannelId());
        }
        if (value.getPassageTypeId() == null) {
          stmt.bindNull(164);
        } else {
          stmt.bindString(164, value.getPassageTypeId());
        }
        if (value.getCreatedOn() == null) {
          stmt.bindNull(165);
        } else {
          stmt.bindString(165, value.getCreatedOn());
        }
        stmt.bindLong(166, value.getCreatedBy());
        if (value.getModifiedOn() == null) {
          stmt.bindNull(167);
        } else {
          stmt.bindString(167, value.getModifiedOn());
        }
        stmt.bindLong(168, value.getModifiedBy());
        if (value.getMarketabilityId() == null) {
          stmt.bindNull(169);
        } else {
          stmt.bindString(169, value.getMarketabilityId());
        }
        if (value.getPropertyAddressAtSite() == null) {
          stmt.bindNull(170);
        } else {
          stmt.bindString(170, value.getPropertyAddressAtSite());
        }
        final Integer _tmp_3;
        _tmp_3 = value.getSameAsDocumentAddress() == null ? null : (value.getSameAsDocumentAddress() ? 1 : 0);
        if (_tmp_3 == null) {
          stmt.bindNull(171);
        } else {
          stmt.bindLong(171, _tmp_3);
        }
        final Integer _tmp_4;
        _tmp_4 = value.getSameAsDocumentBoundary() == null ? null : (value.getSameAsDocumentBoundary() ? 1 : 0);
        if (_tmp_4 == null) {
          stmt.bindNull(172);
        } else {
          stmt.bindLong(172, _tmp_4);
        }
        final Integer _tmp_5;
        _tmp_5 = value.getSameAsDocumentDimension() == null ? null : (value.getSameAsDocumentDimension() ? 1 : 0);
        if (_tmp_5 == null) {
          stmt.bindNull(173);
        } else {
          stmt.bindLong(173, _tmp_5);
        }
        final Integer _tmp_6;
        _tmp_6 = value.getSameAsDocumentSetBack() == null ? null : (value.getSameAsDocumentSetBack() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(174);
        } else {
          stmt.bindLong(174, _tmp_6);
        }
        if (value.getApproachRoadConditionId() == null) {
          stmt.bindNull(175);
        } else {
          stmt.bindLong(175, value.getApproachRoadConditionId());
        }
        if (value.getLocalityCategoryId() == null) {
          stmt.bindNull(176);
        } else {
          stmt.bindLong(176, value.getLocalityCategoryId());
        }
        if (value.getClassId() == null) {
          stmt.bindNull(177);
        } else {
          stmt.bindLong(177, value.getClassId());
        }
        if (value.getTenureId() == null) {
          stmt.bindNull(178);
        } else {
          stmt.bindLong(178, value.getTenureId());
        }
        if (value.getTypeOfLandId() == null) {
          stmt.bindNull(179);
        } else {
          stmt.bindLong(179, value.getTypeOfLandId());
        }
        if (value.getTypeLocalityId() == null) {
          stmt.bindNull(180);
        } else {
          stmt.bindLong(180, value.getTypeLocalityId());
        }
        if (value.getNameofVendor() == null) {
          stmt.bindNull(181);
        } else {
          stmt.bindString(181, value.getNameofVendor());
        }
        if (value.getNameofVendorId() == null) {
          stmt.bindNull(182);
        } else {
          stmt.bindLong(182, value.getNameofVendorId());
        }
        if (value.getNameOfOccupant() == null) {
          stmt.bindNull(183);
        } else {
          stmt.bindString(183, value.getNameOfOccupant());
        }
        if (value.getRelationWithOwner() == null) {
          stmt.bindNull(184);
        } else {
          stmt.bindString(184, value.getRelationWithOwner());
        }
      }
    };
    this.__deletionAdapterOfProperty = new EntityDeletionOrUpdateAdapter<Property>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PropertyModal` WHERE `dummyID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Property value) {
        stmt.bindLong(1, value.dummyID);
      }
    };
    this.__preparedStmtOfDeleteRow = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM propertymodal where CaseId = (?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRow_1 = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM propertymodal";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(Property property) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfProperty.insert(property);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Property property) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfProperty.handle(property);
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
  public List<Property> getProperty() {
    final String _sql = "SELECT * FROM propertymodal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("propertyId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("employeeId");
      final int _cursorIndexOfApplicantAddress = _cursor.getColumnIndexOrThrow("applicantAddress");
      final int _cursorIndexOfLandmark = _cursor.getColumnIndexOrThrow("landmark");
      final int _cursorIndexOfPurpose = _cursor.getColumnIndexOrThrow("purpose");
      final int _cursorIndexOfNameOfPurchaser = _cursor.getColumnIndexOrThrow("nameOfPurchaser");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("propertyAddress");
      final int _cursorIndexOfMunicipalWard = _cursor.getColumnIndexOrThrow("municipalWard");
      final int _cursorIndexOfIsWithinMunicipalArea = _cursor.getColumnIndexOrThrow("isWithinMunicipalArea");
      final int _cursorIndexOfIsPropertyInDemolitionList = _cursor.getColumnIndexOrThrow("isPropertyInDemolitionList");
      final int _cursorIndexOfVillageName = _cursor.getColumnIndexOrThrow("villageName");
      final int _cursorIndexOfColonyName = _cursor.getColumnIndexOrThrow("colonyName");
      final int _cursorIndexOfUnitNo = _cursor.getColumnIndexOrThrow("unitNo");
      final int _cursorIndexOfPlotNo = _cursor.getColumnIndexOrThrow("plotNo");
      final int _cursorIndexOfSurveyNo = _cursor.getColumnIndexOrThrow("surveyNo");
      final int _cursorIndexOfCtsNo = _cursor.getColumnIndexOrThrow("ctsNo");
      final int _cursorIndexOfAreaOfPlot = _cursor.getColumnIndexOrThrow("areaOfPlot");
      final int _cursorIndexOfVariable = _cursor.getColumnIndexOrThrow("variable");
      final int _cursorIndexOfSurveyInPresenceOf = _cursor.getColumnIndexOrThrow("surveyInPresenceOf");
      final int _cursorIndexOfNearestStation = _cursor.getColumnIndexOrThrow("nearestStation");
      final int _cursorIndexOfDistance = _cursor.getColumnIndexOrThrow("distance");
      final int _cursorIndexOfPresentlyOccupiedId = _cursor.getColumnIndexOrThrow("presentlyOccupiedId");
      final int _cursorIndexOfPresentlyOccupied = _cursor.getColumnIndexOrThrow("presentlyOccupied");
      final int _cursorIndexOfNameOfSeller = _cursor.getColumnIndexOrThrow("nameOfSeller");
      final int _cursorIndexOfBoundryNorth = _cursor.getColumnIndexOrThrow("boundryNorth");
      final int _cursorIndexOfBoundrySouth = _cursor.getColumnIndexOrThrow("boundrySouth");
      final int _cursorIndexOfBoundryEast = _cursor.getColumnIndexOrThrow("boundryEast");
      final int _cursorIndexOfBoundryWest = _cursor.getColumnIndexOrThrow("boundryWest");
      final int _cursorIndexOfDocBoundryNorth = _cursor.getColumnIndexOrThrow("docBoundryNorth");
      final int _cursorIndexOfDocBoundrySouth = _cursor.getColumnIndexOrThrow("docBoundrySouth");
      final int _cursorIndexOfDocBoundryEast = _cursor.getColumnIndexOrThrow("docBoundryEast");
      final int _cursorIndexOfDocBoundryWest = _cursor.getColumnIndexOrThrow("docBoundryWest");
      final int _cursorIndexOfMatchBoundaryNorth = _cursor.getColumnIndexOrThrow("matchBoundaryNorth");
      final int _cursorIndexOfMatchBoundarySouth = _cursor.getColumnIndexOrThrow("matchBoundarySouth");
      final int _cursorIndexOfMatchBoundaryEast = _cursor.getColumnIndexOrThrow("matchBoundaryEast");
      final int _cursorIndexOfMatchBoundaryWest = _cursor.getColumnIndexOrThrow("matchBoundaryWest");
      final int _cursorIndexOfNorthMeasure = _cursor.getColumnIndexOrThrow("northMeasure");
      final int _cursorIndexOfSouthMeasure = _cursor.getColumnIndexOrThrow("southMeasure");
      final int _cursorIndexOfEastMeasure = _cursor.getColumnIndexOrThrow("eastMeasure");
      final int _cursorIndexOfWestMeasure = _cursor.getColumnIndexOrThrow("westMeasure");
      final int _cursorIndexOfDocNorthMeasure = _cursor.getColumnIndexOrThrow("docNorthMeasure");
      final int _cursorIndexOfDocSouthMeasure = _cursor.getColumnIndexOrThrow("docSouthMeasure");
      final int _cursorIndexOfDocEastMeasure = _cursor.getColumnIndexOrThrow("docEastMeasure");
      final int _cursorIndexOfDocWestMeasure = _cursor.getColumnIndexOrThrow("docWestMeasure");
      final int _cursorIndexOfBoundaryMeasureUnit = _cursor.getColumnIndexOrThrow("boundaryMeasureUnit");
      final int _cursorIndexOfDocSetBackLeft = _cursor.getColumnIndexOrThrow("docSetBackLeft");
      final int _cursorIndexOfDocSetBackRight = _cursor.getColumnIndexOrThrow("docSetBackRight");
      final int _cursorIndexOfDocSetBackFront = _cursor.getColumnIndexOrThrow("docSetBackFront");
      final int _cursorIndexOfDocSetBackRear = _cursor.getColumnIndexOrThrow("docSetBackRear");
      final int _cursorIndexOfSetBackLeft = _cursor.getColumnIndexOrThrow("setBackLeft");
      final int _cursorIndexOfSetBackRight = _cursor.getColumnIndexOrThrow("setBackRight");
      final int _cursorIndexOfSetBackFront = _cursor.getColumnIndexOrThrow("setBackFront");
      final int _cursorIndexOfSetBackRear = _cursor.getColumnIndexOrThrow("setBackRear");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("typeOfPropertyId");
      final int _cursorIndexOfFlatHallNo = _cursor.getColumnIndexOrThrow("flatHallNo");
      final int _cursorIndexOfFlatKitchenNo = _cursor.getColumnIndexOrThrow("flatKitchenNo");
      final int _cursorIndexOfFlatBedroomNo = _cursor.getColumnIndexOrThrow("flatBedroomNo");
      final int _cursorIndexOfFlatDinningNo = _cursor.getColumnIndexOrThrow("flatDinningNo");
      final int _cursorIndexOfFlatBathNo = _cursor.getColumnIndexOrThrow("flatBathNo");
      final int _cursorIndexOfFlatWcNo = _cursor.getColumnIndexOrThrow("flatWcNo");
      final int _cursorIndexOfFlatAttBathWcNo = _cursor.getColumnIndexOrThrow("flatAttBathWcNo");
      final int _cursorIndexOfFlatPassageNo = _cursor.getColumnIndexOrThrow("flatPassageNo");
      final int _cursorIndexOfFlatBalconyNo = _cursor.getColumnIndexOrThrow("flatBalconyNo");
      final int _cursorIndexOfFlatFbNo = _cursor.getColumnIndexOrThrow("flatFbNo");
      final int _cursorIndexOfFlatDbNo = _cursor.getColumnIndexOrThrow("flatDbNo");
      final int _cursorIndexOfFlatTerraceNo = _cursor.getColumnIndexOrThrow("flatTerraceNo");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfNoOfFloors = _cursor.getColumnIndexOrThrow("noOfFloors");
      final int _cursorIndexOfPodiums = _cursor.getColumnIndexOrThrow("podiums");
      final int _cursorIndexOfBasement = _cursor.getColumnIndexOrThrow("basement");
      final int _cursorIndexOfNoOfLiftInBuilding = _cursor.getColumnIndexOrThrow("noOfLiftInBuilding");
      final int _cursorIndexOfNoOfFlatPerFloor = _cursor.getColumnIndexOrThrow("noOfFlatPerFloor");
      final int _cursorIndexOfConstructionId = _cursor.getColumnIndexOrThrow("constructionId");
      final int _cursorIndexOfUnderconstructionLoading = _cursor.getColumnIndexOrThrow("underconstructionLoading");
      final int _cursorIndexOfPlinthComp = _cursor.getColumnIndexOrThrow("plinthComp");
      final int _cursorIndexOfRccComp = _cursor.getColumnIndexOrThrow("rccComp");
      final int _cursorIndexOfBrickWorkComp = _cursor.getColumnIndexOrThrow("brickWorkComp");
      final int _cursorIndexOfPlasteringIntComp = _cursor.getColumnIndexOrThrow("plasteringIntComp");
      final int _cursorIndexOfPlasteringExtComp = _cursor.getColumnIndexOrThrow("plasteringExtComp");
      final int _cursorIndexOfFlooringComp = _cursor.getColumnIndexOrThrow("flooringComp");
      final int _cursorIndexOfElectricComp = _cursor.getColumnIndexOrThrow("electricComp");
      final int _cursorIndexOfPlumbingComp = _cursor.getColumnIndexOrThrow("plumbingComp");
      final int _cursorIndexOfWoodworkComp = _cursor.getColumnIndexOrThrow("woodworkComp");
      final int _cursorIndexOfPaintingComp = _cursor.getColumnIndexOrThrow("paintingComp");
      final int _cursorIndexOfPresentConditionId = _cursor.getColumnIndexOrThrow("presentConditionId");
      final int _cursorIndexOfQualityConstructionId = _cursor.getColumnIndexOrThrow("qualityConstructionId");
      final int _cursorIndexOfAgeOfProperty = _cursor.getColumnIndexOrThrow("ageOfProperty");
      final int _cursorIndexOfResidualLife = _cursor.getColumnIndexOrThrow("residualLife");
      final int _cursorIndexOfTypeOfBuildingId = _cursor.getColumnIndexOrThrow("typeOfBuildingId");
      final int _cursorIndexOfMaintenanceOfBuildingId = _cursor.getColumnIndexOrThrow("maintenanceOfBuildingId");
      final int _cursorIndexOfExteriorPaintId = _cursor.getColumnIndexOrThrow("exteriorPaintId");
      final int _cursorIndexOfGardenExist = _cursor.getColumnIndexOrThrow("gardenExist");
      final int _cursorIndexOfSeperateCompoundId = _cursor.getColumnIndexOrThrow("seperateCompoundId");
      final int _cursorIndexOfPavingAroundBuildingId = _cursor.getColumnIndexOrThrow("pavingAroundBuildingId");
      final int _cursorIndexOfCarParkingId = _cursor.getColumnIndexOrThrow("carParkingId");
      final int _cursorIndexOfWaterAvailabilityId = _cursor.getColumnIndexOrThrow("waterAvailabilityId");
      final int _cursorIndexOfAmenityQualityId = _cursor.getColumnIndexOrThrow("amenityQualityId");
      final int _cursorIndexOfFittingQualityId = _cursor.getColumnIndexOrThrow("fittingQualityId");
      final int _cursorIndexOfAmenities = _cursor.getColumnIndexOrThrow("amenities");
      final int _cursorIndexOfWingNo = _cursor.getColumnIndexOrThrow("wingNo");
      final int _cursorIndexOfWingName = _cursor.getColumnIndexOrThrow("wingName");
      final int _cursorIndexOfDocumentSeenId = _cursor.getColumnIndexOrThrow("documentSeenId");
      final int _cursorIndexOfNameOfSociety = _cursor.getColumnIndexOrThrow("nameOfSociety");
      final int _cursorIndexOfSocietyRegnNo = _cursor.getColumnIndexOrThrow("societyRegnNo");
      final int _cursorIndexOfPropertyTaxReceiptNo = _cursor.getColumnIndexOrThrow("propertyTaxReceiptNo");
      final int _cursorIndexOfPropertyTaxAmount = _cursor.getColumnIndexOrThrow("propertyTaxAmount");
      final int _cursorIndexOfPropertyTaxYear = _cursor.getColumnIndexOrThrow("propertyTaxYear");
      final int _cursorIndexOfShareCertificateNo = _cursor.getColumnIndexOrThrow("shareCertificateNo");
      final int _cursorIndexOfShareCertificateNoOfShares = _cursor.getColumnIndexOrThrow("shareCertificateNoOfShares");
      final int _cursorIndexOfShareCertificateFaceValue = _cursor.getColumnIndexOrThrow("shareCertificateFaceValue");
      final int _cursorIndexOfShareCertificateDistinctiveNo = _cursor.getColumnIndexOrThrow("shareCertificateDistinctiveNo");
      final int _cursorIndexOfPlanApprovedById = _cursor.getColumnIndexOrThrow("planApprovedById");
      final int _cursorIndexOfCommencementNo = _cursor.getColumnIndexOrThrow("commencementNo");
      final int _cursorIndexOfCommencementDate = _cursor.getColumnIndexOrThrow("commencementDate");
      final int _cursorIndexOfOccupancyNo = _cursor.getColumnIndexOrThrow("occupancyNo");
      final int _cursorIndexOfOccupancyDate = _cursor.getColumnIndexOrThrow("occupancyDate");
      final int _cursorIndexOfPremisesDetails = _cursor.getColumnIndexOrThrow("premisesDetails");
      final int _cursorIndexOfStampDutyDate = _cursor.getColumnIndexOrThrow("stampDutyDate");
      final int _cursorIndexOfAgreementDate = _cursor.getColumnIndexOrThrow("agreementDate");
      final int _cursorIndexOfAgreementAmount = _cursor.getColumnIndexOrThrow("agreementAmount");
      final int _cursorIndexOfRegistrationNo = _cursor.getColumnIndexOrThrow("registrationNo");
      final int _cursorIndexOfRegistrationDate = _cursor.getColumnIndexOrThrow("registrationDate");
      final int _cursorIndexOfRegistrationValue = _cursor.getColumnIndexOrThrow("registrationValue");
      final int _cursorIndexOfRemarks = _cursor.getColumnIndexOrThrow("remarks");
      final int _cursorIndexOfOtherRemarks = _cursor.getColumnIndexOrThrow("otherRemarks");
      final int _cursorIndexOfSpecialRemarks = _cursor.getColumnIndexOrThrow("specialRemarks");
      final int _cursorIndexOfOtherDocuments = _cursor.getColumnIndexOrThrow("otherDocuments");
      final int _cursorIndexOfRegistrationReceiptNo = _cursor.getColumnIndexOrThrow("registrationReceiptNo");
      final int _cursorIndexOfRegistrarsValue = _cursor.getColumnIndexOrThrow("registrarsValue");
      final int _cursorIndexOfHallDim = _cursor.getColumnIndexOrThrow("hallDim");
      final int _cursorIndexOfKitchenDim = _cursor.getColumnIndexOrThrow("kitchenDim");
      final int _cursorIndexOfBedroomDim = _cursor.getColumnIndexOrThrow("bedroomDim");
      final int _cursorIndexOfDinningDim = _cursor.getColumnIndexOrThrow("dinningDim");
      final int _cursorIndexOfPassageDim = _cursor.getColumnIndexOrThrow("passageDim");
      final int _cursorIndexOfWcDim = _cursor.getColumnIndexOrThrow("wcDim");
      final int _cursorIndexOfBathDim = _cursor.getColumnIndexOrThrow("bathDim");
      final int _cursorIndexOfWbDim = _cursor.getColumnIndexOrThrow("wbDim");
      final int _cursorIndexOfFbDim = _cursor.getColumnIndexOrThrow("fbDim");
      final int _cursorIndexOfDbDim = _cursor.getColumnIndexOrThrow("dbDim");
      final int _cursorIndexOfBalconyDim = _cursor.getColumnIndexOrThrow("balconyDim");
      final int _cursorIndexOfTerraceDim = _cursor.getColumnIndexOrThrow("terraceDim");
      final int _cursorIndexOfLatLongDetails = _cursor.getColumnIndexOrThrow("latLongDetails");
      final int _cursorIndexOfBrokerDetails = _cursor.getColumnIndexOrThrow("brokerDetails");
      final int _cursorIndexOfTotalMeasurement = _cursor.getColumnIndexOrThrow("totalMeasurement");
      final int _cursorIndexOfGharvalueInterior = _cursor.getColumnIndexOrThrow("gharvalueInterior");
      final int _cursorIndexOfDescribeInteriors = _cursor.getColumnIndexOrThrow("describeInteriors");
      final int _cursorIndexOfGharvalueAmenities = _cursor.getColumnIndexOrThrow("gharvalueAmenities");
      final int _cursorIndexOfDescribeAmenities = _cursor.getColumnIndexOrThrow("describeAmenities");
      final int _cursorIndexOfGharvalueLocation = _cursor.getColumnIndexOrThrow("gharvalueLocation");
      final int _cursorIndexOfDescribeLocation = _cursor.getColumnIndexOrThrow("describeLocation");
      final int _cursorIndexOfPlotDemarcatedAtSite = _cursor.getColumnIndexOrThrow("plotDemarcatedAtSite");
      final int _cursorIndexOfPropertyIdentificationChannelId = _cursor.getColumnIndexOrThrow("propertyIdentificationChannelId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfMarketabilityId = _cursor.getColumnIndexOrThrow("marketabilityId");
      final int _cursorIndexOfPropertyAddressAtSite = _cursor.getColumnIndexOrThrow("propertyAddressAtSite");
      final int _cursorIndexOfSameAsDocumentAddress = _cursor.getColumnIndexOrThrow("sameAsDocumentAddress");
      final int _cursorIndexOfSameAsDocumentBoundary = _cursor.getColumnIndexOrThrow("sameAsDocumentBoundary");
      final int _cursorIndexOfSameAsDocumentDimension = _cursor.getColumnIndexOrThrow("sameAsDocumentDimension");
      final int _cursorIndexOfSameAsDocumentSetBack = _cursor.getColumnIndexOrThrow("sameAsDocumentSetBack");
      final int _cursorIndexOfApproachRoadConditionId = _cursor.getColumnIndexOrThrow("approachRoadConditionId");
      final int _cursorIndexOfLocalityCategoryId = _cursor.getColumnIndexOrThrow("localityCategoryId");
      final int _cursorIndexOfClassId = _cursor.getColumnIndexOrThrow("classId");
      final int _cursorIndexOfTenureId = _cursor.getColumnIndexOrThrow("tenureId");
      final int _cursorIndexOfTypeOfLandId = _cursor.getColumnIndexOrThrow("typeOfLandId");
      final int _cursorIndexOfTypeLocalityId = _cursor.getColumnIndexOrThrow("typeLocalityId");
      final int _cursorIndexOfNameofVendor = _cursor.getColumnIndexOrThrow("NameofVendor");
      final int _cursorIndexOfNameofVendorId = _cursor.getColumnIndexOrThrow("NameofVendorId");
      final int _cursorIndexOfNameOfOccupant = _cursor.getColumnIndexOrThrow("NameOfOccupant");
      final int _cursorIndexOfRelationWithOwner = _cursor.getColumnIndexOrThrow("RelationWithOwner");
      final List<Property> _result = new ArrayList<Property>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Property _item;
        _item = new Property();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final int _tmpEmployeeId;
        _tmpEmployeeId = _cursor.getInt(_cursorIndexOfEmployeeId);
        _item.setEmployeeId(_tmpEmployeeId);
        final String _tmpApplicantAddress;
        _tmpApplicantAddress = _cursor.getString(_cursorIndexOfApplicantAddress);
        _item.setApplicantAddress(_tmpApplicantAddress);
        final String _tmpLandmark;
        _tmpLandmark = _cursor.getString(_cursorIndexOfLandmark);
        _item.setLandmark(_tmpLandmark);
        final String _tmpPurpose;
        _tmpPurpose = _cursor.getString(_cursorIndexOfPurpose);
        _item.setPurpose(_tmpPurpose);
        final String _tmpNameOfPurchaser;
        _tmpNameOfPurchaser = _cursor.getString(_cursorIndexOfNameOfPurchaser);
        _item.setNameOfPurchaser(_tmpNameOfPurchaser);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpMunicipalWard;
        _tmpMunicipalWard = _cursor.getString(_cursorIndexOfMunicipalWard);
        _item.setMunicipalWard(_tmpMunicipalWard);
        final Boolean _tmpIsWithinMunicipalArea;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsWithinMunicipalArea)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsWithinMunicipalArea);
        }
        _tmpIsWithinMunicipalArea = _tmp == null ? null : _tmp != 0;
        _item.setIsWithinMunicipalArea(_tmpIsWithinMunicipalArea);
        final Boolean _tmpIsPropertyInDemolitionList;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsPropertyInDemolitionList)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsPropertyInDemolitionList);
        }
        _tmpIsPropertyInDemolitionList = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setIsPropertyInDemolitionList(_tmpIsPropertyInDemolitionList);
        final String _tmpVillageName;
        _tmpVillageName = _cursor.getString(_cursorIndexOfVillageName);
        _item.setVillageName(_tmpVillageName);
        final String _tmpColonyName;
        _tmpColonyName = _cursor.getString(_cursorIndexOfColonyName);
        _item.setColonyName(_tmpColonyName);
        final String _tmpUnitNo;
        _tmpUnitNo = _cursor.getString(_cursorIndexOfUnitNo);
        _item.setUnitNo(_tmpUnitNo);
        final String _tmpPlotNo;
        _tmpPlotNo = _cursor.getString(_cursorIndexOfPlotNo);
        _item.setPlotNo(_tmpPlotNo);
        final String _tmpSurveyNo;
        _tmpSurveyNo = _cursor.getString(_cursorIndexOfSurveyNo);
        _item.setSurveyNo(_tmpSurveyNo);
        final String _tmpCtsNo;
        _tmpCtsNo = _cursor.getString(_cursorIndexOfCtsNo);
        _item.setCtsNo(_tmpCtsNo);
        final String _tmpAreaOfPlot;
        _tmpAreaOfPlot = _cursor.getString(_cursorIndexOfAreaOfPlot);
        _item.setAreaOfPlot(_tmpAreaOfPlot);
        final String _tmpVariable;
        _tmpVariable = _cursor.getString(_cursorIndexOfVariable);
        _item.setVariable(_tmpVariable);
        final String _tmpSurveyInPresenceOf;
        _tmpSurveyInPresenceOf = _cursor.getString(_cursorIndexOfSurveyInPresenceOf);
        _item.setSurveyInPresenceOf(_tmpSurveyInPresenceOf);
        final String _tmpNearestStation;
        _tmpNearestStation = _cursor.getString(_cursorIndexOfNearestStation);
        _item.setNearestStation(_tmpNearestStation);
        final String _tmpDistance;
        _tmpDistance = _cursor.getString(_cursorIndexOfDistance);
        _item.setDistance(_tmpDistance);
        final String _tmpPresentlyOccupiedId;
        _tmpPresentlyOccupiedId = _cursor.getString(_cursorIndexOfPresentlyOccupiedId);
        _item.setPresentlyOccupiedId(_tmpPresentlyOccupiedId);
        final String _tmpPresentlyOccupied;
        _tmpPresentlyOccupied = _cursor.getString(_cursorIndexOfPresentlyOccupied);
        _item.setPresentlyOccupied(_tmpPresentlyOccupied);
        final String _tmpNameOfSeller;
        _tmpNameOfSeller = _cursor.getString(_cursorIndexOfNameOfSeller);
        _item.setNameOfSeller(_tmpNameOfSeller);
        final String _tmpBoundryNorth;
        _tmpBoundryNorth = _cursor.getString(_cursorIndexOfBoundryNorth);
        _item.setBoundryNorth(_tmpBoundryNorth);
        final String _tmpBoundrySouth;
        _tmpBoundrySouth = _cursor.getString(_cursorIndexOfBoundrySouth);
        _item.setBoundrySouth(_tmpBoundrySouth);
        final String _tmpBoundryEast;
        _tmpBoundryEast = _cursor.getString(_cursorIndexOfBoundryEast);
        _item.setBoundryEast(_tmpBoundryEast);
        final String _tmpBoundryWest;
        _tmpBoundryWest = _cursor.getString(_cursorIndexOfBoundryWest);
        _item.setBoundryWest(_tmpBoundryWest);
        final String _tmpDocBoundryNorth;
        _tmpDocBoundryNorth = _cursor.getString(_cursorIndexOfDocBoundryNorth);
        _item.setDocBoundryNorth(_tmpDocBoundryNorth);
        final String _tmpDocBoundrySouth;
        _tmpDocBoundrySouth = _cursor.getString(_cursorIndexOfDocBoundrySouth);
        _item.setDocBoundrySouth(_tmpDocBoundrySouth);
        final String _tmpDocBoundryEast;
        _tmpDocBoundryEast = _cursor.getString(_cursorIndexOfDocBoundryEast);
        _item.setDocBoundryEast(_tmpDocBoundryEast);
        final String _tmpDocBoundryWest;
        _tmpDocBoundryWest = _cursor.getString(_cursorIndexOfDocBoundryWest);
        _item.setDocBoundryWest(_tmpDocBoundryWest);
        final String _tmpMatchBoundaryNorth;
        _tmpMatchBoundaryNorth = _cursor.getString(_cursorIndexOfMatchBoundaryNorth);
        _item.setMatchBoundaryNorth(_tmpMatchBoundaryNorth);
        final String _tmpMatchBoundarySouth;
        _tmpMatchBoundarySouth = _cursor.getString(_cursorIndexOfMatchBoundarySouth);
        _item.setMatchBoundarySouth(_tmpMatchBoundarySouth);
        final String _tmpMatchBoundaryEast;
        _tmpMatchBoundaryEast = _cursor.getString(_cursorIndexOfMatchBoundaryEast);
        _item.setMatchBoundaryEast(_tmpMatchBoundaryEast);
        final String _tmpMatchBoundaryWest;
        _tmpMatchBoundaryWest = _cursor.getString(_cursorIndexOfMatchBoundaryWest);
        _item.setMatchBoundaryWest(_tmpMatchBoundaryWest);
        final String _tmpNorthMeasure;
        _tmpNorthMeasure = _cursor.getString(_cursorIndexOfNorthMeasure);
        _item.setNorthMeasure(_tmpNorthMeasure);
        final String _tmpSouthMeasure;
        _tmpSouthMeasure = _cursor.getString(_cursorIndexOfSouthMeasure);
        _item.setSouthMeasure(_tmpSouthMeasure);
        final String _tmpEastMeasure;
        _tmpEastMeasure = _cursor.getString(_cursorIndexOfEastMeasure);
        _item.setEastMeasure(_tmpEastMeasure);
        final String _tmpWestMeasure;
        _tmpWestMeasure = _cursor.getString(_cursorIndexOfWestMeasure);
        _item.setWestMeasure(_tmpWestMeasure);
        final String _tmpDocNorthMeasure;
        _tmpDocNorthMeasure = _cursor.getString(_cursorIndexOfDocNorthMeasure);
        _item.setDocNorthMeasure(_tmpDocNorthMeasure);
        final String _tmpDocSouthMeasure;
        _tmpDocSouthMeasure = _cursor.getString(_cursorIndexOfDocSouthMeasure);
        _item.setDocSouthMeasure(_tmpDocSouthMeasure);
        final String _tmpDocEastMeasure;
        _tmpDocEastMeasure = _cursor.getString(_cursorIndexOfDocEastMeasure);
        _item.setDocEastMeasure(_tmpDocEastMeasure);
        final String _tmpDocWestMeasure;
        _tmpDocWestMeasure = _cursor.getString(_cursorIndexOfDocWestMeasure);
        _item.setDocWestMeasure(_tmpDocWestMeasure);
        final String _tmpBoundaryMeasureUnit;
        _tmpBoundaryMeasureUnit = _cursor.getString(_cursorIndexOfBoundaryMeasureUnit);
        _item.setBoundaryMeasureUnit(_tmpBoundaryMeasureUnit);
        final String _tmpDocSetBackLeft;
        _tmpDocSetBackLeft = _cursor.getString(_cursorIndexOfDocSetBackLeft);
        _item.setDocSetBackLeft(_tmpDocSetBackLeft);
        final String _tmpDocSetBackRight;
        _tmpDocSetBackRight = _cursor.getString(_cursorIndexOfDocSetBackRight);
        _item.setDocSetBackRight(_tmpDocSetBackRight);
        final String _tmpDocSetBackFront;
        _tmpDocSetBackFront = _cursor.getString(_cursorIndexOfDocSetBackFront);
        _item.setDocSetBackFront(_tmpDocSetBackFront);
        final String _tmpDocSetBackRear;
        _tmpDocSetBackRear = _cursor.getString(_cursorIndexOfDocSetBackRear);
        _item.setDocSetBackRear(_tmpDocSetBackRear);
        final String _tmpSetBackLeft;
        _tmpSetBackLeft = _cursor.getString(_cursorIndexOfSetBackLeft);
        _item.setSetBackLeft(_tmpSetBackLeft);
        final String _tmpSetBackRight;
        _tmpSetBackRight = _cursor.getString(_cursorIndexOfSetBackRight);
        _item.setSetBackRight(_tmpSetBackRight);
        final String _tmpSetBackFront;
        _tmpSetBackFront = _cursor.getString(_cursorIndexOfSetBackFront);
        _item.setSetBackFront(_tmpSetBackFront);
        final String _tmpSetBackRear;
        _tmpSetBackRear = _cursor.getString(_cursorIndexOfSetBackRear);
        _item.setSetBackRear(_tmpSetBackRear);
        final int _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getInt(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpFlatHallNo;
        _tmpFlatHallNo = _cursor.getString(_cursorIndexOfFlatHallNo);
        _item.setFlatHallNo(_tmpFlatHallNo);
        final String _tmpFlatKitchenNo;
        _tmpFlatKitchenNo = _cursor.getString(_cursorIndexOfFlatKitchenNo);
        _item.setFlatKitchenNo(_tmpFlatKitchenNo);
        final String _tmpFlatBedroomNo;
        _tmpFlatBedroomNo = _cursor.getString(_cursorIndexOfFlatBedroomNo);
        _item.setFlatBedroomNo(_tmpFlatBedroomNo);
        final String _tmpFlatDinningNo;
        _tmpFlatDinningNo = _cursor.getString(_cursorIndexOfFlatDinningNo);
        _item.setFlatDinningNo(_tmpFlatDinningNo);
        final String _tmpFlatBathNo;
        _tmpFlatBathNo = _cursor.getString(_cursorIndexOfFlatBathNo);
        _item.setFlatBathNo(_tmpFlatBathNo);
        final String _tmpFlatWcNo;
        _tmpFlatWcNo = _cursor.getString(_cursorIndexOfFlatWcNo);
        _item.setFlatWcNo(_tmpFlatWcNo);
        final String _tmpFlatAttBathWcNo;
        _tmpFlatAttBathWcNo = _cursor.getString(_cursorIndexOfFlatAttBathWcNo);
        _item.setFlatAttBathWcNo(_tmpFlatAttBathWcNo);
        final String _tmpFlatPassageNo;
        _tmpFlatPassageNo = _cursor.getString(_cursorIndexOfFlatPassageNo);
        _item.setFlatPassageNo(_tmpFlatPassageNo);
        final String _tmpFlatBalconyNo;
        _tmpFlatBalconyNo = _cursor.getString(_cursorIndexOfFlatBalconyNo);
        _item.setFlatBalconyNo(_tmpFlatBalconyNo);
        final String _tmpFlatFbNo;
        _tmpFlatFbNo = _cursor.getString(_cursorIndexOfFlatFbNo);
        _item.setFlatFbNo(_tmpFlatFbNo);
        final String _tmpFlatDbNo;
        _tmpFlatDbNo = _cursor.getString(_cursorIndexOfFlatDbNo);
        _item.setFlatDbNo(_tmpFlatDbNo);
        final String _tmpFlatTerraceNo;
        _tmpFlatTerraceNo = _cursor.getString(_cursorIndexOfFlatTerraceNo);
        _item.setFlatTerraceNo(_tmpFlatTerraceNo);
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
        final String _tmpIntPop;
        _tmpIntPop = _cursor.getString(_cursorIndexOfIntPop);
        _item.setIntPop(_tmpIntPop);
        final String _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getString(_cursorIndexOfTypeOfStructureId);
        _item.setTypeOfStructureId(_tmpTypeOfStructureId);
        final String _tmpNoOfFloors;
        _tmpNoOfFloors = _cursor.getString(_cursorIndexOfNoOfFloors);
        _item.setNoOfFloors(_tmpNoOfFloors);
        final String _tmpPodiums;
        _tmpPodiums = _cursor.getString(_cursorIndexOfPodiums);
        _item.setPodiums(_tmpPodiums);
        final String _tmpBasement;
        _tmpBasement = _cursor.getString(_cursorIndexOfBasement);
        _item.setBasement(_tmpBasement);
        final String _tmpNoOfLiftInBuilding;
        _tmpNoOfLiftInBuilding = _cursor.getString(_cursorIndexOfNoOfLiftInBuilding);
        _item.setNoOfLiftInBuilding(_tmpNoOfLiftInBuilding);
        final String _tmpNoOfFlatPerFloor;
        _tmpNoOfFlatPerFloor = _cursor.getString(_cursorIndexOfNoOfFlatPerFloor);
        _item.setNoOfFlatPerFloor(_tmpNoOfFlatPerFloor);
        final String _tmpConstructionId;
        _tmpConstructionId = _cursor.getString(_cursorIndexOfConstructionId);
        _item.setConstructionId(_tmpConstructionId);
        final String _tmpUnderconstructionLoading;
        _tmpUnderconstructionLoading = _cursor.getString(_cursorIndexOfUnderconstructionLoading);
        _item.setUnderconstructionLoading(_tmpUnderconstructionLoading);
        final String _tmpPlinthComp;
        _tmpPlinthComp = _cursor.getString(_cursorIndexOfPlinthComp);
        _item.setPlinthComp(_tmpPlinthComp);
        final String _tmpRccComp;
        _tmpRccComp = _cursor.getString(_cursorIndexOfRccComp);
        _item.setRccComp(_tmpRccComp);
        final String _tmpBrickWorkComp;
        _tmpBrickWorkComp = _cursor.getString(_cursorIndexOfBrickWorkComp);
        _item.setBrickWorkComp(_tmpBrickWorkComp);
        final String _tmpPlasteringIntComp;
        _tmpPlasteringIntComp = _cursor.getString(_cursorIndexOfPlasteringIntComp);
        _item.setPlasteringIntComp(_tmpPlasteringIntComp);
        final String _tmpPlasteringExtComp;
        _tmpPlasteringExtComp = _cursor.getString(_cursorIndexOfPlasteringExtComp);
        _item.setPlasteringExtComp(_tmpPlasteringExtComp);
        final String _tmpFlooringComp;
        _tmpFlooringComp = _cursor.getString(_cursorIndexOfFlooringComp);
        _item.setFlooringComp(_tmpFlooringComp);
        final String _tmpElectricComp;
        _tmpElectricComp = _cursor.getString(_cursorIndexOfElectricComp);
        _item.setElectricComp(_tmpElectricComp);
        final String _tmpPlumbingComp;
        _tmpPlumbingComp = _cursor.getString(_cursorIndexOfPlumbingComp);
        _item.setPlumbingComp(_tmpPlumbingComp);
        final String _tmpWoodworkComp;
        _tmpWoodworkComp = _cursor.getString(_cursorIndexOfWoodworkComp);
        _item.setWoodworkComp(_tmpWoodworkComp);
        final String _tmpPaintingComp;
        _tmpPaintingComp = _cursor.getString(_cursorIndexOfPaintingComp);
        _item.setPaintingComp(_tmpPaintingComp);
        final String _tmpPresentConditionId;
        _tmpPresentConditionId = _cursor.getString(_cursorIndexOfPresentConditionId);
        _item.setPresentConditionId(_tmpPresentConditionId);
        final String _tmpQualityConstructionId;
        _tmpQualityConstructionId = _cursor.getString(_cursorIndexOfQualityConstructionId);
        _item.setQualityConstructionId(_tmpQualityConstructionId);
        final String _tmpAgeOfProperty;
        _tmpAgeOfProperty = _cursor.getString(_cursorIndexOfAgeOfProperty);
        _item.setAgeOfProperty(_tmpAgeOfProperty);
        final String _tmpResidualLife;
        _tmpResidualLife = _cursor.getString(_cursorIndexOfResidualLife);
        _item.setResidualLife(_tmpResidualLife);
        final String _tmpTypeOfBuildingId;
        _tmpTypeOfBuildingId = _cursor.getString(_cursorIndexOfTypeOfBuildingId);
        _item.setTypeOfBuildingId(_tmpTypeOfBuildingId);
        final String _tmpMaintenanceOfBuildingId;
        _tmpMaintenanceOfBuildingId = _cursor.getString(_cursorIndexOfMaintenanceOfBuildingId);
        _item.setMaintenanceOfBuildingId(_tmpMaintenanceOfBuildingId);
        final String _tmpExteriorPaintId;
        _tmpExteriorPaintId = _cursor.getString(_cursorIndexOfExteriorPaintId);
        _item.setExteriorPaintId(_tmpExteriorPaintId);
        final String _tmpGardenExist;
        _tmpGardenExist = _cursor.getString(_cursorIndexOfGardenExist);
        _item.setGardenExist(_tmpGardenExist);
        final String _tmpSeperateCompoundId;
        _tmpSeperateCompoundId = _cursor.getString(_cursorIndexOfSeperateCompoundId);
        _item.setSeperateCompoundId(_tmpSeperateCompoundId);
        final String _tmpPavingAroundBuildingId;
        _tmpPavingAroundBuildingId = _cursor.getString(_cursorIndexOfPavingAroundBuildingId);
        _item.setPavingAroundBuildingId(_tmpPavingAroundBuildingId);
        final String _tmpCarParkingId;
        _tmpCarParkingId = _cursor.getString(_cursorIndexOfCarParkingId);
        _item.setCarParkingId(_tmpCarParkingId);
        final String _tmpWaterAvailabilityId;
        _tmpWaterAvailabilityId = _cursor.getString(_cursorIndexOfWaterAvailabilityId);
        _item.setWaterAvailabilityId(_tmpWaterAvailabilityId);
        final String _tmpAmenityQualityId;
        _tmpAmenityQualityId = _cursor.getString(_cursorIndexOfAmenityQualityId);
        _item.setAmenityQualityId(_tmpAmenityQualityId);
        final String _tmpFittingQualityId;
        _tmpFittingQualityId = _cursor.getString(_cursorIndexOfFittingQualityId);
        _item.setFittingQualityId(_tmpFittingQualityId);
        final String _tmpAmenities;
        _tmpAmenities = _cursor.getString(_cursorIndexOfAmenities);
        _item.setAmenities(_tmpAmenities);
        final String _tmpWingNo;
        _tmpWingNo = _cursor.getString(_cursorIndexOfWingNo);
        _item.setWingNo(_tmpWingNo);
        final String _tmpWingName;
        _tmpWingName = _cursor.getString(_cursorIndexOfWingName);
        _item.setWingName(_tmpWingName);
        final String _tmpDocumentSeenId;
        _tmpDocumentSeenId = _cursor.getString(_cursorIndexOfDocumentSeenId);
        _item.setDocumentSeenId(_tmpDocumentSeenId);
        final String _tmpNameOfSociety;
        _tmpNameOfSociety = _cursor.getString(_cursorIndexOfNameOfSociety);
        _item.setNameOfSociety(_tmpNameOfSociety);
        final String _tmpSocietyRegnNo;
        _tmpSocietyRegnNo = _cursor.getString(_cursorIndexOfSocietyRegnNo);
        _item.setSocietyRegnNo(_tmpSocietyRegnNo);
        final String _tmpPropertyTaxReceiptNo;
        _tmpPropertyTaxReceiptNo = _cursor.getString(_cursorIndexOfPropertyTaxReceiptNo);
        _item.setPropertyTaxReceiptNo(_tmpPropertyTaxReceiptNo);
        final String _tmpPropertyTaxAmount;
        _tmpPropertyTaxAmount = _cursor.getString(_cursorIndexOfPropertyTaxAmount);
        _item.setPropertyTaxAmount(_tmpPropertyTaxAmount);
        final String _tmpPropertyTaxYear;
        _tmpPropertyTaxYear = _cursor.getString(_cursorIndexOfPropertyTaxYear);
        _item.setPropertyTaxYear(_tmpPropertyTaxYear);
        final String _tmpShareCertificateNo;
        _tmpShareCertificateNo = _cursor.getString(_cursorIndexOfShareCertificateNo);
        _item.setShareCertificateNo(_tmpShareCertificateNo);
        final String _tmpShareCertificateNoOfShares;
        _tmpShareCertificateNoOfShares = _cursor.getString(_cursorIndexOfShareCertificateNoOfShares);
        _item.setShareCertificateNoOfShares(_tmpShareCertificateNoOfShares);
        final String _tmpShareCertificateFaceValue;
        _tmpShareCertificateFaceValue = _cursor.getString(_cursorIndexOfShareCertificateFaceValue);
        _item.setShareCertificateFaceValue(_tmpShareCertificateFaceValue);
        final String _tmpShareCertificateDistinctiveNo;
        _tmpShareCertificateDistinctiveNo = _cursor.getString(_cursorIndexOfShareCertificateDistinctiveNo);
        _item.setShareCertificateDistinctiveNo(_tmpShareCertificateDistinctiveNo);
        final String _tmpPlanApprovedById;
        _tmpPlanApprovedById = _cursor.getString(_cursorIndexOfPlanApprovedById);
        _item.setPlanApprovedById(_tmpPlanApprovedById);
        final String _tmpCommencementNo;
        _tmpCommencementNo = _cursor.getString(_cursorIndexOfCommencementNo);
        _item.setCommencementNo(_tmpCommencementNo);
        final String _tmpCommencementDate;
        _tmpCommencementDate = _cursor.getString(_cursorIndexOfCommencementDate);
        _item.setCommencementDate(_tmpCommencementDate);
        final String _tmpOccupancyNo;
        _tmpOccupancyNo = _cursor.getString(_cursorIndexOfOccupancyNo);
        _item.setOccupancyNo(_tmpOccupancyNo);
        final String _tmpOccupancyDate;
        _tmpOccupancyDate = _cursor.getString(_cursorIndexOfOccupancyDate);
        _item.setOccupancyDate(_tmpOccupancyDate);
        final String _tmpPremisesDetails;
        _tmpPremisesDetails = _cursor.getString(_cursorIndexOfPremisesDetails);
        _item.setPremisesDetails(_tmpPremisesDetails);
        final String _tmpStampDutyDate;
        _tmpStampDutyDate = _cursor.getString(_cursorIndexOfStampDutyDate);
        _item.setStampDutyDate(_tmpStampDutyDate);
        final String _tmpAgreementDate;
        _tmpAgreementDate = _cursor.getString(_cursorIndexOfAgreementDate);
        _item.setAgreementDate(_tmpAgreementDate);
        final String _tmpAgreementAmount;
        _tmpAgreementAmount = _cursor.getString(_cursorIndexOfAgreementAmount);
        _item.setAgreementAmount(_tmpAgreementAmount);
        final String _tmpRegistrationNo;
        _tmpRegistrationNo = _cursor.getString(_cursorIndexOfRegistrationNo);
        _item.setRegistrationNo(_tmpRegistrationNo);
        final String _tmpRegistrationDate;
        _tmpRegistrationDate = _cursor.getString(_cursorIndexOfRegistrationDate);
        _item.setRegistrationDate(_tmpRegistrationDate);
        final String _tmpRegistrationValue;
        _tmpRegistrationValue = _cursor.getString(_cursorIndexOfRegistrationValue);
        _item.setRegistrationValue(_tmpRegistrationValue);
        final String _tmpRemarks;
        _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
        _item.setRemarks(_tmpRemarks);
        final String _tmpOtherRemarks;
        _tmpOtherRemarks = _cursor.getString(_cursorIndexOfOtherRemarks);
        _item.setOtherRemarks(_tmpOtherRemarks);
        final String _tmpSpecialRemarks;
        _tmpSpecialRemarks = _cursor.getString(_cursorIndexOfSpecialRemarks);
        _item.setSpecialRemarks(_tmpSpecialRemarks);
        final String _tmpOtherDocuments;
        _tmpOtherDocuments = _cursor.getString(_cursorIndexOfOtherDocuments);
        _item.setOtherDocuments(_tmpOtherDocuments);
        final String _tmpRegistrationReceiptNo;
        _tmpRegistrationReceiptNo = _cursor.getString(_cursorIndexOfRegistrationReceiptNo);
        _item.setRegistrationReceiptNo(_tmpRegistrationReceiptNo);
        final String _tmpRegistrarsValue;
        _tmpRegistrarsValue = _cursor.getString(_cursorIndexOfRegistrarsValue);
        _item.setRegistrarsValue(_tmpRegistrarsValue);
        final String _tmpHallDim;
        _tmpHallDim = _cursor.getString(_cursorIndexOfHallDim);
        _item.setHallDim(_tmpHallDim);
        final String _tmpKitchenDim;
        _tmpKitchenDim = _cursor.getString(_cursorIndexOfKitchenDim);
        _item.setKitchenDim(_tmpKitchenDim);
        final String _tmpBedroomDim;
        _tmpBedroomDim = _cursor.getString(_cursorIndexOfBedroomDim);
        _item.setBedroomDim(_tmpBedroomDim);
        final String _tmpDinningDim;
        _tmpDinningDim = _cursor.getString(_cursorIndexOfDinningDim);
        _item.setDinningDim(_tmpDinningDim);
        final String _tmpPassageDim;
        _tmpPassageDim = _cursor.getString(_cursorIndexOfPassageDim);
        _item.setPassageDim(_tmpPassageDim);
        final String _tmpWcDim;
        _tmpWcDim = _cursor.getString(_cursorIndexOfWcDim);
        _item.setWcDim(_tmpWcDim);
        final String _tmpBathDim;
        _tmpBathDim = _cursor.getString(_cursorIndexOfBathDim);
        _item.setBathDim(_tmpBathDim);
        final String _tmpWbDim;
        _tmpWbDim = _cursor.getString(_cursorIndexOfWbDim);
        _item.setWbDim(_tmpWbDim);
        final String _tmpFbDim;
        _tmpFbDim = _cursor.getString(_cursorIndexOfFbDim);
        _item.setFbDim(_tmpFbDim);
        final String _tmpDbDim;
        _tmpDbDim = _cursor.getString(_cursorIndexOfDbDim);
        _item.setDbDim(_tmpDbDim);
        final String _tmpBalconyDim;
        _tmpBalconyDim = _cursor.getString(_cursorIndexOfBalconyDim);
        _item.setBalconyDim(_tmpBalconyDim);
        final String _tmpTerraceDim;
        _tmpTerraceDim = _cursor.getString(_cursorIndexOfTerraceDim);
        _item.setTerraceDim(_tmpTerraceDim);
        final String _tmpLatLongDetails;
        _tmpLatLongDetails = _cursor.getString(_cursorIndexOfLatLongDetails);
        _item.setLatLongDetails(_tmpLatLongDetails);
        final String _tmpBrokerDetails;
        _tmpBrokerDetails = _cursor.getString(_cursorIndexOfBrokerDetails);
        _item.setBrokerDetails(_tmpBrokerDetails);
        final String _tmpTotalMeasurement;
        _tmpTotalMeasurement = _cursor.getString(_cursorIndexOfTotalMeasurement);
        _item.setTotalMeasurement(_tmpTotalMeasurement);
        final String _tmpGharvalueInterior;
        _tmpGharvalueInterior = _cursor.getString(_cursorIndexOfGharvalueInterior);
        _item.setGharvalueInterior(_tmpGharvalueInterior);
        final String _tmpDescribeInteriors;
        _tmpDescribeInteriors = _cursor.getString(_cursorIndexOfDescribeInteriors);
        _item.setDescribeInteriors(_tmpDescribeInteriors);
        final String _tmpGharvalueAmenities;
        _tmpGharvalueAmenities = _cursor.getString(_cursorIndexOfGharvalueAmenities);
        _item.setGharvalueAmenities(_tmpGharvalueAmenities);
        final String _tmpDescribeAmenities;
        _tmpDescribeAmenities = _cursor.getString(_cursorIndexOfDescribeAmenities);
        _item.setDescribeAmenities(_tmpDescribeAmenities);
        final String _tmpGharvalueLocation;
        _tmpGharvalueLocation = _cursor.getString(_cursorIndexOfGharvalueLocation);
        _item.setGharvalueLocation(_tmpGharvalueLocation);
        final String _tmpDescribeLocation;
        _tmpDescribeLocation = _cursor.getString(_cursorIndexOfDescribeLocation);
        _item.setDescribeLocation(_tmpDescribeLocation);
        final Boolean _tmpPlotDemarcatedAtSite;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfPlotDemarcatedAtSite)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfPlotDemarcatedAtSite);
        }
        _tmpPlotDemarcatedAtSite = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setPlotDemarcatedAtSite(_tmpPlotDemarcatedAtSite);
        final String _tmpPropertyIdentificationChannelId;
        _tmpPropertyIdentificationChannelId = _cursor.getString(_cursorIndexOfPropertyIdentificationChannelId);
        _item.setPropertyIdentificationChannelId(_tmpPropertyIdentificationChannelId);
        final String _tmpPassageTypeId;
        _tmpPassageTypeId = _cursor.getString(_cursorIndexOfPassageTypeId);
        _item.setPassageTypeId(_tmpPassageTypeId);
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
        final String _tmpMarketabilityId;
        _tmpMarketabilityId = _cursor.getString(_cursorIndexOfMarketabilityId);
        _item.setMarketabilityId(_tmpMarketabilityId);
        final String _tmpPropertyAddressAtSite;
        _tmpPropertyAddressAtSite = _cursor.getString(_cursorIndexOfPropertyAddressAtSite);
        _item.setPropertyAddressAtSite(_tmpPropertyAddressAtSite);
        final Boolean _tmpSameAsDocumentAddress;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentAddress)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfSameAsDocumentAddress);
        }
        _tmpSameAsDocumentAddress = _tmp_3 == null ? null : _tmp_3 != 0;
        _item.setSameAsDocumentAddress(_tmpSameAsDocumentAddress);
        final Boolean _tmpSameAsDocumentBoundary;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentBoundary)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfSameAsDocumentBoundary);
        }
        _tmpSameAsDocumentBoundary = _tmp_4 == null ? null : _tmp_4 != 0;
        _item.setSameAsDocumentBoundary(_tmpSameAsDocumentBoundary);
        final Boolean _tmpSameAsDocumentDimension;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentDimension)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfSameAsDocumentDimension);
        }
        _tmpSameAsDocumentDimension = _tmp_5 == null ? null : _tmp_5 != 0;
        _item.setSameAsDocumentDimension(_tmpSameAsDocumentDimension);
        final Boolean _tmpSameAsDocumentSetBack;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentSetBack)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfSameAsDocumentSetBack);
        }
        _tmpSameAsDocumentSetBack = _tmp_6 == null ? null : _tmp_6 != 0;
        _item.setSameAsDocumentSetBack(_tmpSameAsDocumentSetBack);
        final Integer _tmpApproachRoadConditionId;
        if (_cursor.isNull(_cursorIndexOfApproachRoadConditionId)) {
          _tmpApproachRoadConditionId = null;
        } else {
          _tmpApproachRoadConditionId = _cursor.getInt(_cursorIndexOfApproachRoadConditionId);
        }
        _item.setApproachRoadConditionId(_tmpApproachRoadConditionId);
        final Integer _tmpLocalityCategoryId;
        if (_cursor.isNull(_cursorIndexOfLocalityCategoryId)) {
          _tmpLocalityCategoryId = null;
        } else {
          _tmpLocalityCategoryId = _cursor.getInt(_cursorIndexOfLocalityCategoryId);
        }
        _item.setLocalityCategoryId(_tmpLocalityCategoryId);
        final Integer _tmpClassId;
        if (_cursor.isNull(_cursorIndexOfClassId)) {
          _tmpClassId = null;
        } else {
          _tmpClassId = _cursor.getInt(_cursorIndexOfClassId);
        }
        _item.setClassId(_tmpClassId);
        final Integer _tmpTenureId;
        if (_cursor.isNull(_cursorIndexOfTenureId)) {
          _tmpTenureId = null;
        } else {
          _tmpTenureId = _cursor.getInt(_cursorIndexOfTenureId);
        }
        _item.setTenureId(_tmpTenureId);
        final Integer _tmpTypeOfLandId;
        if (_cursor.isNull(_cursorIndexOfTypeOfLandId)) {
          _tmpTypeOfLandId = null;
        } else {
          _tmpTypeOfLandId = _cursor.getInt(_cursorIndexOfTypeOfLandId);
        }
        _item.setTypeOfLandId(_tmpTypeOfLandId);
        final Integer _tmpTypeLocalityId;
        if (_cursor.isNull(_cursorIndexOfTypeLocalityId)) {
          _tmpTypeLocalityId = null;
        } else {
          _tmpTypeLocalityId = _cursor.getInt(_cursorIndexOfTypeLocalityId);
        }
        _item.setTypeLocalityId(_tmpTypeLocalityId);
        final String _tmpNameofVendor;
        _tmpNameofVendor = _cursor.getString(_cursorIndexOfNameofVendor);
        _item.setNameofVendor(_tmpNameofVendor);
        final Integer _tmpNameofVendorId;
        if (_cursor.isNull(_cursorIndexOfNameofVendorId)) {
          _tmpNameofVendorId = null;
        } else {
          _tmpNameofVendorId = _cursor.getInt(_cursorIndexOfNameofVendorId);
        }
        _item.setNameofVendorId(_tmpNameofVendorId);
        final String _tmpNameOfOccupant;
        _tmpNameOfOccupant = _cursor.getString(_cursorIndexOfNameOfOccupant);
        _item.setNameOfOccupant(_tmpNameOfOccupant);
        final String _tmpRelationWithOwner;
        _tmpRelationWithOwner = _cursor.getString(_cursorIndexOfRelationWithOwner);
        _item.setRelationWithOwner(_tmpRelationWithOwner);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Property> getProperty_caseID(int caseid_) {
    final String _sql = "SELECT * FROM propertymodal where CaseId = (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, caseid_);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfDummyID = _cursor.getColumnIndexOrThrow("dummyID");
      final int _cursorIndexOfCaseId = _cursor.getColumnIndexOrThrow("CaseId");
      final int _cursorIndexOfPropertyId = _cursor.getColumnIndexOrThrow("propertyId");
      final int _cursorIndexOfEmployeeId = _cursor.getColumnIndexOrThrow("employeeId");
      final int _cursorIndexOfApplicantAddress = _cursor.getColumnIndexOrThrow("applicantAddress");
      final int _cursorIndexOfLandmark = _cursor.getColumnIndexOrThrow("landmark");
      final int _cursorIndexOfPurpose = _cursor.getColumnIndexOrThrow("purpose");
      final int _cursorIndexOfNameOfPurchaser = _cursor.getColumnIndexOrThrow("nameOfPurchaser");
      final int _cursorIndexOfPropertyAddress = _cursor.getColumnIndexOrThrow("propertyAddress");
      final int _cursorIndexOfMunicipalWard = _cursor.getColumnIndexOrThrow("municipalWard");
      final int _cursorIndexOfIsWithinMunicipalArea = _cursor.getColumnIndexOrThrow("isWithinMunicipalArea");
      final int _cursorIndexOfIsPropertyInDemolitionList = _cursor.getColumnIndexOrThrow("isPropertyInDemolitionList");
      final int _cursorIndexOfVillageName = _cursor.getColumnIndexOrThrow("villageName");
      final int _cursorIndexOfColonyName = _cursor.getColumnIndexOrThrow("colonyName");
      final int _cursorIndexOfUnitNo = _cursor.getColumnIndexOrThrow("unitNo");
      final int _cursorIndexOfPlotNo = _cursor.getColumnIndexOrThrow("plotNo");
      final int _cursorIndexOfSurveyNo = _cursor.getColumnIndexOrThrow("surveyNo");
      final int _cursorIndexOfCtsNo = _cursor.getColumnIndexOrThrow("ctsNo");
      final int _cursorIndexOfAreaOfPlot = _cursor.getColumnIndexOrThrow("areaOfPlot");
      final int _cursorIndexOfVariable = _cursor.getColumnIndexOrThrow("variable");
      final int _cursorIndexOfSurveyInPresenceOf = _cursor.getColumnIndexOrThrow("surveyInPresenceOf");
      final int _cursorIndexOfNearestStation = _cursor.getColumnIndexOrThrow("nearestStation");
      final int _cursorIndexOfDistance = _cursor.getColumnIndexOrThrow("distance");
      final int _cursorIndexOfPresentlyOccupiedId = _cursor.getColumnIndexOrThrow("presentlyOccupiedId");
      final int _cursorIndexOfPresentlyOccupied = _cursor.getColumnIndexOrThrow("presentlyOccupied");
      final int _cursorIndexOfNameOfSeller = _cursor.getColumnIndexOrThrow("nameOfSeller");
      final int _cursorIndexOfBoundryNorth = _cursor.getColumnIndexOrThrow("boundryNorth");
      final int _cursorIndexOfBoundrySouth = _cursor.getColumnIndexOrThrow("boundrySouth");
      final int _cursorIndexOfBoundryEast = _cursor.getColumnIndexOrThrow("boundryEast");
      final int _cursorIndexOfBoundryWest = _cursor.getColumnIndexOrThrow("boundryWest");
      final int _cursorIndexOfDocBoundryNorth = _cursor.getColumnIndexOrThrow("docBoundryNorth");
      final int _cursorIndexOfDocBoundrySouth = _cursor.getColumnIndexOrThrow("docBoundrySouth");
      final int _cursorIndexOfDocBoundryEast = _cursor.getColumnIndexOrThrow("docBoundryEast");
      final int _cursorIndexOfDocBoundryWest = _cursor.getColumnIndexOrThrow("docBoundryWest");
      final int _cursorIndexOfMatchBoundaryNorth = _cursor.getColumnIndexOrThrow("matchBoundaryNorth");
      final int _cursorIndexOfMatchBoundarySouth = _cursor.getColumnIndexOrThrow("matchBoundarySouth");
      final int _cursorIndexOfMatchBoundaryEast = _cursor.getColumnIndexOrThrow("matchBoundaryEast");
      final int _cursorIndexOfMatchBoundaryWest = _cursor.getColumnIndexOrThrow("matchBoundaryWest");
      final int _cursorIndexOfNorthMeasure = _cursor.getColumnIndexOrThrow("northMeasure");
      final int _cursorIndexOfSouthMeasure = _cursor.getColumnIndexOrThrow("southMeasure");
      final int _cursorIndexOfEastMeasure = _cursor.getColumnIndexOrThrow("eastMeasure");
      final int _cursorIndexOfWestMeasure = _cursor.getColumnIndexOrThrow("westMeasure");
      final int _cursorIndexOfDocNorthMeasure = _cursor.getColumnIndexOrThrow("docNorthMeasure");
      final int _cursorIndexOfDocSouthMeasure = _cursor.getColumnIndexOrThrow("docSouthMeasure");
      final int _cursorIndexOfDocEastMeasure = _cursor.getColumnIndexOrThrow("docEastMeasure");
      final int _cursorIndexOfDocWestMeasure = _cursor.getColumnIndexOrThrow("docWestMeasure");
      final int _cursorIndexOfBoundaryMeasureUnit = _cursor.getColumnIndexOrThrow("boundaryMeasureUnit");
      final int _cursorIndexOfDocSetBackLeft = _cursor.getColumnIndexOrThrow("docSetBackLeft");
      final int _cursorIndexOfDocSetBackRight = _cursor.getColumnIndexOrThrow("docSetBackRight");
      final int _cursorIndexOfDocSetBackFront = _cursor.getColumnIndexOrThrow("docSetBackFront");
      final int _cursorIndexOfDocSetBackRear = _cursor.getColumnIndexOrThrow("docSetBackRear");
      final int _cursorIndexOfSetBackLeft = _cursor.getColumnIndexOrThrow("setBackLeft");
      final int _cursorIndexOfSetBackRight = _cursor.getColumnIndexOrThrow("setBackRight");
      final int _cursorIndexOfSetBackFront = _cursor.getColumnIndexOrThrow("setBackFront");
      final int _cursorIndexOfSetBackRear = _cursor.getColumnIndexOrThrow("setBackRear");
      final int _cursorIndexOfTypeOfPropertyId = _cursor.getColumnIndexOrThrow("typeOfPropertyId");
      final int _cursorIndexOfFlatHallNo = _cursor.getColumnIndexOrThrow("flatHallNo");
      final int _cursorIndexOfFlatKitchenNo = _cursor.getColumnIndexOrThrow("flatKitchenNo");
      final int _cursorIndexOfFlatBedroomNo = _cursor.getColumnIndexOrThrow("flatBedroomNo");
      final int _cursorIndexOfFlatDinningNo = _cursor.getColumnIndexOrThrow("flatDinningNo");
      final int _cursorIndexOfFlatBathNo = _cursor.getColumnIndexOrThrow("flatBathNo");
      final int _cursorIndexOfFlatWcNo = _cursor.getColumnIndexOrThrow("flatWcNo");
      final int _cursorIndexOfFlatAttBathWcNo = _cursor.getColumnIndexOrThrow("flatAttBathWcNo");
      final int _cursorIndexOfFlatPassageNo = _cursor.getColumnIndexOrThrow("flatPassageNo");
      final int _cursorIndexOfFlatBalconyNo = _cursor.getColumnIndexOrThrow("flatBalconyNo");
      final int _cursorIndexOfFlatFbNo = _cursor.getColumnIndexOrThrow("flatFbNo");
      final int _cursorIndexOfFlatDbNo = _cursor.getColumnIndexOrThrow("flatDbNo");
      final int _cursorIndexOfFlatTerraceNo = _cursor.getColumnIndexOrThrow("flatTerraceNo");
      final int _cursorIndexOfIntFloorId = _cursor.getColumnIndexOrThrow("intFloorId");
      final int _cursorIndexOfIntKitchenType = _cursor.getColumnIndexOrThrow("intKitchenType");
      final int _cursorIndexOfIntKitchenShape = _cursor.getColumnIndexOrThrow("intKitchenShape");
      final int _cursorIndexOfIntWindowId = _cursor.getColumnIndexOrThrow("intWindowId");
      final int _cursorIndexOfIntDoorId = _cursor.getColumnIndexOrThrow("intDoorId");
      final int _cursorIndexOfIntWcId = _cursor.getColumnIndexOrThrow("intWcId");
      final int _cursorIndexOfIntBathId = _cursor.getColumnIndexOrThrow("intBathId");
      final int _cursorIndexOfIntPaintId = _cursor.getColumnIndexOrThrow("intPaintId");
      final int _cursorIndexOfIntPop = _cursor.getColumnIndexOrThrow("intPop");
      final int _cursorIndexOfTypeOfStructureId = _cursor.getColumnIndexOrThrow("typeOfStructureId");
      final int _cursorIndexOfNoOfFloors = _cursor.getColumnIndexOrThrow("noOfFloors");
      final int _cursorIndexOfPodiums = _cursor.getColumnIndexOrThrow("podiums");
      final int _cursorIndexOfBasement = _cursor.getColumnIndexOrThrow("basement");
      final int _cursorIndexOfNoOfLiftInBuilding = _cursor.getColumnIndexOrThrow("noOfLiftInBuilding");
      final int _cursorIndexOfNoOfFlatPerFloor = _cursor.getColumnIndexOrThrow("noOfFlatPerFloor");
      final int _cursorIndexOfConstructionId = _cursor.getColumnIndexOrThrow("constructionId");
      final int _cursorIndexOfUnderconstructionLoading = _cursor.getColumnIndexOrThrow("underconstructionLoading");
      final int _cursorIndexOfPlinthComp = _cursor.getColumnIndexOrThrow("plinthComp");
      final int _cursorIndexOfRccComp = _cursor.getColumnIndexOrThrow("rccComp");
      final int _cursorIndexOfBrickWorkComp = _cursor.getColumnIndexOrThrow("brickWorkComp");
      final int _cursorIndexOfPlasteringIntComp = _cursor.getColumnIndexOrThrow("plasteringIntComp");
      final int _cursorIndexOfPlasteringExtComp = _cursor.getColumnIndexOrThrow("plasteringExtComp");
      final int _cursorIndexOfFlooringComp = _cursor.getColumnIndexOrThrow("flooringComp");
      final int _cursorIndexOfElectricComp = _cursor.getColumnIndexOrThrow("electricComp");
      final int _cursorIndexOfPlumbingComp = _cursor.getColumnIndexOrThrow("plumbingComp");
      final int _cursorIndexOfWoodworkComp = _cursor.getColumnIndexOrThrow("woodworkComp");
      final int _cursorIndexOfPaintingComp = _cursor.getColumnIndexOrThrow("paintingComp");
      final int _cursorIndexOfPresentConditionId = _cursor.getColumnIndexOrThrow("presentConditionId");
      final int _cursorIndexOfQualityConstructionId = _cursor.getColumnIndexOrThrow("qualityConstructionId");
      final int _cursorIndexOfAgeOfProperty = _cursor.getColumnIndexOrThrow("ageOfProperty");
      final int _cursorIndexOfResidualLife = _cursor.getColumnIndexOrThrow("residualLife");
      final int _cursorIndexOfTypeOfBuildingId = _cursor.getColumnIndexOrThrow("typeOfBuildingId");
      final int _cursorIndexOfMaintenanceOfBuildingId = _cursor.getColumnIndexOrThrow("maintenanceOfBuildingId");
      final int _cursorIndexOfExteriorPaintId = _cursor.getColumnIndexOrThrow("exteriorPaintId");
      final int _cursorIndexOfGardenExist = _cursor.getColumnIndexOrThrow("gardenExist");
      final int _cursorIndexOfSeperateCompoundId = _cursor.getColumnIndexOrThrow("seperateCompoundId");
      final int _cursorIndexOfPavingAroundBuildingId = _cursor.getColumnIndexOrThrow("pavingAroundBuildingId");
      final int _cursorIndexOfCarParkingId = _cursor.getColumnIndexOrThrow("carParkingId");
      final int _cursorIndexOfWaterAvailabilityId = _cursor.getColumnIndexOrThrow("waterAvailabilityId");
      final int _cursorIndexOfAmenityQualityId = _cursor.getColumnIndexOrThrow("amenityQualityId");
      final int _cursorIndexOfFittingQualityId = _cursor.getColumnIndexOrThrow("fittingQualityId");
      final int _cursorIndexOfAmenities = _cursor.getColumnIndexOrThrow("amenities");
      final int _cursorIndexOfWingNo = _cursor.getColumnIndexOrThrow("wingNo");
      final int _cursorIndexOfWingName = _cursor.getColumnIndexOrThrow("wingName");
      final int _cursorIndexOfDocumentSeenId = _cursor.getColumnIndexOrThrow("documentSeenId");
      final int _cursorIndexOfNameOfSociety = _cursor.getColumnIndexOrThrow("nameOfSociety");
      final int _cursorIndexOfSocietyRegnNo = _cursor.getColumnIndexOrThrow("societyRegnNo");
      final int _cursorIndexOfPropertyTaxReceiptNo = _cursor.getColumnIndexOrThrow("propertyTaxReceiptNo");
      final int _cursorIndexOfPropertyTaxAmount = _cursor.getColumnIndexOrThrow("propertyTaxAmount");
      final int _cursorIndexOfPropertyTaxYear = _cursor.getColumnIndexOrThrow("propertyTaxYear");
      final int _cursorIndexOfShareCertificateNo = _cursor.getColumnIndexOrThrow("shareCertificateNo");
      final int _cursorIndexOfShareCertificateNoOfShares = _cursor.getColumnIndexOrThrow("shareCertificateNoOfShares");
      final int _cursorIndexOfShareCertificateFaceValue = _cursor.getColumnIndexOrThrow("shareCertificateFaceValue");
      final int _cursorIndexOfShareCertificateDistinctiveNo = _cursor.getColumnIndexOrThrow("shareCertificateDistinctiveNo");
      final int _cursorIndexOfPlanApprovedById = _cursor.getColumnIndexOrThrow("planApprovedById");
      final int _cursorIndexOfCommencementNo = _cursor.getColumnIndexOrThrow("commencementNo");
      final int _cursorIndexOfCommencementDate = _cursor.getColumnIndexOrThrow("commencementDate");
      final int _cursorIndexOfOccupancyNo = _cursor.getColumnIndexOrThrow("occupancyNo");
      final int _cursorIndexOfOccupancyDate = _cursor.getColumnIndexOrThrow("occupancyDate");
      final int _cursorIndexOfPremisesDetails = _cursor.getColumnIndexOrThrow("premisesDetails");
      final int _cursorIndexOfStampDutyDate = _cursor.getColumnIndexOrThrow("stampDutyDate");
      final int _cursorIndexOfAgreementDate = _cursor.getColumnIndexOrThrow("agreementDate");
      final int _cursorIndexOfAgreementAmount = _cursor.getColumnIndexOrThrow("agreementAmount");
      final int _cursorIndexOfRegistrationNo = _cursor.getColumnIndexOrThrow("registrationNo");
      final int _cursorIndexOfRegistrationDate = _cursor.getColumnIndexOrThrow("registrationDate");
      final int _cursorIndexOfRegistrationValue = _cursor.getColumnIndexOrThrow("registrationValue");
      final int _cursorIndexOfRemarks = _cursor.getColumnIndexOrThrow("remarks");
      final int _cursorIndexOfOtherRemarks = _cursor.getColumnIndexOrThrow("otherRemarks");
      final int _cursorIndexOfSpecialRemarks = _cursor.getColumnIndexOrThrow("specialRemarks");
      final int _cursorIndexOfOtherDocuments = _cursor.getColumnIndexOrThrow("otherDocuments");
      final int _cursorIndexOfRegistrationReceiptNo = _cursor.getColumnIndexOrThrow("registrationReceiptNo");
      final int _cursorIndexOfRegistrarsValue = _cursor.getColumnIndexOrThrow("registrarsValue");
      final int _cursorIndexOfHallDim = _cursor.getColumnIndexOrThrow("hallDim");
      final int _cursorIndexOfKitchenDim = _cursor.getColumnIndexOrThrow("kitchenDim");
      final int _cursorIndexOfBedroomDim = _cursor.getColumnIndexOrThrow("bedroomDim");
      final int _cursorIndexOfDinningDim = _cursor.getColumnIndexOrThrow("dinningDim");
      final int _cursorIndexOfPassageDim = _cursor.getColumnIndexOrThrow("passageDim");
      final int _cursorIndexOfWcDim = _cursor.getColumnIndexOrThrow("wcDim");
      final int _cursorIndexOfBathDim = _cursor.getColumnIndexOrThrow("bathDim");
      final int _cursorIndexOfWbDim = _cursor.getColumnIndexOrThrow("wbDim");
      final int _cursorIndexOfFbDim = _cursor.getColumnIndexOrThrow("fbDim");
      final int _cursorIndexOfDbDim = _cursor.getColumnIndexOrThrow("dbDim");
      final int _cursorIndexOfBalconyDim = _cursor.getColumnIndexOrThrow("balconyDim");
      final int _cursorIndexOfTerraceDim = _cursor.getColumnIndexOrThrow("terraceDim");
      final int _cursorIndexOfLatLongDetails = _cursor.getColumnIndexOrThrow("latLongDetails");
      final int _cursorIndexOfBrokerDetails = _cursor.getColumnIndexOrThrow("brokerDetails");
      final int _cursorIndexOfTotalMeasurement = _cursor.getColumnIndexOrThrow("totalMeasurement");
      final int _cursorIndexOfGharvalueInterior = _cursor.getColumnIndexOrThrow("gharvalueInterior");
      final int _cursorIndexOfDescribeInteriors = _cursor.getColumnIndexOrThrow("describeInteriors");
      final int _cursorIndexOfGharvalueAmenities = _cursor.getColumnIndexOrThrow("gharvalueAmenities");
      final int _cursorIndexOfDescribeAmenities = _cursor.getColumnIndexOrThrow("describeAmenities");
      final int _cursorIndexOfGharvalueLocation = _cursor.getColumnIndexOrThrow("gharvalueLocation");
      final int _cursorIndexOfDescribeLocation = _cursor.getColumnIndexOrThrow("describeLocation");
      final int _cursorIndexOfPlotDemarcatedAtSite = _cursor.getColumnIndexOrThrow("plotDemarcatedAtSite");
      final int _cursorIndexOfPropertyIdentificationChannelId = _cursor.getColumnIndexOrThrow("propertyIdentificationChannelId");
      final int _cursorIndexOfPassageTypeId = _cursor.getColumnIndexOrThrow("passageTypeId");
      final int _cursorIndexOfCreatedOn = _cursor.getColumnIndexOrThrow("createdOn");
      final int _cursorIndexOfCreatedBy = _cursor.getColumnIndexOrThrow("createdBy");
      final int _cursorIndexOfModifiedOn = _cursor.getColumnIndexOrThrow("modifiedOn");
      final int _cursorIndexOfModifiedBy = _cursor.getColumnIndexOrThrow("modifiedBy");
      final int _cursorIndexOfMarketabilityId = _cursor.getColumnIndexOrThrow("marketabilityId");
      final int _cursorIndexOfPropertyAddressAtSite = _cursor.getColumnIndexOrThrow("propertyAddressAtSite");
      final int _cursorIndexOfSameAsDocumentAddress = _cursor.getColumnIndexOrThrow("sameAsDocumentAddress");
      final int _cursorIndexOfSameAsDocumentBoundary = _cursor.getColumnIndexOrThrow("sameAsDocumentBoundary");
      final int _cursorIndexOfSameAsDocumentDimension = _cursor.getColumnIndexOrThrow("sameAsDocumentDimension");
      final int _cursorIndexOfSameAsDocumentSetBack = _cursor.getColumnIndexOrThrow("sameAsDocumentSetBack");
      final int _cursorIndexOfApproachRoadConditionId = _cursor.getColumnIndexOrThrow("approachRoadConditionId");
      final int _cursorIndexOfLocalityCategoryId = _cursor.getColumnIndexOrThrow("localityCategoryId");
      final int _cursorIndexOfClassId = _cursor.getColumnIndexOrThrow("classId");
      final int _cursorIndexOfTenureId = _cursor.getColumnIndexOrThrow("tenureId");
      final int _cursorIndexOfTypeOfLandId = _cursor.getColumnIndexOrThrow("typeOfLandId");
      final int _cursorIndexOfTypeLocalityId = _cursor.getColumnIndexOrThrow("typeLocalityId");
      final int _cursorIndexOfNameofVendor = _cursor.getColumnIndexOrThrow("NameofVendor");
      final int _cursorIndexOfNameofVendorId = _cursor.getColumnIndexOrThrow("NameofVendorId");
      final int _cursorIndexOfNameOfOccupant = _cursor.getColumnIndexOrThrow("NameOfOccupant");
      final int _cursorIndexOfRelationWithOwner = _cursor.getColumnIndexOrThrow("RelationWithOwner");
      final List<Property> _result = new ArrayList<Property>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Property _item;
        _item = new Property();
        _item.dummyID = _cursor.getInt(_cursorIndexOfDummyID);
        final int _tmpCaseId;
        _tmpCaseId = _cursor.getInt(_cursorIndexOfCaseId);
        _item.setCaseId(_tmpCaseId);
        final int _tmpPropertyId;
        _tmpPropertyId = _cursor.getInt(_cursorIndexOfPropertyId);
        _item.setPropertyId(_tmpPropertyId);
        final int _tmpEmployeeId;
        _tmpEmployeeId = _cursor.getInt(_cursorIndexOfEmployeeId);
        _item.setEmployeeId(_tmpEmployeeId);
        final String _tmpApplicantAddress;
        _tmpApplicantAddress = _cursor.getString(_cursorIndexOfApplicantAddress);
        _item.setApplicantAddress(_tmpApplicantAddress);
        final String _tmpLandmark;
        _tmpLandmark = _cursor.getString(_cursorIndexOfLandmark);
        _item.setLandmark(_tmpLandmark);
        final String _tmpPurpose;
        _tmpPurpose = _cursor.getString(_cursorIndexOfPurpose);
        _item.setPurpose(_tmpPurpose);
        final String _tmpNameOfPurchaser;
        _tmpNameOfPurchaser = _cursor.getString(_cursorIndexOfNameOfPurchaser);
        _item.setNameOfPurchaser(_tmpNameOfPurchaser);
        final String _tmpPropertyAddress;
        _tmpPropertyAddress = _cursor.getString(_cursorIndexOfPropertyAddress);
        _item.setPropertyAddress(_tmpPropertyAddress);
        final String _tmpMunicipalWard;
        _tmpMunicipalWard = _cursor.getString(_cursorIndexOfMunicipalWard);
        _item.setMunicipalWard(_tmpMunicipalWard);
        final Boolean _tmpIsWithinMunicipalArea;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsWithinMunicipalArea)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsWithinMunicipalArea);
        }
        _tmpIsWithinMunicipalArea = _tmp == null ? null : _tmp != 0;
        _item.setIsWithinMunicipalArea(_tmpIsWithinMunicipalArea);
        final Boolean _tmpIsPropertyInDemolitionList;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsPropertyInDemolitionList)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsPropertyInDemolitionList);
        }
        _tmpIsPropertyInDemolitionList = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setIsPropertyInDemolitionList(_tmpIsPropertyInDemolitionList);
        final String _tmpVillageName;
        _tmpVillageName = _cursor.getString(_cursorIndexOfVillageName);
        _item.setVillageName(_tmpVillageName);
        final String _tmpColonyName;
        _tmpColonyName = _cursor.getString(_cursorIndexOfColonyName);
        _item.setColonyName(_tmpColonyName);
        final String _tmpUnitNo;
        _tmpUnitNo = _cursor.getString(_cursorIndexOfUnitNo);
        _item.setUnitNo(_tmpUnitNo);
        final String _tmpPlotNo;
        _tmpPlotNo = _cursor.getString(_cursorIndexOfPlotNo);
        _item.setPlotNo(_tmpPlotNo);
        final String _tmpSurveyNo;
        _tmpSurveyNo = _cursor.getString(_cursorIndexOfSurveyNo);
        _item.setSurveyNo(_tmpSurveyNo);
        final String _tmpCtsNo;
        _tmpCtsNo = _cursor.getString(_cursorIndexOfCtsNo);
        _item.setCtsNo(_tmpCtsNo);
        final String _tmpAreaOfPlot;
        _tmpAreaOfPlot = _cursor.getString(_cursorIndexOfAreaOfPlot);
        _item.setAreaOfPlot(_tmpAreaOfPlot);
        final String _tmpVariable;
        _tmpVariable = _cursor.getString(_cursorIndexOfVariable);
        _item.setVariable(_tmpVariable);
        final String _tmpSurveyInPresenceOf;
        _tmpSurveyInPresenceOf = _cursor.getString(_cursorIndexOfSurveyInPresenceOf);
        _item.setSurveyInPresenceOf(_tmpSurveyInPresenceOf);
        final String _tmpNearestStation;
        _tmpNearestStation = _cursor.getString(_cursorIndexOfNearestStation);
        _item.setNearestStation(_tmpNearestStation);
        final String _tmpDistance;
        _tmpDistance = _cursor.getString(_cursorIndexOfDistance);
        _item.setDistance(_tmpDistance);
        final String _tmpPresentlyOccupiedId;
        _tmpPresentlyOccupiedId = _cursor.getString(_cursorIndexOfPresentlyOccupiedId);
        _item.setPresentlyOccupiedId(_tmpPresentlyOccupiedId);
        final String _tmpPresentlyOccupied;
        _tmpPresentlyOccupied = _cursor.getString(_cursorIndexOfPresentlyOccupied);
        _item.setPresentlyOccupied(_tmpPresentlyOccupied);
        final String _tmpNameOfSeller;
        _tmpNameOfSeller = _cursor.getString(_cursorIndexOfNameOfSeller);
        _item.setNameOfSeller(_tmpNameOfSeller);
        final String _tmpBoundryNorth;
        _tmpBoundryNorth = _cursor.getString(_cursorIndexOfBoundryNorth);
        _item.setBoundryNorth(_tmpBoundryNorth);
        final String _tmpBoundrySouth;
        _tmpBoundrySouth = _cursor.getString(_cursorIndexOfBoundrySouth);
        _item.setBoundrySouth(_tmpBoundrySouth);
        final String _tmpBoundryEast;
        _tmpBoundryEast = _cursor.getString(_cursorIndexOfBoundryEast);
        _item.setBoundryEast(_tmpBoundryEast);
        final String _tmpBoundryWest;
        _tmpBoundryWest = _cursor.getString(_cursorIndexOfBoundryWest);
        _item.setBoundryWest(_tmpBoundryWest);
        final String _tmpDocBoundryNorth;
        _tmpDocBoundryNorth = _cursor.getString(_cursorIndexOfDocBoundryNorth);
        _item.setDocBoundryNorth(_tmpDocBoundryNorth);
        final String _tmpDocBoundrySouth;
        _tmpDocBoundrySouth = _cursor.getString(_cursorIndexOfDocBoundrySouth);
        _item.setDocBoundrySouth(_tmpDocBoundrySouth);
        final String _tmpDocBoundryEast;
        _tmpDocBoundryEast = _cursor.getString(_cursorIndexOfDocBoundryEast);
        _item.setDocBoundryEast(_tmpDocBoundryEast);
        final String _tmpDocBoundryWest;
        _tmpDocBoundryWest = _cursor.getString(_cursorIndexOfDocBoundryWest);
        _item.setDocBoundryWest(_tmpDocBoundryWest);
        final String _tmpMatchBoundaryNorth;
        _tmpMatchBoundaryNorth = _cursor.getString(_cursorIndexOfMatchBoundaryNorth);
        _item.setMatchBoundaryNorth(_tmpMatchBoundaryNorth);
        final String _tmpMatchBoundarySouth;
        _tmpMatchBoundarySouth = _cursor.getString(_cursorIndexOfMatchBoundarySouth);
        _item.setMatchBoundarySouth(_tmpMatchBoundarySouth);
        final String _tmpMatchBoundaryEast;
        _tmpMatchBoundaryEast = _cursor.getString(_cursorIndexOfMatchBoundaryEast);
        _item.setMatchBoundaryEast(_tmpMatchBoundaryEast);
        final String _tmpMatchBoundaryWest;
        _tmpMatchBoundaryWest = _cursor.getString(_cursorIndexOfMatchBoundaryWest);
        _item.setMatchBoundaryWest(_tmpMatchBoundaryWest);
        final String _tmpNorthMeasure;
        _tmpNorthMeasure = _cursor.getString(_cursorIndexOfNorthMeasure);
        _item.setNorthMeasure(_tmpNorthMeasure);
        final String _tmpSouthMeasure;
        _tmpSouthMeasure = _cursor.getString(_cursorIndexOfSouthMeasure);
        _item.setSouthMeasure(_tmpSouthMeasure);
        final String _tmpEastMeasure;
        _tmpEastMeasure = _cursor.getString(_cursorIndexOfEastMeasure);
        _item.setEastMeasure(_tmpEastMeasure);
        final String _tmpWestMeasure;
        _tmpWestMeasure = _cursor.getString(_cursorIndexOfWestMeasure);
        _item.setWestMeasure(_tmpWestMeasure);
        final String _tmpDocNorthMeasure;
        _tmpDocNorthMeasure = _cursor.getString(_cursorIndexOfDocNorthMeasure);
        _item.setDocNorthMeasure(_tmpDocNorthMeasure);
        final String _tmpDocSouthMeasure;
        _tmpDocSouthMeasure = _cursor.getString(_cursorIndexOfDocSouthMeasure);
        _item.setDocSouthMeasure(_tmpDocSouthMeasure);
        final String _tmpDocEastMeasure;
        _tmpDocEastMeasure = _cursor.getString(_cursorIndexOfDocEastMeasure);
        _item.setDocEastMeasure(_tmpDocEastMeasure);
        final String _tmpDocWestMeasure;
        _tmpDocWestMeasure = _cursor.getString(_cursorIndexOfDocWestMeasure);
        _item.setDocWestMeasure(_tmpDocWestMeasure);
        final String _tmpBoundaryMeasureUnit;
        _tmpBoundaryMeasureUnit = _cursor.getString(_cursorIndexOfBoundaryMeasureUnit);
        _item.setBoundaryMeasureUnit(_tmpBoundaryMeasureUnit);
        final String _tmpDocSetBackLeft;
        _tmpDocSetBackLeft = _cursor.getString(_cursorIndexOfDocSetBackLeft);
        _item.setDocSetBackLeft(_tmpDocSetBackLeft);
        final String _tmpDocSetBackRight;
        _tmpDocSetBackRight = _cursor.getString(_cursorIndexOfDocSetBackRight);
        _item.setDocSetBackRight(_tmpDocSetBackRight);
        final String _tmpDocSetBackFront;
        _tmpDocSetBackFront = _cursor.getString(_cursorIndexOfDocSetBackFront);
        _item.setDocSetBackFront(_tmpDocSetBackFront);
        final String _tmpDocSetBackRear;
        _tmpDocSetBackRear = _cursor.getString(_cursorIndexOfDocSetBackRear);
        _item.setDocSetBackRear(_tmpDocSetBackRear);
        final String _tmpSetBackLeft;
        _tmpSetBackLeft = _cursor.getString(_cursorIndexOfSetBackLeft);
        _item.setSetBackLeft(_tmpSetBackLeft);
        final String _tmpSetBackRight;
        _tmpSetBackRight = _cursor.getString(_cursorIndexOfSetBackRight);
        _item.setSetBackRight(_tmpSetBackRight);
        final String _tmpSetBackFront;
        _tmpSetBackFront = _cursor.getString(_cursorIndexOfSetBackFront);
        _item.setSetBackFront(_tmpSetBackFront);
        final String _tmpSetBackRear;
        _tmpSetBackRear = _cursor.getString(_cursorIndexOfSetBackRear);
        _item.setSetBackRear(_tmpSetBackRear);
        final int _tmpTypeOfPropertyId;
        _tmpTypeOfPropertyId = _cursor.getInt(_cursorIndexOfTypeOfPropertyId);
        _item.setTypeOfPropertyId(_tmpTypeOfPropertyId);
        final String _tmpFlatHallNo;
        _tmpFlatHallNo = _cursor.getString(_cursorIndexOfFlatHallNo);
        _item.setFlatHallNo(_tmpFlatHallNo);
        final String _tmpFlatKitchenNo;
        _tmpFlatKitchenNo = _cursor.getString(_cursorIndexOfFlatKitchenNo);
        _item.setFlatKitchenNo(_tmpFlatKitchenNo);
        final String _tmpFlatBedroomNo;
        _tmpFlatBedroomNo = _cursor.getString(_cursorIndexOfFlatBedroomNo);
        _item.setFlatBedroomNo(_tmpFlatBedroomNo);
        final String _tmpFlatDinningNo;
        _tmpFlatDinningNo = _cursor.getString(_cursorIndexOfFlatDinningNo);
        _item.setFlatDinningNo(_tmpFlatDinningNo);
        final String _tmpFlatBathNo;
        _tmpFlatBathNo = _cursor.getString(_cursorIndexOfFlatBathNo);
        _item.setFlatBathNo(_tmpFlatBathNo);
        final String _tmpFlatWcNo;
        _tmpFlatWcNo = _cursor.getString(_cursorIndexOfFlatWcNo);
        _item.setFlatWcNo(_tmpFlatWcNo);
        final String _tmpFlatAttBathWcNo;
        _tmpFlatAttBathWcNo = _cursor.getString(_cursorIndexOfFlatAttBathWcNo);
        _item.setFlatAttBathWcNo(_tmpFlatAttBathWcNo);
        final String _tmpFlatPassageNo;
        _tmpFlatPassageNo = _cursor.getString(_cursorIndexOfFlatPassageNo);
        _item.setFlatPassageNo(_tmpFlatPassageNo);
        final String _tmpFlatBalconyNo;
        _tmpFlatBalconyNo = _cursor.getString(_cursorIndexOfFlatBalconyNo);
        _item.setFlatBalconyNo(_tmpFlatBalconyNo);
        final String _tmpFlatFbNo;
        _tmpFlatFbNo = _cursor.getString(_cursorIndexOfFlatFbNo);
        _item.setFlatFbNo(_tmpFlatFbNo);
        final String _tmpFlatDbNo;
        _tmpFlatDbNo = _cursor.getString(_cursorIndexOfFlatDbNo);
        _item.setFlatDbNo(_tmpFlatDbNo);
        final String _tmpFlatTerraceNo;
        _tmpFlatTerraceNo = _cursor.getString(_cursorIndexOfFlatTerraceNo);
        _item.setFlatTerraceNo(_tmpFlatTerraceNo);
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
        final String _tmpIntPop;
        _tmpIntPop = _cursor.getString(_cursorIndexOfIntPop);
        _item.setIntPop(_tmpIntPop);
        final String _tmpTypeOfStructureId;
        _tmpTypeOfStructureId = _cursor.getString(_cursorIndexOfTypeOfStructureId);
        _item.setTypeOfStructureId(_tmpTypeOfStructureId);
        final String _tmpNoOfFloors;
        _tmpNoOfFloors = _cursor.getString(_cursorIndexOfNoOfFloors);
        _item.setNoOfFloors(_tmpNoOfFloors);
        final String _tmpPodiums;
        _tmpPodiums = _cursor.getString(_cursorIndexOfPodiums);
        _item.setPodiums(_tmpPodiums);
        final String _tmpBasement;
        _tmpBasement = _cursor.getString(_cursorIndexOfBasement);
        _item.setBasement(_tmpBasement);
        final String _tmpNoOfLiftInBuilding;
        _tmpNoOfLiftInBuilding = _cursor.getString(_cursorIndexOfNoOfLiftInBuilding);
        _item.setNoOfLiftInBuilding(_tmpNoOfLiftInBuilding);
        final String _tmpNoOfFlatPerFloor;
        _tmpNoOfFlatPerFloor = _cursor.getString(_cursorIndexOfNoOfFlatPerFloor);
        _item.setNoOfFlatPerFloor(_tmpNoOfFlatPerFloor);
        final String _tmpConstructionId;
        _tmpConstructionId = _cursor.getString(_cursorIndexOfConstructionId);
        _item.setConstructionId(_tmpConstructionId);
        final String _tmpUnderconstructionLoading;
        _tmpUnderconstructionLoading = _cursor.getString(_cursorIndexOfUnderconstructionLoading);
        _item.setUnderconstructionLoading(_tmpUnderconstructionLoading);
        final String _tmpPlinthComp;
        _tmpPlinthComp = _cursor.getString(_cursorIndexOfPlinthComp);
        _item.setPlinthComp(_tmpPlinthComp);
        final String _tmpRccComp;
        _tmpRccComp = _cursor.getString(_cursorIndexOfRccComp);
        _item.setRccComp(_tmpRccComp);
        final String _tmpBrickWorkComp;
        _tmpBrickWorkComp = _cursor.getString(_cursorIndexOfBrickWorkComp);
        _item.setBrickWorkComp(_tmpBrickWorkComp);
        final String _tmpPlasteringIntComp;
        _tmpPlasteringIntComp = _cursor.getString(_cursorIndexOfPlasteringIntComp);
        _item.setPlasteringIntComp(_tmpPlasteringIntComp);
        final String _tmpPlasteringExtComp;
        _tmpPlasteringExtComp = _cursor.getString(_cursorIndexOfPlasteringExtComp);
        _item.setPlasteringExtComp(_tmpPlasteringExtComp);
        final String _tmpFlooringComp;
        _tmpFlooringComp = _cursor.getString(_cursorIndexOfFlooringComp);
        _item.setFlooringComp(_tmpFlooringComp);
        final String _tmpElectricComp;
        _tmpElectricComp = _cursor.getString(_cursorIndexOfElectricComp);
        _item.setElectricComp(_tmpElectricComp);
        final String _tmpPlumbingComp;
        _tmpPlumbingComp = _cursor.getString(_cursorIndexOfPlumbingComp);
        _item.setPlumbingComp(_tmpPlumbingComp);
        final String _tmpWoodworkComp;
        _tmpWoodworkComp = _cursor.getString(_cursorIndexOfWoodworkComp);
        _item.setWoodworkComp(_tmpWoodworkComp);
        final String _tmpPaintingComp;
        _tmpPaintingComp = _cursor.getString(_cursorIndexOfPaintingComp);
        _item.setPaintingComp(_tmpPaintingComp);
        final String _tmpPresentConditionId;
        _tmpPresentConditionId = _cursor.getString(_cursorIndexOfPresentConditionId);
        _item.setPresentConditionId(_tmpPresentConditionId);
        final String _tmpQualityConstructionId;
        _tmpQualityConstructionId = _cursor.getString(_cursorIndexOfQualityConstructionId);
        _item.setQualityConstructionId(_tmpQualityConstructionId);
        final String _tmpAgeOfProperty;
        _tmpAgeOfProperty = _cursor.getString(_cursorIndexOfAgeOfProperty);
        _item.setAgeOfProperty(_tmpAgeOfProperty);
        final String _tmpResidualLife;
        _tmpResidualLife = _cursor.getString(_cursorIndexOfResidualLife);
        _item.setResidualLife(_tmpResidualLife);
        final String _tmpTypeOfBuildingId;
        _tmpTypeOfBuildingId = _cursor.getString(_cursorIndexOfTypeOfBuildingId);
        _item.setTypeOfBuildingId(_tmpTypeOfBuildingId);
        final String _tmpMaintenanceOfBuildingId;
        _tmpMaintenanceOfBuildingId = _cursor.getString(_cursorIndexOfMaintenanceOfBuildingId);
        _item.setMaintenanceOfBuildingId(_tmpMaintenanceOfBuildingId);
        final String _tmpExteriorPaintId;
        _tmpExteriorPaintId = _cursor.getString(_cursorIndexOfExteriorPaintId);
        _item.setExteriorPaintId(_tmpExteriorPaintId);
        final String _tmpGardenExist;
        _tmpGardenExist = _cursor.getString(_cursorIndexOfGardenExist);
        _item.setGardenExist(_tmpGardenExist);
        final String _tmpSeperateCompoundId;
        _tmpSeperateCompoundId = _cursor.getString(_cursorIndexOfSeperateCompoundId);
        _item.setSeperateCompoundId(_tmpSeperateCompoundId);
        final String _tmpPavingAroundBuildingId;
        _tmpPavingAroundBuildingId = _cursor.getString(_cursorIndexOfPavingAroundBuildingId);
        _item.setPavingAroundBuildingId(_tmpPavingAroundBuildingId);
        final String _tmpCarParkingId;
        _tmpCarParkingId = _cursor.getString(_cursorIndexOfCarParkingId);
        _item.setCarParkingId(_tmpCarParkingId);
        final String _tmpWaterAvailabilityId;
        _tmpWaterAvailabilityId = _cursor.getString(_cursorIndexOfWaterAvailabilityId);
        _item.setWaterAvailabilityId(_tmpWaterAvailabilityId);
        final String _tmpAmenityQualityId;
        _tmpAmenityQualityId = _cursor.getString(_cursorIndexOfAmenityQualityId);
        _item.setAmenityQualityId(_tmpAmenityQualityId);
        final String _tmpFittingQualityId;
        _tmpFittingQualityId = _cursor.getString(_cursorIndexOfFittingQualityId);
        _item.setFittingQualityId(_tmpFittingQualityId);
        final String _tmpAmenities;
        _tmpAmenities = _cursor.getString(_cursorIndexOfAmenities);
        _item.setAmenities(_tmpAmenities);
        final String _tmpWingNo;
        _tmpWingNo = _cursor.getString(_cursorIndexOfWingNo);
        _item.setWingNo(_tmpWingNo);
        final String _tmpWingName;
        _tmpWingName = _cursor.getString(_cursorIndexOfWingName);
        _item.setWingName(_tmpWingName);
        final String _tmpDocumentSeenId;
        _tmpDocumentSeenId = _cursor.getString(_cursorIndexOfDocumentSeenId);
        _item.setDocumentSeenId(_tmpDocumentSeenId);
        final String _tmpNameOfSociety;
        _tmpNameOfSociety = _cursor.getString(_cursorIndexOfNameOfSociety);
        _item.setNameOfSociety(_tmpNameOfSociety);
        final String _tmpSocietyRegnNo;
        _tmpSocietyRegnNo = _cursor.getString(_cursorIndexOfSocietyRegnNo);
        _item.setSocietyRegnNo(_tmpSocietyRegnNo);
        final String _tmpPropertyTaxReceiptNo;
        _tmpPropertyTaxReceiptNo = _cursor.getString(_cursorIndexOfPropertyTaxReceiptNo);
        _item.setPropertyTaxReceiptNo(_tmpPropertyTaxReceiptNo);
        final String _tmpPropertyTaxAmount;
        _tmpPropertyTaxAmount = _cursor.getString(_cursorIndexOfPropertyTaxAmount);
        _item.setPropertyTaxAmount(_tmpPropertyTaxAmount);
        final String _tmpPropertyTaxYear;
        _tmpPropertyTaxYear = _cursor.getString(_cursorIndexOfPropertyTaxYear);
        _item.setPropertyTaxYear(_tmpPropertyTaxYear);
        final String _tmpShareCertificateNo;
        _tmpShareCertificateNo = _cursor.getString(_cursorIndexOfShareCertificateNo);
        _item.setShareCertificateNo(_tmpShareCertificateNo);
        final String _tmpShareCertificateNoOfShares;
        _tmpShareCertificateNoOfShares = _cursor.getString(_cursorIndexOfShareCertificateNoOfShares);
        _item.setShareCertificateNoOfShares(_tmpShareCertificateNoOfShares);
        final String _tmpShareCertificateFaceValue;
        _tmpShareCertificateFaceValue = _cursor.getString(_cursorIndexOfShareCertificateFaceValue);
        _item.setShareCertificateFaceValue(_tmpShareCertificateFaceValue);
        final String _tmpShareCertificateDistinctiveNo;
        _tmpShareCertificateDistinctiveNo = _cursor.getString(_cursorIndexOfShareCertificateDistinctiveNo);
        _item.setShareCertificateDistinctiveNo(_tmpShareCertificateDistinctiveNo);
        final String _tmpPlanApprovedById;
        _tmpPlanApprovedById = _cursor.getString(_cursorIndexOfPlanApprovedById);
        _item.setPlanApprovedById(_tmpPlanApprovedById);
        final String _tmpCommencementNo;
        _tmpCommencementNo = _cursor.getString(_cursorIndexOfCommencementNo);
        _item.setCommencementNo(_tmpCommencementNo);
        final String _tmpCommencementDate;
        _tmpCommencementDate = _cursor.getString(_cursorIndexOfCommencementDate);
        _item.setCommencementDate(_tmpCommencementDate);
        final String _tmpOccupancyNo;
        _tmpOccupancyNo = _cursor.getString(_cursorIndexOfOccupancyNo);
        _item.setOccupancyNo(_tmpOccupancyNo);
        final String _tmpOccupancyDate;
        _tmpOccupancyDate = _cursor.getString(_cursorIndexOfOccupancyDate);
        _item.setOccupancyDate(_tmpOccupancyDate);
        final String _tmpPremisesDetails;
        _tmpPremisesDetails = _cursor.getString(_cursorIndexOfPremisesDetails);
        _item.setPremisesDetails(_tmpPremisesDetails);
        final String _tmpStampDutyDate;
        _tmpStampDutyDate = _cursor.getString(_cursorIndexOfStampDutyDate);
        _item.setStampDutyDate(_tmpStampDutyDate);
        final String _tmpAgreementDate;
        _tmpAgreementDate = _cursor.getString(_cursorIndexOfAgreementDate);
        _item.setAgreementDate(_tmpAgreementDate);
        final String _tmpAgreementAmount;
        _tmpAgreementAmount = _cursor.getString(_cursorIndexOfAgreementAmount);
        _item.setAgreementAmount(_tmpAgreementAmount);
        final String _tmpRegistrationNo;
        _tmpRegistrationNo = _cursor.getString(_cursorIndexOfRegistrationNo);
        _item.setRegistrationNo(_tmpRegistrationNo);
        final String _tmpRegistrationDate;
        _tmpRegistrationDate = _cursor.getString(_cursorIndexOfRegistrationDate);
        _item.setRegistrationDate(_tmpRegistrationDate);
        final String _tmpRegistrationValue;
        _tmpRegistrationValue = _cursor.getString(_cursorIndexOfRegistrationValue);
        _item.setRegistrationValue(_tmpRegistrationValue);
        final String _tmpRemarks;
        _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
        _item.setRemarks(_tmpRemarks);
        final String _tmpOtherRemarks;
        _tmpOtherRemarks = _cursor.getString(_cursorIndexOfOtherRemarks);
        _item.setOtherRemarks(_tmpOtherRemarks);
        final String _tmpSpecialRemarks;
        _tmpSpecialRemarks = _cursor.getString(_cursorIndexOfSpecialRemarks);
        _item.setSpecialRemarks(_tmpSpecialRemarks);
        final String _tmpOtherDocuments;
        _tmpOtherDocuments = _cursor.getString(_cursorIndexOfOtherDocuments);
        _item.setOtherDocuments(_tmpOtherDocuments);
        final String _tmpRegistrationReceiptNo;
        _tmpRegistrationReceiptNo = _cursor.getString(_cursorIndexOfRegistrationReceiptNo);
        _item.setRegistrationReceiptNo(_tmpRegistrationReceiptNo);
        final String _tmpRegistrarsValue;
        _tmpRegistrarsValue = _cursor.getString(_cursorIndexOfRegistrarsValue);
        _item.setRegistrarsValue(_tmpRegistrarsValue);
        final String _tmpHallDim;
        _tmpHallDim = _cursor.getString(_cursorIndexOfHallDim);
        _item.setHallDim(_tmpHallDim);
        final String _tmpKitchenDim;
        _tmpKitchenDim = _cursor.getString(_cursorIndexOfKitchenDim);
        _item.setKitchenDim(_tmpKitchenDim);
        final String _tmpBedroomDim;
        _tmpBedroomDim = _cursor.getString(_cursorIndexOfBedroomDim);
        _item.setBedroomDim(_tmpBedroomDim);
        final String _tmpDinningDim;
        _tmpDinningDim = _cursor.getString(_cursorIndexOfDinningDim);
        _item.setDinningDim(_tmpDinningDim);
        final String _tmpPassageDim;
        _tmpPassageDim = _cursor.getString(_cursorIndexOfPassageDim);
        _item.setPassageDim(_tmpPassageDim);
        final String _tmpWcDim;
        _tmpWcDim = _cursor.getString(_cursorIndexOfWcDim);
        _item.setWcDim(_tmpWcDim);
        final String _tmpBathDim;
        _tmpBathDim = _cursor.getString(_cursorIndexOfBathDim);
        _item.setBathDim(_tmpBathDim);
        final String _tmpWbDim;
        _tmpWbDim = _cursor.getString(_cursorIndexOfWbDim);
        _item.setWbDim(_tmpWbDim);
        final String _tmpFbDim;
        _tmpFbDim = _cursor.getString(_cursorIndexOfFbDim);
        _item.setFbDim(_tmpFbDim);
        final String _tmpDbDim;
        _tmpDbDim = _cursor.getString(_cursorIndexOfDbDim);
        _item.setDbDim(_tmpDbDim);
        final String _tmpBalconyDim;
        _tmpBalconyDim = _cursor.getString(_cursorIndexOfBalconyDim);
        _item.setBalconyDim(_tmpBalconyDim);
        final String _tmpTerraceDim;
        _tmpTerraceDim = _cursor.getString(_cursorIndexOfTerraceDim);
        _item.setTerraceDim(_tmpTerraceDim);
        final String _tmpLatLongDetails;
        _tmpLatLongDetails = _cursor.getString(_cursorIndexOfLatLongDetails);
        _item.setLatLongDetails(_tmpLatLongDetails);
        final String _tmpBrokerDetails;
        _tmpBrokerDetails = _cursor.getString(_cursorIndexOfBrokerDetails);
        _item.setBrokerDetails(_tmpBrokerDetails);
        final String _tmpTotalMeasurement;
        _tmpTotalMeasurement = _cursor.getString(_cursorIndexOfTotalMeasurement);
        _item.setTotalMeasurement(_tmpTotalMeasurement);
        final String _tmpGharvalueInterior;
        _tmpGharvalueInterior = _cursor.getString(_cursorIndexOfGharvalueInterior);
        _item.setGharvalueInterior(_tmpGharvalueInterior);
        final String _tmpDescribeInteriors;
        _tmpDescribeInteriors = _cursor.getString(_cursorIndexOfDescribeInteriors);
        _item.setDescribeInteriors(_tmpDescribeInteriors);
        final String _tmpGharvalueAmenities;
        _tmpGharvalueAmenities = _cursor.getString(_cursorIndexOfGharvalueAmenities);
        _item.setGharvalueAmenities(_tmpGharvalueAmenities);
        final String _tmpDescribeAmenities;
        _tmpDescribeAmenities = _cursor.getString(_cursorIndexOfDescribeAmenities);
        _item.setDescribeAmenities(_tmpDescribeAmenities);
        final String _tmpGharvalueLocation;
        _tmpGharvalueLocation = _cursor.getString(_cursorIndexOfGharvalueLocation);
        _item.setGharvalueLocation(_tmpGharvalueLocation);
        final String _tmpDescribeLocation;
        _tmpDescribeLocation = _cursor.getString(_cursorIndexOfDescribeLocation);
        _item.setDescribeLocation(_tmpDescribeLocation);
        final Boolean _tmpPlotDemarcatedAtSite;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfPlotDemarcatedAtSite)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfPlotDemarcatedAtSite);
        }
        _tmpPlotDemarcatedAtSite = _tmp_2 == null ? null : _tmp_2 != 0;
        _item.setPlotDemarcatedAtSite(_tmpPlotDemarcatedAtSite);
        final String _tmpPropertyIdentificationChannelId;
        _tmpPropertyIdentificationChannelId = _cursor.getString(_cursorIndexOfPropertyIdentificationChannelId);
        _item.setPropertyIdentificationChannelId(_tmpPropertyIdentificationChannelId);
        final String _tmpPassageTypeId;
        _tmpPassageTypeId = _cursor.getString(_cursorIndexOfPassageTypeId);
        _item.setPassageTypeId(_tmpPassageTypeId);
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
        final String _tmpMarketabilityId;
        _tmpMarketabilityId = _cursor.getString(_cursorIndexOfMarketabilityId);
        _item.setMarketabilityId(_tmpMarketabilityId);
        final String _tmpPropertyAddressAtSite;
        _tmpPropertyAddressAtSite = _cursor.getString(_cursorIndexOfPropertyAddressAtSite);
        _item.setPropertyAddressAtSite(_tmpPropertyAddressAtSite);
        final Boolean _tmpSameAsDocumentAddress;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentAddress)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfSameAsDocumentAddress);
        }
        _tmpSameAsDocumentAddress = _tmp_3 == null ? null : _tmp_3 != 0;
        _item.setSameAsDocumentAddress(_tmpSameAsDocumentAddress);
        final Boolean _tmpSameAsDocumentBoundary;
        final Integer _tmp_4;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentBoundary)) {
          _tmp_4 = null;
        } else {
          _tmp_4 = _cursor.getInt(_cursorIndexOfSameAsDocumentBoundary);
        }
        _tmpSameAsDocumentBoundary = _tmp_4 == null ? null : _tmp_4 != 0;
        _item.setSameAsDocumentBoundary(_tmpSameAsDocumentBoundary);
        final Boolean _tmpSameAsDocumentDimension;
        final Integer _tmp_5;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentDimension)) {
          _tmp_5 = null;
        } else {
          _tmp_5 = _cursor.getInt(_cursorIndexOfSameAsDocumentDimension);
        }
        _tmpSameAsDocumentDimension = _tmp_5 == null ? null : _tmp_5 != 0;
        _item.setSameAsDocumentDimension(_tmpSameAsDocumentDimension);
        final Boolean _tmpSameAsDocumentSetBack;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfSameAsDocumentSetBack)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfSameAsDocumentSetBack);
        }
        _tmpSameAsDocumentSetBack = _tmp_6 == null ? null : _tmp_6 != 0;
        _item.setSameAsDocumentSetBack(_tmpSameAsDocumentSetBack);
        final Integer _tmpApproachRoadConditionId;
        if (_cursor.isNull(_cursorIndexOfApproachRoadConditionId)) {
          _tmpApproachRoadConditionId = null;
        } else {
          _tmpApproachRoadConditionId = _cursor.getInt(_cursorIndexOfApproachRoadConditionId);
        }
        _item.setApproachRoadConditionId(_tmpApproachRoadConditionId);
        final Integer _tmpLocalityCategoryId;
        if (_cursor.isNull(_cursorIndexOfLocalityCategoryId)) {
          _tmpLocalityCategoryId = null;
        } else {
          _tmpLocalityCategoryId = _cursor.getInt(_cursorIndexOfLocalityCategoryId);
        }
        _item.setLocalityCategoryId(_tmpLocalityCategoryId);
        final Integer _tmpClassId;
        if (_cursor.isNull(_cursorIndexOfClassId)) {
          _tmpClassId = null;
        } else {
          _tmpClassId = _cursor.getInt(_cursorIndexOfClassId);
        }
        _item.setClassId(_tmpClassId);
        final Integer _tmpTenureId;
        if (_cursor.isNull(_cursorIndexOfTenureId)) {
          _tmpTenureId = null;
        } else {
          _tmpTenureId = _cursor.getInt(_cursorIndexOfTenureId);
        }
        _item.setTenureId(_tmpTenureId);
        final Integer _tmpTypeOfLandId;
        if (_cursor.isNull(_cursorIndexOfTypeOfLandId)) {
          _tmpTypeOfLandId = null;
        } else {
          _tmpTypeOfLandId = _cursor.getInt(_cursorIndexOfTypeOfLandId);
        }
        _item.setTypeOfLandId(_tmpTypeOfLandId);
        final Integer _tmpTypeLocalityId;
        if (_cursor.isNull(_cursorIndexOfTypeLocalityId)) {
          _tmpTypeLocalityId = null;
        } else {
          _tmpTypeLocalityId = _cursor.getInt(_cursorIndexOfTypeLocalityId);
        }
        _item.setTypeLocalityId(_tmpTypeLocalityId);
        final String _tmpNameofVendor;
        _tmpNameofVendor = _cursor.getString(_cursorIndexOfNameofVendor);
        _item.setNameofVendor(_tmpNameofVendor);
        final Integer _tmpNameofVendorId;
        if (_cursor.isNull(_cursorIndexOfNameofVendorId)) {
          _tmpNameofVendorId = null;
        } else {
          _tmpNameofVendorId = _cursor.getInt(_cursorIndexOfNameofVendorId);
        }
        _item.setNameofVendorId(_tmpNameofVendorId);
        final String _tmpNameOfOccupant;
        _tmpNameOfOccupant = _cursor.getString(_cursorIndexOfNameOfOccupant);
        _item.setNameOfOccupant(_tmpNameOfOccupant);
        final String _tmpRelationWithOwner;
        _tmpRelationWithOwner = _cursor.getString(_cursorIndexOfRelationWithOwner);
        _item.setRelationWithOwner(_tmpRelationWithOwner);
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
    final String _sql = "SELECT COUNT(*) from propertymodal";
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
