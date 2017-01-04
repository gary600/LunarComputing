package club.krist.lc.lunarcomputing.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.util.HashMap;
import java.util.Map;

/**
 * A GUI that displays the LunarComputing manual
 */
public class GuiManual extends GuiScreen {

    public static final int IMG_WIDTH = 160;
    public static final int IMG_HEIGHT = 320;

    public Map<String, GuiButton> buttonMap = new HashMap<String, GuiButton>();

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    public boolean doesGuiPauseGame() { return true; }

    @Override
    public void initGui() {
        buttonMap.put( "nextButton", new GuiButton(0, this.width / 2 + 100, this.height / 2 + 100, "Next") );
        buttonMap.put( "prevButton", new GuiButton(0, this.width / 2 - 100, this.height / 2 + 100, "Previous") );
    }
}
