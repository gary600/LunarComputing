package club.krist.lc.lunarcomputing;

public class Reference {

    public static final String MOD_ID = "lunarcomputing";
    public static final String NAME = "LunarComputing";
    public static final String VERSION = "1.0-SNAPSHOT";
    public static final String ACCEPTED_VERSIONS = "[1.10.2]";

    public static final String CLIENT_PROXY_CLASS = "club.krist.lc.lunarcomputing.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "club.krist.lc.lunarcomputing.proxy.ServerProxy";

    public static enum LCItems {
        CPU("cpu", "cpu"),
        SCREEN("screen", "screen"),
        MANUAL("manual", "manual");

        private String unlocalizedName;
        private String registryName;

        LCItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

    public static enum LCBlocks {
        COMPUTER("computer", "computer");

        private String unlocalizedName;
        private String registryName;

        LCBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

}
