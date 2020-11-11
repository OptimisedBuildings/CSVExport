package com.optimised_buildings_ltd.CSVExport.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;
import javax.baja.test.BTestNg;

@NiagaraType

public class BGoodTest extends BTestNg {

    @Test
    public void addTest()
    {
        Assert.assertEquals(1,1);
    }

/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.optimised_buildings_ltd.CSVExport.test.BGoodTest(2979906276)1.0$ @*/
/* Generated Wed Nov 11 09:16:41 GMT 2020 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BGoodTest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
