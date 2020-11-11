package com.optimised_buildings_ltd.CSVExport;

import javax.baja.category.BCategoryMask;
import javax.baja.category.BCategoryService;
import javax.baja.category.BOrdToCategoryMap;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(name = "historyExporter", type = "BHistoryExporter", defaultValue = "new BHistoryExporter()")

public class BFTPSyncManager extends BComponent implements BIExportMethod, BIService {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.optimised_buildings_ltd.CSVExport.BFTPSyncManager(3848927917)1.0$ @*/
/* Generated Wed Nov 11 10:25:32 GMT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "historyExporter"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the {@code historyExporter} property.
   * @see #getHistoryExporter
   * @see #setHistoryExporter
   */
  public static final Property historyExporter = newProperty(0, new BHistoryExporter(), null);
  
  /**
   * Get the {@code historyExporter} property.
   * @see #historyExporter
   */
  public BHistoryExporter getHistoryExporter() { return (BHistoryExporter)get(historyExporter); }
  
  /**
   * Set the {@code historyExporter} property.
   * @see #historyExporter
   */
  public void setHistoryExporter(BHistoryExporter v) { set(historyExporter, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFTPSyncManager.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
    public boolean begin(){
        return true;

        //connect to ftp server
        //login
        //create file
        //keep connection alive
    }

    public boolean end(){
        return true;
        //close connection
    }

    public boolean send(String data){
        return true;
        //append file
    }


    public Type[] getServiceTypes() {
        return serviceTypes;
    }

    public void serviceStarted() throws Exception {
    }

    public void serviceStopped() throws Exception {
    }

    private static final Type[] serviceTypes= new Type[]{Sys.loadType(BHistoryExporter.class)};

}
