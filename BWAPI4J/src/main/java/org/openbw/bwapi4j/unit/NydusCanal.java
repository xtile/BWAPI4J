////////////////////////////////////////////////////////////////////////////////
//
//    Copyright (C) 2017-2018 OpenBW Team
//
//    This file is part of BWAPI4J.
//
//    BWAPI4J is free software: you can redistribute it and/or modify
//    it under the terms of the Lesser GNU General Public License as published 
//    by the Free Software Foundation, version 3 only.
//
//    BWAPI4J is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with BWAPI4J.  If not, see <http://www.gnu.org/licenses/>.
//
////////////////////////////////////////////////////////////////////////////////

package org.openbw.bwapi4j.unit;

import org.openbw.bwapi4j.Position;
import org.openbw.bwapi4j.type.UnitCommandType;
import org.openbw.bwapi4j.type.UnitType;

import static org.openbw.bwapi4j.type.UnitCommandType.Build;
import static org.openbw.bwapi4j.type.UnitType.Zerg_Nydus_Canal;

public class NydusCanal extends Building implements Organic {

    private int nydusExitId;
    
    protected NydusCanal(int id, int timeSpotted) {
        
        super(id, UnitType.Zerg_Nydus_Canal, timeSpotted);
    }

    @Override
    public void update(int[] unitData, int index, int frame) {
        
        this.nydusExitId = unitData[index + Unit.NYDUS_EXIT_INDEX];
        super.update(unitData, index, frame);
    }
    
    public Unit getNydusExit() {
        
        return super.getUnit(nydusExitId);
    }
    
    /**
     * Builds a nydus exit for this nydus canal at given position.
     * @param position the position of the nydus exit
     * @return true if command successful, false else
     */
    public boolean buildNydusExit(Position position) {
        
        return issueCommand(this.id, Build, -1,
                position.getX(), position.getY(), Zerg_Nydus_Canal.getId());
    }
}
