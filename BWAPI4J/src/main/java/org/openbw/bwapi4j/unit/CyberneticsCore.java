package org.openbw.bwapi4j.unit;

import org.openbw.bwapi4j.type.UnitType;
import org.openbw.bwapi4j.type.UpgradeType;

public class CyberneticsCore extends Building implements Mechanical, ResearchingFacility {

    private Researcher researcher;
    
    protected CyberneticsCore(int id, int timeSpotted) {
        
        super(id, UnitType.Protoss_Cybernetics_Core, timeSpotted);
        this.researcher = new Researcher();
    }

    @Override
    public void update(int[] unitData, int index) {

        this.researcher.update(unitData, index);
        super.update(unitData, index);
    }
    
    public boolean upgradeAirArmor() {
        
        return this.researcher.upgrade(UpgradeType.Protoss_Air_Armor);
    }
	    
	public boolean upgradeAirWeapons() {
	        
	        return this.researcher.upgrade(UpgradeType.Protoss_Air_Weapons);
	    }
	
	public boolean upgradeSingularityCharge() {
	    
	    return this.researcher.upgrade(UpgradeType.Singularity_Charge);
	}
    
    @Override
    public boolean isUpgrading() {
        
        return this.researcher.isUpgrading();
    }

    @Override
    public boolean isResearching() {
        
        return this.researcher.isResearching();
    }

    @Override
    public boolean cancelResearch() {
        
        return this.researcher.cancelResearch();
    }

    @Override
    public boolean cancelUpgrade() {
        
        return this.researcher.cancelUpgrade();
    }
}