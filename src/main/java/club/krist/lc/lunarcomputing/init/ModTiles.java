package club.krist.lc.lunarcomputing.init;


import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTiles {

    public static void init() {

    }

    public static void register() {
        GameRegistry.registerTileEntity(TileComputer.class, "lcTileComputer");
    }

}
