package com.solvd.hardwarestore.abstractclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Here we have the kind of product that tou can use to make another, for example, sand, gasoline
//or all the kind of product that you don't sell by unit
public abstract class RawMaterial {
    private static final Logger LOGGER= LogManager.getLogger(RawMaterial.class);
    private String rawMaterialName;
    private String rawMaterialDescription;
    private String unitType;//For example, a ton, kg, lt


    //Constructor
    public RawMaterial(String rawMaterialName, String rawMaterialDescription, String unitType) {
        this.rawMaterialName = rawMaterialName;
        this.rawMaterialDescription = rawMaterialDescription;
    }
    //End constructor

    //Getter and setter

    public String getRawMaterialName() {
        return rawMaterialName;
    }

    public void setRawMaterialName(String rawMaterialName) {
        this.rawMaterialName = rawMaterialName;
    }

    public String getRawMaterialDescription() {
        return rawMaterialDescription;
    }

    public void setRawMaterialDescription(String rawMaterialDescription) {
        this.rawMaterialDescription = rawMaterialDescription;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }


    //end getter and setter

    //Abstract method
    /*
    This abstract method tells us if we need a special license to buy that product. It uses the license of the product according
    to the type of product, for example, some kind of poison.
     */
    public abstract boolean checkLicence(boolean needLicense, String licenseId, int licenseNumberLength);
    //end Abstract method


}
