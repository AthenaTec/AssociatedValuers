// Generated code from Butter Knife. Do not modify!
package com.realappraiser.associatedvaluers.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.realappraiser.associatedvaluers.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeActivity_ViewBinding implements Unbinder {
  private HomeActivity target;

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HomeActivity_ViewBinding(HomeActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.parentLay = Utils.findRequiredViewAsType(source, R.id.parentLay, "field 'parentLay'", LinearLayout.class);
    target.openViewLayout = Utils.findRequiredViewAsType(source, R.id.openViewLayout, "field 'openViewLayout'", LinearLayout.class);
    target.closeViewLayout = Utils.findRequiredViewAsType(source, R.id.closeViewLayout, "field 'closeViewLayout'", LinearLayout.class);
    target.offlineViewLayout = Utils.findOptionalViewAsType(source, R.id.offlineViewLayout, "field 'offlineViewLayout'", LinearLayout.class);
    target.openLayout = Utils.findRequiredViewAsType(source, R.id.openLayout, "field 'openLayout'", LinearLayout.class);
    target.closeLayout = Utils.findRequiredViewAsType(source, R.id.closeLayout, "field 'closeLayout'", LinearLayout.class);
    target.offlineLayout = Utils.findRequiredViewAsType(source, R.id.offlineLayout, "field 'offlineLayout'", LinearLayout.class);
    target.opencutLay = Utils.findRequiredViewAsType(source, R.id.opencutLay, "field 'opencutLay'", LinearLayout.class);
    target.closecutLay = Utils.findRequiredViewAsType(source, R.id.closecutLay, "field 'closecutLay'", LinearLayout.class);
    target.offlinecutLay = Utils.findRequiredViewAsType(source, R.id.offlinecutLay, "field 'offlinecutLay'", LinearLayout.class);
    target.open_cut_image = Utils.findRequiredViewAsType(source, R.id.open_cut_image, "field 'open_cut_image'", ImageView.class);
    target.close_cut_image = Utils.findRequiredViewAsType(source, R.id.close_cut_image, "field 'close_cut_image'", ImageView.class);
    target.offline_cut_image = Utils.findRequiredViewAsType(source, R.id.offline_cut_image, "field 'offline_cut_image'", ImageView.class);
    target.openrecyclerview = Utils.findRequiredViewAsType(source, R.id.openrecyclerview, "field 'openrecyclerview'", RecyclerView.class);
    target.closerecyclerview = Utils.findRequiredViewAsType(source, R.id.closerecyclerview, "field 'closerecyclerview'", RecyclerView.class);
    target.offlinerecyclerview = Utils.findRequiredViewAsType(source, R.id.offlinerecyclerview, "field 'offlinerecyclerview'", RecyclerView.class);
    target.pending_case = Utils.findRequiredViewAsType(source, R.id.pending_case, "field 'pending_case'", TextView.class);
    target.pendingLayout = Utils.findRequiredViewAsType(source, R.id.pendingLayout, "field 'pendingLayout'", LinearLayout.class);
    target.pendingcutLay = Utils.findRequiredViewAsType(source, R.id.pendingcutLay, "field 'pendingcutLay'", LinearLayout.class);
    target.pending_cut_image = Utils.findRequiredViewAsType(source, R.id.pending_cut_image, "field 'pending_cut_image'", ImageView.class);
    target.pendingViewLayout = Utils.findRequiredViewAsType(source, R.id.pendingViewLayout, "field 'pendingViewLayout'", LinearLayout.class);
    target.pendingrecyclerview = Utils.findRequiredViewAsType(source, R.id.pendingrecyclerview, "field 'pendingrecyclerview'", RecyclerView.class);
    target.no_data_found_open = Utils.findRequiredViewAsType(source, R.id.no_data_found_open, "field 'no_data_found_open'", TextView.class);
    target.no_data_found_close = Utils.findRequiredViewAsType(source, R.id.no_data_found_close, "field 'no_data_found_close'", TextView.class);
    target.no_data_found_offline = Utils.findRequiredViewAsType(source, R.id.no_data_found_offline, "field 'no_data_found_offline'", TextView.class);
    target.no_data_found_pending = Utils.findRequiredViewAsType(source, R.id.no_data_found_pending, "field 'no_data_found_pending'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.parentLay = null;
    target.openViewLayout = null;
    target.closeViewLayout = null;
    target.offlineViewLayout = null;
    target.openLayout = null;
    target.closeLayout = null;
    target.offlineLayout = null;
    target.opencutLay = null;
    target.closecutLay = null;
    target.offlinecutLay = null;
    target.open_cut_image = null;
    target.close_cut_image = null;
    target.offline_cut_image = null;
    target.openrecyclerview = null;
    target.closerecyclerview = null;
    target.offlinerecyclerview = null;
    target.pending_case = null;
    target.pendingLayout = null;
    target.pendingcutLay = null;
    target.pending_cut_image = null;
    target.pendingViewLayout = null;
    target.pendingrecyclerview = null;
    target.no_data_found_open = null;
    target.no_data_found_close = null;
    target.no_data_found_offline = null;
    target.no_data_found_pending = null;
  }
}
