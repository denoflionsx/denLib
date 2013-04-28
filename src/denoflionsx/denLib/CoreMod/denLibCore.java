package denoflionsx.denLib.CoreMod;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import denoflionsx.denLib.CoreMod.Updater.UpdateManager;
import java.io.File;
import java.util.Map;

@MCVersion(value = "1.5.1")
public class denLibCore implements IFMLLoadingPlugin {
    
    public static UpdateManager updater;
    public static File check = new File("denLibUpdateCheck.bin");

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String[] getLibraryRequestClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        updater = new UpdateManager();
        updater.doUpdate();
    }
    
    public static void print(String msg){
        FMLLog.info("[denLibCore]: " + msg);
    }
}