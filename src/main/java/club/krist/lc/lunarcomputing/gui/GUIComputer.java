package club.krist.lc.lunarcomputing.gui;

import club.krist.lc.lunarcomputing.container.ContainerComputer;
import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GUIComputer extends GuiContainer {

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }

    public GUIComputer(TileComputer computer) {
        super(new ContainerComputer(computer));
    }
}
