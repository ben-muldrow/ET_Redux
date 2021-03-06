/*
 * XMLFileFilter.java
 *
 * Created on April 25, 2006, 5:35 PM
 *
 *
 * Copyright 2006-2015 James F. Bowring and www.Earth-Time.org
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
package org.earthtime.UPb_Redux.filters;

import java.io.File;

/**
 *
 * @author James F. Bowring
 */
public class XMLFileFilter extends javax.swing.filechooser.FileFilter {

    /**
     * 
     * @param f
     * @return
     */
    public boolean accept ( File f ) {
        boolean accept = f.isDirectory();

        if (  ! accept ) {
            String suffix = getSuffix( f );

            if ( suffix != null ) {
                accept = suffix.equalsIgnoreCase( "xml" );
            }
        }

        return accept;
    }

    /**
     * 
     * @return
     */
    public String getDescription () {
        return "XML files (*.xml)";
    }

    private String getSuffix ( File f ) {
        String s = f.getPath(), suffix = null;
        int i = s.lastIndexOf( '.' );

        if ( i > 0 && i < s.length() - 1 ) {
            suffix = s.substring( i + 1 ).toLowerCase();
        }

        return suffix;
    }
}
