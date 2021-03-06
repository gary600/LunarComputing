package club.krist.lc.lunarcomputing.init;

import club.krist.lc.lunarcomputing.Reference;
import club.krist.lc.lunarcomputing.items.ItemCPU;
import club.krist.lc.lunarcomputing.items.ItemScreen;
import club.krist.lc.lunarcomputing.items.ItemManual;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public static Item cpu;
    public static Item screen;
    public static Item manual;

    public static void init() {
        cpu = new ItemCPU();
        screen = new ItemScreen();
        manual = new ItemManual();
    }

    public static void register() {
        GameRegistry.register(cpu);
        GameRegistry.register(screen);
        GameRegistry.register(manual);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(cpu);
        registerRender(screen);
        registerRender(manual);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
