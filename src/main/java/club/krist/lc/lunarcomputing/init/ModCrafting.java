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
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.screen, 1),
                "GRL",
                "GCl",
                "GBr",
                'G', Blocks.GLASS_PANE,
                'I', Items.IRON_INGOT,
                'R', new ItemStack(Items.DYE, 1, 1), // Rose Red
                'C', new ItemStack(Items.DYE, 1, 2), // Cactus Green
                'B', new ItemStack(Items.DYE, 1, 4), // Lapis Lazuli
                'L', Items.GOLD_INGOT,
                'l', Blocks.REDSTONE_LAMP,
                'r', Items.REDSTONE);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.computer, 1),
                "III",
                "SCR",
                "GGG",
                'G', Items.GOLD_INGOT,
                'I', Items.IRON_INGOT,
                'S', ModItems.screen,
                'R', Items.REDSTONE,
                'C', ModItems.cpu);
    }

}
