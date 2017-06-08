package org.openbw.bwapi4j.unit;

import org.openbw.bwapi4j.type.UnitCommandType;
import org.openbw.bwapi4j.type.UnitType;

public class SporeColony extends Building implements Organic {

    SporeColony(int id, int timeSpotted) {
        super(id, UnitType.Zerg_Spore_Colony, timeSpotted);
    }

    public boolean attack(Unit target) {
        return attack(target, false);
    }
    
    public boolean attack(Unit target, boolean queued) {
        return issueCommand(this.id, UnitCommandType.Attack_Unit.ordinal(), target.getId(), -1, -1, queued ? 1 : 0);
    }
}