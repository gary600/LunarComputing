package club.krist.lc.lunarcomputing.gui;

import club.krist.lc.lunarcomputing.util.Color;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;

public class FontRenderer {

    public static ResourceLocation font = new ResourceLocation("lunarcomputing", "textures/gui/termFont.png");

    public static int HEIGHT = 9;
    public static int WIDTH = 6;

    public static String CHARSET = "0123456789abcdef";

    private TextureManager textureManager;

    public FontRenderer(TextureManager textureManager) {
        this.textureManager = textureManager;
    }

    public void drawBackgroundHex() {

    }

    public void drawForegroundHex() {

    }

    public void drawText() {

    }

    private void drawChar(VertexBuffer buffer, double x, double y, int index, int col0r) {
        int col = index%16;
        int row = index/16;
        Color color = Color.values()[(15-col0r)];
        float[] rgb = color.getRGB();

        buffer.pos(x, y+HEIGHT, 0.0).tex(col * WIDTH / 256.0D, (row+1) * HEIGHT / 256.0D).color(rgb[0],rgb[1],rgb[2], 1.0F).endVertex();
        buffer.pos(x + WIDTH, y + HEIGHT, 0.0D).tex((col+1) * WIDTH / 256.0D, (row+1) * HEIGHT / 256.0D).color(rgb[0],rgb[1],rgb[2], 1.0F).endVertex();
        buffer.pos(x + WIDTH, y, 0.0D).tex((col+1) * WIDTH / 256.0D, row * HEIGHT / 256.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
        buffer.pos(x, y, 0.0D).tex(col * WIDTH / 256.0D, row * HEIGHT / 256.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
    }

    private void drawQuad(VertexBuffer buffer, double x, double y, int col0r, double width)
    {
        Color color = Color.values()[(15 - col0r)];
        float[] rgb = color.getRGB();
        buffer.pos(x, y + HEIGHT, 0.0D).tex(0.0D, 1.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
        buffer.pos(x + width, y + HEIGHT, 0.0D).tex(1.0D, 1.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
        buffer.pos(x + width, y, 0.0D).tex(1.0D, 0.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
        buffer.pos(x, y, 0.0D).tex(0.0D, 0.0D).color(rgb[0],rgb[1],rgb[2],1.0F).endVertex();
    }
}
