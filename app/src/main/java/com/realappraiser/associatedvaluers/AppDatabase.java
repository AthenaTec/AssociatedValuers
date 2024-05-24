package com.realappraiser.associatedvaluers;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import android.content.Context;

import com.realappraiser.associatedvaluers.Interface.CaseDetailDAO;
import com.realappraiser.associatedvaluers.Interface.InterfaceCaseQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceDataModelQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceDocumentListQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoMeasurmentQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceGetPhotoQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyFloorsValuationQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndPropertyValuationQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceIndpropertyQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceLatLongQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineCaseQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceOfflineDataModelQuery;
import com.realappraiser.associatedvaluers.Interface.InterfacePropertyQuery;
import com.realappraiser.associatedvaluers.Interface.InterfaceProximityQuery;
import com.realappraiser.associatedvaluers.Interface.PropertyUpdateCategory;
import com.realappraiser.associatedvaluers.Interface.TypeofPropertyQuery;
import com.realappraiser.associatedvaluers.communicator.DataModel;
import com.realappraiser.associatedvaluers.model.Case;
import com.realappraiser.associatedvaluers.model.CaseDetail;
import com.realappraiser.associatedvaluers.model.Document_list;
import com.realappraiser.associatedvaluers.model.GetPhoto;
import com.realappraiser.associatedvaluers.model.GetPhoto_measurment;
import com.realappraiser.associatedvaluers.model.IndProperty;
import com.realappraiser.associatedvaluers.model.IndPropertyFloor;
import com.realappraiser.associatedvaluers.model.IndPropertyFloorsValuation;
import com.realappraiser.associatedvaluers.model.IndPropertyValuation;
import com.realappraiser.associatedvaluers.model.LatLongDetails;
import com.realappraiser.associatedvaluers.model.OfflineDataModel;
import com.realappraiser.associatedvaluers.model.OflineCase;
import com.realappraiser.associatedvaluers.model.Property;
import com.realappraiser.associatedvaluers.model.PropertyUpdateRoomDB;
import com.realappraiser.associatedvaluers.model.Proximity;
import com.realappraiser.associatedvaluers.model.TypeOfProperty;

import org.jetbrains.annotations.NotNull;

/**
 * Created by user on 15-02-2018.
 */

@Database(entities = {DataModel.class, OfflineDataModel.class, TypeOfProperty.class, PropertyUpdateRoomDB.class, Case.class, Property.class, IndProperty.class, IndPropertyValuation.class, IndPropertyFloor.class, IndPropertyFloorsValuation.class, Proximity.class, GetPhoto.class, CaseDetail.class,OflineCase.class,Document_list.class,LatLongDetails.class,GetPhoto_measurment.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    // DataModal
    public abstract InterfaceDataModelQuery interfaceDataModelQuery();

    // DataModal
    public abstract InterfaceOfflineDataModelQuery interfaceOfflineDataModelQuery();

    // Case
    public abstract InterfaceCaseQuery interfaceCaseQuery();

    // Property
    public abstract InterfacePropertyQuery interfacePropertyQuery();

    // IndProperty
    public abstract InterfaceIndpropertyQuery interfaceIndpropertyQuery();

    // IndPropertyValuation
    public abstract InterfaceIndPropertyValuationQuery interfaceIndPropertyValuationQuery();

    // IndPropertyFloor
    public abstract InterfaceIndPropertyFloorsQuery interfaceIndPropertyFloorsQuery();

    // IndPropertyFloorsValuation
    public abstract InterfaceIndPropertyFloorsValuationQuery interfaceIndPropertyFloorsValuationQuery();

    // Proximity
    public abstract InterfaceProximityQuery interfaceProximityQuery();

    // GetPhoto
    public abstract InterfaceGetPhotoQuery interfaceGetPhotoQuery();

    // Offlinecase
    public abstract InterfaceOfflineCaseQuery interfaceOfflineCaseQuery();

    // DocumentList
    public abstract InterfaceDocumentListQuery interfaceDocumentListQuery();

    // LatLong
    public abstract InterfaceLatLongQuery interfaceLatLongQuery();

    // typeofproperty
    public abstract TypeofPropertyQuery typeofPropertyQuery();

    // Total Case
    public abstract CaseDetailDAO daoAccess();

    // property Update category
    public abstract PropertyUpdateCategory propertyUpdateCategory();

    // GetPhotoMeasurment
    public abstract InterfaceGetPhotoMeasurmentQuery interfaceGetPhotoMeasurmentQuery();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "RA-Database.db")
                    // allow queries on the main thread.
                    // Don't do this on a real app! See PersistenceBasicSample for an example.
                    .allowMainThreadQueries()
                    .addMigrations(MIGRATION_1_2,MIGRATION_2_3)
                    /* call fallbackToDestructiveMigration in the builder in which case Room will re-create all of the tables */
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }


    public static void destroyInstance() {
        INSTANCE = null;
    }

    static final Migration MIGRATION_1_2 = new Migration(1, 2) {
        @Override
        public void migrate(SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE GetPhotoModel "
                    +"ADD COLUMN Filename TEXT;");
        }
    };

    static final Migration MIGRATION_2_3 = new Migration(2, 3) {
        @Override
        public void migrate(@NonNull @NotNull SupportSQLiteDatabase database) {
            database.execSQL("ALTER TABLE DataModel ADD COLUMN pendingcase INTEGER;");
            database.execSQL("ALTER TABLE DataModel ADD COLUMN CreatedOn TEXT;");
            database.execSQL("ALTER TABLE OfflineDataModel ADD COLUMN CreatedOn TEXT;");
        }
    };



}
