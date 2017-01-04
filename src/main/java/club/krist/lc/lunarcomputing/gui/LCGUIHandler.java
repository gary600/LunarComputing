package club.krist.lc.lunarcomputing.gui;

import club.krist.lc.lunarcomputing.container.ContainerComputer;
import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class LCGUIHandler implements IGuiHandler {

    public static final int COMPUTER_GUI = 0;
    public static final int MANUAL_GUI = 1;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        switch(ID) {
            case COMPUTER_GUI:
                return new ContainerComputer((TileComputer) world.getTileEntity(pos));
            case MANUAL_GUI:
                return new GUIManual();
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }
}
