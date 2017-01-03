package club.krist.lc.lunarcomputing.blocks;

import club.krist.lc.lunarcomputing.LunarComputing;
import club.krist.lc.lunarcomputing.Reference;
import club.krist.lc.lunarcomputing.tile.TileComputer;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockComputer extends Block implements ITileEntityProvider{

    public static final int OFF = 0;
    public static final int ON = 1;
    public static final int BLINKING = 2;

    public static final PropertyDirection FACING = PropertyDirection.create("facing");
    public static final PropertyInteger STATE = PropertyInteger.create("state", OFF, BLINKING);

    public BlockComputer() {
        super(Material.ROCK);
        setCreativeTab(LunarComputing.lunarComputingTab);

        setUnlocalizedName(Reference.LCBlocks.COMPUTER.getUnlocalizedName());
        setRegistryName(Reference.LCBlocks.COMPUTER.getRegistryName());

        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        setDefaultState(blockState.getBaseState().withProperty(STATE, OFF));
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileComputer();
    }

    //region Directional Placement
    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        world.setBlockState(pos, state.withProperty(FACING, getFacingFromEntity(pos, placer)), 2);
        world.setBlockState(pos, state.withProperty(STATE, OFF));
    }

    public static EnumFacing getFacingFromEntity(BlockPos clickedBlock, EntityLivingBase entity) {
        return EnumFacing.getFacingFromVector(
                (float) (entity.posX - clickedBlock.getX()),
                (float) (entity.posY - clickedBlock.getY()),
                (float) (entity.posZ - clickedBlock.getZ()));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING, STATE);
    }
    //endregion
}