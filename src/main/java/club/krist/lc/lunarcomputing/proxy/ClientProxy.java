package club.krist.lc.lunarcomputing.proxy;

import club.krist.lc.lunarcomputing.gui.GUIComputer;
import club.krist.lc.lunarcomputing.init.ModBlocks;
import club.krist.lc.lunarcomputing.init.ModItems;
import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy {

    @Override
    public void openComputerGUI(TileComputer computer) {
        Minecraft.getMinecraft().displayGuiScreen(new GUIComputer(computer));
    }

    @Override
    public void init() {
        super.init();
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
