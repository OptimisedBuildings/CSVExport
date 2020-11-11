package com.optimised_buildings_ltd.CSVExport;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;



public interface BIExportMethod {



    public boolean begin();
    public boolean end();
    public boolean send(String data);

}
