package club.krist.lc.lunarcomputing.items;

import club.krist.lc.lunarcomputing.LunarComputing;
import club.krist.lc.lunarcomputing.Reference;
import club.krist.lc.lunarcomputing.gui.GuiManual;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * A manual that explains how to use LunarComputing
 */
public class ItemManual  extends ItemBase{

    public ItemManual() {
        super();
        setUnlocalizedName(Reference.LCItems.MANUAL.getUnlocalizedName());
        setRegistryName(Reference.LCItems.MANUAL.getRegistryName());
    }

    @Override
    public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand)
    {
        if (world.isRemote)
            player.openGui(LunarComputing.instance, 0, world, (int) player.posX, (int) player.posY, (int) player.posZ);
        return EnumActionResult.SUCCESS;
    }

}
