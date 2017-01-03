package club.krist.lc.lunarcomputing.items;

import club.krist.lc.lunarcomputing.Reference;

/**
 * A manual that explains how to use LunarComputing
 */
public class ItemManual  extends ItemBase{

    public ItemManual() {
        super();
        setUnlocalizedName(Reference.LCItems.MANUAL.getUnlocalizedName());
        setRegistryName(Reference.LCItems.MANUAL.getRegistryName());
    }

}
