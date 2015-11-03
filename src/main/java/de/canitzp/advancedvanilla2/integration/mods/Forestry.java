package de.canitzp.advancedvanilla2.integration.mods;

import de.canitzp.advancedvanilla2.integration.CheckLoadedMods;
import de.canitzp.advancedvanilla2.util.AVOreDictionary;

@SuppressWarnings("unchecked")
public class Forestry { //Version: Forestry_1.7.10-3-6-6-24

    public static void postInit(){
        CheckLoadedMods.modList.add("Forestry");
        //Glass:
        AVOreDictionary.WildcardBlock("blockGlass", "Forestry:stained");
        //Chipsets:
        AVOreDictionary.AVODItem("circuitBasic", "Forestry:chipsets", 0);
        AVOreDictionary.AVODItem("circuitAdvanced", "Forestry:chipsets", 3);

    }
}
