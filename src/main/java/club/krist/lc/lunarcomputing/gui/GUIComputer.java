package club.krist.lc.lunarcomputing.gui;

import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.client.gui.GuiScreen;
public class GUIComputer extends GuiScreen {

    public GUIComputer(TileComputer computer) {
        super();
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
