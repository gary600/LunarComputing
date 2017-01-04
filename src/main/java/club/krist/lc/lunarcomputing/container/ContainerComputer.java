package club.krist.lc.lunarcomputing.container;

import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerComputer extends Container {

    private TileComputer computer;

    public ContainerComputer(TileComputer computer) {
        this.computer = computer;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
