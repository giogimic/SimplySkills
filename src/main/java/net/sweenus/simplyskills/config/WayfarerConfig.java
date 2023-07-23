package net.sweenus.simplyskills.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "wayfarer")
public class WayfarerConfig implements ConfigData {

    public int passiveWayfarerSlenderArmorThreshold = 15;
    public int passiveWayfarerSlenderSlownessAmplifier = 0;
    public int passiveWayfarerSneakSpeedAmplifier = 2;

}