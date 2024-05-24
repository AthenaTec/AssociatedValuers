// Generated code from Butter Knife. Do not modify!
package com.realappraiser.associatedvaluers.fragments;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.associatedvaluers.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentBuilding_ViewBinding implements Unbinder {
  private FragmentBuilding target;

  @UiThread
  public FragmentBuilding_ViewBinding(FragmentBuilding target, View source) {
    this.target = target;

    target.textview_land_measurement = Utils.findRequiredViewAsType(source, R.id.textview_land_measurement, "field 'textview_land_measurement'", TextView.class);
    target.checkbox_is_compounded = Utils.findRequiredViewAsType(source, R.id.checkbox_is_compounded, "field 'checkbox_is_compounded'", CheckBox.class);
    target.textview_construction_details = Utils.findRequiredViewAsType(source, R.id.textview_construction_details, "field 'textview_construction_details'", TextView.class);
    target.textview_actualusage = Utils.findRequiredViewAsType(source, R.id.textview_actualusage, "field 'textview_actualusage'", TextView.class);
    target.textview_generl_info_measu = Utils.findRequiredViewAsType(source, R.id.textview_generl_info_measu, "field 'textview_generl_info_measu'", TextView.class);
    target.textview_progress = Utils.findRequiredViewAsType(source, R.id.textview_progress, "field 'textview_progress'", TextView.class);
    target.textview_doc_area = Utils.findRequiredViewAsType(source, R.id.textview_doc_area, "field 'textview_doc_area'", TextView.class);
    target.textview_actual_area = Utils.findRequiredViewAsType(source, R.id.textview_actual_area, "field 'textview_actual_area'", TextView.class);
    target.textview_age = Utils.findRequiredViewAsType(source, R.id.textview_age, "field 'textview_age'", TextView.class);
    target.textview_life = Utils.findRequiredViewAsType(source, R.id.textview_life, "field 'textview_life'", TextView.class);
    target.textview_floor_usage = Utils.findRequiredViewAsType(source, R.id.textview_floor_usage, "field 'textview_floor_usage'", TextView.class);
    target.textview_average = Utils.findRequiredViewAsType(source, R.id.textview_average, "field 'textview_average'", TextView.class);
    target.textview_total = Utils.findRequiredViewAsType(source, R.id.textview_total, "field 'textview_total'", TextView.class);
    target.textview_internal_composition = Utils.findRequiredViewAsType(source, R.id.textview_internal_composition, "field 'textview_internal_composition'", TextView.class);
    target.textview_floor_name_composition = Utils.findRequiredViewAsType(source, R.id.textview_floor_name_composition, "field 'textview_floor_name_composition'", TextView.class);
    target.textview_hall_dinning = Utils.findRequiredViewAsType(source, R.id.textview_hall_dinning, "field 'textview_hall_dinning'", TextView.class);
    target.textview_kitchen = Utils.findRequiredViewAsType(source, R.id.textview_kitchen, "field 'textview_kitchen'", TextView.class);
    target.textview_bedroom = Utils.findRequiredViewAsType(source, R.id.textview_bedroom, "field 'textview_bedroom'", TextView.class);
    target.textview_bath = Utils.findRequiredViewAsType(source, R.id.textview_bath, "field 'textview_bath'", TextView.class);
    target.textview_shop_office = Utils.findRequiredViewAsType(source, R.id.textview_shop_office, "field 'textview_shop_office'", TextView.class);
    target.textview_error_measure_land = Utils.findRequiredViewAsType(source, R.id.textview_error_measure_land, "field 'textview_error_measure_land'", TextView.class);
    target.textview_measurement_doc = Utils.findRequiredViewAsType(source, R.id.textview_measurement_doc, "field 'textview_measurement_doc'", TextView.class);
    target.textview_measurement_act = Utils.findRequiredViewAsType(source, R.id.textview_measurement_act, "field 'textview_measurement_act'", TextView.class);
    target.image_addFloors = Utils.findRequiredViewAsType(source, R.id.image_addFloors, "field 'image_addFloors'", ImageView.class);
    target.recyclerview_generalinfo = Utils.findRequiredViewAsType(source, R.id.recyclerview_generalinfo, "field 'recyclerview_generalinfo'", RecyclerView.class);
    target.recyclerview_internal = Utils.findRequiredViewAsType(source, R.id.recyclerview_internal, "field 'recyclerview_internal'", RecyclerView.class);
    target.textview_actual_usage = Utils.findRequiredViewAsType(source, R.id.textview_actual_usage, "field 'textview_actual_usage'", TextView.class);
    target.open_calc_compound = Utils.findRequiredViewAsType(source, R.id.open_calc_compound, "field 'open_calc_compound'", ImageView.class);
    target.open_calc_measurment = Utils.findRequiredViewAsType(source, R.id.open_calc_measurment, "field 'open_calc_measurment'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentBuilding target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textview_land_measurement = null;
    target.checkbox_is_compounded = null;
    target.textview_construction_details = null;
    target.textview_actualusage = null;
    target.textview_generl_info_measu = null;
    target.textview_progress = null;
    target.textview_doc_area = null;
    target.textview_actual_area = null;
    target.textview_age = null;
    target.textview_life = null;
    target.textview_floor_usage = null;
    target.textview_average = null;
    target.textview_total = null;
    target.textview_internal_composition = null;
    target.textview_floor_name_composition = null;
    target.textview_hall_dinning = null;
    target.textview_kitchen = null;
    target.textview_bedroom = null;
    target.textview_bath = null;
    target.textview_shop_office = null;
    target.textview_error_measure_land = null;
    target.textview_measurement_doc = null;
    target.textview_measurement_act = null;
    target.image_addFloors = null;
    target.recyclerview_generalinfo = null;
    target.recyclerview_internal = null;
    target.textview_actual_usage = null;
    target.open_calc_compound = null;
    target.open_calc_measurment = null;
  }
}
