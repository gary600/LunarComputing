package club.krist.lc.lunarcomputing.proxy;

import club.krist.lc.lunarcomputing.init.ModBlocks;
import club.krist.lc.lunarcomputing.init.ModItems;

public class ClientProxy implements CommonProxy {

    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
