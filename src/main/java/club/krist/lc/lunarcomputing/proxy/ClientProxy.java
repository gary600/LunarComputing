package club.krist.lc.lunarcomputing.proxy;

import club.krist.lc.lunarcomputing.init.ModBlocks;
import club.krist.lc.lunarcomputing.init.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void init() {
        super.init();
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
