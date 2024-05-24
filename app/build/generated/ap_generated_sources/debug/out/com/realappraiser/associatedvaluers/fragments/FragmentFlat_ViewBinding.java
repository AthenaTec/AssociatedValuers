// Generated code from Butter Knife. Do not modify!
package com.realappraiser.associatedvaluers.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.associatedvaluers.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentFlat_ViewBinding implements Unbinder {
  private FragmentFlat target;

  @UiThread
  public FragmentFlat_ViewBinding(FragmentFlat target, View source) {
    this.target = target;

    target.textview_actualusage_flat = Utils.findRequiredViewAsType(source, R.id.textview_actualusage_flat, "field 'textview_actualusage_flat'", TextView.class);
    target.textview_land_measurement = Utils.findRequiredViewAsType(source, R.id.textview_land_measurement, "field 'textview_land_measurement'", TextView.class);
    target.textview_measurement_doc = Utils.findRequiredViewAsType(source, R.id.textview_measurement_doc, "field 'textview_measurement_doc'", TextView.class);
    target.textview_measurement_act = Utils.findRequiredViewAsType(source, R.id.textview_measurement_act, "field 'textview_measurement_act'", TextView.class);
    target.textview_generl_info_measu = Utils.findRequiredViewAsType(source, R.id.textview_generl_info_measu, "field 'textview_generl_info_measu'", TextView.class);
    target.textview_floor_name = Utils.findRequiredViewAsType(source, R.id.textview_floor_name, "field 'textview_floor_name'", TextView.class);
    target.textview_stage = Utils.findRequiredViewAsType(source, R.id.textview_stage, "field 'textview_stage'", TextView.class);
    target.textview_comp = Utils.findRequiredViewAsType(source, R.id.textview_comp, "field 'textview_comp'", TextView.class);
    target.textview_progress = Utils.findRequiredViewAsType(source, R.id.textview_progress, "field 'textview_progress'", TextView.class);
    target.textview_carpetarea = Utils.findRequiredViewAsType(source, R.id.textview_carpetarea, "field 'textview_carpetarea'", TextView.class);
    target.textview_builduparea = Utils.findRequiredViewAsType(source, R.id.textview_builduparea, "field 'textview_builduparea'", TextView.class);
    target.textview_saleablearea = Utils.findRequiredViewAsType(source, R.id.textview_saleablearea, "field 'textview_saleablearea'", TextView.class);
    target.textview_age = Utils.findRequiredViewAsType(source, R.id.textview_age, "field 'textview_age'", TextView.class);
    target.textview_life = Utils.findRequiredViewAsType(source, R.id.textview_life, "field 'textview_life'", TextView.class);
    target.textviewlabel_carpetloading_per = Utils.findRequiredViewAsType(source, R.id.textviewlabel_carpetloading_per, "field 'textviewlabel_carpetloading_per'", TextView.class);
    target.textviewlabel_carpet_area_per = Utils.findRequiredViewAsType(source, R.id.textviewlabel_carpet_area_per, "field 'textviewlabel_carpet_area_per'", TextView.class);
    target.textviewlabel_carpetloading_type = Utils.findRequiredViewAsType(source, R.id.textviewlabel_carpetloading_type, "field 'textviewlabel_carpetloading_type'", TextView.class);
    target.textview_average = Utils.findRequiredViewAsType(source, R.id.textview_average, "field 'textview_average'", TextView.class);
    target.textview_total = Utils.findRequiredViewAsType(source, R.id.textview_total, "field 'textview_total'", TextView.class);
    target.textview_doc_total = Utils.findRequiredViewAsType(source, R.id.textview_doc_total, "field 'textview_doc_total'", TextView.class);
    target.textview_actual_total = Utils.findRequiredViewAsType(source, R.id.textview_actual_total, "field 'textview_actual_total'", TextView.class);
    target.textview_internal_composition = Utils.findRequiredViewAsType(source, R.id.textview_internal_composition, "field 'textview_internal_composition'", TextView.class);
    target.textview_floor_name_composition = Utils.findRequiredViewAsType(source, R.id.textview_floor_name_composition, "field 'textview_floor_name_composition'", TextView.class);
    target.textview_hall_dinning = Utils.findRequiredViewAsType(source, R.id.textview_hall_dinning, "field 'textview_hall_dinning'", TextView.class);
    target.textview_kitchen = Utils.findRequiredViewAsType(source, R.id.textview_kitchen, "field 'textview_kitchen'", TextView.class);
    target.textview_bedroom = Utils.findRequiredViewAsType(source, R.id.textview_bedroom, "field 'textview_bedroom'", TextView.class);
    target.textview_bath = Utils.findRequiredViewAsType(source, R.id.textview_bath, "field 'textview_bath'", TextView.class);
    target.textview_shop_office = Utils.findRequiredViewAsType(source, R.id.textview_shop_office, "field 'textview_shop_office'", TextView.class);
    target.textview_actual_usage_flat = Utils.findRequiredViewAsType(source, R.id.textview_actual_usage_flat, "field 'textview_actual_usage_flat'", TextView.class);
    target.open_calc_builduparea = Utils.findRequiredViewAsType(source, R.id.open_calc_builduparea, "field 'open_calc_builduparea'", ImageView.class);
    target.open_calc_saleablearea = Utils.findRequiredViewAsType(source, R.id.open_calc_saleablearea, "field 'open_calc_saleablearea'", ImageView.class);
    target.open_calc_carpetarea = Utils.findRequiredViewAsType(source, R.id.open_calc_carpetarea, "field 'open_calc_carpetarea'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentFlat target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textview_actualusage_flat = null;
    target.textview_land_measurement = null;
    target.textview_measurement_doc = null;
    target.textview_measurement_act = null;
    target.textview_generl_info_measu = null;
    target.textview_floor_name = null;
    target.textview_stage = null;
    target.textview_comp = null;
    target.textview_progress = null;
    target.textview_carpetarea = null;
    target.textview_builduparea = null;
    target.textview_saleablearea = null;
    target.textview_age = null;
    target.textview_life = null;
    target.textviewlabel_carpetloading_per = null;
    target.textviewlabel_carpet_area_per = null;
    target.textviewlabel_carpetloading_type = null;
    target.textview_average = null;
    target.textview_total = null;
    target.textview_doc_total = null;
    target.textview_actual_total = null;
    target.textview_internal_composition = null;
    target.textview_floor_name_composition = null;
    target.textview_hall_dinning = null;
    target.textview_kitchen = null;
    target.textview_bedroom = null;
    target.textview_bath = null;
    target.textview_shop_office = null;
    target.textview_actual_usage_flat = null;
    target.open_calc_builduparea = null;
    target.open_calc_saleablearea = null;
    target.open_calc_carpetarea = null;
  }
}
