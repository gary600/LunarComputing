package club.krist.lc.lunarcomputing.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cpu, 1),
                "GIG",
                "TRP",
                "GIG",
                'G', Items.GOLD_INGOT,
                'I', Items.IRON_INGOT,
                'T', Blocks.REDSTONE_TORCH,
                'R', Blocks.REDSTONE_BLOCK,
                'P', Items.REPEATER);
    }

}
