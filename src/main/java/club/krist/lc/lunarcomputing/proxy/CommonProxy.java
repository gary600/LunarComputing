package club.krist.lc.lunarcomputing.proxy;

import club.krist.lc.lunarcomputing.LunarComputing;
import club.krist.lc.lunarcomputing.gui.LCGUIHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(LunarComputing.instance, new LCGUIHandler());
    }

}
