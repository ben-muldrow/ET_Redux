/*
 * LaserchronElementII_RawDataTemplate_C
 *
 * Copyright 2006-2016 James F. Bowring and www.Earth-Time.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.earthtime.Tripoli.rawDataFiles.templates.Thermo;

import java.util.TimeZone;
import org.earthtime.Tripoli.dataModels.inputParametersModels.AbstractAcquisitionModel;
import org.earthtime.Tripoli.dataModels.inputParametersModels.SingleCollectorAcquisition;
import org.earthtime.Tripoli.massSpecSetups.singleCollector.ThermoFinnigan.LaserchronElementIISetupUPb_C;
import org.earthtime.Tripoli.rawDataFiles.templates.AbstractRawDataFileTemplate;
import org.earthtime.dataDictionaries.FileTypeEnum;

/**
 *
 * @author James F. Bowring
 */
public final class LaserchronElementII_RawDataTemplate_C extends AbstractRawDataFileTemplate {

    //Class variables   
    private static final long serialVersionUID = -4082959888559262169L;
    private static LaserchronElementII_RawDataTemplate_C instance = new LaserchronElementII_RawDataTemplate_C();

    private LaserchronElementII_RawDataTemplate_C() {
        super();

        this.NAME = "Laserchron Element II 176-202-235-238";
        this.aboutInfo = "analysis runs setup to process 176, 202, 204, 206, 207, 208, 232, 235, 238";
        this.fileType = FileTypeEnum.dat;
        this.startOfFirstLine = "C H d r F i l e ";//C H d r F i l e        x      ";
        this.startOfDataSectionFirstLine = "Time";
        this.startOfEachBlockFirstLine = "Time";
        this.blockStartOffset = 0;
        this.blockSize = 55;
        this.standardIDs = new String[]//
        {"FC", "SL", "R33"};
        this.timeZone = TimeZone.getTimeZone("GMT");
        this.defaultParsingOfFractionsBehavior = 1;
        this.elementsByIsotopicMass = new String[]{"176", "202", "204", "206", "207", "208", "232", "235", "238"};
        this.massSpecSetup = LaserchronElementIISetupUPb_C.getInstance();
    }

    /**
     *
     * @return
     */
    public static LaserchronElementII_RawDataTemplate_C getInstance() {
        return instance;
    }

    /**
     *
     * @return
     */
    @Override
    public AbstractAcquisitionModel makeNewAcquisitionModel() {
        this.acquisitionModel = new SingleCollectorAcquisition();
        return acquisitionModel;
    }
}
