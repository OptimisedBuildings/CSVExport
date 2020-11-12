package com.optimised_buildings_ltd.CSVExport;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraAction(name = "collectHistories")
@NiagaraProperty(name = "timeRange", type = "BTimeRange", defaultValue = "BTimeRange.DEFAULT")
@NiagaraProperty(name = "filterOfflineResults", type = "BBoolean", defaultValue = "BBoolean.FALSE")


public class BHistoryExporter extends BComponent {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.optimised_buildings_ltd.CSVExport.BHistoryExporter(2979906276)1.0$ @*/
/* Generated Wed Nov 11 10:25:59 GMT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BHistoryExporter.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
