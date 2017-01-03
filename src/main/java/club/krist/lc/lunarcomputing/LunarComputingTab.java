package club.krist.lc.lunarcomputing;

import club.krist.lc.lunarcomputing.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LunarComputingTab extends CreativeTabs {

    public LunarComputingTab() {
        super("lunarComputingTab");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.cpu;
    }

}
