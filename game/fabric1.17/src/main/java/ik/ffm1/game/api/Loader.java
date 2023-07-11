package ik.ffm1.game.api;

import ik.ffm1.loader.utils.FabricQuiltUtils;
import net.fabricmc.api.EnvType;

public class Loader {

    public static String getPlatform() {
        return FabricQuiltUtils.getPlatform();
    }

    public static String getVersion() {
        return FabricQuiltUtils.getVersion();
    }

    public static boolean isClient() {
        return FabricQuiltUtils.getEnvironmentType() == EnvType.CLIENT;
    }
}
