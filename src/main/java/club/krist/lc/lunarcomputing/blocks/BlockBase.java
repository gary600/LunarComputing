package club.krist.lc.lunarcomputing.blocks;

import club.krist.lc.lunarcomputing.LunarComputing;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    public BlockBase() {
        super(Material.ROCK);
        setCreativeTab(LunarComputing.lunarComputingTab);
    }

}
