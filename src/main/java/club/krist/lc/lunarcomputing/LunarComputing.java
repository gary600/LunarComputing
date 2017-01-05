package club.krist.lc.lunarcomputing;

import club.krist.lc.lunarcomputing.init.ModBlocks;
import club.krist.lc.lunarcomputing.init.ModCrafting;
import club.krist.lc.lunarcomputing.init.ModItems;
import club.krist.lc.lunarcomputing.init.ModTiles;
import club.krist.lc.lunarcomputing.proxy.CommonProxy;

import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS
)
public class LunarComputing {

    @Instance
    public static LunarComputing instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs lunarComputingTab = new LunarComputingTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();

        ModBlocks.init();
        ModBlocks.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        ModCrafting.register();

        ModTiles.register();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
