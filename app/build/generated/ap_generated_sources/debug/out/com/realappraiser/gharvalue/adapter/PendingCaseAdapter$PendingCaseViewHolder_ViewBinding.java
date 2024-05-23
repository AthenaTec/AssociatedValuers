// Generated code from Butter Knife. Do not modify!
package com.realappraiser.gharvalue.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.gharvalue.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PendingCaseAdapter$PendingCaseViewHolder_ViewBinding implements Unbinder {
  private PendingCaseAdapter.PendingCaseViewHolder target;

  @UiThread
  public PendingCaseAdapter$PendingCaseViewHolder_ViewBinding(
      PendingCaseAdapter.PendingCaseViewHolder target, View source) {
    this.target = target;

    target.case_person_name = Utils.findRequiredViewAsType(source, R.id.case_person_name, "field 'case_person_name'", TextView.class);
    target.case_mobile = Utils.findRequiredViewAsType(source, R.id.case_mobile, "field 'case_mobile'", TextView.class);
    target.case_addressloc = Utils.findRequiredViewAsType(source, R.id.case_addressloc, "field 'case_addressloc'", TextView.class);
    target.case_bank = Utils.findRequiredViewAsType(source, R.id.case_bank, "field 'case_bank'", TextView.class);
    target.case_assigned_time = Utils.findRequiredViewAsType(source, R.id.case_assigned_time, "field 'case_assigned_time'", TextView.class);
    target.case_assigned_date = Utils.findRequiredViewAsType(source, R.id.case_assigned_date, "field 'case_assigned_date'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PendingCaseAdapter.PendingCaseViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.case_person_name = null;
    target.case_mobile = null;
    target.case_addressloc = null;
    target.case_bank = null;
    target.case_assigned_time = null;
    target.case_assigned_date = null;
  }
}
